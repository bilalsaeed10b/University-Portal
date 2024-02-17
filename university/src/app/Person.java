package app;

public class Person {
    private String name,age,gender,mail,password,id;

    public Person() {
        name = "testName";
        age = "20";
        gender = "male";
        mail = "testName@gmail.com";
        id = "123";
        password = "123";
        
    }

    public Person(String name, String age, String gender, String mail, String id, String password) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mail = mail;
        this.id = id;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getGender() {
        return gender;
    }

    public String getAge() {
        return age;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }
    
    

    public String getPersonDisplay(){
        return ("NAME: "+name+"\nMAIL: "+mail+"\nAGE: "+age+"\nGENDER: "+gender);
    }
}
