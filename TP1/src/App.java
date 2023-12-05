        class camion{
            public static void main(String[] args) {
                Camion camion1 = new Camion(20000, "1234-AB-56", "J9", "B", 2008, 25);
                camion1.afficherCamion();
                if (camion1.peutTransporterVolume(7)){
                    System.out.println("Le camion peut transporter le volume");
                } else {
                    System.out.println("Le camion ne peut pas transporter le volume");
                
                };
                System.out.println(camion1.coutLocation());
            }
        }

        class voiture{
            public static void main(String[] args) {
                Voiture voiture1 = new Voiture(10000, "AB-123-CD", "Twingo", "B", 2019, true);
                voiture1.afficherVoiture();
                System.out.println(voiture1.coutLocation());
            }
        }

        class autocar{
            public static void main(String[] args) {
                Autocar autocar1 = new Autocar(90000, "123-AB-45", "FRI", "D", 2005, 3, 53);
                autocar1.afficherAutocar();
                if (autocar1.peutTransporterPassagers(10,0.1)){
                    System.out.println("L'autocar peut transporter les passagers");
                } else {
                    System.out.println("L'autocar ne peut pas transporter les passagers");
                
                }
                System.out.println(autocar1.coutLocation());
            }
        }