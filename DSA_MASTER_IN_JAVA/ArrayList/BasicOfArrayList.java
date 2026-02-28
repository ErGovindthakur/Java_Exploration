package DSA_MASTER_IN_JAVA.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class BasicOfArrayList {
     public static void main(String[] args) {
          // Basic syntax
          ArrayList<Integer> list = new ArrayList<>();

          // Inbuilt methods
          // 1. .add(elem), .add(index,elem)

          list.add(10);
          list.add(20);
          list.add(30);

          // with index
          list.add(1,11);


          // 2. accessing elem (.get(index))
          System.out.println("Elem at "+1+" is "+ list.get(1));

          // 3. update elem (.set(index,elem))
          list.set(1, 12);

          // 4. remove (.remove(index), .remove(Integer.value(12)))
          // by value
          list.remove(Integer.valueOf(12));
          // by index
          list.remove(1);

          // 5. size (.size())
          System.out.println("The size of list : "+ list.size());

          // 6. search (.contains(elem))
          list.contains(30);

          // 7. empty (.isEmpty())
          list.isEmpty();

          // 8. remove all (.clear())
          list.clear();

          // 9. indexOf(elem)/lastIndexOf(elem)
          list.indexOf(30);
          list.lastIndexOf(30);

          // 10. convert to Array (list.toArray)

          Integer [] arr = list.toArray(new Integer[0]);

          // 11. ArrayList Traversal using forEach loop
          for(int elem : list){
               System.out.println(elem);
          }


          // 12. Most used Collections methods
          Collections.reverse(list);
          Collections.sort(list);
     }
}
