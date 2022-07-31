import java.util.Scanner;

//progrma to print the season according to the month entered by the user using if else
class season
{
    public static void main(String args[])
    {
        int month;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month");
        month = sc.nextInt();
        
        
        if(month==1||month==2||month==3||month==4){
            System.out.println("The season is winter");
        }
        else if(month==5||month==6||month==7||month==8){
            System.out.println("The season is spring");
        }
        else if(month==9||month==10||month==11||month==12){
            System.out.println("The Season is summer");
        }
        else{
            System.out.println("Invalid month");
        }
        sc.close();
    }
}