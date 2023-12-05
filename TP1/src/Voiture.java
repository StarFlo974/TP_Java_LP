public class Voiture extends Vehicule {
    
        protected boolean autoRadio;

        public Voiture(double prix, String numImmat, String modele, String permis, int anneeAchat, boolean autoRadio) {
            super(prix, numImmat, modele, permis, anneeAchat);
            this.autoRadio = autoRadio;
        }

        boolean ajouterAutorio() {
            return this.autoRadio = true;
        }

        boolean retirerAutorio() {
            return this.autoRadio = false;
        }

        void afficherVoiture(){
            System.out.println("Prix : " + this.prix + " Numéro d'immatriculation : " + this.numImmat + " Modèle : " + this.modele + " Permis : " + this.permis + " Année d'achat : " + this.anneeAchat + " Autoradio : " + this.autoRadio);
        }

}