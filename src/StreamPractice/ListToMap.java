package StreamPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {


    public static Map<Integer,String> listToHashmapJava8(List<Student> students)
    {
        Map<Integer, String> studentsMap = students.stream().collect(Collectors.toMap(Student :: getStudentId, Student :: getStdName));
        return studentsMap;
    }

    public static Map<Integer,String> listToHashmapJava8WithDuplicates(List<Student> students)
    {
        Map<Integer, String> studentsMap = students.stream().collect(Collectors.toMap(Student :: getStudentId, Student :: getStdName
                , (oldValue, newValue) -> oldValue));
        return studentsMap;
    }

  /*  public static Map<Integer,String> listToHashmapJava8PreserveOrder(List<Student> students)
    {

        Map<Integer, String> studentsMap = students.stream().collect(Collectors.toMap(Student :: getStudentId, Student :: getStdName
                , (oldValue, newValue) -> oldValue,LinkedHashMap::new));
        return studentsMap;
    }*/

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(1,"Ujjawal"));
        studentList.add(new Student(4,"Aseem"));
        studentList.add(new Student(33,"Shruti"));
        studentList.add(new Student(42,"Vipul"));

        List<Student> studentList2 = new ArrayList<>();
        studentList.add(new Student(1,"Ujjawal"));
        studentList.add(new Student(42,"Aseem"));
        studentList.add(new Student(33,"Shruti"));
        studentList.add(new Student(42,"Vipul"));

       //Here duplicates are not checked
        System.out.println(listToHashmapJava8(studentList));
        //here duplicates are removed
        System.out.println(listToHashmapJava8WithDuplicates(studentList2));
    }
}
