
public class Matrix {
    
    private double[][] matrix;
    private int width;
    private int height;
    
    public Matrix(int width, int height) {
        this.matrix = new double[width][height];
        this.width = width;
        this.height = height;
    }
    
    public Matrix(double[][] matrix) {
        this.matrix = matrix;
        this.width = this.matrix.length;
        this.height = this.matrix[0].length;
    }
    
    public int width() {
        return this.width;
    }
    
    public int height() {
        return this.height;
    }
    
    public double value(int x, int y) {
        return this.matrix[x][y];
    }
    
    public double[] row(int rownum) {
        double[] r = new double[this.width];
        for (int i = 0; i < this.width; ++i) {
            r[i] = this.matrix[i][rownum];
        }
        return r;
    }
    
    public double[] column(int colnum) {
        double[] r = new double[this.height];
        for (int i = 0; i < this.height; ++i) {
            r[i] = this.matrix[colnum][i];
        }
        return r;
    }
    
    public Matrix mul(Matrix m) throws Exception {
        if (this.width == m.height) {
            throw new Exception();
        }
        Matrix r = new Matrix(m.width, this.height);
        
        
        
        return r;
    }

    public static void main(String[] args) {
        double[][] d = {{1, 2}, {3, 4}};
        Matrix m = new Matrix(d);
        double[] r = m.column(0);
        System.out.println(r[0] + ", " + r[1]);
    }

}
