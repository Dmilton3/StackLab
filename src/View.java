/**
 * Created by ASUS on 2/16/2016.
 */
import javax.swing.*;
import java.awt.event.*;

public class View extends JPanel {
    public static final int FRAMEHEIGHT = 200;
    public static final int FRAMEWIDTH = 600;
    private JButton pushButton;
    private JButton popButton;
    private JButton peekButton;
    private JButton contButton;

    private JTextArea messageBox;
    private JTextField textField;
    Stack stack;


    public View()
    {
        stack = new Stack(10);

        setLayout(null);
        setSize(FRAMEWIDTH, FRAMEHEIGHT);
        pushButton = new JButton("Push");
        pushButton.setSize(100,20);
        pushButton.setLocation(50,10);
        pushButton.addActionListener(new PushButtonClickHandler());
        add(pushButton);

        popButton = new JButton("Pop");
        popButton.setSize(100,20);
        popButton.setLocation(150, 10);
        popButton.addActionListener(new PopButtonClickHandler());
        add(popButton);

        peekButton = new JButton("Peek");
        peekButton.setSize(100,20);
        peekButton.setLocation(250, 10);
        peekButton.addActionListener(new PeekButtonClickHandler());
        add(peekButton);

        contButton = new JButton("Content");
        contButton.setSize(100,20);
        contButton.setLocation(350, 10);
        contButton.addActionListener(new ContButtonClickHandler());
        add(contButton);

        textField = new JTextField("");
        textField.setSize(125,20);
        textField.setLocation(50,50);
        textField.setEditable(true);
        add(textField);

        messageBox = new JTextArea("");
        messageBox.setSize(200,20);
        messageBox.setLocation(300,50);
        messageBox.setEditable(false);
        add(messageBox);


    }
    /**
     * GUI DISPLAY
     */
    public void display()
    {
        JFrame frame = new JFrame("Stack Lab");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setContentPane(this);
        frame.setSize(FRAMEWIDTH, FRAMEHEIGHT);
        frame.setVisible(true);
    }

    private class PushButtonClickHandler implements ActionListener{

        public void actionPerformed(ActionEvent e){
            String input = textField.getText();
            textField.setText("");
            stack.push(input);
        }
    }

    private class PopButtonClickHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            stack.pop();
        }
    }

    private class PeekButtonClickHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            messageBox.setText(stack.peek());
        }
    }

    private class ContButtonClickHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            messageBox.setText(stack.contents());
        }
    }
}
