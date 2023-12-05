public class Animaux {

    protected int poids;
    protected int age;

    public Animaux(int poids, int age) {
        this.poids = poids;
        this.age = age;
    }

    public void manger()
     {
        System.out.println("Je mange");
    }

    public void dormir()
     {
        System.out.println("Je dors");
    }
}