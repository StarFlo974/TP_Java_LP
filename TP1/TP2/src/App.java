class TestBatiment{
    public static void main(String[] args) {
        Batiment b = new Batiment("24 rue dacoté", 20);
        Immeuble i = new Immeuble("25 rue dacoté", 110, 30);
        Maison m = new Maison("26 rue dacoté", 120, 5, 100);
        System.out.println(b);
        System.out.println(i);
        System.out.println(m);
    }

            public static int surfaceHabitableTotale(Maison[] tabMaison){
                int surfaceHabitableTotale = 0;
                for (Maison maison : tabMaison) {
                    surfaceHabitableTotale += maison.getSurfaceHabitable();
                }
                return surfaceHabitableTotale;
            }

            public static int surfaceJardinTotale(Maison[] tabMaison){
                int surfaceJardinTotale = 0;
                for (Maison maison : tabMaison) {
                    surfaceJardinTotale += maison.getSurfaceJardin();
                }
                return surfaceJardinTotale;
            }
        }

