import java.util.*;
class Stud
{
    int id;
    String name;
    int mark;
    Stud(int id,String name,int mark)
    {
        this.id=id;
        this.name=name;
        this.mark=mark;
    }
    @Override
    public String toString()
    {
        return id+"-"+name+"-"+mark;
    }

}
public class ComparatorInterface {
    public static void main(String[] args) {
        List<Stud> students=new ArrayList<>();
        students.add(new Stud(6,"xxx",98));
        students.add(new Stud(4,"xxy",97));
        students.add(new Stud(1,"xyx",95));
        students.add(new Stud(2,"xyy",100));
        Comparator<Stud> byId=new Comparator<Stud>()
        {
            public int compare(Stud a,Stud b)
            {
                return a.id-b.id;
            }
        };
        Collections.sort(students,byId);
        System.out.println(students);
        Comparator<Stud> byMark=new Comparator<Stud>()
        {
            public int compare(Stud a,Stud b)
            {
                return a.mark-b.mark;
            }
        };
        Collections.sort(students,byMark);
        System.out.println(students);

    }
}
