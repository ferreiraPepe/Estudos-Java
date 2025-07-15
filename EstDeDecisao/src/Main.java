import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        var name = scanner.next();
        System.out.println("Qual sua idade?");
        var age = scanner.nextInt();

        if (age >= 18) {
            System.out.printf("%s, você pode dirigir, você tem  %s anos\n",name,age);
        } else System.out.println("Você não pode dirigir ssss");


    }
}