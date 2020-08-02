package cn.com.pac.controller;


import cn.com.pac.Teacher;

import java.util.Arrays;
import java.util.List;

public class TeacherController {

    public List<Teacher> searchTeachers(){
        return Arrays.asList(new Teacher(1, "张三"), new Teacher(2, "李四"));
    }

}
