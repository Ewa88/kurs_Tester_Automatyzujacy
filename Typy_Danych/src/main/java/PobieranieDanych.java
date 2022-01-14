import java.util.Scanner;

public class PobieranieDanych {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witaj użytkowniku");
        System.out.println("Podaj imię");
        String name = scanner.nextLine();
        System.out.println("Nazwisko");
        String surname = scanner.nextLine();
        System.out.println("Wiek");
        byte age = Byte.parseByte(scanner.nextLine());
        System.out.println("wzrost w mm");
        short hight = Short.parseShort(scanner.nextLine());
        System.out.println("waga w kilogramach");
        int mass = Integer.parseInt(scanner.nextLine());
        System.out.println("Witaj "+name+" "+surname);
        System.out.println("lat: "+age);
        System.out.println("Masz "+hight+" mm wzrostu i "+mass+ " kilogramów.");
}
}
