/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package voronoy;

/**
 *
 * @author rikiafifuddin
 */
public class Voronoy { 
    public static void main(String[] args) {
        final int X = 0;
        final int Y = 1;
        String persamaan;
        // Points
        double[][] points ={{1, -2},
                            {3, 4},
                            {1, 1}
                            };
        double[][]midPoints = new double[100][2];
        double startpointX, startpointY, otherpointX, otherpointY;
        for (int i=1; i<points.length; i++){
            startpointX = points [i][X];
            startpointY = points [i][Y];
            for (int j=0; j<(points.length-1); j++){
                otherpointX = points[j][X];
                otherpointY = points[j][Y];
                if (startpointX == otherpointX && startpointY == otherpointY){                    
                }
                else{
                    double midX = (startpointX+otherpointX)/2;
                    double midY = (startpointY+otherpointY)/2;
                    midPoints[j][X]= midX;
                    midPoints[j][Y]= midY;
                    //titik tengah
                    if ((otherpointX - startpointX) == 0 || (otherpointY- startpointY)==0){
                        System.out.println(midPoints[j][X]+"; "+midPoints[j][Y]);
                        System.out.println("Y = "+midX);
                    }else{
                    System.out.println(midPoints[j][X]+"; "+midPoints[j][Y]);
                    //gradien m = deltaY/daltaX ; delta x = y2-y1
                    double m = (otherpointY - startpointY)/(otherpointX - startpointX);
                    //gradien titik tengah, karena tegak lurus dengan garis start,other makan m1.m2 = -1
                    double m2 = -1* m;
                    //persamaan garis titik tengah y-y1 = m(x-x1) --> (y= mx - mx1 +y1) --> (y=ax+b)
                    double b = -1* (m2*midX) + midY ;
                    System.out.println("Y= "+m+"X + "+b);}
                }
           }
        }
    }  
}
