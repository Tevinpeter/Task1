import java.util.Scanner;

public class RectangleArea {
    public int width;
    public int height;
    public int area;
    public void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        width = sc.nextInt();

        System.out.println("Enter the height: ");
        height = sc.nextInt();

        sc.close();

    }

    public void computeField(){
        area = width * height;
    }

    public void displayField(){
        System.out.println("The area is: " + area);
    }

    public void All(){
        getData();
        computeField();
        displayField();
    }




}
