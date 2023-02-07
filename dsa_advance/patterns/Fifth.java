package dsa_advance.patterns;

public class Fifth {
    public static void main(String[] args) {
        display(8);
    }

    static void display(int n){
        int ceil = (int)Math.ceil(n/2);
        for(int i=1;i<=n;i++){
            if(i<=ceil){
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else{
                for(int j=1;j<=(n-i+1);j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
