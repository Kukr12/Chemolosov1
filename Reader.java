package homejobe;

public class Reader {
    String name; // ФИО
    int numberTicket; //билет
    String fuckultet; //факультет
    int birthdey;   // ДР
    int phoneNamber;  // Телефон

    public Reader(String name, int numberTicket, String fuckultet, int birthdey, int phoneNamber) {
        this.name = name;
        this.numberTicket = numberTicket;
        this.fuckultet = fuckultet;
        this.birthdey = birthdey;
        this.phoneNamber = phoneNamber;
    }

    void takeBook(String name, int numberTicket) {
        System.out.println(name + " С такимто номером билета  " + numberTicket);
    }

    void takeBook(String name, int numberTicket, String fuckultet, int birthdey, int phoneNamber) {
        System.out.println(" имя  " + name + " номер билета " + numberTicket + " Факультета " + " др " + birthdey + " с телефоном " +
                phoneNamber);
    }

    void returnBook(String name, int numberTicket, String fuckultet) {
        System.out.println(name + " С такимто номером билета" + numberTicket + "С такого факультета " +
                fuckultet + "Вернул кинигу ");
    }

    void returnBook(String name, int numberTicket, String fuckultet, int birthdey, int phoneNamber) {
        System.out.println("имя" + name + "номер билета" + numberTicket + "Факультета " + "др" + birthdey + "с телефоном" +
                phoneNamber + "Вернул книгу");
    }
}
