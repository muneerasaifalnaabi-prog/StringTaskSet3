public class countYZ {
    public static void main(String[] args) {
            String str="fez day";
        String str1="day fyyyz";
        System.out.println(countYZ(str));
        System.out.println(countYZ(str1));

    }
    public static Integer countYZ(String str){
        int count=0;
        str=str.toLowerCase();
        for (int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if ((ch=='y'|| ch=='z')&&(i==str.length()-1 || !Character.isLetter(str.charAt(i + 1)))){
                count++;


            }


        }

return count;

    }
}
