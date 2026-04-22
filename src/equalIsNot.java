public class equalIsNot {
    public static void main(String[] args) {
        String str ="This is not";
        System.out.println(equalIsNot(str));

    }
    public static Boolean equalIsNot(String str){
        int numOfIs=0;
        int numOfNot=0;
        for (int i=0;i<str.length();i++){
            if (str.contains("is")){
                numOfIs++;
            }
            if (str.contains("not")){
                numOfNot++;
            }
            if (numOfIs==numOfNot){
                return true;
            }
        }
        return false;
    }

}
