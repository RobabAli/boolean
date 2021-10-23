import java.util.Scanner;

public class bool {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean isMinor = false;
        System.out.println("Enter your age: ");
        double age = input.nextDouble();

        if(age<18){
            isMinor = true;
            System.out.println("You are a minor");
        }
        else{
            System.out.println("You are not a minor");
        }






    }
}
