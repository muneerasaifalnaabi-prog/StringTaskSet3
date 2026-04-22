public class withoutString {
    public static void main(String[] args) {
            String str ="Hello there";
            String str1 ="e";
        System.out.println(withoutString(str,str1));

    }
    public static String withoutString(String base,String remove){
        base=base.toLowerCase();
        String result ="";

        int i=0;
        while ((base.contains(remove.toLowerCase()))){
            i=base.indexOf(remove.toLowerCase());
            result=base.substring(i,i+remove.length());
            base=base.replace(result,"");
            base=base.toLowerCase();

        }

return base;
    }

}
