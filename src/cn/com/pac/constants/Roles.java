package cn.com.pac.constants;


public enum Roles {

    STUDENT_ROLE("student", "学生"),

    TEACHER_ROLE("teacher", "老师");


    private String key;

    private String value;

    Roles(String key, String value){

    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
