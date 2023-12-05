
public class Test {
	public static void main(String[] args) {

		Annuaire annuaire = new Annuaire();
		
		
		int rep =0; 
		while(rep!=-1){              
			System.out.println("1 ===>  Ajouter un nouveau client"); 
			System.out.println("2 ===>  Afficher la taille de l'annuaire"); 
			System.out.println("3 ===>  Afficher l'annuaire complet"); 
			System.out.println("4 ===>  Rechercher un client par son identifiant"); 
			System.out.println("5 ===>  Supprimer un client par son identifiant"); 
			System.out.println("6 ===>  Crediter le solde d'un client"); 
			System.out.println("7 ===>  Afficher le total des soldes des clients de l'annuaire"); 
			System.out.println("-1 ===>  Quitter"); 
			rep = Saisie.lireEntier("Votre choix ?"); 
			
			if(rep == 1){

				String nom = Saisie.lireChaine("Nom du client ?");
				Client client = new Client(nom);
				annuaire.ajouterClient(client);

			} else if (rep ==2){ 

				System.out.println("Taille de l'annuaire : " + annuaire.getNbClients());
	
			} else if (rep ==3){ 
				
				annuaire.afficher();
				
			} else if (rep ==4){ 

				int numeroClient = Saisie.lireEntier("Numero du client ?");
				Client client = annuaire.getClient(numeroClient);
				if(client != null){
					client.afficher();
				} else {
					System.out.println("Client non trouvé");
				}
				
			} else if (rep ==5){ 
				
				int numeroClient = Saisie.lireEntier("Numero du client ?");
				annuaire.supprimerClient(numeroClient);
				
			} else if (rep ==6){ 
				
				//Crediter le solde d'un client
				int numeroClient = Saisie.lireEntier("Numero du client ?");
				Client client = annuaire.getClient(numeroClient);
				if(client != null){
					double montant = Saisie.lireDouble("Montant à créditer ?");
					client.crediter(montant);
				} else {
					System.out.println("Client non trouvé");
				}
				
			} else if (rep ==7){ 
				
				double total = 0;
				for(int i=0; i<annuaire.getNbClients(); i++){
					total += annuaire.getClient(i).getSolde();
				}
				System.out.println("Total des soldes : " + total);
				
			}
		}
		
		
	}
}
