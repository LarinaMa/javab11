import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
int[][] input = {{3,5,6,7},{2,4},{1},{2,3,4,5}};
int result = 1;
for(int i=0; i<input.length;i++){
    for(int j=0; j<input[2].length; j++){
        result*=input[i][j];
    }
}
        System.out.println(result);
    }
}