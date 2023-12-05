public class Cercle {
    protected Point centre;
    protected int rayon;

    public Cercle(Point centre, int rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }

    public String toString() {
        return "Cercle : " + this.centre + " " + this.rayon + " " + this.perimetre();
    }

    public int perimetre() {
        return (int) (2 * Math.PI * this.rayon);
    }
}
