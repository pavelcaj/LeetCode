package kata_rang_4.codewars_style_ranking_system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User();
        User user1 = new User();
        System.out.println(user);
        System.out.println(user1);
        while (true) {
            user.jdo();
            user1.jdo();
            System.out.println(user);
            System.out.println(user1);
            System.out.println("нажмите 1 чтобы продолжить?");
            int scInt = sc.nextInt();
            switch (scInt) {
                case 1:
                case 2:
                    break;
            }
        }
    }
}
