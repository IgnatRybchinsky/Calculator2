import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        int sw;


        System.out.println("Enter the a: ");
        Scanner s1 = new Scanner(System.in);
        double a = s1.nextDouble();

        System.out.println("Enter the a: ");
        Scanner s2 = new Scanner(System.in);
        double b = s2.nextDouble();

        System.out.println("Enter the a: ");
        Scanner s3 = new Scanner(System.in);
        double c = s3.nextDouble();

         double delta= b*b-(4*a*c);
        System.out.println(delta);

        if (delta<0){
            sw=1;
        } else if(delta==0){
            sw=2;
        }else if(delta>0){
            sw=3;
        }


      switch (sw){
          case 1:


              break;
           case 2:


          break;

          case 3:


              break;




      }






    }
}