public class maxBlock {
    public static void main(String[] args) {
        String str ="hoopla";
        System.out.println(maxBlock(str));

    }
    public static Integer maxBlock(String str){
        int count =0;
        for (int i=0;i<str.length();i++){
            if(i>0 && str.charAt(i)==i && str.charAt(i-1)==i || str.charAt(i-1)==i && i<str.length()){
                count++;
            }
        }
        return count;
    }
}
