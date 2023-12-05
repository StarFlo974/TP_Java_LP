import java.util.Random;

public class JoueurAleatoire {
    public static void jouerAleatoire(Game jeu) {
        Random rand = new Random();
        int taille = 3;
        int x, y;

        do {
            x = rand.nextInt(taille);
            y = rand.nextInt(taille);
        } while (jeu.getGrille()[x][y] != 0);

        jeu.jouer(x, y);
    }
}
