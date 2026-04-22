public class sumDigits {
    public static void main(String[] args) {
        String str ="aa1bc2d3";
        String str1 ="aa11b33";
        System.out.println(sumDigits(str));
        System.out.println(sumDigits(str1));
    }
    public static Integer sumDigits(String str){
        int sum=0;
        for (int i=0;i<str.length();i++){
            char c =str.charAt(i);
            if(Character.isDigit(c)){
                Integer num=Integer.parseInt(String.valueOf(c));
                sum+=num;

            }
        }
        return sum;
    }
}
