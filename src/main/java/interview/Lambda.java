package interview;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author YatXue
 * @date 2019/11/13 21:36
 */
public class Lambda {
    interface lambda {
        int sum(int a, int b);
    }

    @FunctionalInterface
    interface functionLambda {
        void say(String name, int age);
    }

    @Test
    public void lambdaTest() {
        DemoTest.lambda lambda = Integer::sum;
        System.out.println(lambda.sum(1, 2));

        DemoTest.functionLambda functionLambda = (String name, int age) -> System.out.println("我叫" + name + "，今年" + age + "岁");
        functionLambda.say("张三", 21);

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("使用lambda之前启动线程");
            }
        };
        new Thread(runnable1).start();

        Runnable runnable2 = () -> System.out.println("使用lambda之后启动线程");
        new Thread(runnable2).start();

        new Thread(() -> System.out.println("简洁lambda之后启动线程")).start();
    }

    static class User {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public User() {
        }

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    static List<User> userList = new ArrayList<User>();

    static {
        userList.add(new User("张三", 21));
        userList.add(new User("李四", 20));
        userList.add(new User("王五", 22));
        userList.add(new User("赵六", 23));
    }

    @Test
    public void getMsg() {
        User[] users = new User[userList.size()];
        userList.toArray(users);
        Arrays.sort(users, Comparator.comparing(User::getAge));
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void foreachTest() {
        List<String> skills = Arrays.asList("Java", ".NET", "C++", "C");
        // 使用Lambda之前
        for (String skill : skills) {
            System.out.print(skill + "，");
        }
        System.out.println();

        // 使用Lambda之后
        skills.forEach(skill -> System.out.print(skill + "，"));
        System.out.println();

        skills.forEach(System.out::print);
    }

    /**
     * 流式操作的数据去重和过滤
     * @author YatXue
     * @date 2019/11/13 22:13
     */
    @Test
    public void streamTest() {
        List<String> skills = Arrays.asList("Java", ".NET", "C++", "C", "Java");
        // jdk8之前
        System.out.print("jdk8之前：\t");
        for (String skill : skills) {
            System.out.print(skill + "，");
        }
        System.out.println();

        // jdk8之后    去重遍历
        System.out.print("jdk8之后去重遍历：\t");
        skills.stream().distinct().forEach(skill -> System.out.print(skill + "，"));
        System.out.println();

        // jdk8之后    去重遍历
        System.out.print("jdk8之后去重遍历：\t");
        skills.stream().distinct().forEach(System.out::print);
        System.out.println();

        // jdk8之后   过滤遍历
        System.out.print("jdk8之后过滤遍历：\t");
        skills.stream().filter(skill -> !"C++".equals(skill)).forEach(skill -> System.out.print(skill + "，"));
        System.out.println();

        // jdk8之后   过滤遍历
        System.out.print("jdk8之后过滤遍历：\t");
        skills.stream().filter(skill -> !"C++".equals(skill)).forEach(System.out::print);
        System.out.println();

        // jdk8之后   转字符串
        System.out.print("jdk8之后转字符串：\t");
        String skillString = String.join("，", skills);
        System.out.println(skillString);
    }

    /**
     * 流式操作的数据转换(也称映射)map
     * @author YatXue
     * @date 2019/11/13 22:12
     */
    @Test
    public void mapTest() {
        List<Integer> numList = Arrays.asList(1, 2, 3, 4, 5);
        // 数据转换
        numList.stream().map(num -> num * num).forEach(num -> System.out.print(num + "，"));
        System.out.println();

        // 数据收集
        Set<Integer> numSet = numList.stream().map(num -> num * num).collect(Collectors.toSet());
        numSet.forEach(num -> System.out.print(num + "，"));
    }

    /**
     * 数学计算测试
     * @author YatXue
     * @date 2019/11/13 22:18
     */
    @Test
    public void mapMathTest() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        IntSummaryStatistics stats = list.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("最小值：" + stats.getMin());
        System.out.println("最大值：" + stats.getMax());
        System.out.println("个数：" + stats.getCount());
        System.out.println("和：" + stats.getSum());
        System.out.println("平均数：" + stats.getAverage());
        // 求和的另一种方式
        Integer integer = list.stream().reduce(Integer::sum).get();
        System.out.println(integer);
    }

}
