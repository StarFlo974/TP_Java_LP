public class Batiment{
    protected String adresse;
    protected int surfaceHabitable;
    
    public int getSurfaceHabitable() {
        return surfaceHabitable;
    }

    public Batiment(String adresse, int surfaceHabitable) {
        this.adresse = adresse;
        this.surfaceHabitable = surfaceHabitable;
    }

    @Override
    public String toString() {
        return "Ce batiment se situe au " + adresse + ", et a une suface habitable de " + surfaceHabitable + "m²";
    }

    

}