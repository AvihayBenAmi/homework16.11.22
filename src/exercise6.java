import java.util.Scanner;
public class exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number; //parameter to insert
        System.out.println("Enter Number Please");
        number = scanner.nextInt();
        sumDigits(number); //go to function with insert number.
    }
    public static void sumDigits(int number){
        int sum=0; //parameter for sum digits
        int temp=0; //parameter for the sum + the last digit
        do{
            sum=sum+(number%10); //extract the last digit
            number=number/10; //cut the number without the last digit.
            temp=sum+number; //add the number to sum, for the first digit
        }
        while(number/10!=0); //end when is one digit left.
        System.out.println("The Summery of digits is "+temp); //print the summery.
    }
}
