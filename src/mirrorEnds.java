public class mirrorEnds {
    public static void main(String[] args) {
        String str ="xxx";
        System.out.println(mirrorEnds(str));

    }
    public static String mirrorEnds(String str){
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

