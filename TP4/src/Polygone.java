public class Polygone {
    // On souhaite maintenant créer des formes géométriques de type Polygone. Chaque polygone est
    // constitué d’une liste de points. Un polygone doit posséder une méthode perimetre() qui permet de
    // calculer son périmètre. Pour calculer ce périmètre on va avoir besoin d’une fonction qui calcule la
    // distance entre deux points. On définit ensuite deux types de polygone : des rectangles (définis par
    // une liste de quatre points) et des triangles (définis par une liste de trois points). Les rectangles et
    // les triangles doivent disposer d’une méthode toString() qui permet d’afficher leur type, les positions
    // de l’ensemble de leurs points (contenus dans la liste) et leur périmètre.

    protected String nom;
    protected Point[] points;

    public Polygone(String nom, Point[] points) {
        this.nom = nom;
        this.points = points;
    }

    public String toString() {
        String result = this.nom + " : ";
        for (Point point : this.points) {
            result += point + " ";
        }
        result += this.perimetre();
        return result;
    }

    public int perimetre() {
        int result = 0;
        for (int i = 0; i < this.points.length - 1; i++) {
            result += this.points[i].distance(this.points[i + 1]);
        }
        result += this.points[this.points.length - 1].distance(this.points[0]);
        return result;
    }

    public static void main(String[] args) {
        Point[] points = new Point[4];
        points[0] = new Point(0, 0);
        points[1] = new Point(0, 1);
        points[2] = new Point(1, 1);
        points[3] = new Point(1, 0);
        Polygone polygone = new Polygone("Rectangle", points);
        System.out.println(polygone);
    }
    
}
