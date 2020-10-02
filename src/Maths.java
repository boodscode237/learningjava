public class Maths {
    public static void main(String[] args){
        double base;
        double height;
        double sidLine1;
        double sideLine2;
        double sideLine3;
        Triangle triangleA = new Triangle(
                base= 15,
                height = 8,
                sidLine1= 15,
                sideLine2= 8,
                sideLine3= 15 );
        Triangle triangleB = new Triangle(
                base= 5,
                height = 8,
                sidLine1= 5,
                sideLine2= 8,
                sideLine3= 25 );

        double TriangleAArea = triangleA.findArea();
        System.out.println(TriangleAArea);

        double TriangleBArea = triangleB.findArea();
        System.out.println(TriangleBArea);

        System.out.println(triangleA.sideLine3);
        System.out.println(triangleB.base);
    }
}
