package Array.MultiDimentionalArrays;

public class StringPracticeDoubleArray {
    public static void main(String[] args) {
          /*
* if you create multidimentional array by using 'new' keyword, inner arrays will have same size
  ex:  int[][] numbers = new int[2][3];--> [[22, 33, 44], [55, 66, 77]]
* if you create multi dimentional array by using curly brackets,   size of the inner array can vary
  ex:    String[][] states = { {"IL","OH"},{},{"CA", "WA", "OR","UT"}};
         */
        // states of different regions in US
        //print out every state by one
         String[][] states = {{"IL", "OH"},{"NY","FL","NC"},{"CA","WA","OR", "UT"}};
        for (String[] state:states){
          for(String st: state){
        System.out.println(st);
        }
        }
    }
}


