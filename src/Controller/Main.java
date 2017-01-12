package Controller;

import java.util.Scanner;

import Model.*;

public class Main {
	public static void main(String[] args) {
		DateController date = new DateController();
		Scanner sc = new Scanner(System.in);		
		//Connect conect = new Connect();
		
		System.out.println("¿Cuantos paises desea cargar?");		
		Country arrayCountry[] = new Country[sc.nextInt()];		
		for(int e = 0; e < arrayCountry.length; e++){
				
			Country country = new Country();	
			System.out.println("Ingrese el nombre del "+(e+1)+"° pais");
			String name = sc.nextLine();
			System.out.println("Codigo de 2 letas");
			String code2 = sc.nextLine();
			System.out.println("codigo de 3 letras");
			String code3 = sc.nextLine();
			country.setName(name);
			country.setCodeAlpha2(code2);
			country.setCodeAlpha3(code3);		
			//conect.Insert(country); -- Si funciona		
			System.out.println("*****************");
			String cant;
			//Intento de validacion
			do{
				System.out.println("Cantidad de estados/provincias que va a cargar");
				cant = sc.next();
			}while(!cant.matches("([0-100])"));
						
			State array[] = new State[Integer.parseInt(cant)]; 
			
			for(int i = 0; i < array.length; i++){
				//Estado
				System.out.println("Nombre del "+(i+1)+"° estado");
				String estName = sc.nextLine();
				System.out.println("Abrebiatura");
				String abbr = sc.nextLine();
				System.out.println("Area");
				int area = sc.nextInt();
				System.out.println("Ciudad mas grande");
				String city = sc.nextLine();
				System.out.println("Capital");
				String capital = sc.nextLine();			
				System.out.println("************");
				//Clima
				System.out.println("Ingrese los datos del clima");
				System.out.println("Fecha: "+date.Today());
				String tempa;
				do{
					System.out.println("Temperatura");
					tempa = sc.next();
				}while(!tempa.matches("([0-272])"));
				
				int temp = Integer.parseInt(tempa);
				System.out.println("Descripcion");
				String desc = sc.nextLine();
				System.out.println("************");
				//Viento
				System.out.println("Viento");					
				System.out.println("Frio");
				int chill = sc.nextInt();
				System.out.println("Direccion");
				int direct = sc.nextInt();
				System.out.println("Velocidad");
				int speed = sc.nextInt();
				//Atmosfera
				System.out.println("Ingrese los datos de la atmosfera: ");
				System.out.println("Humedad");
				int hum = sc.nextInt();
				System.out.println("Presion");
				float pres = sc.nextFloat();
				System.out.println("Visibilidad");
				int vis = sc.nextInt();
				System.out.println("Ambiente ascendente");
				int amb = sc.nextInt();
				System.out.println("Salida del Sol");
				String sunR = sc.nextLine();
				System.out.println("Puesta del Sol");
				String sunS = sc.nextLine();
				System.out.println("************");
				
				//Pronostico extendido
				System.out.println("Pronostico extendido");
				
				Forecaste arrFor[] = new Forecaste[10];
				
				for(int d = 1; d < 11; d++){
					System.out.println("Fecha: "+ date.DateForecast(d,0));
					System.out.println("Dia: "+date.DateForecast(d,1));
					System.out.println("Maxima");
					int max = sc.nextInt();
					System.out.println("Minima");
					int min = sc.nextInt();
					System.out.println("Descripcion");
					String descP = sc.nextLine();
					
					Forecaste forecaste = new Forecaste(date.DateForecast(d, 0),date.DateForecast(d,1),max,min,descP,0);
					arrFor[d-1] = forecaste;
				}
				
				
				Weather weather = new Weather(date.Today(),temp,desc,chill,direct,speed,hum,pres,amb,vis,sunR,sunS);
				State state = new State(code3,estName,abbr,area,city,capital,0, weather,arrFor);
				array[i] = state;
				
				country.setState(array);
				arrayCountry[e] = country;
				
				System.out.println("Guardado con exito");
				
				System.out.println("************");
			}
		}// for world
		for(Country c : arrayCountry){
			
			System.out.println(c.toString()+"\n");			
			for(State st : c.getState()){			
				System.out.println(st.toString());
				System.out.println("****");
				System.out.println(st.getWeather().toString());
				System.out.println("******");
				System.out.println("Pronostico Extendido");
				for(int a = 1; a < st.getForecast().length; a++){
					System.out.println("Fecha: "+ date.DateForecast(a,0));
					System.out.println("Dia: "+date.DateForecast(a,1));
					System.out.println(st.getForecast()[a-1].toString());
					System.out.println("***************");
				}
			}
		}
		
		
		
		
		sc.close();
	}
}
