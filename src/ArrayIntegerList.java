public class ArrayIntegerList implements IntegerList {
    private int[] data;  // Das Array für die Liste
    private int size;    // Die aktuelle Anzahl der Elemente in der Liste

    public ArrayIntegerList(int maxSize) {
        data = new int[maxSize];
        size = 0;
    }

    @Override
    public int getLength() {
        return size;
    }

    @Override
    public int insertLast(int value) {
        if (size >= data.length) {
            return -1; // Liste ist voll
        }
        data[size] = value;
        size++;
        return 0; // Erfolgreich eingefügt
    }

    @Override
    public int getFirst() {
        if (size == 0) {
            return -9999; // Liste ist leer
        }
        return data[0];
    }

    @Override
    public int deleteFirst() {
        if (size == 0) {
            return -1; // Liste ist leer
        }
        // Alle Elemente nach vorne verschieben
        for (int i = 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        return 0; // Erfolgreich gelöscht
    }

    @Override
    public boolean search(int value) {
        for (int i = 0; i < size; i++) {
            if (data[i] == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void print() {
        if (size == 0) {
            System.out.println("Liste ist leer.");
        } else {
            System.out.print("Liste: ");
            for (int i = 0; i < size; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }
}
