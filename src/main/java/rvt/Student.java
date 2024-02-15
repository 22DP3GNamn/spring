package rvt;

public class Student {
    public String name;
    public String surname;
    public String email;
    public String group;
    public String age;


    public Student(String name, String surname, String email, String group) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.group = group;
    }

public String getname(){
    return name;
}

public String getsurname(){
    return surname;
}

public String getemail(){
    return email;
}

public String getgroup(){
    return group;
}

public String getage(){
    return age;
}
}