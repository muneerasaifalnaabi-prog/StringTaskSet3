public class gHappy {
    public static void main(String[] args) {
        String str="xxggxx";
        String str1="xxgxx";
        System.out.println(gHappy(str));
        System.out.println(gHappy(str1));


    }
    public static  Boolean gHappy(String str){
        str=str.toLowerCase();
        for (int i=0;i<str.length();i++){
            char c =str.charAt(i);
            if (c == 'g') {
                if ((i > 0 && str.charAt(i - 1) == 'g') ||
                        (i < str.length() - 1 && str.charAt(i + 1) == 'g')) {
                    return true;
                }
            }

        }
        return false;
    }


}
