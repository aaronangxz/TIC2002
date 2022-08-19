public class Main {

    public static void printPrice(String item) {
        //TODO: Add your code here
        item = item.trim();
        int nameIdx = item.indexOf('-');
        String name = item.substring(0,nameIdx).toUpperCase();
    }

    public static void main(String[] args) {
        //WARNING: Do not change the code below
        printPrice("sandwich  --$4/50");
        printPrice("  soda --$10/00");
        printPrice("  fries --$0/50");
    }
}