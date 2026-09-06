import java.util.Scanner;
import java.util.Arrays;
public class Main {

    static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = i + i * i;
            System.out.println(arr[i]);
        }
        System.out.println();
        Arrays.sort(arr);
        for(int x : arr) System.out.println(x);


        scanner.close();
    }
}
