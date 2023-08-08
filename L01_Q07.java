import java.util.Scanner;

public class L01_Q07 {

	public static void main(String[] args) {
		int num;
		
		Scanner lerNum = new Scanner(System.in);
		
		System.out.println("Número: ");
		num = lerNum.nextInt();
		
		switch(num) {
			case 1:
				System.out.println("Esse numero  por extenso é um!");
				break;
			case 2:
				System.out.println("Esse numero  por extenso é um dois!");
				break;
			case 3:
				System.out.println("Esse numero  por extenso é um três!");
				break;
			case 4:
				System.out.println("Esse numero  por extenso é um quatro!");
				break;
			case 5:
				System.out.println("Esse numero  por extenso é um cinco!");
				break;
			case 6:
				System.out.println("Esse numero  por extenso é um seis!");
				break;
			case 7:
				System.out.println("Esse numero  por extenso é um sete!");
				break;
			case 8:
				System.out.println("Esse numero  por extenso é um oito!");
				break;
			case 9:
				System.out.println("Esse numero  por extenso é um nove!");
				break;
			case 10:
				System.out.println("Esse numero  por extenso é um dez!");
				break;
			default:
				System.out.println("Número deve estar entre 1 e 10!!!");
		}
	}

}
