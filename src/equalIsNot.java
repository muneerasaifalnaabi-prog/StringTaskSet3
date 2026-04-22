public class equalIsNot {
    public static void main(String[] args) {
        String str ="This is not";
        System.out.println(equalIsNot(str));

    }
    public static Boolean equalIsNot(String str){
        int numOfIs=0;
        int numOfNot=0;
        for (int i=0;i<str.length();i++){
            if (i + 2 <= str.length() && str.substring(i, i + 2).equals("is")) {
                numOfIs++;
            }
            if (i + 3 <= str.length() && str.substring(i, i + 3).equals("not")) {
                numOfNot++;
            }


        }
        return numOfIs==numOfNot;
    }

}
