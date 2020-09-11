package Balls;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(3.1415, 2.7183);
        System.out.println(b1);
        b1.move(-22.46, 23.14);
        System.out.println(b1);
        b1.setXY(123.45, 678.90);
        System.out.println(b1);
    }
}