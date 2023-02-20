import Sn.edu.ucao.domain.Personne;

public class Main {
    public static void main(String[] args){
        Personne p = new Personne();
        Personne p1 = new Personne("DIOP","Toto");
        Personne p2 = new Personne("Mariste");

        //System.out.println(p1.getNom());
        //System.out.println(p1.getPrenom());

        p1.setNom("Diompy");
        p1.setPrenom("Albert");


        System.out.println(p1);

        }

    }
