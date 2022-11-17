import java.util.Scanner;
public class exercise1 {
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in); //insert 3 parameters
        double parameterA;
        double parameterB;
        double parameterC;
        System.out.println("Please enter parameter A");
        parameterA=scanner.nextDouble();
        System.out.println("Please enter parameter B");
        parameterB=scanner.nextDouble();
        System.out.println("Please enter parameter C");
        parameterC=scanner.nextDouble();
        quadraticequation(parameterA,parameterB,parameterC); //go to function with 3 parameters
    }
    public static void quadraticequation(double parameterA,double parameterB,double parameterC){ // function for quadratic equation
        double x1=0; //variables for x
        double x2=0;
        double sqrtroot=0; //variable for check the summery under the sqrt.
        sqrtroot=(parameterB*parameterB)-4*(parameterA*parameterC);
        if(sqrtroot>= 0){ //check if the summery under the sqrt is positive.
            sqrtroot=Math.sqrt(sqrtroot); //sqrt
            x1=(-(parameterB)+sqrtroot)/(2*parameterA); //calculation for x1 with +
            x2=(-(parameterB)-sqrtroot)/(2*parameterA); //calculation for x2 with -
            if(x1!=x2){ //if the differentes, it been tow solutions.
                System.out.println("There are two solutions to the quadratic equation: x1= "+x1+" x2= "+x2);}
            else if (x1==x2) { // if they equals, it been one solution.
                System.out.println("There is one solution to the quadratic equation: x1= "+x1);}
        }
        else{ // the summery under sqrt is negative, no solution for quadratic equation.
            System.out.println("There are no solutions to the quadratic equation");}
    }
}

