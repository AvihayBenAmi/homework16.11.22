import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("Enter Number Please");
        number = scanner.nextInt();
        if(number>0){
        primeNumber(number);}
    }

    public static void primeNumber(int number) {
        int countPrints = 0;
        int temp = 2;
        do {
            int countNotPrimes = 0;
            for (int i = 1; i <= temp / 2; i++) {
                if (temp % i == 0) {
                    countNotPrimes++;
                }
            }
            if(countNotPrimes==1){
                System.out.print(" " + temp);
                countPrints++;}
            temp++;
            //for (int i = 1; i <= number; i++) {    //loop for the number of prints
            // int count = 0;
            //for (int j = 2; j <= i/2; j++) {
            // if(i%j==0){
            //  count++;
            // System.out.print(" "+ j);
            // }
            // }
            //if(count)
            //  }
            //}
        }
        while (countPrints != number) ;
    }
}

