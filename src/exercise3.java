import java.util.Scanner;

public class exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a odd and positive number bigger than 3");
            number = scanner.nextInt();
        }
        while (!(number % 2 != 0 && number >= 3));
        diamond(number);
    }

    public static void diamond(int number) {
        for (int i = 1; i <= number; i += 2) {
            for (int j = 1; j <= i; j++) {
                if(j==1){
                    for(int k=i; k<=number; k+=2){
                        System.out.print(" ");}
                }
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = number-2; i >= 1; i -=2) {
            for (int j = i; j >= 1; j--) {
                if(j==i){
                    for(int k=i; k<=number; k+=2){
                        System.out.print(" ");}
                }
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
