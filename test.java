public class test {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        int n = s.length;
        int i=0, j=n-1;
        while(i<=j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
        System.out.println(s);
        
    }
}
