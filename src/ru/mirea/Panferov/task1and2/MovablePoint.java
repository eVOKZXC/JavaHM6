package ru.mirea.Panferov.task1and2;

public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        System.out.println("Движение вверх на " + ySpeed);
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        System.out.println("Движение вниз на " + ySpeed);
        y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        System.out.println("Движение влево на " + xSpeed);
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        System.out.println("Движение вправо на " + xSpeed);
        x += xSpeed;
    }

    @Override
    public String toString() {
        return "Точка {x = " + x + ", y = " + y + ", скорость по x = " + xSpeed + ", скорость по y = " + ySpeed + "}";
    }
}
