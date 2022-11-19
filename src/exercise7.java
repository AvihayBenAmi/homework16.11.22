public class exercise7 {
    public static void main(String[] args) {
        narcisist();
    }

    public static void narcisist() {
        double digits;
        for (int i = 1; i <= 1000; i++) {
            if(i>=1&&i<=9){
                digits=1;
            if(Math.pow(i,digits)==i){
            System.out.print(" "+i);}
            }
            else if (i>=10&&i<=99) {
                digits=2;
                if((Math.pow(i%10,digits)+Math.pow(i/10%10,digits))==i)
                    System.out.print(" "+i);}
            else{
                digits=3;
                if(((Math.pow(i%10,digits))+(Math.pow(i/10%10,digits))+(Math.pow(i/100%10,digits)))==i){
                    System.out.print(" "+i);}
            }
        }
    }
}
