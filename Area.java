import java.util.Scanner;

class Rectangle {
    int m_width;
    int m_height;

    public Rectangle(int width, int height) {
        m_width = width;
        m_height = height;
    }

    public void setWidth(int width) {
        m_width = width;
    }

    public void setHeight(int height) {
        m_height = height;
    }

    public int getWidth() {
        return m_width;
    }

    public int getHeight() {
        return m_height;
    }

    public int getArea() {
        return m_width * m_height;
    }
}

// Square is extending the Rectangle class to find the area of square.
class Square extends Rectangle {
    public Square(int side) {
        super(side, side);
    }
}

public class Area {
    public static void main(String[] args) {
        //Taking Input from User.

        Scanner input = new Scanner(System.in);
        System.out.println("Choose 1 to find the area of rectangle:");
        System.out.println("Choose 2 to find the area of square:");
        System.out.println("Enter a choice to calculate required area: ");
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("Enter length of rectangle: ");
            int length = input.nextInt();
            System.out.println("Enter breadth of rectangle: ");
            int breadth = input.nextInt();
            Rectangle dimensions = new Rectangle(length, breadth);
            int area = dimensions.getArea();
            System.out.println("Area of rectangle is: " + area);
        } else if (choice == 2) {
            System.out.println("Enter length of side of square: ");
            int side = input.nextInt();
            Square squareSide = new Square(side);
            int area = squareSide.getArea();
            System.out.println("Area of square is: " + area);
        } else {
            System.out.println("Wrong choice!! Only choose 1 or 2.");
        }
    }
}

