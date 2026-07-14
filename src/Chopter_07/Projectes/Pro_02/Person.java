package Chopter_07.Projectes.Pro_02;

import com.sun.source.doctree.SeeTree;

public class Person {

    private String firstName;
    private String lastName;
    private  int age ;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        if (age <=0 || age >=100){
            return 0;
        }
        return this.age = age;
    }

    public String getFullName (){
        if(firstName.isEmpty()){
            return  lastName;
        } else if (lastName.isEmpty()) {
            return firstName ;
        } else if (firstName.isEmpty() && lastName.isEmpty()) {
            return " ";
        }
        return firstName +" " +  lastName;
    }

    public boolean isTeen (){
        if (age > 12 && age <20){
            return true;
        }
        return false;
    }
}
