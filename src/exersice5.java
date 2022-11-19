import java.util.Scanner;
public class exersice5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number; //parameter to insert
        System.out.println("Enter Number Please");
        number = scanner.nextInt();
        isFib(number); //go to function with insert number.
    }
    public static void isFib(int number) {
        int num1 = 0; //first parameter in fib series
        int num2 = 1; //secondary parameter in fib series
        int num3; // calculate parameter
        //System.out.print(num1);  //prints for check
        //System.out.print(" " + num2);
        if(number>=0) { //check if the insert bigger or equal to 0.
            do { //do all time until the calculate number equal to the insert number.
                num3 = num2 + num1; //calculate
                //System.out.print(" " + num3); //print check.
                num1 = num2; //promote the series.
                num2 = num3;
            }
            while (num3 < number); //the insert number bigger than the calculate parameter.
            if ((num3 == number)||(number == 0)) { //check if the number insert equal to calculate or to 0.
                System.out.println(" Your Number is in Fibunacci series");} //print yes.
            else{
                System.out.println(" Your Number is not in Fibunacci series");} //or print no.
        }
    }
}
