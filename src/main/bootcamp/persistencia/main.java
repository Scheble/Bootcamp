package persistencia;

import dominio.Country;

public class main {

	public static void main(String[] args) {
		Country c = new Country("Argentina","AR","ARG");
		DBController db = new DBController();
		if(db.InsertCountry(c))
			System.out.println("aaaaaaaaaa");
	}

}
