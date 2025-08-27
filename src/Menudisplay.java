public class Menudisplay{
    List<String> menu_items = new ArrayList<String>();
    String welcom_message = "Welcome to Menudisplay";

    public void setmenu(String menu){
        menu.append(menu);
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














