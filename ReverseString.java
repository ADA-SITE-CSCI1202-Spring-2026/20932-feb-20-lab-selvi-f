import java.util.Scanner;

public class ReverseString {

    public static String reverse(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversedStr = reverse(str);

        System.out.println("Original: " + str);
        System.out.println("Reversed: " + reversedStr);

        sc.close();
    }
}