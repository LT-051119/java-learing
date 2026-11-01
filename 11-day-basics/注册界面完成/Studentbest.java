import java.util.ArrayList;
import java.util.Scanner;

public class Studentbest {
    //3大需求，注册界面，登录界面，忘记密码界面
    public static void main(String[] args) {
        System.out.println("------欢迎来到黑马学生管理升级版系统------");
        System.out.println("请输入你的操作选项：1.注册 2.登录 3.忘记密码4.退出");
        //创建集合
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你的选项");
            String choose = sc.next();
            switch (choose) {
                case "1" -> login(list);
                case "2" -> System.out.println(1);
                case "3" -> System.out.println(2);
                case "4" -> {
                    System.out.println("谢谢使用");
                    //退出当前循环
                    System.exit(0);
                }
                default -> System.out.println("没有这个选项");
            }
        }
    }
    //1.注册界面的具体操作方法
    public static void login(ArrayList<Student>list) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入用户名");
            String Username = sc.next();
            //先判断用户名是否存在
            boolean flag1 = contains(list, Username);
            if (flag1) {
                //不满足条件
                System.out.println("输入的用户名不满足要求，请重新输入");
                continue;
            }
            //再判断用户名的是不是纯数字
            boolean flag2 = Userlength(Username);
            //满足条件3-15,用户名不是纯数字
            if (flag2) {
                System.out.println("用户名添加成功，请继续操作");
                //符合用户名要求继续操作，跳出当前的while循环
                break;
            } else {
                System.out.println("用户名是纯数字，请重新输入");
                continue;
            }
        }
        //二.键盘录入密码，要求两次输入一样才能通过
        while (true){
            System.out.println("请输入密码");
            String password = sc.next();
            System.out.println("请再次输入密码，要和第一次密码完全一样");
            String password1 = sc.next();
            //判断两次输入密码一样吗？
            if (!(password.equals(password1))) {
               System.out.println("两次输入的密码不一样");
               continue;
            }
            System.out.println("密码添加成功，请继续操作");
            break;
        }
        //三.键盘录入身份
        while(true) {
            System.out.println("请输入身份证号");
            String PersonID = sc.next();
            if (!(PersonID.length() == 18)) {
                System.out.println("身份证号码不是18位，请重新输入");
                continue;
            }
            //1.满足刚好18位条件
            //2.判断首字母
            char star = PersonID.charAt(0);
            if (!('9'>=star&& star>'0')) {
                System.out.println("输入身份证首位数要大于0,小于9");
                continue;
            }
            //满足首字母条件
            //3.判断1-17位身份证号
            boolean flag3 = getnumber(PersonID);
            if(!flag3){
                System.out.println("输入的身份证中有数字不在0-9之间");
                continue;
            }
            //满足1-17条件
            //4.判断身份证号最后一位
            boolean flag4 = getendnumber(PersonID);
            if (!flag4) {
                System.out.println("输入的身份证号最后一位不满足0-9或者X或者x");
                continue;
            }
            System.out.println("身份证添加成功");
            break;
        }
        //四.键盘录入手机号码
        while (true) {
            //1.判断手机号码的长度
            System.out.println("请输入手机号码");
            String PhoneNumber = sc.next();
            if (!(PhoneNumber.length() == 11)) {
                System.out.println("输入的手机号码不满足11位");
                continue;
            }
            //手机号码长度满足
            //2.判断首字母不为0
            char starnumber1 = PhoneNumber.charAt(0);
            if (!(starnumber1>'0' && starnumber1<='9')) {
                System.out.println("输入的手机号码首字母不满足（0,9]");
                continue;
            }
            //3.遍历手机号判断每一位在不在0-9
            boolean flag4 = number1(PhoneNumber);
            if (!flag4) {
                System.out.println("输入的手机号码中有数字不满足0-9");
                continue;
            }
            //运行到这里满足全部条件
            System.out.println("手机号码添加成功");
            break;
        }
        }
    public static boolean contains(ArrayList<Student>list,String Username){
        //1.1判断当前用户名是否存在
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            String User = stu.getUsername();
            if (User.equals(Username)) {
                return true;
            }
        }
    return false;
    }
    public static boolean Userlength(String Username){
        //1.2判断长度是否为3-15
        if(!(Username.length()>=3 && Username.length()<=15)) {
            System.out.println("用户名输入长度超过3-15");
            return false;
        }
        //1.3再获取Username里面的字符
        //循环遍历集合里面的字符去判断
        int count = 0;
        for (int i = 0; i < Username.length(); i++) {
            char c = Username.charAt(i);
            //(大写)||(小写)||(数字)
            if (!((c>='A'&&c<='Z')||(c<='z'&&c>='a')||(c<='9'&&c>='0'))) {
                    System.out.println("输入的用户名有特殊符号，请重新输入");
                    return false;
            }else if(!(c<='9'&& c>='0')){
                //判断是不是纯数字
               count++;
               break;
            }
        }//满足条件return count>0;
    return count>0;
    }
    public static boolean getnumber(String PersonId){
        //判断1-17位身份证号
        for (int i = 0; i < 17; i++) {
            char P = PersonId.charAt(i);
            if (!('9'>=P && P >='0')) {
                return false;
            }
        }
        //满足0-9条件
        return true;
    }
    public static boolean getendnumber(String Personid){
        //判断最后一位数字
        char end = Personid.charAt(17);
        if (end<='9'&&end>='0'||'X'==end||'x'==end) {
            return true;
        }
    return false;
    }
    public static boolean number1(String PhoneNumber){
        for (int i = 0; i < PhoneNumber.length(); i++) {
            char number = PhoneNumber.charAt(i);
            if (!(number<='9' && number >= '0') ) {
                return false;
            }
        }
    return true;
    }
}
