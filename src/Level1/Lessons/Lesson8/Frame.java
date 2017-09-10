package Level1.Lessons.Lesson8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by infuntis on 07/09/17.
 */
public class Frame extends JFrame{

    public Frame(){
        setSize(500,545);
        setLocation(600,200);
        setTitle("Tic tac toe");
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        Map grid = new Map(3);
        JPanel jpBottom = new JPanel(new GridLayout());
        jpBottom.setBackground(Color.lightGray);
        add(grid, BorderLayout.CENTER);
        add(jpBottom, BorderLayout.SOUTH);
        JButton jbStart = new JButton("Start new game");
        jpBottom.add(jbStart);
        jbStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                grid.newGame();
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
    }
}

/*
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Frame extends JFrame{
    public Frame() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500,300,400,400);

        //setLayout(new BorderLayout());
        //setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        //setLayout(new FlowLayout());
        setLayout( new GridLayout(4,3));
//        JButton[] jbs = new JButton[12];
//        for (int i = 0; i < jbs.length; i++) {
//            jbs[i] = new JButton("#"+i);
//            //jbs[i].setAlignmentX(Component.CENTER_ALIGNMENT);
//            add(jbs[i]);
//        }

        JLabel label = new JLabel("label");
        add(label);
        JTextField jft = new JTextField(30);
        add(jft);

        JTextArea jta = new JTextArea(5,30);
        add(jta);

        JButton button = new JButton("Press me");
        //button.setSize(new Dimension(100, 60));
        button.setPreferredSize(new Dimension(100, 60));
        add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //System.out.println("don't touch me!");
                jft.setText("don't touch me!");
            }
        });

        jft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("eeee");
            }
        });

//        add(jbs[0], BorderLayout.EAST);
//        add(jbs[1], BorderLayout.WEST);
//        add(jbs[2], BorderLayout.NORTH);
//        add(jbs[3], BorderLayout.SOUTH);
//        add(jbs[4], BorderLayout.CENTER);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                System.out.println("Mouse pressed");
            }
        });
        setVisible(true);
    }
}
*/