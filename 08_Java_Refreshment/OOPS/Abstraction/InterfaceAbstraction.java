public class InterfaceAbstraction {
    public static void main(String[] args) {
     ParentAbs ref = new ChildAbs();

     ref.pressPowerBtn();
     ref.pressVolumeUp();
    } 
}

interface ParentAbs {
     void pressPowerBtn();
     void pressVolumeUp();
}

class ChildAbs implements ParentAbs{
     @Override
     public void pressPowerBtn(){
          System.out.println("Power Button Pressed");
     }
     @Override
     public void pressVolumeUp(){
          System.out.println("Volume increased");
     }
}