import java.util.Scanner;

public class Converter {

    public static void main(String args[]) {
        Converter datConv = new Converter();
        datConv.tempConverter();
    }

    private void tempConverter() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter F or C for what you are converting from: ");
        String degType = scan.next();
        if (!degType.toLowerCase().equals("c") && !degType.toLowerCase().equals("f")) {
            Converter x = new Converter();
            x.tempConverter();
        } else {
            float degNum;
            System.out.print("How many degrees? ");
            String degrees = scan.next();
            while (!degrees.matches("^-?\\d+$")) {
                System.out.print("Please enter an integer value: ");
                degrees = scan.next();
            }
            degNum = Integer.parseInt(degrees);
            double convDeg;
            if (degType.toLowerCase().equals("f")) {
                convDeg = (degNum - 32) * (5.0/9);
                convDeg = (double)Math.round(convDeg * 100d) / 100d;
                System.out.println(
                        "That is " + convDeg + " degrees Celsius.");
            } else {
                convDeg = degNum * (9.0/5) + 32;
                convDeg = (double)Math.round(convDeg * 100d) / 100d;
                System.out.println(
                        "That is " + convDeg + " degrees Fahrenheit.");
            }
        }
    }
}
