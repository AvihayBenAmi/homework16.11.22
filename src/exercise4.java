import java.util.Scanner;

public class exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number; //variable for parameter.
        System.out.println("Enter Number Please");
        number = scanner.nextInt();
        if(number>0){ //check if the number is positve.
        primeNumber(number);} //go to function with correct number.
    }

    public static void primeNumber(int number) {
        int countPrints = 0; //counter primenumbers that printed.
        int runNumber = 2; //variable for run number.
        do {
            int countDividers = 0; //variable to count dividers numbers.
            for (int i = 1; i <= runNumber / 2; i++) { //loop for check prime numbers.
                if (runNumber % i == 0) {
                    countDividers++;
                }
            }
            if(countDividers==1){ //if found 1 divider, is a prime number.
                System.out.print(" " + runNumber);
                countPrints++;}
            runNumber++;
        }
        while (countPrints != number) ; // stop when we count prints that equal to the number insert.
    }
}

