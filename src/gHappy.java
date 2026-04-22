public class gHappy {
    public static void main(String[] args) {

    }
    public static  Boolean gHappy(String str){
        str=str.toLowerCase();
        for (int i=0;i<str.length();i++){
            char c =str.charAt(i);
            if (c=='g'){
                if (c-1='g' || c+1='g'){
                    return true;
                }
            }

        }
        return false;
    }


}
