public class MainW3E2 {

    public static void printTotalScore(String[] values){
        //TODO: Add your code here
        int scores = 0;
        for (String val: values){
            scores += Integer.parseInt(val);
        }
        System.out.printf("%d\n",scores);
    }

    public static void main(String[] args) {
        //WARNING: Do not change the code below
        printTotalScore(new String[]{});
        printTotalScore(new String[]{"0", "124", "-15"});
    }
}