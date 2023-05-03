import java.util.Scanner;

public class temp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp=sc.nextInt();
        if (temp < 0){
            System.out.println("its freezing cold outside");
        }
        else if (temp < 10){
            System.out.println("its cold outside");
        }
        else if (temp <20){
            System.out.println("its pleasant outside");
        }
        else if (temp < 30){
            System.out.println("its hot outside");
        }
        else if (temp < 50){
            System.out.println("its very hot outside");
        }
    }
}
