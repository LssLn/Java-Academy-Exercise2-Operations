import java.util.Scanner;

public class test {
	
	public static int somma(int a, int b) {
		return a+b;
	}
	
	public static int min(int a, int b) {
		return a-b;
	}
	
	public static int mul(int a, int b) {
		return a*b;
	}
	
	public static int div(int a, int b) {
		if(b==0) return 0;
		return a/b;
	}
	
	public static void main(String[] args) {
		/*Classe operazioni che fa le 4 +-* / dati 2 numeri, nel main avviene 
		il passaggio di questi numeri da input (scanner) e si stampano in output
		i risultati dei 4 metodi operazioni
		*/
		System.out.println("Inserisci a e b: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		
		int return1 = somma(a,b);
		int return2 = min(a,b);
		int return3 = mul(a,b);
		int return4 = div(a,b);
		
		System.out.println("Dati "+a+" e "+b+" in input\nla somma � "+return1+
				"\nla sottrazione � "+return2+"\nla moltiplicazione � "+return3+
				"\nla divisione � "+return4);
	}
}
