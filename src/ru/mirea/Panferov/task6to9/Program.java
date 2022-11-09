package ru.mirea.Panferov.task6to9;

public class Program {
    public static void main(String[] args) {
        Printable[] mas = new Printable[5];
        mas[0] = new Book("Отцы и дети", "Тургенев", 1862);
        mas[1] = new Book("Война и Мир", "Толстой", 1873);
        mas[2] = new Book("Метро 2033", "Глуховский", 2007);
        mas[3] = new Shop("How to smell bebra's ?", "The Guardian");
        mas[4] = new Shop("Где деньги, Mr. Putin ?", "РИА Новости");

        for (Printable i : mas) i.print();
    }
}
