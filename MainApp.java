/*
 * base numérique : décimale ( 10 -> 0 à 9)
 *                : binaire ( 2 ->0 à 1)
 *                : octale (8 -> 0 à 7)
 *                : hexadécimale (16 -> 0 à F)
 * nombre entier  : 12
 *                : 12_333
 *                : 12333
 * binaire -> 0b1100011
 *         -> 1_100_011
 * hexadécimale -> 0xFB233
 * 
 * boolean	1	Représente une valeur booléenne, soit true (vrai) soit false (faux).
 * byte	    8	Représente un entier signé de 8 bits.
 * short	16	Représente un entier signé de 16 bits.
 * int	    32	Représente un entier signé de 32 bits.
 * long	    64	Représente un entier signé de 64 bits.
 * float	32	Représente un nombre flottant simple précision en virgule flottante   conformément à la norme IEEE 754.
 * double	64	Représente un nombre flottant double précision en virgule flottante conformément à la norme IEEE 754.* char	16	Représente un caractère Unicode codé sur 16 bits.
 * 
 * \n : retour à la ligne
 * \t : tabulation
 * \r : retour chariot
 * \b : retour arriere
 * \f : nouvelle page (file)
 * 
 * pas de caracteres speciaux pas d'espaces, commence par une lettre ou un underscore (_) par convention on utilsera le CamelCase
 * 
 */
//demander a l'utilisateur de rentrer un chiffre de depart , condition d'arret defini par l'utilksateur
// import java.util.Scanner;
//     public static void main(String[] args) {

//         Scanner valeurDebut = new Scanner(System.in);
//         System.out.println("Saisissez un entier :");
//         int i = valeurDebut.nextInt();
//         Scanner valeurFin = new Scanner(System.in);
//         System.out.println("Saisissez un entier de fin :");
//         int fin = valeurFin.nextInt();

//         do {
//             i--;
//             if (i % 2 != 0) {
//                 continue;
//             }

//               System.out.println(i);                   
//         }
//         while (i != fin);
//     }
// }


import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // int debut;
        // int fin;
        // do {
        //     System.out.println("Saisissez un entier de début entre 1 et 10 :");
        //     debut = sc.nextInt();
        // } while (debut < 1 || debut > 10);
        // do {
        //     System.out.println("Saisissez un entier de fin supérieur à 10 :");
        //     fin = sc.nextInt();
        //     sc.close();
        // } while (fin <= 10);

        // for (int i = debut; i <= fin; i++) {
        //     if (i % 2 == 0) {
        //         System.out.println(i);
        //     }
        // }
    }
}