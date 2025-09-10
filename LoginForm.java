import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {
    private Container c;
    private JLabel userLabel, passLabel, messageLabel;
    private JTextField userText;
    private JPasswordField passText;
    private JButton loginButton;

    public LoginForm() {
        setTitle("Login Form");
        setBounds(300, 90, 350, 250);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        userLabel = new JLabel("Username");
        userLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        userLabel.setSize(100, 20);
        userLabel.setLocation(50, 50);
        c.add(userLabel);

        userText = new JTextField();
        userText.setFont(new Font("Arial", Font.PLAIN, 15));
        userText.setSize(150, 20);
        userText.setLocation(150, 50);
        c.add(userText);

        passLabel = new JLabel("Password");
        passLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        passLabel.setSize(100, 20);
        passLabel.setLocation(50, 90);
        c.add(passLabel);

        passText = new JPasswordField();
        passText.setFont(new Font("Arial", Font.PLAIN, 15));
        passText.setSize(150, 20);
        passText.setLocation(150, 90);
        c.add(passText);

        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.PLAIN, 15));
        loginButton.setSize(100, 30);
        loginButton.setLocation(110, 130);
        loginButton.addActionListener(this);
        c.add(loginButton);

        messageLabel = new JLabel("");
        messageLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        messageLabel.setSize(300, 25);
        messageLabel.setLocation(80, 170);
        c.add(messageLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String pass = new String(passText.getPassword());
        // Hardcoded check for demonstration
        if (user.equals("admin") && pass.equals("password")) {
            messageLabel.setText("Login successful!");
        } else {
            messageLabel.setText("Invalid username or password.");
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}