import java.io.*;

public class organizador_de_tareas {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String comentar;
		String descrip;
		String eti;
		String fechaini;
		String fechasali;
		double listar;
		String nombrelista;
		String nomtab;
		String nomtare;
		double opcio;
		double t;
		double tare;
		System.out.println("Bienvenido, al organizador de tareas");
		System.out.println("Eliga una de las Opciones.... 1.Crear tabla...2.Salir");
		// tablero
		t = Double.parseDouble(bufEntrada.readLine());
		if (t==1) {
			System.out.println("");
			System.out.println("nombre de la tabla");
			nomtab = bufEntrada.readLine();
			System.out.println("el tablero..."+nomtab+"..ya fue creada, desea crear un lista de tareas? ");
			System.out.println("1..si  2..no");
			// lista de tareas
			listar = Double.parseDouble(bufEntrada.readLine());
			if (listar==1) {
				System.out.println("");
				System.out.println("tablero.."+nomtab);
				System.out.println("nombre de la lista de tareas");
				// nombre de la lista de tareas
				nombrelista = bufEntrada.readLine();
				System.out.println("crear tarea?");
				System.out.println("1...si 2...no");
				// tarea
				tare = Double.parseDouble(bufEntrada.readLine());
				if (tare==1) {
					System.out.println(""); 
					System.out.println(nomtab);
					System.out.println(nombrelista);
					System.out.println("nombre de la tarea");
					// nombre de la tarea 
					nomtare = bufEntrada.readLine();
					System.out.println("descripción");
					// descripcion de la tarea
					descrip = bufEntrada.readLine();
					System.out.println("");
					System.out.println(nomtab);
					System.out.println(nombrelista);
					System.out.println(nomtare);
					System.out.println(descrip);
					System.out.println("desea agregar opciones a la tarea como etiquetas, fecha, comentario? ");
					System.out.println("1....si  2....no");
					// opciones de la tarea 
					opcio = Double.parseDouble(bufEntrada.readLine());
					if (opcio==1) {
						System.out.println("ingrese las etiquetas");
						eti = bufEntrada.readLine();
						System.out.println("ingresar la fecha de inicio");
						fechaini = bufEntrada.readLine();
						System.out.println("ingresar la fecha de salida");
						fechasali = bufEntrada.readLine();
						System.out.println("ingresar la comentarios");
						comentar = bufEntrada.readLine();
						System.out.println("");
						System.out.println("ok, su organizador de tareas es");
						System.out.println(nomtab);
						System.out.println("");
						System.out.println(nombrelista);
						System.out.println("//Estado incompeto//");
						System.out.println("");
						System.out.println(nomtare);
						System.out.println("//Avance de la tarea 0%//");
						System.out.println("");
						System.out.println(descrip);
						System.out.println("");
						System.out.println("etiquetas");
						System.out.println(eti);
						System.out.println("");
						System.out.println("fecha de la tarea"+fechaini+"...."+fechasali);
						System.out.println(comentar);
					} else {
						System.out.println("");
						System.out.println("ok, su organizador de tareas es");
						System.out.println(nomtab);
						System.out.println("");
						System.out.println(nombrelista);
						System.out.println("//Estado incompeto//");
						System.out.println("");
						System.out.println(nomtare);
						System.out.println("//Avance de la tarea 0%//");
						System.out.println(descrip);
					}
				} else {
					System.out.println("");
					System.out.println("la tabla.."+nomtab+"....fue guardada");
					System.out.println("");
					System.out.println("y la lista.."+nombrelista+"...tambien fue guardada");
					System.out.println("//Estado de la lista incompeto//");
				}
			} else {
				System.out.println("");
				System.out.println("la tabla.."+nomtab+"....fue guardada");
			}
		} else {
			System.out.println("");
			System.out.println("Salida");
		}
	}


}

