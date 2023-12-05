public class Autocar extends Camion {
        
            protected int nbPlaces;
        
            public Autocar(double prix, String numImmat, String modele, String permis, int anneeAchat, int volume, int nbPlaces) {
                super(prix, numImmat, modele, permis, anneeAchat,  volume);
                this.nbPlaces = nbPlaces;
            }

            boolean peutTransporterPassagers(int nbPassagers, double volume){
                if (this.volume >= nbPassagers*volume) {
                    return true;
                } else {
                    return false;
                }
            
            }

            void afficherAutocar(){
                System.out.println("Prix : " + this.prix + " Numéro d'immatriculation : " + this.numImmat + " Modèle : " + this.modele + " Permis : " + this.permis + " Année d'achat : " + this.anneeAchat + " Volume : " + this.volume + " Nombre de places : " + this.nbPlaces);
            }
}