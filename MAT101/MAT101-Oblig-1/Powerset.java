import easyIO.Out;

public class Powerset {
    private static Out out = new Out();

    public static void main(String[] args) {
        char[] A = {'x', 'y', 'z', 'd'};
        char[] bool = {'T', 'F'};
        String[] Axbool = new String[8];
        for (int i = 0; i < A.length; ++i) {
            for (int j = 0; j < bool.length; ++j) {
                Axbool[i+4*j] = "(" + A[i] + ", " + bool[j] + ")";
            }
        }
        out.outln("{");
        for (int i = 0; i < 256; ++i) {
            out.out("{");
            boolean comma = false;
            for (int j = 0; j < 8; ++j) {
                if (((int)Math.pow(2, j) & i) == (int)Math.pow(2, j)) {
                    if (comma) {
                        out.out(", ");
                    } else {
                        comma = true;
                    }
                    out.out(Axbool[j]);
                }
            }
            out.outln("}");
        }
        out.outln("}");
    }
}
