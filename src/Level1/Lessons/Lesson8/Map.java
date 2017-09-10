package Level1.Lessons.Lesson8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by infuntis on 07/09/17.
 */
public class Map extends JPanel {
    private static final int PLAYER_1 = 1;
    private static final int PLAYER_2 = 2;
    private final int PANEL_SIZE = 500;
    private int linesCount;
    private int cellSize;
    private int[][] field;

    public Map(int linesCount){
        this.linesCount = linesCount;
        this.cellSize = PANEL_SIZE/linesCount;
        this.field = new int[linesCount][linesCount];
        setBackground(Color.white);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                field[e.getX()/cellSize][e.getY()/cellSize] = PLAYER_1;
                repaint();
            }
        });
    }

    public void newGame(){
        field = new int[linesCount][linesCount];
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < linesCount; i++) {
            g.drawLine(0, i*cellSize, PANEL_SIZE, i*cellSize);
            g.drawLine(i*cellSize, 0, i*cellSize, PANEL_SIZE);
        }
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if(field[i][j]!=0){
                    if(field[i][j]==PLAYER_1){
                        g.setColor(Color.red);
                    }
                    if(field[i][j]==PLAYER_2){
                        g.setColor(Color.blue);
                    }
                    g.fillOval(i*cellSize+3,j*cellSize+3,cellSize-6,cellSize-6);
                }
            }
        }

    }
}