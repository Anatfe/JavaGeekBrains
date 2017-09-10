package Level1.Tasks.Task8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame extends JFrame{

    private Map grid;

    public Frame() {

        Dimension scrDim=Toolkit.getDefaultToolkit().getScreenSize();
        setLocation(scrDim.width/4,scrDim.height/4);
        setSize(scrDim.width/4,scrDim.width/4+50);
        //setVisible(true);

        //setResizable(false); // изменение размера
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        grid = new Map(3);
        add(grid, BorderLayout.CENTER);

        JPanel jpBottom = new JPanel(new GridLayout());
        jpBottom.setBackground(Color.lightGray);
        add(jpBottom, BorderLayout.SOUTH);

        jpBottom.getInsets();

        JButton jbStart = new JButton("Start new game");
        jpBottom.add(jbStart);
        jbStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startNewGame();
            }
        });

        JButton jbExit = new JButton("Exit");
        jpBottom.add(jbExit);
        jbExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);

        startNewGame();

    }

    public void startNewGame() {
        grid.newGame();
        if(JOptionPane.showConfirmDialog(this,"Вы будете ходить крестиками?","Game mode",JOptionPane.YES_NO_OPTION) ==JOptionPane.NO_OPTION){
            grid.setPlayerSide(-1);
            grid.machineMove();
        }
    }
}
