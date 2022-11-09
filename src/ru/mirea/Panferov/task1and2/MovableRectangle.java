package ru.mirea.Panferov.task1and2;

public class MovableRectangle implements Movable{
    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed1,
                            int xSpeed2, int ySpeed1, int ySpeed2) {
        if (xSpeed1 != xSpeed2){
            xSpeed1 = Math.min(xSpeed1, xSpeed2);
            xSpeed2 = xSpeed1;
        }
        if (ySpeed1 != ySpeed2){
            ySpeed1 = Math.min(ySpeed1, ySpeed2);
            ySpeed2 = ySpeed1;
        }
        topLeft = new MovablePoint(x1, y1, xSpeed1, ySpeed1);
        bottomRight = new MovablePoint(x2, y2, xSpeed2, ySpeed2);
    }

    @Override
    public void moveUp() {
        System.out.println("Движение вверх на " + bottomRight.ySpeed);
        bottomRight.y += bottomRight.ySpeed;
        topLeft.y += topLeft.ySpeed;
    }

    @Override
    public void moveDown() {
        System.out.println("Движение вниз на " + bottomRight.ySpeed);
        bottomRight.y -= bottomRight.ySpeed;
        topLeft.y -= topLeft.ySpeed;
    }

    @Override
    public void moveLeft() {
        System.out.println("Движение влево на " + bottomRight.xSpeed);
        bottomRight.x -= bottomRight.xSpeed;
        topLeft.x -= topLeft.xSpeed;
    }

    @Override
    public void moveRight() {
        System.out.println("Движение вправо на " + bottomRight.xSpeed);
        bottomRight.x += bottomRight.xSpeed;
        topLeft.x += topLeft.xSpeed;
    }

    @Override
    public String toString() {
        return "Прямоугольник с левой верхней " + topLeft + ", с правой нижней " + bottomRight;
    }
}
