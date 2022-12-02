import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeListener;

public class MainForm {

    private JPanel MainPanel;
    private JTextArea textArea;
    private JButton count_button;
    private JButton clear_button;

    public MainForm() {

            // CLEAR BUTTON
            clear_button.addActionListener(new Action() {
                @Override
                public Object getValue(String key) {
                    return null;
                }

                @Override
                public void putValue(String key, Object value) {

                }

                @Override
                public void setEnabled(boolean b) {

                }

                @Override
                public boolean isEnabled() {
                    return false;
                }

                @Override
                public void addPropertyChangeListener(PropertyChangeListener listener) {

                }

                @Override
                public void removePropertyChangeListener(PropertyChangeListener listener) {

                }

                @Override
                public void actionPerformed(ActionEvent e) {
                    textArea.setText("");
                }
            });

            // COUNT BUTTON
            count_button.addActionListener(new Action() {
                @Override
                public Object getValue(String key) {
                    return null;
                }

                @Override
                public void putValue(String key, Object value) {

                }

                @Override
                public void setEnabled(boolean b) {

                }

                @Override
                public boolean isEnabled() {
                    return false;
                }

                @Override
                public void addPropertyChangeListener(PropertyChangeListener listener) {

                }

                @Override
                public void removePropertyChangeListener(PropertyChangeListener listener) {

                }

                @Override
                public void actionPerformed(ActionEvent e) {
                    String text = textArea.getText();
                    int length = text.length();
                    JOptionPane.showMessageDialog(
                            MainPanel,
                            "символов в тексте: " + length,
                            "длина текста",
                            JOptionPane.PLAIN_MESSAGE
                    );
                }
            });

            textArea.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    textArea.setBackground(Color.lightGray);
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    textArea.setBackground(Color.white);
                }

                @Override
                public void mouseEntered(MouseEvent e) {

                }

                @Override
                public void mouseExited(MouseEvent e) {

                }
            });

            textArea.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                    if (e.getKeyChar() == '`') {
                        textArea.setText(textArea.getText() + "DING");
                    }
                }

                @Override
                public void keyPressed(KeyEvent e) {

                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
            });



    }

    public JPanel getMainPanel() {

        return MainPanel;
    }
}
