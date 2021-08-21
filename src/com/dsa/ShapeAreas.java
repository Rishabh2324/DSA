package com.dsa;

public class ShapeAreas {
    public static void main(String[] args) {
        System.out.println(areaOfCirlcle(2));
        System.out.println(areaOfTriangle(5,2));
        System.out.println(areaOfRectangle(2,3));
        System.out.println(areaOfIsosceles(10,5));
        System.out.println(areaOParallelogram(8,8));
        System.out.println(areaOfRhombus(10,10));
        System.out.println(areaOfEquilateral(4));
        System.out.println(perimeterOfCircle(2));

    }
    static double areaOfCirlcle(float r){
        return Math.PI * r * r;
    }
    static double areaOfTriangle(float b, float h){
        return 0.5 * b * h;
    }
    static double areaOfRectangle(float l , float b){
        return l * b;
    }
    static double areaOfIsosceles(float b, float h){
        return 0.5 * b * h;
    }
    static float areaOParallelogram(float l, float b){
        return l * b;
    }
    static double areaOfRhombus(float p , float q) {
        return 0.5 * p *q;
    }
    static double areaOfEquilateral(float a){
        return (Math.sqrt(3) * a * a)  / 4;
    }
    static double perimeterOfCircle(float r){
        return 2 * Math.PI *r;
    }
//    static float perimeterOfEquilateralTriangle(){}
//    static float perimeterOfParallelogram (){}
//    static float perimeterOfRectangle(){}
//    static float perimeterOfSquare(){}
//    static float perimeterOfRhombus(){}
//    static float volumeOfCone(){}
//    static float volumeOfPrism(){}
//    static float volumeOfCylinder(){}
//    static float volumeOfSphere(){}
//    static float volumeOfPyramid(){}
//    static float curvedSurfaceAreaOfCylinder(){}
//    static float totalSurfaceAreaOfCube(){}

}
