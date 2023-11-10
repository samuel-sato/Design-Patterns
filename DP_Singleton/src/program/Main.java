package program;

public class Main {
	public static void main(String[] args) {
		

		Database db1 = Database.getInstace();
		
		db1.consultar("select * from users");
		
		Database db2 = Database.getInstace();
		
		db2.consultar("select * from product");
		
	}

}
