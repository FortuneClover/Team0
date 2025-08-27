import java.util.List;
import java.util.ArrayList;

public class Menudisplay {
    private final List<String> menu_items = new ArrayList<>();
    private String welcome_message = "Welcome to Menudisplay";

    // 메뉴 추가
    public void setMenu(String menu) {
        if (menu == null || menu.isBlank()) return;
        menu_items.add(menu.trim());
    }

    // 메뉴 출력
    public void display() {
        if (menu_items.isEmpty()) {
            System.out.println("(메뉴가 없습니다. 먼저 메뉴를 추가하세요)");
            return;
        }
        for (String item : menu_items) {
            System.out.println(item);
        }
    }

    // 환영 문구 출력
    public void welcome() {
        System.out.println(welcome_message);
    }

    // 환영 문구 변경
    public void setWelcomeMessage(String msg) {
        if (msg != null && !msg.isBlank()) {
            welcome_message = msg.trim();
        }
    }
}
