/**
 Define an interface “Operation” which has method volume( ).
 Define a constant PI having a value 3.142. 
 Create a class cylinder which implements this interface (members – radius, height). 
 Create one object and calculate the volume.
 */
public class Slip11{
    public static void main(String[] args) {
        Cylinder c= new Cylinder(3, 4);
        c.volume();
    }
}

class Cylinder implements Operation  {
    int radius;
    int height;

    Cylinder(int radius, int height){
        this.radius=radius;
        this.height=height;
    }


    public void volume(){
        System.out.println("Volume is " + PI*this.radius*this.radius*this.height );
        
    }

}

interface Operation{
    final double PI=3.14;
    public void volume();
}
