public class MainW3E1 {

    public static void printPrice(String item) {
        item = item.replaceAll("\\s+","");
        item = item.replaceAll("/",".");
        System.out.printf("%s: %s\n",item.substring(0,item.indexOf('-')).toUpperCase(),item.substring(item.indexOf('$')+1,item.length()));
    }

    public static void main(String[] args) {
        //WARNING: Do not change the code below
        printPrice("sandwich  --$4/50");
        printPrice("  soda --$10/00");
        printPrice("  fries --$0/50");
    }
}