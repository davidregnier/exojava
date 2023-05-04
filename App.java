import java.util.Scanner;

public class App
{
    public static void main(String[] args) {
       Chat tom = new Chat("tom", 1, true);
       Chat annneSo = new Chat("anneSo", 2, false);
       Chien Remi = new Chien("remi", 5, true);
       Serpent Mathias = new Serpent("mathiass", 2, true, "froid");
       miaule(tom);
       tom.crier();
    }

    /*public static void name(Chat tom){
        System.out.println("tom.mName :" + tom.getName());
        System.out.println("tom.mAge :" + tom.getAge());
    }*/
    public static void miaule(Chat tom){
        String question = "Bonjour je m'appelle " + tom.getName() + " je suis un chat de " + tom.getAge() + " Voulez " +
                "vous me carresser ? (y/n)";

        Scanner saisieUtilisateur = new Scanner(System.in);
        System.out.println("Voulez vous le carresser ? y ou n ");
        String reponse = saisieUtilisateur.next();

        if(reponse.equals("y")){
            System.out.println(tom.getName() + " Miaule");
        } else if (reponse.equals("n")){
            System.out.println(tom.getName() + " s'en va.");
        } else {

        }
    }

}
