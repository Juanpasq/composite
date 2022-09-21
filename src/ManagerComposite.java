import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ManagerComposite implements Empleado{
	
	private String Nombre;
	private double Salario;
	
	public ManagerComposite (String nombre, double salario) {
		this.Nombre = nombre;
		this.Salario = salario;
	}
	
	List<Empleado> empleados = new ArrayList<Empleado>();
	
	public void add(Empleado empleado) {
		empleados.add(empleado);
	}
	
	public void delete(Empleado empleado) {
		empleados.remove(empleado);
	}

	public String getNombre() {
		return Nombre;
	}
	
	public double getSalario() {
		return Salario;
	}
	
	public void print() {
		
		System.out.println(" ------ ");
		System.out.println(" Nombre: "+getNombre());
		System.out.println(" Salario: $"+getSalario());
		System.out.println(" ------ ");
		
		Iterator <Empleado> empleadoIterator = empleados.listIterator();
		
		while(empleadoIterator.hasNext()) {
			Empleado empleado = empleadoIterator.next();
			empleado.print();
		}
	}
}
