import java.util.Arrays;
import java.util.Scanner;

public class simplify{

    int[] data;
    int[] arranged_data;
    public static void main(String[] args) {
        simplify s = new simplify();
        s.take_input_in_array();
        s.find_sum();
    }

    void take_input_in_array(){
        int i = 0;
        Scanner sc = new Scanner(System.in);       
        while(sc.hasNextInt()){
            data[i] = sc.nextInt();
            ++i;
        }
        sc.close();
    }

    void find_sum(){
        for(int i= 0; i<=data.length; i++){
            boolean found = Arrays.stream(data).anyMatch(x -> x == 1);
            System.out.println(found);
        }
    }
}