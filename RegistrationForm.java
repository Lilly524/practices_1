import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RegistrationForm extends JFrame implements ActionListener {
    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel email;
    private JTextField temail;
    private JLabel pass;
    private JPasswordField tpass;
    private JLabel gender;
    private JRadioButton male;
    private JRadioButton female;
    private ButtonGroup gengp;
    private JButton sub;
    private JLabel res;

    public RegistrationForm()
    {
        setTitle("Registration Form");
        setBounds(300, 90, 400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.PLAIN, 20));
        title.setSize(200, 30);
        title.setLocation(100, 20);
        c.add(title);

        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.PLAIN, 15));
        name.setSize(100, 20);
        name.setLocation(50, 70);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(150, 70);
        c.add(tname);

        email = new JLabel("Email");
        email.setFont(new Font("Arial", Font.PLAIN, 15));
        email.setSize(100, 20);
        email.setLocation(50, 110);
        c.add(email);

        temail = new JTextField();
        temail.setFont(new Font("Arial", Font.PLAIN, 15));
        temail.setSize(190, 20);
        temail.setLocation(150, 110);
        c.add(temail);

        pass = new JLabel("Password");
        pass.setFont(new Font("Arial", Font.PLAIN, 15));
        pass.setSize(100, 20);
        pass.setLocation(50, 150);
        c.add(pass);

        tpass = new JPasswordField();
        tpass.setFont(new Font("Arial", Font.PLAIN, 15));
        tpass.setSize(190, 20);
        tpass.setLocation(150, 150);
        c.add(tpass);

        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.PLAIN, 15));
        gender.setSize(100, 20);
        gender.setLocation(50, 190);
        c.add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 15));
        male.setSelected(true);
        male.setSize(75, 20);
        male.setLocation(150, 190);
        c.add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 15));
        female.setSelected(false);
        female.setSize(80, 20);
        female.setLocation(225, 190);
        c.add(female);

        gengp = new ButtonGroup();
        gengp.add(male);
        gengp.add(female);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(100, 30);
        sub.setLocation(150, 240);
        sub.addActionListener(this);
        c.add(sub);

        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 15));
        res.setSize(300, 25);
        res.setLocation(100, 290);
        c.add(res);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == sub) {
            String genderSel = male.isSelected() ? "Male" : "Female";
            res.setText("Registered: " + tname.getText() + ", " + temail.getText() + ", " + genderSel);
        }
    }

    public static void main(String[] args) throws Exception
    {
        new RegistrationForm();
    }
}