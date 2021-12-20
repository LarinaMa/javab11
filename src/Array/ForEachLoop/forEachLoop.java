package Array.ForEachLoop;

public class forEachLoop {
    public static void main(String[] args) {
        /*
         FOR LOOP vs. FOR EACH LOOP
        FOR LOOP
        for (int i =0; i< numbers.length; i++){
        numbers[i]
        }
        int[] numbers = {7,8,9,10}
        FOR EACH LOOP ----> starting from the beginning to the end
        for (int num: numbers){
        num
        }
         */
        int[] numbers = {45, 23, 5, 7, 21, 66, 100};
        // print out each element from this array by using for each loop
        for (int i = 0; i < +numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println("===============");

        for (int num : numbers) {
            System.out.println(num);
        }
        System.out.println("===============");
        String flowers[] = {"rose", "lily", "orchid", "violet", "tulip"};
        for (String flower : flowers) {
            System.out.println(flower);// will print every element form array

        }
        System.out.println("===============");
        for (String flower : flowers) {
            System.out.println(flowers[0]); //this will print 1st element 'rose' fpr arrays size
        }
    }
}
