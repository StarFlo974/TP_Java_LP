import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {

        //Exercice 1
        Poisson poisson = new Poisson(10, 2);

        Oiseau oiseau = new Oiseau(5, 1);

        Oiseau oiseau2 = new Oiseau(5, 4);




        //Regroupez ces trois animaux dans un tableau. Faites appelle aux méthodes manger() de tous ces animaux en parcourant le tableau.
        Animaux[] animaux = new Animaux[3];
        animaux[0] = poisson;
        animaux[1] = oiseau;
        animaux[2] = oiseau2;

        for (int i = 0; i < animaux.length; i++) {
            animaux[i].manger();
        }

        // Poulet poulet = new Poulet(10, 5);
        // poulet.voler();

        Moineau moineau = new Moineau(2, 2);
        moineau.voler();

        Avion avion = new Avion();
        avion.voler();

        // Créez une classe de test qui instancie une ArrayList qui contient des avions et des moineaux et fait appel à leurs méthodes voler() (en parcourant la liste).
        ArrayList<Volant> volants = new ArrayList<Volant>();
        volants.add(moineau);
        volants.add(avion);

        for (Volant volant : volants) {
            volant.voler();
        }


        //Exercice 2
    }
}
