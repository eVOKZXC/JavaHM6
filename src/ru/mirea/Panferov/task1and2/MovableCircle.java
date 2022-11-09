package ru.mirea.Panferov.task1and2;

public class MovableCircle implements Movable{
    int radius;
    MovablePoint center;

    public MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.radius = radius;
        center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        System.out.println("Движение вверх на " + center.ySpeed);
        center.y += center.ySpeed;
    }

    @Override
    public void moveDown() {
        System.out.println("Движение вниз на " + center.ySpeed);
        center.y -= center.ySpeed;
    }

    @Override
    public void moveLeft() {
        System.out.println("Движение влево на " + center.xSpeed);
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        System.out.println("Движение право на " + center.xSpeed);
        center.x += center.xSpeed;
    }

    @Override
    public String toString() {
        return "Окружность с радиусом = " + radius + " и " + center;
    }
}
