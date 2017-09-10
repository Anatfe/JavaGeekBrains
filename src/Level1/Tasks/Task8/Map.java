package Level1.Tasks.Task8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.Ellipse2D;


public class Map extends JPanel {
    private int linesCount;

    private static int panelSize;
    private static int cellSize;
    private static int playerSide = 1;

    private int[][] field;

    ComponentAdapter resizer = new ComponentAdapter() {
        public void
        componentResized(ComponentEvent e) {
            Insets i = getInsets();
            onResize(e.getComponent().getWidth() - i.left - i.right, e.getComponent().getHeight() - i.top - i.bottom);
        }
    };

    public void onResize(int w, int h) {

        if (w < h) {
            w = h;
            setSize(w, h);
        } else if (w > h) {
            h = w;
            setSize(w, h);
        }

        panelSize = w;
        cellSize  = w / linesCount;
    }

    public void turnHuman(int x, int y) {
        field[x][y] = playerSide;
        repaint();

        if(checkWinX(playerSide)){
            JOptionPane.showMessageDialog(this,"Вы победели!");
            return;
        }

        if(isMapFull()){
            JOptionPane.showMessageDialog(this,"Ничья!");
            return;
        }

        machineMove();
    }

    public void machineMove() {

        // проверим на выигрыш
        int x = -1, y = -1;

        boolean stop = false;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j]!=0) continue;
                x = i; y = j;
                field[i][j] = -playerSide;
                if (checkWinX(-playerSide)) {
                    stop = true;
                    break;
                }
                field[i][j] = playerSide;
                if (checkWinX(playerSide)) {
                    stop = true;
                    break;
                }

                field[i][j] = 0;
            }
            if (stop) break;
        }

        field[x][y] = -playerSide;

        repaint();

        if(checkWinX(-playerSide)){
            JOptionPane.showMessageDialog(this,"Вы проиграли!");
            return;
        }

        if(isMapFull()){
            JOptionPane.showMessageDialog(this,"Ничья!");
            return;
        }


    }


    public boolean isMapFull(){
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if(field[i][j] == 0){
                    return false;
                }
            }
        }
        return true;
    }

    public boolean checkWinX(int a){
        for (int i = 0; i < 3; i++) {
            if(checkLine(i,0,0,1,3,a)){
                return true;
            }
            if(checkLine(0,i,1,0,3,a)){
                return true;
            }
        }

        if (checkLine(0,0,1,1,3,a)){
            return true;
        }
        if (checkLine(0,2,1,-1,3,a)){
            return true;
        }
        return false;
    }

    /*
     cx - номер строки начальной точки
     cy - номер столбца начальной точки
     vx - направление движения по горизонтали (0 - нет движения 1 - двигаемя вправо)
     vy - направление движения по вертикали (0 - нет движения 1 - двигаемя вправо -1 - движение влево)
     l - длина искомой выигрышной последовательности (3)
     dot - искомый символ (крестик или нолик)
     */
    public boolean checkLine(int cx, int cy, int vx, int vy, int l, int a){
        for (int i = 0; i < l; i++) {
            if(field[cy + i*vy][cx + i*vx]!= a){
                return false;
            }
        }
        return true;
    }


    public Map(int linesCount) {
        this.linesCount = linesCount;
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                if (field[e.getX() / cellSize][e.getY() / cellSize] != 0) {
                    return;
                }

                turnHuman(e.getX() / cellSize, e.getY() / cellSize);
            }
        });
        addComponentListener(resizer);
        onResize(getWidth(), getHeight());
        //this.cellSize = PANEL_SIZE/linesCount;
        this.field = new int[linesCount][linesCount];
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D gLine = (Graphics2D) g;
        gLine.setStroke(new BasicStroke(8.0f));
        for (int i = 1; i < linesCount; i++) {
            gLine.drawLine(0, i * cellSize, panelSize, i * cellSize);
            gLine.drawLine(i * cellSize, 0, i * cellSize, panelSize);
        }


        int shiftX = 20, shiftO = 15;

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j] == 1) {
                    gLine.drawLine((i * cellSize) + (shiftX*cellSize / 100), (j + 1) * cellSize - (shiftX*cellSize / 100), (i + 1) * cellSize - (shiftX*cellSize / 100), (j * cellSize) + (shiftX*cellSize / 100));
                    gLine.drawLine((i * cellSize) + (shiftX*cellSize / 100), (j * cellSize) + (shiftX*cellSize / 100), (i + 1) * cellSize - (shiftX*cellSize / 100), (j + 1) * cellSize - (shiftX*cellSize / 100));
                }

                if (field[i][j] == -1) {
                    gLine.draw(new Ellipse2D.Double((i * cellSize) + shiftO, j * cellSize + shiftO, cellSize * 80 / 100, cellSize * 80 / 100));
                }

            }
        }



    }

    void newGame() {
        playerSide = 1;
        field = new int[linesCount][linesCount];
        repaint();
    }

    public static void setPlayerSide(int playerSide) {
        Map.playerSide = playerSide;
    }

}