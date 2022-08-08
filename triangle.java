import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число n:");
        double n = sc.nextInt(); // double потому, что в формуле будет дробное число. Иначе округляется
        // первый способ
        double result = n/2*(n+1);
        System.out.println(result);
        // второй способ
        int res = 0;
        for(int i = 1; i <= n; i++){
            res = res + i;
        }
         System.out.println(res);
    }

}
