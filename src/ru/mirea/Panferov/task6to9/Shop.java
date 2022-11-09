package ru.mirea.Panferov.task6to9;

public class Shop implements Printable{
    private final String title;
    private final String publisher;

    public Shop(String title, String publisher) {
        this.title = title;
        this.publisher = publisher;
    }

    @Override
    public void print(){
        System.out.printf("Журнал под названием %s, издатель %s.\n", title, publisher);
    }
}
