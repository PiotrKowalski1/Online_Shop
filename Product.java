public class Product { //klasa nadrzędna dla klas produktów
    private int price; //zmienna przechowujące informację  cenie produktu
    private String name; //zmienna przechowujące informację o nazwie produktu

    public Product() // konstruktor podstawowy
    {
        price=0;
        name="Produkt";
    }
    public Product(String name, int price){ //konstruktor przzyjmujący argumenty
        this.name=name;
        this.price=price;
    }

    public double getPrice(){  //funkcja zwracająca cenę produktu
        return price;
    }

    public String getName() { //funkcja zwracająca nazwę produktu
        return name;
    }

   }

