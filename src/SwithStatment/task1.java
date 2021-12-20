package SwithStatment;

public class task1 {
    public static void main(String[] args) {
        int num = 123;
        switch (num) {
            case 100:
                System.out.println("this is 1st case");
            case 110:
                System.out.println("this is 2snd case");
            case 120:
                System.out.println("this is 3rd case");
            case 123:
                System.out.println("this is 4th case");
            case 130:
                System.out.println("this is 5th case");
                defalt:
                System.out.println("this is default case");

//this is 4th case
//this is 5th case
//this is default case ------> printing everything after it find right case

                int num1 = 12;
                switch (num1) {
                    case 5:
                        System.out.println("this is 1st case");
                        break;
                    case 8:
                        System.out.println("this is 2snd case");
                        break;
                    case 12:
                        System.out.println("this is 3rd case");
                        break;
                    case 11:
                        System.out.println("this is 4th case");
                        break;
                    case 13:
                        System.out.println("this is 5th case");
                        break;
                    default:
                        System.out.println("this is default case");
                        break;
                }
        }

// this is 3rd case --> <break> help to stop after right name is found and executed
        int num3 = 102;
        switch (num3) {
            case 5:
                System.out.println("this is 1st case");
                break;
            case 10:
                System.out.println("this is 5th case");
                break;
            default:
                System.out.println("this is default case");
                break;
        }
    }
}