import java.util.Scanner;

public class calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input : ");
        float a = sc.nextFloat();
        System.out.print("year : ");
        int y = sc.nextInt();
        for(int i = 0; i < y; i++) {
            a += a * 2;
        }
        System.out.println("hello world");
        System.out.println("Goodbye");
        
        sc.close();
    }
}