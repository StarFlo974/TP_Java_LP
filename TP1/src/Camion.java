public class Camion extends Vehicule {
    
        protected int volume;
    
        public Camion(double prix, String numImmat, String modele, String permis, int anneeAchat,int volume) {
            super(prix, numImmat, modele, permis, anneeAchat);
            this.volume = volume;
        }
    
        boolean peutTransporterVolume(double volume){
            if (this.volume >= volume) {
                return true;
            } else {
                return false;
            }
        
        }

        void afficherCamion(){
            System.out.println("Prix : " + this.prix + " Numéro d'immatriculation : " + this.numImmat + " Modèle : " + this.modele + " Permis : " + this.permis + " Année d'achat : " + this.anneeAchat + " Volume : " + this.volume);
        }
}