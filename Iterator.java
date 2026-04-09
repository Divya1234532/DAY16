import java.util.*;

public class Iterators {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        /*for(int i:list) //throws concurrent accessing error due to varying size of list due to remove operation
        {
            if(i==4)
            {
                list.remove(i);
            }
            System.out.println(i);
        }*/
        //Iterator<Integer> it=list.iterator();
        ListIterator<Integer> it=list.listIterator();
        while (it.hasNext()) //like for each looping
        {
            int current=it.next();
            System.out.println(current);
            if(current==4)
            {
                it.remove();
            }
        }
        System.out.println(list);
        while(it.hasPrevious())
        {
            int prev=it.previous();
            System.out.println(prev);
        }
        System.out.println(list);

    }
}
