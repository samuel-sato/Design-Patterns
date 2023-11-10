package Program;

public class Main {

	public static void main(String args[]) {
		System.out.println("Template Method");
		
		//Define a ordem que metodos devem ser executados, mas não define o que eles deve executar.
		
		TipoSistema sistema;
		
		sistema = new ProcessoByArquivos();
		sistema.templateMethod();
		
		System.out.println("--- ");
		
		sistema = new ProcessoByDatabase();
		sistema.templateMethod();
		
	}
}
