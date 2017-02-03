package repository;

import dominio.Country;

public class main {

	public static void main(String[] args) {
		//Country c = new Country("Argentina","AR","ARG");
		DBController db = new DBController();
		
		
		System.out.println(db.Serch("ARG"));
	}

}
