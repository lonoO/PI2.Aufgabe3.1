import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Maximale Größe der Liste eingeben
        System.out.print("Maximale Größe der Liste eingeben: ");
        int maxSize = scanner.nextInt();

        ArrayIntegerList list = new ArrayIntegerList(maxSize);

        boolean running = true;

        while (running) {
            System.out.println("\nWähle eine Aktion:");
            System.out.println("1: insertLast");
            System.out.println("2: getFirst");
            System.out.println("3: deleteFirst");
            System.out.println("4: search");
            System.out.println("5: print");
            System.out.println("6: getLength");
            System.out.println("0: Beenden");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Gib den Wert ein: ");
                    int value = scanner.nextInt();
                    int result = list.insertLast(value);
                    System.out.println("Ergebnis: " + result);
                    break;
                case 2:
                    System.out.println("Erstes Element: " + list.getFirst());
                    break;
                case 3:
                    System.out.println("deleteFirst Ergebnis: " + list.deleteFirst());
                    break;
                case 4:
                    System.out.print("Gib den Suchwert ein: ");
                    int searchValue = scanner.nextInt();
                    System.out.println("Gefunden: " + list.search(searchValue));
                    break;
                case 5:
                    list.print();
                    break;
                case 6:
                    System.out.println("Länge der Liste: " + list.getLength());
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Ungültige Eingabe.");
            }
        }

        scanner.close();
    }
}
