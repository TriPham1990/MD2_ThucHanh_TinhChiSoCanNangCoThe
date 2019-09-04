import java.util.Scanner;

public class BmiCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the weight : ");
        double weight = scanner.nextDouble();
        System.out.println("Enter the height : ");
        double height = scanner.nextDouble();

        double bmi = weight / Math.pow(height,2);

        if(bmi >= 30){
            System.out.println("Obese");
        } else if(bmi < 30 && bmi >= 25){
            System.out.println("Overweight");
        } else if(bmi < 25 && bmi >= 18.5){
            System.out.println("Normal");
        } else {
            System.out.println("Underweight");
        }

    }
}
