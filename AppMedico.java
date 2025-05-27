package abstraccion;

import java.util.Vector;

public class AppMedico {

	public static void main(String[] args) {
		// Comparar diferentes objetos
		//generar un vector de tipo medicos
		//Vector <Medicos>listaMedicos = new Vector<>();
		Vector listaMedicos = new Vector<>(); //valido
		Medico medico1 = new Medico(); //creamos un objeto tipo medico
		medico1.setNombre("Juanito"); //agregamos nombre al objeto medico 1
		listaMedicos.add(medico1);  //añadimos al vector listaMedicos el objeto medico1
		
		//Tipologia tipologia = null; //Enum de TipologiaO
		//Tipologia tipo=null;
		//Tipologias.t t=Tipologias.t.NEUROLOGO;
		
		Ortopetista op1 = new Ortopetista();
		op1.setNombre("Pablo");
		op1.setTipo(TipologiaO.MAXILOFACIA);
		listaMedicos.add(op1);
		
		Pediatra p1 = new Pediatra();
		p1.setNombre("Jhon");
		p1.setTipo(Tipologia.NEUROLOGO);
		listaMedicos.add(p1);
		
		//proceso de comparcion entre estos objetos a ver si corresponden
		for (int i=0; i<listaMedicos.size(); i++) {
			//generar un casting de la clase padre
			Medico a = (Medico) listaMedicos.elementAt(i);
			//Determinar si el elemento es un ortopedista
			if (a instanceof Ortopetista) {
				System.out.println("El objeto en el indice "+i+"es Ortpedista");
				continue; //sirve para continuar el programa si es que no se cumple la funcion
			}
			
			//determina si el elemento es un pediatra
			if (a instanceof Pediatra) {
				System.out.println("El objeto en el indice "+i+"es Pediatra");
				continue;
			}
			
			//determina si el elemento es un medico
			if (a instanceof Medico) {
				System.out.println("El objeto en el indice "+i+"es Medico");
				continue;
			}
		}

	}

}
