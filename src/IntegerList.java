public interface IntegerList {


    int getLength();             // Gibt die Länge der Liste zurück
    int insertLast(int value);   // Fügt ein Element am Ende der Liste ein
    int getFirst();              // Gibt das erste Element zurück
    int deleteFirst();           // Entfernt das erste Element
    boolean search(int value);   // Prüft, ob ein Wert in der Liste vorhanden ist
    void print();                // Gibt den Inhalt der Liste aus
}
