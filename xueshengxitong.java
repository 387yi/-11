package xsglxt;

import java.util.ArrayList;
import java.util.Scanner;

public class xueshengxitong {
    public static void main(String[] args) {

        boolean p = true;
        do {
            men();
            Scanner sc = new Scanner(System.in);
            ArrayList<student> b = new ArrayList<student>();
            System.out.println("输入你的选择：》");
            int input = sc.nextInt();
            switch (input) {
                case 1:
                    tianjia(b);
                    break;
                case 2:
                    xiugai(b);
                    break;
                case 3:
                    shanchu(b);
                    break;
                case 4:
                    chazhao(b);
                    break;
                case 5:
                    chakan(b);
                    break;
                case 0:
                    p = false;
                    System.out.println("退出成功");
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
            }

        } while (p);


    }

    public static void men() {
        System.out.println("------学生管理系统-------");
        System.out.println("----1.添加学生信息-------");
        System.out.println("----2.修改学生信息-------");
        System.out.println("----3.删除学生信息-------");
        System.out.println("----4.查找学生信息-------");
        System.out.println("----5.查看全部学生信息----");
        System.out.println("----0.退出--------------");
    }

    public static void tianjia(ArrayList<student> a) {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("输入添加的学生学号");
        String sid = sc1.nextLine();

        System.out.println("输入添加的学生名字");
        String name = sc1.nextLine();

        System.out.println("输入添加的学生年龄");
        String age = sc1.nextLine();

        System.out.println("输入添加的学生地址");
        String address = sc1.nextLine();

        student s = new student(sid, name, age, address);


        a.add(s);

        System.out.println("添加成功");
    }

    public static void xiugai(ArrayList<student> a) {

    }

    public static void shanchu(ArrayList<student> a) {

    }

    public static void chazhao(ArrayList<student> a) {

    }

    public static void chakan(ArrayList<student> a) {
        System.out.println("学生学号\t学生名字\t学生年龄\t学生地址\t");
        System.out.println(a.size());
        for (int i = 0; i < a.size(); i++) {
            student s = a.get(i);
            System.out.println(a.get(i));
            System.out.println(s.getSid() + "\t" + s.getName() + "\t" + s.getAge() + "岁\t" + s.getAddress());

        }
    }
}
