public class Calculation {
    double radius;
    double side;
    double area;
    double phi = 3.14;

    public void setSquare(double side) {
        if (side > 0) {
            this.area = side * side;
        } else {
            throw new IllegalArgumentException();
        }
    }
    
    public double getSquare() {
        return area;
    }

    public void setCircle(double radius) {
        if (radius > 0) {
            this.area = phi * radius * radius;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double getCircle() {
        return area;
    }

    public void setTrapezoid(double a, double b, double t) {
        if (a > 0 && b > 0 && t > 0) {
            this.area = 0.5 * (a + b) * t;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public double getTrapezoid() {
        return area;
    }

    public void run() {
        System.out.println("\n====Program will start in====");

        for (int i = 3; i > 0; i--) {
            System.out.println("Starting with thread " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}