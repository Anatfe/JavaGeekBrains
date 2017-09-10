package Level1.Tasks.Task8.Alien;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CrossesNaughts extends JFrame{

    static final long serialVersionUID=1;

    Cell[]cells;
    int best;
    static final int SIZE=3;
    int currentSide=1,playerSide=1;
    int[] field;

    class Cell extends JButton implements ActionListener{

        static final long serialVersionUID=1;

        private int id;
        Dimension dim=new Dimension();

        Cell(int id){
            this.id=id;
            addActionListener(this);
        }//Cell

        public void
        actionPerformed(ActionEvent e){
            onPress(id);
        }//actionPerformed

        void
        mark(int side){
            field[id]=side;
            setEnabled(false);
            if(side>0)
                setText("X");
            else
                setText("O");
        }//mark

    }//class Cell

    ComponentAdapter resizer=new ComponentAdapter(){
        public void
        componentResized(ComponentEvent e){
            Insets i=getInsets();
            onResize(e.getComponent().getWidth()-i.left-i.right,e.getComponent().getHeight()-i.top-i.bottom);
        }//componentResized
    };//componentAdapter

    CrossesNaughts(){
        super("Crosses and Naughts");

        field=new int[SIZE*SIZE];
        for(int i=0;i<field.length;i++)
            field[i]=0;

        cells=new Cell[SIZE*SIZE];
        for(int i=0;i<cells.length;i++){
            add(cells[i]=new Cell(i));
        }//for

        setLayout(null);
        addComponentListener(resizer);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        Dimension scrDim=Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(scrDim.width/4,scrDim.height/4);
        setSize(scrDim.width/2,scrDim.height/2);
        setVisible(true);
        if(JOptionPane.showConfirmDialog(this,"Do you want to play for Crosses?","Game mode",JOptionPane.YES_NO_OPTION)
                ==JOptionPane.NO_OPTION){
            machineMove();
            playerSide=-1;
        }//if
    }//CrossesNaughts

    int get(int x,int y){return field[y*SIZE+x];}
    void set(int x,int y,int v){field[y*SIZE+x]=v;}
    int x(int i){return i%SIZE;}
    int y(int i){return i/SIZE;}

    void
    onResize(int w,int h){
        for(int i=0;i<cells.length;i++){
            cells[i].setLocation(w*x(i)/SIZE,h*y(i)/SIZE);
            cells[i].setSize(w*(x(i)+1)/SIZE-w*x(i)/SIZE,h*(y(i)+1)/SIZE-h*y(i)/SIZE);
        }//for
    }//onResize

    void
    onPress(int id){
        if(currentSide!=playerSide)
            return;
        cells[id].mark(currentSide);
        if(checkWin(x(id),y(id))){
            JOptionPane.showMessageDialog(this,"You win!");
            return;
        }//if
        currentSide=-currentSide;
        assess(currentSide);
        if(best<0){
            JOptionPane.showMessageDialog(this,"Draw!");
            return;
        }//if
        machineMove();
    }//onPress

    void
    machineMove(){
        cells[best].mark(currentSide);
        if(checkWin(x(best),y(best))){
            JOptionPane.showMessageDialog(this,"You lost, stupido! Juego abortado!");
            return;
        }//if
        currentSide=-currentSide;
        assess(currentSide);
        if(best<0){
            JOptionPane.showMessageDialog(this,"Draw!");
            return;
        }//if
    }//machineMove

    boolean
    checkWin(int x,int y){
        int i,s;
        for(i=0,s=0;i<SIZE;i++)
            s+=get(i,y);
        if(Math.abs(s)==SIZE)
            return true;
        for(i=0,s=0;i<SIZE;i++)
            s+=get(x,i);
        if(Math.abs(s)==SIZE)
            return true;
        if(x==y){
            for(i=0,s=0;i<SIZE;i++)
                s+=get(i,i);
            if(Math.abs(s)==SIZE)
                return true;
        }//if
        if(x+y+1==SIZE){
            for(i=0,s=0;i<SIZE;i++)
                s+=get(i,SIZE-i-1);
            if(Math.abs(s)==SIZE)
                return true;
        }//if
        return false;
    }//checkWin

    int
    assess(int side){
        int best=-1,bestVal=-2,curVal;
        for(int i=0;i<field.length;i++){
            if(field[i]!=0)
                continue;
            field[i]=side;
            if(checkWin(x(i),y(i))){
                field[i]=0;
                this.best=i;
                return side;
            }//if
            curVal=assess(-side);
            field[i]=0;
            if(curVal*side>bestVal){
                bestVal=curVal*side;
                best=i;
            }//if
        }//for
        this.best=best;
        if(best<0)
            return 0;
        return bestVal*side;
    }//assess

    public static void
    main(String[]args){
        new CrossesNaughts();
    }//main

}//class CrossesNaughs