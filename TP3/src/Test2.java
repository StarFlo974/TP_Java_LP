public class Test2 {
    public static void main(String[] args) {
        Annuaire annuaire = new Annuaire();
        Client c1 = new Client("toto");
        Client c2 = new Client("toto");
        annuaire.ajouterClient(c1);
        System.out.println(annuaire.contient(c2));
    }
    
}
