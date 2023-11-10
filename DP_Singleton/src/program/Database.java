package program;

public class Database {
	
	private static  Database _database;
	
	private Database() {
		System.out.println("Instância criada");
	}
	
	public static Database getInstace() {
		if(_database == null)
			_database = new Database();
		
		return _database;
	}
	
	public void consultar(String sql) {
		//realiza consulta
	}

}
