public class countTriple {
    public static void main(String[] args) {
        String str

    }
    public static  Integer countTriple(String str){
        int count =0;
        for (int i=0; i<str.length();i++){
            if (str.substring(i,i+4).equals(i)){
                count++;

            }
        }
        return count;
    }

}
