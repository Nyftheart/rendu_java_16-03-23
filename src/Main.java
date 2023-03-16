import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        while (!quit) {
            System.out.println("Veuillez sélectionner une option :");
            System.out.println("1. Inverser une chaîne de caractères");
            System.out.println("2. Répéter les caractères non uniques");
            System.out.println("3. Afficher les caractères non répétés");
            System.out.println("4. Vérifier une chaîne de caractères");
            System.out.println("5. Quitter");
            System.out.print("Votre choix : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    stack_chaine_renverser.ReverseString.main(args);
                    break;
                case 2:
                    Charactere_repeter.RepeatingCharacters.main(args);
                    break;
                case 3:
                    Charactere_non_repeter.NonRepeatingCharacters.main(args);
                    break;
                case 4:
                    String_verify.ParenthesesChecker.main(args);
                    break;
                case 5:
                    System.out.println("exit");
                    quit = true;
                    break;
                default:
                    System.out.println("Désolé je n'ai pas compris votre demande");
                    break;
            }
        }
    }
}