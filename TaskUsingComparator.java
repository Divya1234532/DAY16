import java.util.*;
class product
{
    String name;
    int price;
    double rating;
    product(String name,int price,double rating)
    {
        this.name=name;
        this.price=price;
        this.rating=rating;
    }
    @Override
    public String toString()
    {
        return name+" "+price+" "+rating;
    }
}
public class TaskUsingComparator {
    public static void main(String[] args) {
        List<product> list=new ArrayList<>();
        list.add(new product("xxx",900,4));
        list.add(new product("xxy",1000,9));
        list.add(new product("xyx",150,7));
        list.add(new product("xyy",300,6));
        list.add(new product("yyx",700,5));

        Comparator<product> byPrice=new Comparator<>()
        {
            public int compare(product a, product b) {
                return a.price-b.price;
            }

        };
        Collections.sort(list,byPrice);
        System.out.println(list);
        Comparator<product> byRating=new Comparator<>()
        {
            public int compare(product a, product b) {
                return Double.compare(a.rating,b.rating);
            }

        };
        Collections.sort(list,byRating);
        System.out.println(list);



    }
}
