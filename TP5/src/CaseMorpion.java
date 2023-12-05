import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaseMorpion {
    private JButton bouton;
    private Game jeu;
    private int x;
    private int y;

    public CaseMorpion(Game jeu, int x, int y) {
        this.jeu = jeu;
        this.x = x;
        this.y = y;

        bouton = new JButton();
        bouton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                jouer();
            }
        });
    }

    public JButton getBouton() {
        return bouton;
    }

    private void jouer() {
        jeu.jouer(x, y);
        bouton.setText((jeu.getJoueurCourant() == 1) ? "X" : "O");
        bouton.setEnabled(false);
    }
}
