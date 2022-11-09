package ru.mirea.Panferov.task1and2;

public class Program {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(12, 3, 3, 5, 7);
        System.out.println(circle);
        circle.moveDown();
        circle.moveLeft();
        System.out.println(circle);

        MovableRectangle rectangle = new MovableRectangle(3 ,8, 9, 9, 12, 15, 13, 13);
        System.out.println("\n" + rectangle);
        rectangle.moveDown();
        System.out.println(rectangle);
        rectangle.moveUp();
        rectangle.moveRight();
        System.out.println(rectangle);
    }
}
