public class sameEnds {
    public static void main(String[] args) {
        String str = "abXYab";
        System.out.println(sameEnds(str));

    }

    public static String sameEnds(String str){
         int middle = str.length() / 2;
        for (int i = middle; i >= 0; i--) {
            String left = str.substring(0, i);
            if (str.endsWith(left)) {
                return left;
            }
        }
        return "";
    }
    }



