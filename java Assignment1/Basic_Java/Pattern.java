public class Pattern {
    public static void TrianglePattern(int num){

        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" *");
            }System.out.println();
        }
    }
    
    public static void SquarePattern(int num){
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                System.out.print("  *");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        TrianglePattern(6);
        System.out.println();
        SquarePattern(6);
    }
}
