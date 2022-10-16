import java.util.Arrays;

public class ComparableCircleTest {
    public static void main(String args[]){
        ComprrableCircle[] circles = new ComprrableCircle[3];
        circles[0] = new ComprrableCircle(3.6);
        circles[1] = new ComprrableCircle();
        circles[2] = new ComprrableCircle(3.5,"indigo",false);
        System.out.println("Pre-sorted:");
        for (ComprrableCircle circle : circles){
            System.out.println(circle);
        }
        Arrays.sort(circles);
        System.out.println("After-sorted:");
        for (ComprrableCircle circle : circles){
            System.out.println(circle);
        }

    }
}
