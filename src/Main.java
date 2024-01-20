//Zadanie 1.
//import java.util.ArrayList;
//import java.util.List;
//
//abstract class Produkt {
//    String nazwa;
//    double cena;
//
//    public Produkt(String nazwa, double cena) {
//        this.nazwa = nazwa;
//        this.cena = cena;
//    }
//
//    abstract void wyswietlInformacje();
//}
//
//class ProduktSpozywczy extends Produkt {
//    String dataWaznosci;
//
//    public ProduktSpozywczy(String nazwa, double cena, String dataWaznosci) {
//        super(nazwa, cena);
//        this.dataWaznosci = dataWaznosci;
//    }
//
//    @Override
//    void wyswietlInformacje() {
//        System.out.println("Produkt spożywczy: " + nazwa + ", Cena: " + cena + " zł, Data ważności: " + dataWaznosci);
//    }
//}
//
//class ProduktElektroniczny extends Produkt {
//    String marka;
//
//    public ProduktElektroniczny(String nazwa, double cena, String marka) {
//        super(nazwa, cena);
//        this.marka = marka;
//    }
//
//    @Override
//    void wyswietlInformacje() {
//        System.out.println("Produkt elektroniczny: " + nazwa + ", Cena: " + cena + " zł, Marka: " + marka);
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        List<Produkt> produkty = new ArrayList<>();
//
//        produkty.add(new ProduktSpozywczy("Mleko", 2.5, "2024-02-01"));
//        produkty.add(new ProduktElektroniczny("Laptop", 1200.0, "Dell"));
//        produkty.add(new ProduktSpozywczy("Chleb", 1.0, "2024-01-25"));
//
//        System.out.println("Lista produktów:");
//        for (Produkt produkt : produkty) {
//            produkt.wyswietlInformacje();
//        }
//    }
//}

//Zadanie 2.
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;
//
//abstract class Osoba {
//    String imie;
//    String nazwisko;
//
//    public Osoba(String imie, String nazwisko) {
//        this.imie = imie;
//        this.nazwisko = nazwisko;
//    }
//
//    abstract void wyswietlInformacje();
//}
//
//class Student extends Osoba {
//    int numerIndeksu;
//
//    public Student(String imie, String nazwisko, int numerIndeksu) {
//        super(imie, nazwisko);
//        this.numerIndeksu = numerIndeksu;
//    }
//
//    @Override
//    void wyswietlInformacje() {
//        System.out.println("Student: " + imie + " " + nazwisko + ", Numer indeksu: " + numerIndeksu);
//    }
//}
//
//abstract class Grupa {
//    String nazwaGrupy;
//    Map<Integer, Student> studenci;
//
//    public Grupa(String nazwaGrupy) {
//        this.nazwaGrupy = nazwaGrupy;
//        this.studenci = new HashMap<>();
//    }
//
//    void dodajStudenta(Student student) {
//        studenci.put(student.numerIndeksu, student);
//    }
//
//    abstract void wyswietlInformacje();
//}
//
//class GrupaInzynierska extends Grupa {
//    public GrupaInzynierska(String nazwaGrupy) {
//        super(nazwaGrupy);
//    }
//
//    @Override
//    void wyswietlInformacje() {
//        System.out.println("Grupa inżynierska: " + nazwaGrupy);
//        for (Student student : studenci.values()) {
//            student.wyswietlInformacje();
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        List<Student> wszyscyStudenci = new ArrayList<>();
//        List<Grupa> wszystkieGrupy = new ArrayList<>();
//
//        // Dodawanie studentów
//        Student student1 = new Student("Jan", "Kowalski", 101);
//        Student student2 = new Student("Anna", "Nowak", 102);
//        wszyscyStudenci.add(student1);
//        wszyscyStudenci.add(student2);
//
//        // Dodawanie grup
//        Grupa grupaInzynierska = new GrupaInzynierska("Grupa Inżynierska 1");
//        grupaInzynierska.dodajStudenta(student1);
//        grupaInzynierska.dodajStudenta(student2);
//        wszystkieGrupy.add(grupaInzynierska);
//
//        // Wyświetlanie studentów w grupie
//        grupaInzynierska.wyswietlInformacje();
//
//        // Dodatkowe funkcjonalności (możesz dostosować według własnych pomysłów)
//        System.out.println("\nDodatkowe funkcjonalności:");
//        System.out.println("1. Wyświetl studentów");
//        System.out.println("2. Dodaj studenta do grupy");
//        System.out.print("Wybierz opcję: ");
//        int opcja = scanner.nextInt();
//
//        switch (opcja) {
//            case 1:
//                System.out.println("\nWszyscy studenci:");
//                for (Student student : wszyscyStudenci) {
//                    student.wyswietlInformacje();
//                }
//                break;
//            case 2:
//                System.out.print("\nPodaj imię nowego studenta: ");
//                String noweImie = scanner.next();
//                System.out.print("Podaj nazwisko nowego studenta: ");
//                String noweNazwisko = scanner.next();
//                System.out.print("Podaj numer indeksu nowego studenta: ");
//                int nowyNumerIndeksu = scanner.nextInt();
//
//                Student nowyStudent = new Student(noweImie, noweNazwisko, nowyNumerIndeksu);
//                wszyscyStudenci.add(nowyStudent);
//                grupaInzynierska.dodajStudenta(nowyStudent);
//
//                System.out.println("Dodano nowego studenta do grupy.");
//                break;
//            default:
//                System.out.println("Niepoprawna opcja.");
//        }
//    }
//}



//Zadanie 3
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Witaj w kalkulatorze!");
//
//        while (true) {
//            System.out.print("Podaj pierwszą liczbę: ");
//            double num1 = scanner.nextDouble();
//
//            System.out.print("Podaj drugą liczbę: ");
//            double num2 = scanner.nextDouble();
//
//            System.out.println("Wybierz operację:");
//            System.out.println("1. Dodawanie");
//            System.out.println("2. Odejmowanie");
//            System.out.println("3. Mnożenie");
//            System.out.println("4. Dzielenie");
//            System.out.println("0. Zakończ");
//
//            int choice = scanner.nextInt();
//
//            switch (choice) {
//                case 1:
//                    System.out.println("Wynik dodawania: " + add(num1, num2));
//                    break;
//                case 2:
//                    System.out.println("Wynik odejmowania: " + subtract(num1, num2));
//                    break;
//                case 3:
//                    System.out.println("Wynik mnożenia: " + multiply(num1, num2));
//                    break;
//                case 4:
//                    System.out.println("Wynik dzielenia: " + divide(num1, num2));
//                    break;
//                case 0:
//                    System.out.println("Do widzenia!");
//                    System.exit(0);
//                default:
//                    System.out.println("Niepoprawny wybór. Spróbuj ponownie.");
//            }
//        }
//    }
//
//    // Przeciążone metody dla różnych operacji kalkulatora
//    private static double add(double a, double b) {
//        return a + b;
//    }
//
//    private static double subtract(double a, double b) {
//        return a - b;
//    }
//
//    private static double multiply(double a, double b) {
//        return a * b;
//    }
//
//    private static double divide(double a, double b) {
//        if (b != 0) {
//            return a / b;
//        } else {
//            System.out.println("Nie można dzielić przez zero. Wybierz inne liczby.");
//            return Double.NaN; // NaN (Not a Number) w przypadku dzielenia przez zero
//        }
//    }
//}

//zadanie 4
// Definicja interfejsu Pracownik
//interface Pracownik {
//    void wykonajPrace();
//    String pobierzOpis();
//}
//
//// Implementacja interfejsu Pracownik dla klasy Programista
//class Programista implements Pracownik {
//    private String jezykProgramowania;
//
//    public Programista(String jezykProgramowania) {
//        this.jezykProgramowania = jezykProgramowania;
//    }
//
//    @Override
//    public void wykonajPrace() {
//        System.out.println("Programista programuje w języku: " + jezykProgramowania);
//    }
//
//    @Override
//    public String pobierzOpis() {
//        return "Programista, specjalizacja: " + jezykProgramowania;
//    }
//}
//
//// Implementacja interfejsu Pracownik dla klasy ManagerProjektu
//class ManagerProjektu implements Pracownik {
//    private String dzial;
//
//    public ManagerProjektu(String dzial) {
//        this.dzial = dzial;
//    }
//
//    @Override
//    public void wykonajPrace() {
//        System.out.println("Manager projektu zarządza działem: " + dzial);
//    }
//
//    @Override
//    public String pobierzOpis() {
//        return "Manager projektu, dział: " + dzial;
//    }
//}
//
//// Klasa Main - program demonstracyjny
//public class Main {
//    public static void main(String[] args) {
//        // Tworzenie obiektów klas Programista i ManagerProjektu
//        Programista programista = new Programista("Java");
//        ManagerProjektu managerProjektu = new ManagerProjektu("IT");
//
//        // Wywoływanie metod wykonajPrace() i pobierzOpis() dla każdego pracownika
//        programista.wykonajPrace();
//        System.out.println(programista.pobierzOpis());
//
//        System.out.println(); // Dodatkowy odstęp między wynikami
//
//        managerProjektu.wykonajPrace();
//        System.out.println(managerProjektu.pobierzOpis());
//    }
//}
//
