public class sameEnds {
    public static void main(String[] args) {

    }

    public static String sameEnds(String str){
        String result = "";
        for (int i=0;i<str.length()/2;i++){
            String start =str.substring(0,i);
            String end =str.substring(str.length()-1);
            if (start.equals(end)) {
                result = start;
            }
        }
        return result;
        }
    }



