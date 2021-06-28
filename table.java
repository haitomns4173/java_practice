import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        int product, num;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number : ");
        num = input.nextInt();
        for (int i = 1; i <= 10; i++){
            product = i * num;
            System.out.println(num+" * "+i+" = "+product);
        }
        input.close();
    }
}
