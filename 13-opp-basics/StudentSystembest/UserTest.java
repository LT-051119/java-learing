import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserTest {
    //3大需求，注册界面，登录界面，忘记密码界面
    public static void main(String[] args) {
        System.out.println("------欢迎来到黑马学生管理升级版系统------");
        System.out.println("请输入你的操作选项：1.注册 2.登录 3.忘记密码4.退出");
        //创建集合
        ArrayList<User> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你的选项");
            String choose = sc.next();
            switch (choose) {
                case "1" -> register(list);
                case "2" -> login(list);
                case "3" -> FPW(list);
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
    public static void register(ArrayList<User>list) {
        Scanner sc = new Scanner(System.in);
        //由于Username处于循环当中，在我创建对象时无法使用，要先定义在循环外面
        String Username;
        while (true) {
            System.out.println("请输入用户名");
             Username = sc.next();
            //先判断用户名是否存在
            boolean flag1 = contains(list, Username);
            if (flag1) {
                //不满足条件
                System.out.println("输入的用户名已存在，请重新输入");
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
        String password;
        while (true){
            System.out.println("请输入密码");
             password = sc.next();
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
        String PersonID;
        while(true) {
            System.out.println("请输入身份证号");
            PersonID = sc.next();
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
        String PhoneNumber;
        while (true) {
            //1.判断手机号码的长度
            System.out.println("请输入手机号码");
            PhoneNumber = sc.next();
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
        //创建对象存入数据
        User u = new User(Username,password,PersonID,PhoneNumber);
        //添加进数组
        list.add(u);
        System.out.println("注册成功！！！");
        //查看数组内容
        getMember(list);
    }
    //遍历数组元素
    public static void getMember(ArrayList<User>list){
        for (int i = 0; i < list.size(); i++) {
            User U = list.get(i);
            System.out.println(U.getUsername()+", "+U.getPassword()+", "+U.getPersonid()+", "+U.getPhonenumber());
        }
    }
    //验证用户名存在
    public static boolean contains(ArrayList<User>list, String Username){
        //1.1判断当前用户名是否存在
        for (int i = 0; i < list.size(); i++) {
            User stu = list.get(i);
            String User = stu.getUsername();
            if (User.equals(Username)) {
                //用户存在
                return true;
            }
        }
        //用户不存在
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

    //2.登录界面
    public static void login(ArrayList<User>list){
        //1.键盘录入用户名
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名");
            String Username = sc.next();
            //判断用户名是否存在
            boolean flag = contains(list,Username);
            if (!flag) {
                //不存在，结束方法
                System.out.println("该用户名不存在请重新输入");
                return;
            }
            //2.键盘录入密码
            System.out.println("请输入密码");
            String password = sc.next();

            //3.输入验证码
            //先把生成的验证码打印出来
            while (true) {
                String newcode = getcode();
                System.out.println("当前正确的验证码是：" + newcode);
                System.out.println("请输入验证码");
                String code = sc.next();
                if (!(code.equalsIgnoreCase(newcode))) {
                    //输入不一样
                    System.out.println("输入验证码错误请重新输入");
                    continue;
                }else{
                    System.out.println("输入验证码成功");
                    break;
                }
            }
            //验证码校验完成
            //验证密码和用户名满足要求吗？创建一个方法
            //利用封装思想把用户名和密码放进对象中
            User u = new User(Username,password,null,null);
            boolean flag1= verify(list,u);
            if (flag1) {
                System.out.println("登录成功！！！");
                break;
            } else {
                    if (i == 2) {
                        System.out.println("当前账户"+Username+"已锁定，请你联系管理员");
                        return;
                    } else {
                        System.out.println("密码或用户名错误"+"你还有"+(2-i)+"次机会");
                    }
                }
            }
        }
    //生成验证码
    public static String getcode() {
        //验证码
        //Character -> char
        //1.添加英文大小写
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            list.add((char)('a'+i));//每次计算'a'+0=数字，需要强转
            list.add((char)('A'+i));
        }
        //2.随机拼接英文大小写
        //StringBuilder创建这个方法为了拼接字符串
        StringBuilder sb = new StringBuilder();
        //抽取list中4个随机元素
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            //获取随机索引
            int Index = r.nextInt(list.size());
            //通过生成的随机索引去list里面获取相对应的元素
            char c = list.get(Index);
            //拼接字符串
            sb.append(c);
        }
        //3.添加数字
        //获取随机数
        int c = r.nextInt(10);
        //添加到最后一位索引
        sb.append(c);
        System.out.println(sb);
        //4.让数字可以出现到任意位置
        //思路：让5位索引去填充4位索引，填充的4个索引只要数字索引进入，就可以实现数字任意位置
        //修改字符串内容，要重新创建一个字符新数组
        char [] arr = sb.toString().toCharArray();
        //把随机索引去替换
        int RandomIndex = r.nextInt(arr.length);
        //记录随机索引
        //拿最后一位索引跟随机索引交换位置
        char temp = arr[RandomIndex];
        arr[RandomIndex] = arr[ arr.length - 1 ];
        arr[arr.length -1] = temp;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        return new String(arr);
    }
    //验证密码和用户名 数组 密码 用户名
    public static boolean verify(ArrayList<User>list,User u){
        for (int i = 0; i < list.size(); i++) {
            User stu = list.get(i);
            if(u.getUsername().equals(stu.getUsername())
                    && u.getPassword().equals(stu.getPassword())){
                //相同
                return true;
            }
        }
        return false;
    }
    //3.忘记密码
    public static void FPW(ArrayList<User>list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String Username = sc.next();
        //1.验证用户名存在性
        boolean flag = contains(list, Username);
        if (!flag) {
            //不存在则结束方法去注册
            System.out.println("该用户不存在，请去注册");
            //结束方法
            return;
        }
        //运行到这里就是存在用户名
        //2.键盘录入身份证号和手机号
        while (true) {
            System.out.println("请输入身份证号码");
            String PersonId = sc.next();
            System.out.println("请输入手机号码");
            String Phone = sc.next();
            //3.判断手机号码和身份证号码是否正确
            //先把手机号码和身份证封装进对象
            User user = new User(null, null, PersonId, Phone);
            //判断身份证号码和手机号码
            boolean flag1 = decide(list, user);
            if (!flag1) {
                System.out.println("输入的身份证号码或者手机号码错误，修改密码错误");
                continue;
            }
            System.out.println("操作成功,请修改密码");
            String PassWord = sc.next();
            System.out.println("请再次输入刚才的密码");
            String PassWord1 = sc.next();
            if (!(PassWord1.equals(PassWord))) {
                System.out.println("输入的两次密码不一样");
                continue;
            }
            //密码一样
            for (int i = 0; i < list.size(); i++) {
                //找到真实的list，存有数据对象
                User u = list.get(i);
                if(u.getUsername().equals(Username)){
                    u.setPassword(PassWord);
                    System.out.println("修改密码成功！！！");
                    //结束方法
                    return;
                }
            }
        }
        }
    //判断手机号和身份证号码
    public static boolean decide(ArrayList<User>list,User user){
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if (u.getPersonid().equalsIgnoreCase(user.getPersonid()) && u.getPhonenumber().equals(user.getPhonenumber())) {
                return true;
            }
        }
        return false;
    }
    }









