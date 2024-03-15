import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        LinkedList<String>linkedList = new LinkedList<>();
//        linkedList.add("Dog");
//        linkedList.add("Cat");
//        linkedList.add("Cow");
//
//        System.out.println(linkedList);
//

        List<Integer> numbers = List.of(2,3,5,8,9,1,12,34);

        List<Integer> pos = new LinkedList<>();
        List<Integer> neg = new LinkedList<>();

        for(Integer number : numbers){
            if(number % 2==0){
                pos.add(number);
            }else{
                neg.add(number);
            }
        }
        Collections.sort(pos);
        System.out.println(pos);
        Collections.sort(neg);
        System.out.println(neg);

    }
}
