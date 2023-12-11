import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorChangeApp {
    private JFrame frame;
    private JPanel centerPanel;

    public ColorChangeApp() {
        // create main frame
        frame = new JFrame("Color Change App");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // create buttons with icons, adjusted size
        JButton red = new JButton("Red", new ImageIcon("red.png"));
        JButton green = new JButton("Green", new ImageIcon("green.png"));
        JButton blue = new JButton("Blue", new ImageIcon("blue.png"));

        // set preferred size for buttons
        Dimension buttonSize = new Dimension(200, 40);
        red.setPreferredSize(buttonSize);
        green.setPreferredSize(buttonSize);
        blue.setPreferredSize(buttonSize);

        // create center panel
        centerPanel = new JPanel();
        centerPanel.setBackground(Color.WHITE);

        // add action listeners to buttons
        red.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                centerPanel.setBackground(Color.RED);
            }
        });

        green.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                centerPanel.setBackground(Color.GREEN);
            }
        });

        blue.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                centerPanel.setBackground(Color.BLUE);
            }
        });

        // add buttons to top of panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(red);
        buttonPanel.add(green);
        buttonPanel.add(blue);

        // add components to main frame
        frame.add(buttonPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);

        // set frame properties
        frame.setSize(1200, 700);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ColorChangeApp();
            }
        });
    }
}
