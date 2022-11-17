import java.util.Scanner;
public class exercise1 {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);
        double parameterA;
        double parameterB;
        double parameterC;
        System.out.println("Please enter parameter A");
        parameterA=scanner.nextDouble();
        System.out.println("Please enter parameter B");
        parameterB=scanner.nextDouble();
        System.out.println("Please enter parameter C");
        parameterC=scanner.nextDouble();
        quadraticequation(parameterA,parameterB,parameterC);
    }
    public static void quadraticequation(double parameterA,double parameterB,double parameterC){
        double x1=0;
        double x2=0;
        double sqrtroot=0;
        sqrtroot=(parameterB*parameterB)-4*(parameterA*parameterC);
        if(sqrtroot>= 0){
            sqrtroot=Math.sqrt(sqrtroot);
            x1=(-(parameterB)+sqrtroot)/(2*parameterA);
            x2=(-(parameterB)-sqrtroot)/(2*parameterA);
            if(x1!=x2){
                System.out.println("There are two solutions to the quadratic equation: x1= "+x1+" x2= "+x2);}
            else if (x1==x2) {
                System.out.println("There is one solution to the quadratic equation: x1= "+x1);}
        }
        else{
            System.out.println("There are no solutions to the quadratic equation");}
    }
}

