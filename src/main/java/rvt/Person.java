package rvt;

public class Person {
    public String Name;
    public String Adress;

    public Person(String name, String adress){
        this.Name = name;
        this.Adress = adress;
    }

    public String getName(){
        return Name;
    }

    public String setName(String name){
        return this.Name = name;
    }

    public String getAdress(){
        return Adress;
    }

    public String setAdress(String adress){
        return this.Adress = adress;
    }

    public String toString(){
        return "Person: " + Name + " Adress: " + Adress;
    }

}
