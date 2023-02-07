package dsa_advance.patterns;

public class Second {
    public static void main(String[] args) {
        display(5);
    }

    static void display(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
