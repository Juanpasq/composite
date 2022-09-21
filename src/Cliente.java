
public class Cliente {

	public static void main(String[] args) {
		
		//Creamos los empleados de la "Empresa" (Empleados). Dependiendo de
		//el OBJETO que estan construidos son Compuestos u Hojas.
		
		//Developers (Hojas)
		Empleado empleado1 = new DeveloperHoja("Juan Luque (Empleado 1)", 1500.00);
		Empleado empleado2 = new DeveloperHoja("Maximiliano Arrieta (Empleado 2)", 3800.000);
		Empleado empleado3 = new DeveloperHoja("Rogelio Gonzalez (Empleado 3)", 3300.000);
		
		//Jefes de Area (Compuestos)
		Empleado jefeArea1 = new ManagerComposite("Gabriela Acevedo (Jefe 1)", 6500.000);
		Empleado jefeArea2 = new ManagerComposite("Gustavo Bermudez (Jefe 2)", 6500.000);
		
		//Director CEO (Compuestos)
		Empleado director1 = new ManagerComposite("Esteban Quito (Director1)", 9800.000);
		
		//Agregamos el "Empleado" a su padre (COMPUESTO)
		jefeArea1.add(empleado1);
		jefeArea1.add(empleado2);
		jefeArea2.add(empleado3);
		director1.add(jefeArea2);
		director1.add(jefeArea1);
		
		//Ejecutamos el proceso, nos mostrara el contenido de Padre e Hijos
		//Componentes >>> Hojas
		director1.print();

		//Borramos el empleado Jefe Area 2 "Gustavo Bermudez"
		director1.delete(jefeArea2);
		//Recorremos de nuevo para ver que ya no se encuentra
		director1.print();

	}

}
