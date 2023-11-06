/*
Define a “Clock” class that does the following ;
a. Accept Hours, Minutes and Seconds
b. Check the validity of numbers
c. Set the time to AM/PM mode
Use the necessary constructors and methods to do the above task
*/

class Clock {

    int hrs;
    int min;
    int sec;
    String time;

    Clock(int hrs, int min, int sec){
        this.hrs=hrs;
        this.min=min;
        this.sec=sec;
        if(hrs>=12){
            this.time="pm";
        }
        else{
            this.time="am";
        }
    }

    public void getTime(){
        if(verify()==true){
        System.out.println("The time is "+this.hrs+":"+this.min+":"+this.sec+" "+this.time);
        }
    }


    public boolean verify(){
        if(hrs>=0 && hrs<=24 && min>=0 && min<60 && sec>=0 && sec<60){
           // System.out.println("Given time is valid!");
            return true;
        }

        System.out.println("Given time is not valid!");
        return false;
    }
    public static void main(String [] args){
        Clock c= new Clock(14, 34, 23);
        c.getTime();
        Clock c1= new Clock(13, 90, 69);
        c1.getTime();
    }

}
