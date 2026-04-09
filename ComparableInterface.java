import java.util.*;
class Student implements Comparable<Student>
{
    String name;
    int mark;
    Student(String name,int mark)
    {
        this.name=name;
        this.mark=mark;
    }
    @Override
    public int compareTo(Student s)
    {
        return this.mark-s.mark;
    }
    @Override
    public String toString()
    {
        return name+"-"+mark;
    }
}
public class ComparableInterface {
    public static void main(String[] args) {
        List<Student> s=new ArrayList<>();
        s.add(new Student("A",98));
        s.add(new Student("B",95));
        s.add(new Student("C",97));
        s.add(new Student("D",100));
        Collections.sort(s);
        for(Student st:s)
        {
            System.out.println(st.name+"-"+st.mark);
        }
        //OR
        System.out.println(s);
    }
}
