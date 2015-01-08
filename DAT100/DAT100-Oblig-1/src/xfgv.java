
public class xfgv {
    public static double logb(double num, int b) {
        return Math.log(num) / Math.log(b);
    }
    
    public static void main(String[] args) {
        double sum = 1;
        for (int i=2; i<=16; ++i) {
            System.out.print(1+"/"+i+"+");
            sum += 1/(double)i;
        }
        System.out.println();
        System.out.println(sum);
        System.out.println();
        
        for (double i=1; i<30; ++i) {
            System.out.print((int)i + ":");
            System.out.println("1/" + Math.pow(2, Math.floor(logb(i-1, 2))+1));
        }
    }
}
