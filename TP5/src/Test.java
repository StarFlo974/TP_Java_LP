import javax.swing.*;
import java.awt.*;


public class Test {
    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();
        frame.setSize(500, 500);

            FlowLayout layout = new FlowLayout();
            frame.setLayout(layout);

            JLabel label = new JLabel("What is your name ?");
            frame.add(label);

            JButton button = new JButton("Ok");
            frame.add(button);

            JTextField textField = new JTextField("Entre ta taille");
            frame.add(textField);

            button.addActionListener(e -> {
                System.out.println(textField.getText());
            });

            frame.setVisible(true);

    }


}
