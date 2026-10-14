package test5;
//JavaBean标准写法

public class User {
    //定义属性
    private String Username;
    private int password;
    private String email;
    private String gender;
    private int age;

    //构造参数，每一个JavaBean都要保证构造至少2个参数形式
    //构造空参
    public User(){};

    //构造有参,使用(alt+insert),可以快速生成set,get.
    public User (String Username,int password,String email,String gender,int age) {
        this.Username = Username;
        this.password = password;
        this.email = email;
        this.gender = gender;
        this.age = age;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    }

