package com.orilore.dk.test1;
import java.util.*;
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Double> list =new TreeSet<Double>(); 
Scanner s = new Scanner(System.in);
System.out.println("欢迎来到成绩查询系统");
System.out.println("请输入你要录入成绩的科数");

int input = s.nextInt();
int temp = 0;
double sum = 0;

for(int i=0;i<input;i++){
	temp++;

System.out.println("请输入第"+temp+"课的成绩");
double input1 = s.nextDouble();
list.add(input1);

sum+=input1; 
continue;

	}
System.out.println("您输入的成绩依次是"+list.toString());
double sum1 = sum/input;
System.out.println("您要求的平均成绩为"+sum1);
	}
}
