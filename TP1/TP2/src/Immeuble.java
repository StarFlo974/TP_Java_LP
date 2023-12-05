public class Immeuble extends Batiment{
    protected int nbAppartements;
    
    public Immeuble(String adresse, int surfaceHabitable, int nbAppartements) {
        super(adresse, surfaceHabitable);
        this.nbAppartements = nbAppartements;
    }

    public int getNbAppartements() {
        return nbAppartements;
    }

    @Override
    public String toString() {
        return "Cette immeuble à " + nbAppartements + " appartements et une surface habitable de "+ surfaceHabitable+ "m² et se situe au " + adresse;
    }
    
}
