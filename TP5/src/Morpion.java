import javax.swing.*;
import java.awt.*;

public class Morpion {
    public static void main(String[] args) {
        Game jeu = new Game();

        JFrame fenetre = new JFrame("Morpion");
        fenetre.setSize(300, 300);
        fenetre.setLayout(new GridLayout(3, 3));

        CaseMorpion[][] cases = new CaseMorpion[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                cases[i][j] = new CaseMorpion(jeu, i, j);
                fenetre.add(cases[i][j].getBouton());
            }
        }

        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setVisible(true);
    }
}
