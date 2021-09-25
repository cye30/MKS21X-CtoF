/* What should the functions have as parameter(s)? c-celsius, f-fahrenheit
What type should they be? double
What should the functions return? doubles values */


import java.util.Scanner;

public class CtoFTester{

  public static void main(String[] arg){

    Scanner in = new Scanner(System.in);

    System.out.print("Enter Celsius Temperature: ");
    double c = in.nextDouble();
    System.out.println(celsiusToFahrenheit(c));
    System.out.print("Enter Fahrenheit Temperature: ");
    double f = in.nextDouble();
    System.out.println(fahrenheitToCelsius(f));

  }

  public static double celsiusToFahrenheit(double c){
    return (c * 9 / 5 + 32);
  }

  public static double fahrenheitToCelsius(double f){
    return (f - 32) * 5 / 9;
  }

}
