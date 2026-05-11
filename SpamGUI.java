import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SpamGUI extends JFrame implements ActionListener {

    private JTextArea inputArea;
    private JButton detectButton;
    private JLabel resultLabel;
    private JLabel titleLabel;

    private SpamDetector detector;

    public SpamGUI() {

        detector = new SpamDetector();

        // Window settings
        setTitle("Spam Email Detector");
        setSize(600, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Main panel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(30, 30, 30));

        // Title
        titleLabel = new JLabel("SPAM EMAIL DETECTOR");
        titleLabel.setBounds(120, 20, 400, 40);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 28));
        titleLabel.setForeground(Color.WHITE);

        // Input label
        JLabel inputLabel = new JLabel("Enter Email Text:");
        inputLabel.setBounds(50, 90, 200, 30);
        inputLabel.setFont(new Font("Arial", Font.BOLD, 18));
        inputLabel.setForeground(Color.WHITE);

        // Text area
        inputArea = new JTextArea();
        inputArea.setFont(new Font("Arial", Font.PLAIN, 16));
        inputArea.setLineWrap(true);
        inputArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(inputArea);
        scrollPane.setBounds(50, 130, 480, 140);

        // Button
        detectButton = new JButton("Detect Spam");
        detectButton.setBounds(190, 300, 180, 45);
        detectButton.setFont(new Font("Arial", Font.BOLD, 18));
        detectButton.setBackground(new Color(0, 153, 76));
        detectButton.setForeground(Color.WHITE);
        detectButton.setFocusPainted(false);

        detectButton.addActionListener(this);

        // Result label
        resultLabel = new JLabel("Result: ");
        resultLabel.setBounds(180, 370, 300, 40);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 22));
        resultLabel.setForeground(Color.YELLOW);

        // Add components
        panel.add(titleLabel);
        panel.add(inputLabel);
        panel.add(scrollPane);
        panel.add(detectButton);
        panel.add(resultLabel);

        add(panel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String email = inputArea.getText();

        boolean spam = detector.isSpam(email);

        if(spam) {

            resultLabel.setText("Result: SPAM ❌");
            resultLabel.setForeground(Color.RED);

        } else {

            resultLabel.setText("Result: NOT SPAM ✅");
            resultLabel.setForeground(Color.GREEN);
        }
    }
}