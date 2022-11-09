package ru.mirea.Panferov.task6to9;

public class Book implements Printable{
    private final String title;
    private final String author;
    private final int date;

    public Book(String title, String author, int date) {
        this.title = title;
        this.author = author;
        this.date = date;
    }

    @Override
    public void print(){
        System.out.printf("Книга под названием %s, автор %s, год выпуска: %d год.\n", title, author, date);
    }
}
