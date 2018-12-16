public class Triangle {

    private static void mesForInput (){
        IOData.printMes("Enter coordinates X and Y: ");
    }

    private static double inputCoord(){
        return IOData.addDoubleValue();
    }

    public static void AddCoordAndCalc(){
        mesForInput();
        double x1 = inputCoord();
        double y1 = inputCoord();
        mesForInput();
        double x2 = inputCoord();
        double y2 = inputCoord();
        mesForInput();
        double x3 = inputCoord();
        double y3 = inputCoord();
        calcK(x1, x2, x3, y1, y2, y3);
    }

    private static void calcK(double x1, double x2, double x3, double y1, double y2, double y3){
        //y = kx + b
        double k = (y1 - y2) / (x1 - x2);
        calcB(x1, x2, x3, y1, y2, y3, k);
    }

    private static void calcB (double x1, double x2, double x3, double y1, double y2, double y3, double k){
        //b = y1 - kx1
        double b = y1 - k * x1;
        mesForTriangleOrNot(x1, x2, x3, y1, y2, y3, k, b);
    }

    private static boolean triangleOrNot(double x3, double y3, double k, double b){
        return k * x3 + b == y3;
    }

    private static void mesForTriangleOrNot(double x1, double x2, double x3, double y1, double y2, double y3, double k, double b){
        if (triangleOrNot( x3, y3, k, b)){
            IOData.printMes("Not a triangle!");
        }
        else {
            IOData.printMes("This is a triangle!");
            rectangular(x1, x2, x3, y1, y2, y3);
        }
    }

    private static double calc(double firstCoord, double secCoord){
        return firstCoord - secCoord;
    }

    private static boolean scalarPr (double firstX, double firstY, double secX, double secY){
        return firstX * secX + firstY * secY == 0;
    }

    private static boolean vectorCoord(double x1, double x2, double x3, double y1, double y2, double y3){
        double xRes1 = calc(x1, x2);
        double yRes1 = calc(y1, y2);
        double xRes2 = calc(x2, x3);
        double yRes2 = calc(y2, y3);
        return scalarPr(xRes1, yRes1, xRes2, yRes2);
    }

    private static void rectangular(double x1, double x2, double x3, double y1, double y2, double y3){
        if(vectorCoord(x1, x2, x3, y1, y2, y3)){
            IOData.printMes("Triangle is rectangular!");
        }
        else{
            IOData.printMes("Triangle is not rectangular!");
        }
    }
}
