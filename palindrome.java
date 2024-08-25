public class palindrome{
    public static void main(String[] args){
        String str="12345";
        String reversed=new StringBuilder(str).reverse().toString();
        System.out.println("Original:"+str);
        System.out.println("Reversed:"+reversed);
        }
}
