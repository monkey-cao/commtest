package cn.com.pac;

import java.util.*;

public class Demo {
     public void creat(){

     }

     public String check(){
         String string = "white";
         return "";
     }

    public static void main(String[] args){
        List<Student> stus = new ArrayList<Student>();
        Set set = new HashSet();
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();
        stu1.setName("张三");
        stu1.setAge(30);

        stu2.setName("李四");
        stu2.setAge(20);

        stu3.setName("王五");
        stu3.setAge(60);

        stus.add(stu1);
        stus.add(stu2);
        stus.add(stu3);

        Collections.sort(stus, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });

//        for (Student student:stus
//             ) {
//            stus.remove(student);
//        }
        for (int i=0;i<stus.size();i++){
            stus.remove(i);
        }
        System.out.println(stus.toArray());
		System.out.println("end");

    }
}
