public class Maison extends Batiment {
    protected int nbPieces;
    protected int surfaceJardin;

    public Maison(String adresse, int surfaceHabitable, int nbPieces, int surfaceJardin) {
        super(adresse, surfaceHabitable);
        this.nbPieces = nbPieces;
        this.surfaceJardin = surfaceJardin;
    }

    @Override
    public String toString() {
        return "Cette maison a " + nbPieces + " pieces et un jardin de " + surfaceJardin + "m² et se situe au " + adresse;
    }

    int getSurfaceJardin(){
        return surfaceJardin;
    }
    
}
