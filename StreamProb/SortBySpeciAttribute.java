package StreamProb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
class Students{
    int id;
    int roll;
    String name;
    Students(int id,int roll,String name){
        this.id=id;
        this.name=name;
        this.roll=roll;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", roll=" + roll +
                ", name='" + name + '\'' +
                '}';
    }
}
public class SortBySpeciAttribute {
    public static void main(String[] args) {
        List<Students> list=new ArrayList<>();
        list.add(new Students(1,34,"Saurabh4"));
        list.add(new Students(8,37,"Saurabh3"));
        list.add(new Students(5,39,"Saurabh2"));
        list.add(new Students(3,37,"Saurabh1"));
        list.sort((o,o1)->o.id- o1.id);
        System.out.println(list);
        list.sort((o,o1)->o.name.compareTo(o1.name));
        System.out.println(list);

    }
}
