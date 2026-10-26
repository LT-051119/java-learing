package test;
/*需求：
1，main方法中定义一个集合，存入三个用户对象。
用户属性为：id，username，password
2，要求：定义一个方法，根据id查找对应的用户信息。
如果存在，返回true
如果不存在，返回false*/
public class User {
    //成员私有化
    private String id;
    private String username;
    private String password;
    //空参

    public User() {
    }
    //带全参

    public User(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    //get /set

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
