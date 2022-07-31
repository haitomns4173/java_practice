import java.util.Scanner;

public class exam{
    public static void main(String[] args){
        int physics, chemistry, maths, english, com_pro, com_arc;

        Scanner sc = new Scanner(System.in);

        System.out.println("# Enter the marks #");
        System.out.print("Physics : ");
        physics = sc.nextInt();
        System.out.print("Chemistry : ");
        chemistry = sc.nextInt();
        System.out.print("Maths : ");
        maths = sc.nextInt();
        System.out.print("English : ");
        english = sc.nextInt();
        System.out.print("Computer Programming : ");
        com_pro = sc.nextInt();
        System.out.print("Computer Architecture : ");
        com_arc = sc.nextInt();

        float total = physics + chemistry + maths + english + com_pro + com_arc;
        float percentage = (total * 100) / 475;
        float gpa = percentage / 25;
        System.out.print("\n\n");
        System.out.println("Total Marks : " + total);
        String per = String.format("%.02f", percentage);
        System.out.println("Percentage  : " + per + "%");

        if(percentage >= 90 && percentage <= 100){
            System.out.println("Grade       : A+");
        }
        else if(percentage >= 80 && percentage < 90){
            System.out.println("Grade       : A");
        }
        else if(percentage >= 70 && percentage < 80){
            System.out.println("Grade       : B+");
        }
        else if(percentage >= 60 && percentage < 70){
            System.out.println("Grade       : B");
        }
        else if(percentage >= 50 && percentage < 60){
            System.out.println("Grade       : C+");
        }
        else if(percentage >= 40 && percentage < 50){
            System.out.println("Grade       : C");
        }
        else if(percentage >= 30 && percentage < 40){
            System.out.println("Grade       : D+");
        }
        else if(percentage >= 20 && percentage < 30){
            System.out.println("Grade       : D");
        }
        else if(percentage >= 0 && percentage < 20){
            System.out.println("Grade       : E");
        }
        else{
            System.out.println("Not eligible");
        }

        String gpas = String.format("%.02f", gpa);
        System.out.println("GPA         : " + gpas);

        sc.close();
    }
}