package behavioral.memento;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
    Memento
    - Store previous state of object
    - In a Stack, from where possible to undo, redo later
    - "Memento" is the subject, the content to store
    - But what is the use with Originator?
    - (Could it be a HasMap in parallel to make it a cache?)

    Adding a Memento means
    - Adding a new set of Memento, Caretaker and Originator
 */

public class Runner extends JFrame {

    class ButtonListener implements ActionListener {

        // might be glitchy but works well enough to prove the concept of a memento
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == saveButton) {
                String textAreaContent = article.getText();
                careTaker.addMemento(originator.storeInMemento());
                originator.setArticle(textAreaContent);

                saveFiles++;
                currentArticle++;

                System.out.println("[ButtonListener] Save Files " + saveFiles);

                undoButton.setEnabled(true);
            } else
                if (e.getSource() == undoButton) {
                    if (currentArticle >= 1) {
                        currentArticle--;
                        String textBoxContent = originator.restoreFromMemento(careTaker.peekMemento(currentArticle));
                        article.setText(textBoxContent);
                        redoButton.setEnabled(true);
                    } else {
                        undoButton.setEnabled(false);
                    }

                } else
                    if (e.getSource() == redoButton) {
                        if ((saveFiles - 1) > currentArticle) {
                            currentArticle++;
                            String textBoxContent = originator.restoreFromMemento(careTaker.peekMemento(currentArticle));
                            article.setText(textBoxContent);
                            undoButton.setEnabled(true);
                        } else {
                            redoButton.setEnabled(false);
                        }
                    }

        }
    }


    public static void main(String[] args) {

        new Runner();
    }

    private JButton saveButton, undoButton, redoButton;

    private JTextArea article = new JTextArea(40, 60);

    Caretaker careTaker = new Caretaker();

    Originator originator = new Originator();

    int saveFiles = 0, currentArticle = 0;

    public Runner() {

        this.setSize(750, 780);
        this.setTitle("Memento Design Pattern");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        panel.add(new JLabel("Article"));

        panel.add(article);

        ButtonListener saveListener = new ButtonListener();
        ButtonListener undoListener = new ButtonListener();
        ButtonListener redoListener = new ButtonListener();

        saveButton = new JButton("Save");
        saveButton.addActionListener(saveListener);

        undoButton = new JButton("Undo");
        undoButton.addActionListener(undoListener);

        redoButton = new JButton("Redo");
        redoButton.addActionListener(redoListener);

        panel.add(saveButton);
        panel.add(undoButton);
        panel.add(redoButton);

        this.add(panel);
        this.setVisible(true);
    }
}