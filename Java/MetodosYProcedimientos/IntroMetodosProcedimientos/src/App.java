import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        App methos = new App();
        methos.printCustomMessage("New Message");

        Person personOne = new Person("Ana", "Rodriguez", 151212);
        System.out.println(personOne);
        personOne.caminar();
        System.out.println("Acceso a los atributos del objeto");
        System.out.println(String.join("---", personOne.age, Integer.toString(personOne.id), personOne.name));

    }
    public void printCustomMessage(String msg){
        System.out.printf("The message was: %s\n", msg);
    }
}