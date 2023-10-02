import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите адрес: ");
        String ip = sc.nextLine();
        eighth_task(ip);
    }
    public static void eighth_task(String ip){
        if (ip.matches("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$")) {
            System.out.println("IP-адрес верный");
        } else {
            System.out.println("IP-адрес неверный");
        }
    }
}