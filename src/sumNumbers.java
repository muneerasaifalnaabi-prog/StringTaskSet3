public class sumNumbers {
    public static void main(String[] args) {
        System.out.println(sumNumbers("aa11b33"));

    }
    public static  Integer sumNumbers(String str){
        int sum = 0;
        String tmp = "";
        for(int i=0; i<str.length(); i++){
            if(Character.isDigit(str.charAt(i))){
                tmp += str.charAt(i);
                if(i == str.length()-1 || !Character.isDigit(str.charAt(i+1))){
                    sum += Integer.parseInt(tmp);
                    tmp = "";
                }
            }
        }
        return sum;
    }
    }


