import java.util.Scanner;
public class exercise2 {
        public static void main(String []args){
            int firstnumber;
            int diffrence;
            int elements;
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter First number in series");
            firstnumber=scanner.nextInt();
            System.out.println("Enter The diffrence");
            diffrence=scanner.nextInt();
            System.out.println("Enter Number of elements");
            elements=scanner.nextInt();
            function1(firstnumber,diffrence,elements);
        }
        public static void function1(int firstnumber,int diffrence,int elements){
            int number=firstnumber;
            System.out.print("the series math is " +firstnumber+" ");
            for(int i=1; i<elements; i++){
                System.out.print(number+diffrence+" ");
                number=number+diffrence;
            }
        }
    }
