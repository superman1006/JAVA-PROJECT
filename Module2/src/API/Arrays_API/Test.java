package API.Arrays_API;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        int[] arr = {3,2,5,89,100,50,20};
        System.out.println(Arrays.toString(arr));//[3, 2, 5, 89, 100, 50, 20]

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[2, 3, 5, 20, 50, 89, 100]

        int index = Arrays.binarySearch(arr,89);
        System.out.println(index);




        Student[] Students = new Student[3];
        Students[0] = new Student("C L",19,180);
        Students[1] = new Student("ZYY",18,165);
        Students[2] = new Student("CYY",10,200);
        System.out.println(Arrays.toString(Students));

        Arrays.sort(Students,new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();//按照年龄升序排序

            }
        });
        System.out.println(Arrays.toString(Students));

        Arrays.sort(Students,new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.getHeight()-o2.getHeight());//按照身高升序排序

            }
        });
        System.out.println(Arrays.toString(Students));

    }
}
class Student{
    String name;
    int age;
    double height;

    public Student(String name,int age , double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
