package program;

import java.util.Scanner;

import Factory.FactoryLinux;
import Factory.FactoryWindows;
import Interface.IBotao;
import Interface.ICheckbox;
import Interface.IGuiFactory;

public class Main {
	
	public static void main(String args []) {
		Scanner scanner = new Scanner(System.in);
		
		int os = scanner.nextInt();
		
		IBotao b;
		ICheckbox c;
		
		IGuiFactory factory;
		
		if((os % 2) == 0) {
			factory = new FactoryLinux();
		}
		else {
			factory = new FactoryWindows();
		}
		
		b = factory.criarbotao();
		c = factory.criarCheckbox();
		
		System.out.println(b.Clicar());
		System.out.println(c.check());
	}

}
