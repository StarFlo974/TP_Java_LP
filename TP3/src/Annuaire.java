
public class Annuaire {
    private Client[] clients;
    private int nbClients;

    public Annuaire() {
        this.clients = new Client[100];
        this.nbClients = 0;
    }

    public void ajouterClient(Client client) {
        if (this.nbClients < this.clients.length) {
            this.clients[this.nbClients] = client;
            this.nbClients++;
        }
    }

    public void afficher() {
        for (int i = 0; i < this.nbClients; i++) {
            this.clients[i].afficher();
        }
    }

    public Client getClient(int numeroClient) {
        for (int i = 0; i < this.nbClients; i++) {
            if (this.clients[i].getNumeroClient() == numeroClient) {
                return this.clients[i];
            }
        }
        return null;
    }

    public int getNbClients() {
        return nbClients;
    }

    public double getTotalSolde() {
        double total = 0;
        for (int i = 0; i < this.nbClients; i++) {
            total += this.clients[i].getSolde();
        }
        return total;
    }

    public void crediter(int numeroClient, double montant) {
        Client client = this.getClient(numeroClient);
        if (client != null) {
            client.crediter(montant);
        }
    }

    public void debiter(int numeroClient, double montant) {
        Client client = this.getClient(numeroClient);
        if (client != null) {
            client.debiter(montant);
        }
    }

    public void supprimerClient(int numeroClient) {
        for (int i = 0; i < this.nbClients; i++) {
            if (this.clients[i].getNumeroClient() == numeroClient) {
                this.clients[i] = this.clients[this.nbClients - 1];
                this.nbClients--;
                return;
            }
        }
    }

    public boolean contient(Client client) {
        for (int i = 0; i < this.nbClients; i++) {
            if (this.clients[i].equals(client)) {
                return true;
            }
        }
        return false;
    }

	
}
