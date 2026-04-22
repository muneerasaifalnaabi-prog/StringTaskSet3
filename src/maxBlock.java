public class maxBlock {
    public static void main(String[] args) {
        String str ="abbCCCddBBBxx";
        System.out.println(maxBlock(str));

    }
    public static Integer maxBlock(String str){
        int count=1;
        int max=1;
        if(str.length()<2){
            return str.length() ;
        }
        for(int i=0 ; i<str.length();i++){
            if(i<str.length()-1&& str.charAt(i)==str.charAt(i+1) ){
                count++;
                max=Math.max(max,count);
            }
            else {
                count=1;
            }

        }
        return max;
    }
    }

