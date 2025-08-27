import java.util.List;
import java.util.ArrayList;

public class Menudisplay{
    List<String> menu_items = new ArrayList<String>();
    String welcom_message = "Welcome to Menudisplay";

    public void setmenu(String menu){
        // 'append'는 문자열 클래스에는 없으므로, List의 'add'를 사용합니다.
        // 'append' does not exist in the String class, so we use 'add' from the List.
        menu_items.add(menu);
    }

    public void display(){
        for(String item : menu_items){
            System.out.println(item);
        }
    }

    public void welcome(){
        System.out.println(welcom_message);
    }
}














