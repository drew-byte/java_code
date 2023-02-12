
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tryClicker {

    private static int count = 0;
    private static boolean playing = false;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton button = new JButton("Play/Pause");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                if (count % 2 == 1) {
                    playing = true;
                    System.out.println("Playing");
                } else {
                    playing = false;
                    System.out.println("Paused");
                }
            }
        });

        frame.add(button, BorderLayout.CENTER);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
