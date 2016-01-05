package multicast;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.System;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MulticastTest extends JPanel implements ActionListener {

    private int cnt = 0;
    private JButton closeAllButton;

    public MulticastTest() {

        JButton jButton = new JButton("New");

        add(jButton);

        jButton.addActionListener(this);

        closeAllButton = new JButton("Close all");

        add(closeAllButton);
    }

    @Override
    public void actionPerformed(ActionEvent event) {

        CloseFrame closeFrame = new CloseFrame();

        cnt++;

        closeFrame.setTitle("Window " + cnt);

        closeFrame.setSize(200, 150);

        closeFrame.setLocation(30 * cnt, 30 * cnt);

        closeFrame.setVisible(true);

        closeAllButton.addActionListener(closeFrame);
    }

    private static void showUI() {

        JFrame jFrame = new JFrame();

        jFrame.setTitle("Multicast");

        jFrame.setSize(700, 500);

        jFrame.addWindowListener(new WindowAdapter() {

            @Override

            public void windowClosing(WindowEvent event) {

                System.exit(0);

            }

        });

        Container cPane = jFrame.getContentPane();

        cPane.add(new MulticastTest());

        jFrame.setVisible(true);
    }

    class CloseFrame extends JFrame implements ActionListener {

        @Override

        public void actionPerformed(ActionEvent evt) {

            setVisible(false);

        }
    }

    public void test() {
        System.out.println("Multicast Test");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {

            @Override

            public void run() {

                showUI();

            }

        });
    }
}

//参考
//http://examples.javacodegeeks.com/desktop-java/awt/event/multicast-event-example/