public class Moineau extends Oiseau implements Volant{

    public Moineau(int poids, int age) {
        super(poids, age);
    }

    public void voler() {
        System.out.println("Je vole");
    }
    
}
