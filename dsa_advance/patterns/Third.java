package dsa_advance.patterns;

public class Third {
    public static void main(String[] args) {
        display(5);
    }

    static void display(int n){
        for(int i=n;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
