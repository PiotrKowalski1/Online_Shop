import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Worker { //klasa, która wykonuje wszystkie funkcje
    int read = 0;  //zmienna przechowująca dane wprowadzone przez użytkownika
    int sum = 0;  // zmienna przechowująca informację o sumie zamówienia
    int amount = 0;  //zmienna przechowująca informację o ilości zakupionych produktów
    List<Product> list = new ArrayList<Product>(); //lista przechowująca informację o produktach dodawanych przez użytkownika

    public void show() //funkcja wyświetlająca informacje powitalne

    {
        System.out.println("Witaj w sklepie internetowym!");
        System.out.println("Wybierz rodzaj produktu.");
        System.out.println("1. Komputer 3000zł");
        System.out.println("2. Drukarka 500zł");
        System.out.println("3. Telefon 900zł");
        System.out.println("4. Radio 250zł");
        System.out.println("5. Monitor 1200zł");
        System.out.println("Wciśnij 1 , 2, 3, 4, 5 :");

    }
    public void read() {  //funkcja odczytująca dane wprowadzane przez użytkownika
        boolean check=false; //zmienna informująca czy wprowadzone dane są poprawne
        while(check==false) {  //pętla umożliwiająca ponowne wpisanie danych
            try {
                Scanner scan = new Scanner(System.in);
                read = scan.nextInt();
                check=true;
            } catch (InputMismatchException e) {  //przechwytywanie wyjątków, jeśli użytkownik wprowadzi zły format danych
                System.out.println("Źle wprowadzone dane! Wpisz ponownie:");
                check=false;
            }
        }

        choose(read);

    }
    public void choose(int read) { //funkcja dodająca do listy element wybrany przez użytkownika

        if (read == 1) {
            Computer comp = new Computer();
            System.out.println("```````````````````````````");
            System.out.println(comp.getName() +" " +comp.getPrice()+"zł");
            list.add(comp);
            sum += comp.getPrice();
            amount++;
        } else if (read == 2) {
            Printer print = new Printer();

            System.out.println(print.getName() +" " + print.getPrice()+"zł");
            list.add(print);
            sum += print.getPrice();
            amount++;
        } else if (read == 3) {
            Phone phone = new Phone();

            System.out.println(phone.getName() +" " + phone.getPrice()+"zł");
            list.add(phone);
            sum += phone.getPrice();
            amount++;
        }
        else if (read == 4) {
            Radio radio=new Radio();

            System.out.println(radio.getName() +" " + radio.getPrice()+"zł");
            list.add(radio);
            sum += radio.getPrice();
            amount++;
        }
        else if (read == 5) {
            Monitor monitor=new Monitor();

            System.out.println(monitor.getName() +" " + monitor.getPrice()+"zł");
            list.add(monitor);
            sum += monitor.getPrice();
            amount++;
        }
        summarize();
    }
    public void summarize(){ // funkcja wyświetlająca informacje podsumowujące
        System.out.println("Suma zamównia: " + sum+"zł");
        System.out.println("Ilość produktów: " + amount);
        System.out.println("```````````````````````````");
        System.out.println("Czy chcesz kontynuować zakupy? Wciśnij t ,aby kontynuować lub dowolny klawisz aby zakończyć zakupy");

        Scanner scan=new Scanner(System.in);
        String enter=scan.nextLine();
        char sign=enter.charAt(0);

        System.out.println("```````````````````````````");

        if(sign=='t') {
            show();
            read();
        }
        else {
            ending();
            System.out.println("***********************");
            System.out.println("Dziękujemy za zakupy w sklepie online!");
        }

    }
    public void ending(){  //funkcja wyświetlająca informacje na zakończenie progamu
        System.out.println("Zakupiono:");

        for(Product p: list)
            System.out.println(p.getName()+" "+p.getPrice()+"zł");

        System.out.println("***********************");
        System.out.println("Całkowita kwota do zapłaty: "+sum+"zł");
    }
}