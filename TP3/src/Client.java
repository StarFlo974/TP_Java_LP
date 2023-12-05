public class Client {
    private int numeroClient;
    private String nom;
    private double solde;
    private static int cptClient = 0;

    public Client(String nom) {
        this.nom = nom;
        this.solde = 0;
        this.numeroClient = cptClient;
        cptClient++;
    }

    public int getNumeroClient() {
        return numeroClient;
    }

    public String getNom() {
        return nom;
    }

    public double getSolde() {
        return solde;
    }

    public void setNumeroClient(int numeroClient) {
        this.numeroClient = numeroClient;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void crediter(double montant) {
        this.solde += montant;
    }

    public void debiter(double montant) {
        this.solde -= montant;
    }

    public void afficher() {
        System.out.println("Client " + this.numeroClient + " : " + this.nom + " - Solde : " + this.solde);
    }
}
