// Encapsulation -> It's the process of hiding internal detail and exposing only what needed using getters/setters

// Note -> ⛳ Why? Protects data from direct access or modification.

class Member{
     private String memberName;
     private int memberId;

     // creating setter method to set member details
     public void setName(String memberName, int memberId){
          this.memberName = memberName;
          this.memberId = memberId;
     }

     // exposing name through getter method
     public String getName(){
          return memberName + " and id  " + memberId;
     }
}
public class Encapsulation {
   public static void main(String[] args) {
     // creating instance to call setter method to setName
     Member member = new Member();

     member.setName("Govind Thakur", 99);

     System.out.println(member.getName());
   }  
}
