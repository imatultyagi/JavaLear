import java.util.Scanner;

public class Add {
    public Add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no to print table");
        int n = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(n*i);
        }
    }
}
