package jsjs;
import java.util.*;

public class Myclac {
	public Myclac(){
		
	}
	static void addNumbers(){
		int a = getFirstNumber();
		int b = getSecondNumber();
		checkIfDigit(a);	
		System.out.println(a+" + "+b+" = "+(a+b));
	}
	static void subNumbers(){
		int a = getFirstNumber();
		int b = getSecondNumber();
		System.out.println(a+" - "+b+" = "+(a-b));
	}
	static void multNumbers(){
		int a = getFirstNumber();
		int b = getSecondNumber();
		System.out.println(a+" * "+b+" = "+(a*b));
	}
	static  void divNumbers(){
		double a = getFirstNumber();
		double b = getSecondNumber();
		if(b==0) {System.out.println("���� �� ����");}
		else System.out.println(a+" / "+b+" = "+(a/b));
	}	
	public static void showMenu(){
		
		System.out.println("1. ADD");
		System.out.println("2. SUBSTRACT");
		System.out.println("3. MULTIPLY");
		System.out.println("4. DIVIDE");
		System.out.println("5. EXIT");		
	}		
	public static void checkIfDigit(int a){
		if(a>47&&a<58) System.out.println("���ڸ� �Է��ϼ���");		
	}

public static void main(String[] args){
	Scanner input = new Scanner(System.in);	
	while(true){
	showMenu();	
	System.out.println("�Է� : ");
	int a = input.nextInt();	
	if(a==1){addNumbers(); break;}
	else if(a==2){subNumbers(); break;}
	else if(a==3){multNumbers(); break;}
	else if(a==4){divNumbers(); break;}
	else if(a==5){System.out.println("����");return;}
	}
}


static int getFirstNumber() {
	Scanner input = new Scanner(System.in);
	System.out.println("1�� ���� �Է� : ");		
	int x = input.nextInt();	
	return x;
	
}
 static int getSecondNumber() {
	Scanner input = new Scanner(System.in); 
	System.out.println("2�� ���� �Է� : ");		
	int y = input.nextInt();	
	return y;
	
}}
 


