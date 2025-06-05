
// creating an interface to implement abstraction using the example of remote control system.

interface RemoteControl{
     void turnOn();

     void channelNo(int channel);
}

class TV implements RemoteControl{
     @Override
     public void turnOn(){
          System.out.println("TV is on Now.");
     }

     public void channelNo(int channel){
          System.out.println("TV channel changed to -: "+channel);
     }
}
public class AbstractionByInterface {
    public static void main(String[] args) {
     RemoteControl myTv = new TV();

     myTv.turnOn();
     myTv.channelNo(9);
    } 
}
