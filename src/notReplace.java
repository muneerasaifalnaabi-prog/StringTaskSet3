public class notReplace {
    public static void main(String[] args) {
        System.out.println(notReplace("is or"));
    }
    public static String notReplace(String str){
        String result = "";
        for(int i = 0; i < str.length(); i++){
            if(i-1 >= 0 && Character.isLetter(str.charAt(i-1))
                    || i+2 < str.length() && Character.isLetter(str.charAt(i+2))) {
                     result += str.charAt(i);
            }
             else if(i+1 < str.length() && str.substring(i, i+2).equals("is")) {
                result += "is not";
                i++;
            }

              else result += str.charAt(i);
        }
        return result;

    }

}

