import java.util.Scanner;

public class main {
    //Complete the following program. Use the Scanner class to read the following string into variables.
    //Input String: "P Sherman 42 Wallaby Way Sydney" Variables: firstInitial,lastName, houseNumber,streetName,streetType,city
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your first initial?");
        String firstInitial = keyboard.nextLine();
        System.out.println("What is your last name?");
        String lastName =keyboard.nextLine();
        System.out.println("What is your house number?");
        int houseNumber = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("What is your street name?");
        String streetName = keyboard.nextLine();
        System.out.println("What is your street type?");
        String streetType = keyboard.nextLine();
        System.out.println("What is your city?");
        String city = keyboard.nextLine();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
