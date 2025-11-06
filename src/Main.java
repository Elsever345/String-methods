import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String str="   Hello World!   ";


        System.out.println(str.toLowerCase());

        System.out.println(str.toUpperCase());

        System.out.println(str.trim());

        System.out.println(str.replace(" ", ""));

        System.out.println(str.replaceAll("l", ""));

        System.out.println(str.replaceFirst("l", "e"));

        System.out.println(str.substring(5,8));

        System.out.println(str.concat("Java"));

        System.out.println(str.compareTo("   Hello World!"   ));

        System.out.println(str.contains("!"));

        System.out.println(str.lastIndexOf("l"));

        System.out.println(str.startsWith(" "));

        System.out.println(str.endsWith("!"));

        System.out.println(str.indexOf("e"));

        System.out.println(Arrays.toString(str.split(" ")));

        System.out.println(str.repeat(4));

    }
}