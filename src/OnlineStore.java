import java.util.Scanner;
/* Nishchay Gupta
 * Student id: 1895314
 * Online Music/Apps Store 
 */
public class OnlineStore {
	//Online store for int
	public static void main(String[] args) {
		int a, b, c, d, e, f, g;
		OnlineStore onlStore = new OnlineStore();
		Scanner sc = new Scanner(System.in);
		System.out.println("How much money do you wish to prepay?");
		a = sc.nextInt();
		while(a>0)
		{
			b = a/3;
			c = a%3;
			d = a/7;
			e = a%7;
			f = e/3;
			g = e%3;
			System.out.println("With this amount, you will be able to purchase " + b + " app(s). You will then have " + c + "$ left as a credit on your account.");
			System.out.println("Alternatively, for this amount, you will be able to purchase " + d + " song(s) and " + f + " app(s). You will then have " + g + "$ left as a credit on your account. ");
			System.out.println("Thanks for Shopping at Best Music Store!");
		}
			onlStore.store();
	}
	
	//Online store for double
	public void store()
	{
		double a, b, c, d, e, f, g;
		Scanner sc = new Scanner(System.in);
		System.out.println("How much money do you wish to prepay?");
		a = sc.nextDouble();
		b = a/3;
		c = a%3;
		d = a/7;
		e = a%7;
		f = e/3;
		g = e%3;
		System.out.println("With this amount, you will be able to purchase " + b + " app(s). You will then have " + c + "$ left as a credit on your account.");
		System.out.println("Alternatively, for this amount, you will be able to purchase " + d + " song(s) and " + f + " app(s). You will then have " + g + "$ left as a credit on your account. ");
		System.out.println("Thanks for Shopping at Best Music Store!");
	}
}