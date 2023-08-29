import java.util.Scanner;

public class Temp_Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Temperature Conversion Program - ");
        System.out.print("Please enter the temperature in Celsius : ");
        float temp_c = input.nextFloat();
        float temp_f = temp_c * 1.8F + 32.0F;
        System.out.println("Temperature in Fahrenheit is = " + temp_f);
        System.out.println("..End of program..");
    }
}
