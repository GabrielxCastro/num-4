import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc =  new Scanner(System.in);
        
        double a, b, c, d, media;

        System.out.println("Digite suas notas");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = sc.nextDouble();

        media = (a+b+c+d)/4;

        System.out.println("Sua média é " + media);
    }
}
