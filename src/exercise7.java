public class exercise7 {
    public static void main(String[] args) {
        narcisistNumbers(); //go to function
    }

    public static void narcisistNumbers() {
        double digits; //parametr for number of digits.
        for (int i = 1; i <= 1000; i++) { //loop for all numbers between 1-1000
            if(i>=1&&i<=9){ //check the numbers between 1-9.
                digits=1;
            if(Math.pow(i,digits)==i){ //check if the number in pow in number of digits equal to number.
            System.out.print(" "+i);}
            }
            else if (i>=10&&i<=99) { //check the numbers between 10-99
                digits=2;
                if((Math.pow(i%10,digits)+Math.pow(i/10%10,digits))==i)
                    System.out.print(" "+i);}
            else{ // check the numbers between 100-999
                digits=3;
                if(((Math.pow(i%10,digits))+(Math.pow(i/10%10,digits))+(Math.pow(i/100%10,digits)))==i){
                    System.out.print(" "+i);}
            }
        }
    }
}
