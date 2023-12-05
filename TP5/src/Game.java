import javax.swing.*;
import java.awt.*;

public class Game {
    private int[][] grille;
    private int joueurCourant;

    public Game() {
        grille = new int[3][3];
        joueurCourant = 1;
    }

    public void jouer(int x, int y) {
        if (grille[x][y] == 0) {
            grille[x][y] = joueurCourant;

            if (aGagne()) {
                JOptionPane.showMessageDialog(null, "Le joueur " + joueurCourant + " a gagné!");
                reinitialiserPartie();
            } else {
                if (estPartieNulle()) {
                    JOptionPane.showMessageDialog(null, "La partie est nulle!");
                    reinitialiserPartie();
                } else {
                    joueurCourant = (joueurCourant == 1) ? 2 : 1;
                }
            }
        }
    }

    public int getJoueurCourant() {
        return joueurCourant;
    }

    private boolean aGagne() {
        for (int i = 0; i < 3; i++) {
            if (grille[i][0] == joueurCourant && grille[i][1] == joueurCourant && grille[i][2] == joueurCourant) {
                return true;
            }
        }
        return false;
    }

    private boolean estPartieNulle() {
        for (int[] row : grille) {
            for (int value : row) {
                if (value == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private void reinitialiserPartie() {
        grille = new int[3][3];
        joueurCourant = 1;
    }
}
