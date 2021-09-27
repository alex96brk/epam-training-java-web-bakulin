package implementation;

/*
 * 3. Окружность вписана в квадрат заданной площади. Найти площадь квадрата, вписанного в эту окружность.
 *  Во сколько раз площадь вписанного квадрата меньше площади заданного?
 *
 * */

public class Task01_3 {

    private double rectangularInitialSquare;

    public static void main(String[] args) {
        Task01_3 task01_3 = new Task01_3(100);
        double result = task01_3.calculate();
        System.out.println(result);
    }

    public Task01_3(double rectangularInitialSquare) {
        this.rectangularInitialSquare = rectangularInitialSquare;
    }

    public double calculate() {
        SquareRectangle outerSquareRectangle = new SquareRectangle(this.rectangularInitialSquare);
        double outerSquareRectangleSide =  outerSquareRectangle.side;

        double innerCircleDiameter = outerSquareRectangleSide;
        Circle innerCircle = new Circle(innerCircleDiameter);

        double innerRectangleSide = innerCircle.diameter / (Math.sqrt(2));
        SquareRectangle innerSquareRectangle = new SquareRectangle();
        innerSquareRectangle.setSide(innerRectangleSide);

        return innerSquareRectangle.getRectangularSquare();
    }

    static class Circle {
        private double radius;
        private double diameter;
        private double circleSquare;

        public Circle(double diameter) {
            this.diameter = diameter;
            this.radius = diameter / 2;
            this.circleSquare = Math.PI * Math.pow(radius, 2);
        }

        public Circle() {};

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
            this.diameter = radius * 2;
            this.circleSquare = Math.PI*Math.pow(radius, 2);
        }

        public double getDiameter() {
            return diameter;
        }

        public void setDiameter(double diameter) {
            this.diameter = diameter;
            this.radius = diameter / 2;
            this.circleSquare = Math.PI * (Math.pow(diameter, 2) / 4);
        }

        public double getCircleSquare() {
            return circleSquare;
        }

    }

    static class SquareRectangle {
        private double side;
        private double rectangularSquare;

        public SquareRectangle(double rectangularSquare) {
            this.rectangularSquare = rectangularSquare;
            this.side = Math.sqrt(rectangularSquare);
        }

        public SquareRectangle() {}

        public double getSide() {
            return side;
        }

        public void setSide(double side) {
            this.side = side;
            this.rectangularSquare = Math.pow(side, 2);
        }

        public double getRectangularSquare() {
            return rectangularSquare;
        }

        public void setRectangularSquare(double rectangularSquare) {
            this.rectangularSquare = rectangularSquare;
            this.side = Math.sqrt(rectangularSquare);
        }
    }
}
