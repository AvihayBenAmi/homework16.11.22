import java.util.Scanner;
public class exercise2 {
        public static void main(String []args){
            int firstnumber; //variables for parameters.
            int diffrence;
            int elements;
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter First number in series");
            firstnumber=scanner.nextInt();
            System.out.println("Enter The diffrence");
            diffrence=scanner.nextInt();
            System.out.println("Enter Number of elements");
            elements=scanner.nextInt();
            function1(firstnumber,diffrence,elements); //go to function with variables values.
        }
        public static void function1(int firstnumber,int diffrence,int elements){
            int number=firstnumber; //initialization the print number to first number.
            System.out.print("the series math is " +firstnumber+" "); //print just the first number.
            for(int i=1; i<elements; i++){ //loop from 1 until numbers of elements.
                System.out.print(number+diffrence+" "); //print the number+the diffrernce each time until the number of the elements.
                number=number+diffrence; //add the difference to number for the next loop.
            }
        }
    }
