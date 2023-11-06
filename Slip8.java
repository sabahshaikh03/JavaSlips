/*
Create a class Sphere, to calculate the volume and surface area of sphere.
 (Hint : Surface area=4*3.14(r*r), Volume=(4/3)3.14(r*r*r))
*/

public class Slip8{

    double radius;

    Slip8(double radius){
        this.radius=radius;
    }

    public double volume ( ){
        double volume=(4/3)*3.14*(this.radius*this.radius*this.radius);
        return volume;
    }
    public double area () {

        double area= 4*3.14*(this.radius*this.radius);
        return area;
    }
    public static void main(String [] args){
        double radius = Double.parseDouble (args[0]);
        Slip8 sphere= new Slip8(radius);
        System.out.println("Volume of sphere is "+ sphere.volume());
        System.out.println("Area of sphere is "+ sphere.area());
    }

}