package Project3;

import java.util.Scanner;

public class MusicBox {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int classic$ = 2, pop$ = 4, country$ = 3;// music price
        System.out.println("Available music types are Classical, Pop, and Country.");
        System.out.println("Here is the price");
        System.out.println("Classical: 2$");
        System.out.println("Country: 3$");
        System.out.println("Pop: 4$");
        System.out.println("Please enter the music type");
        String musicCategory = input.nextLine().toLowerCase();// music category from user
        int sum, sum1, sum2;
        Scanner scan = new Scanner(System.in);
        String usersAnswer;
        do {
            System.out.println("Please enter the music type");
            switch (musicCategory) {
            case "classical":
                System.out.println("Four Seasons");
                System.out.println("Fur Elise");
                System.out.println("Finlandia");
                System.out.println("Vocalise");
                System.out.println("Planet");
                System.out.println("Which one do you want to listen?");
                Scanner input1 = new Scanner(System.in);
                String classic = input.nextLine();
                if (classic.equalsIgnoreCase("four seasons") || classic.equalsIgnoreCase("fur elise")
                        || classic.equalsIgnoreCase("finlandia") || classic.equalsIgnoreCase("vocalise")
                        || classic.equalsIgnoreCase("planet")) {
                    System.out.println("please enter the 2$ for this song");
                    Scanner money = new Scanner(System.in);
                    int user$ = money.nextInt();

                    if (user$ == classic$) {
                        System.out.println(classic + " is playing. Enjoy with the song is your change");
                    }
                    if (user$ < classic$) {
                        while (user$ < classic$) {
                            sum = classic$ - user$;
                            System.out.println("$" + user$ + " is not enough, please try later or pay $" + sum + " more");
                            user$++;
                        }

                    } else {
                        sum1 = user$ - classic$;
                        System.out.println("You have entered " + sum1 + "$ more. Please wait for change");
                        System.out.println(classic + " is playing. Enjoy with the song");

                    }
                } else {
                    System.out.println("Name of song is not available");
                }
                break;
            case "pop":
                System.out.println("Bad Guy");
                System.out.println("Talk");
                System.out.println("Please me");
                System.out.println("7 Ring");
                System.out.println("Without me");
                System.out.println("Which one do you want to listen");
                Scanner input2 = new Scanner(System.in);
                String pop = input.nextLine();
                if (pop.equalsIgnoreCase("Bad Guy") || pop.equalsIgnoreCase("Talk")
                        || pop.equalsIgnoreCase("Please me") || pop.equalsIgnoreCase("7 Ring")
                        || pop.equalsIgnoreCase("Without me")) {
                    System.out.println("please enter the 4$ for this song");
                    Scanner money1 = new Scanner(System.in);
                    int user$1 = money1.nextInt();
                    if (user$1 < pop$) {
                        System.out.println("ENTERED PRICE is not enough, please try later");
                    } else {
                        System.out.println(pop.toUpperCase() + " is playing. Enjoy with the song”.");
                    }
                } else {
                    System.out.println("Name of song is not available");
                }
                break;
            case "country":

                System.out.println("Meant To Be");
                System.out.println("Heaven");
                System.out.println("Simple");
                System.out.println("One number Away");
                System.out.println("Get Along");
                System.out.println("Which one do you want to listen");
                Scanner input3 = new Scanner(System.in);
                String country = input.nextLine();
                if (country.equalsIgnoreCase("Meant To Be") || country.equalsIgnoreCase("Heaven")
                        || country.equalsIgnoreCase("Simple") || country.equalsIgnoreCase("One number Away")
                        || country.equalsIgnoreCase("Get Along")) {
                    System.out.println("please enter the 3$ for this song");
                    Scanner money2 = new Scanner(System.in);
                    int user$2 = money2.nextInt();
                    if (user$2 < country$) {
                        System.out.println("ENTERED PRICE is not enough, please try later");
                    } else {
                        System.out.println(country.toUpperCase() + " is playing. Enjoy with the song”.");
                    }
                } else {
                    System.out.println("Name of song is not available");
                }
                break;
            default:
                System.out.println("The  " + musicCategory + " music category is not available");
                break;
        }
                    System.out.println("Do you want to listen songs again? yes/no");
                    usersAnswer = scan.nextLine();
        }while (usersAnswer.equalsIgnoreCase("yes")) ;


    }
}










