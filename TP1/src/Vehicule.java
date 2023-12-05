public class Vehicule {

    protected double prix;
    protected String numImmat;
    protected String modele;
    protected String permis;
    protected int anneeAchat ;

        public Vehicule(double prix, String numImmat, String modele, String permis, int anneeAchat) {
        this.prix = prix;
        this.numImmat = numImmat;
        this.modele = modele;
        this.permis = permis;
        this.anneeAchat = anneeAchat;
    }

    int age(){
        return 2023 - this.anneeAchat;
    }

    void afficherVehicule(){
        System.out.println("Prix : " + this.prix + " Numéro d'immatriculation : " + this.numImmat + " Modèle : " + this.modele + " Permis : " + this.permis + " Année d'achat : " + this.anneeAchat);
    }

    double coutLocation(){
        if (age() < 1) {
           return  this.prix/200;
        } else {
            return this.prix/250;
        }
    }
}