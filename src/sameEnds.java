public class sameEnds {
    public static void main(String[] args) {
        String str = "abXYab";
        System.out.println(sameEnds(str));

    }

    public static String sameEnds(String str){
        String result = "";
        for (int i=0;i<str.length()/2;i++){
            String start =str.substring(0,i);
            String end =str.substring(str.length()-i);
            if (start.equals(end)) {
                result = start;
            }
        }
        return result;
        }
    }



