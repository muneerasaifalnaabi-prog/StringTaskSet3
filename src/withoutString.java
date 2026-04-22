public class withoutString {
    public static void main(String[] args) {
            String str ="Hello there";
            String str1 ="llo";
        System.out.println(withoutString(str,str1));

    }
    public static String withoutString(String base,String remove){
        base=base.toLowerCase();
        remove=remove.toLowerCase();
        String result ="";

        for (int i=0;i<base.length();i++){
            if(i + remove.length() <= base.length() && base.substring(i,i+remove.length()).equals(remove)){
                i+=remove.length();
            }
            else{
                result+=base.charAt(i);
                i++;

            }
        }

return result;


    }

}
