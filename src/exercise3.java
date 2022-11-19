import java.util.Scanner;
public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number; //variable for parameter
        do { //check the insert number
            System.out.println("Enter a odd and positive number bigger than 3");
            number = scanner.nextInt();
        }
        while (!(number % 2 != 0 && number >= 3));
        diamond(number); //go to the function with a correct number.
    }

    public static void diamond(int number) {
        for (int i = 1; i <= number; i += 2) { //loop for rows
            for (int j = 1; j <= i; j++) { //loop for prints
                if(j==1){
                    for(int k=i; k<=number; k+=2){ //loop for spaces
                        System.out.print(" ");}
                }
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = number-2; i >= 1; i -=2) { //loop for rows in the opposite order
            for (int j = i; j >= 1; j--) { //loop for prints in the opposite order
                if(j==i){
                    for(int k=i; k<=number; k+=2){ //loop for spaces in the opposite order
                        System.out.print(" ");}
                }
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
