package com.orilore.dk.test1;
import java.util.*;
public class Main3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Double> list =new TreeSet<Double>(); 
Scanner s = new Scanner(System.in);
System.out.println("��ӭ�����ɼ���ѯϵͳ");
System.out.println("��������Ҫ¼��ɼ��Ŀ���");

int input = s.nextInt();
int temp = 0;
double sum = 0;

for(int i=0;i<input;i++){
	temp++;

System.out.println("�������"+temp+"�εĳɼ�");
double input1 = s.nextDouble();
list.add(input1);

sum+=input1; 
continue;

	}
System.out.println("������ĳɼ�������"+list.toString());
double sum1 = sum/input;
System.out.println("��Ҫ���ƽ���ɼ�Ϊ"+sum1);
	}
}
