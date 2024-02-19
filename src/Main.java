import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println(task1("World"));
        System.out.println(task2("Just Hello"));
        task3("радар");
        System.out.println(task4("Helloo"));
        System.out.println(Arrays.toString(task5("Hello Peaceful World")));
    }

    public static String task1(String text) {
        String reversText = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversText += text.charAt(i);
        }
        return reversText;
    }

    public static int task2(String str) {
        str = str.toLowerCase();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void task3(String msg) {
        String reversMsg = "";
        for (int i = msg.length() - 1; i >= 0; i--) {
            reversMsg += msg.charAt(i);
        }
        if (reversMsg.equals(msg)) {
            System.out.println("Так це паліндром");
        } else {
            System.out.println("Ні, це слово не є паліндромом");
        }
    }

    public static String task4(String input) {
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (seen.add(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static String[] task5(String word) {
        return word.split(" ");
    }
}