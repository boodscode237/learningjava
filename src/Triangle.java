public class Triangle {
    static int numOfSides=3;

    double base, height, sideLine1, sideLine2, sideLine3;
    public Triangle(double base,double height, double sideLine1, double sideLine2, double sideLine3){
        this.base=base;
        this.height= height;
        this.sideLine1 = sideLine1;
        this.sideLine2 = sideLine2;
        this.sideLine3 = sideLine3;
    }

    public double findArea() {
        return (this.base*this.height)/2;
    }
}
