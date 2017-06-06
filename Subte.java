public class Subte {

	public static void main(String[] args) {

		String opcion, estacionI, estacionF, entrar;
		String[] estacionesIda = { "Hospitales", "Parque Patricios", "Caseros", "Inclan", "Humberto 1", "Venezuela",
				"Once", "30 de Diciembre", "Corrientes", "Cordoba", "Santa Fe", "Las Heras" };
		String[] estacionesVuelta = { "Las Heras", "Santa Fe", "Cordoba", "Corrientes", "30 de Diciembre", "Once",
				"Venezuela", "Humberto 1", "Inclan", "Caseros", "Parque Patricios", "Hospitales" };
		ObjetoRobot objeto = new ObjetoRobot();
		int pos1 = 0, pos2 = 0;

		System.out.println("Bienvenido a la Linea H ");
		System.out.println("");
		System.out.println("¿Tomara la Linea H hacia Las Heras?");
		opcion = objeto.Leertexto();
		System.out.println("Por Favor Ingresa el Nombre de la Estacion de Subte en la que se Encuentra: ");
		estacionI = objeto.Leertexto();
		System.out.println("Hacia que Estacion Desea Viajar: ");
		estacionF = objeto.Leertexto();

		if (opcion.equalsIgnoreCase("si")) {

			// saber posicion inicial
			for (int m = 0; m < estacionesIda.length; m++) {
				if (estacionesIda[m].equalsIgnoreCase(estacionI)) {
					pos1 = m;
				}
			}

			// Saber posicion final
			for (int m = 0; m < estacionesIda.length; m++) {
				if (estacionesIda[m].equalsIgnoreCase(estacionF)) {
					pos2 = m;
				}
			}

			if (estacionI != estacionF) {

				System.out.println("El Subte a llegado");
				System.out.println("Abrir Puertas");
				System.out.println("¿Ingresara al Subte?");
				entrar = objeto.Leertexto();

				
				if (entrar.equalsIgnoreCase("si")) {

					System.out.println("A Ingresado!");
					System.out.println("Cerrar Puertas");
					System.out.println("Disfrute del Viaje");

					for (int j = pos1; j <= pos2; j++) {
						System.out.println(estacionesIda[j]);
					}

					System.out.println("Ha Llegado a Su Destino");
					System.out.println("");
					System.out.println("Gracias por viajar con Codo a Codo");

				} else {

					System.out.println("Cerrar Puertas");
					
				}

			} else {
				System.out.println("A Ingresado la Misma Estacion");
				System.out.println("Intente Nuevamente");

			}
		} else {

			// saber posicion inicial
			for (int m = 0; m < estacionesVuelta.length; m++) {
				if (estacionesVuelta[m].equalsIgnoreCase(estacionI)) {
					pos1 = m;
				}
			}

			// Saber posicion final
			for (int m = 0; m < estacionesVuelta.length; m++) {
				if (estacionesVuelta[m].equalsIgnoreCase(estacionF)) {
					pos2 = m;
				}
			}

			if (estacionI != estacionF) {

				System.out.println("El Subte a llegado");
				System.out.println("Abrir Puertas");
				System.out.println("¿Ingresara al Subte?");
				entrar = objeto.Leertexto();

				if (entrar.equalsIgnoreCase("si")) {

					System.out.println("A Ingresado!");
					System.out.println("Cerrar Puertas");
					System.out.println("Disfrute del Viaje");

					for (int j = pos1; j <= pos2; j++) {
						System.out.println(estacionesVuelta[j]);
					}

					System.out.println("Ha Llegado a Su Destino");
					System.out.println("");
					System.out.println("Gracias por viajar con Codo a Codo");

				}
				else {
						
					System.out.println("Cerrar Puertas");

				}

			} else {
				System.out.println("A Ingresado la Misma Estacion");
				System.out.println("Intente Nuevamente");

			}
		}
	}
}