public class Main {
    public static void main(String [] args){ //klasa główna wywołująca kolejne funkcje
        new Worker().show(); //wywołnie pierwszej funkcji powitalnej
        new Worker().read();
    }
}
