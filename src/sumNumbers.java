public class sumNumbers {
    public static void main(String[] args) {

    }
    public static  Integer sumNumbers(String str){
        int count =0;


        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
             if(Character.isDigit(ch) && Character.isDigit(ch+1)){
                 Integer num=Integer.parseInt(String.valueOf(ch));



             }


        }

    }

}
