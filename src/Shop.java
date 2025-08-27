import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Menudisplay menudisplay = new Menudisplay();
        Scanner sc = new Scanner(System.in);

        menudisplay.welcome();

        while (true) {
            System.out.println("===============================");
            System.out.println("1. Set menu");
            System.out.println("2. Show menu");
            System.out.println("3. Change welcome message");
            System.out.println("4. Exit");
            System.out.println("===============================");
            System.out.print(">> ");

            String sel = sc.nextLine().trim();

            switch (sel) {
                case "1": // 메뉴 추가
                    System.out.print("추가할 메뉴 이름 입력 >> ");
                    String item = sc.nextLine();
                    menudisplay.setMenu(item);
                    System.out.println("[OK] 메뉴 추가됨");
                    break;

                case "2": // 메뉴 출력
                    menudisplay.display();
                    break;

                case "3": // 환영 문구 변경
                    System.out.print("새 환영 문구 입력 >> ");
                    String msg = sc.nextLine();
                    menudisplay.setWelcomeMessage(msg);
                    System.out.println("[OK] 환영 문구 변경됨");
                    menudisplay.welcome();
                    break;

                case "4": // 종료
                    System.out.println("프로그램 종료");
                    return;

                default:
                    System.out.println("[WARN] 1~4 중에서 선택하세요.");
            }
        }
    }
}
