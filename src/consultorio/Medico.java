package consultorio;

import java.util.ArrayList;
import java.util.List;

public class Medico {
	private String nombre;
	private String apellido;
	private String especialidad;
	private List<Paciente> pacientes;
	
	public Medico(String nombre, String apellido, String especialidad) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.especialidad=especialidad;
		this.pacientes= new ArrayList<Paciente>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	public List<Paciente> getPacientes() {
		return (this.pacientes);
	}
//---------------------------------------
//---------------------------------------
	public float calcularIMC(Paciente paciente) {
		return (float)(paciente.getPeso()/Math.pow(paciente.getEstatura(), 2));
	}
	
	public float traerPromedioPeso() {
		float ret=0;
		
		for(Paciente p : this.pacientes) {
			ret+=p.getPeso();
		}
		ret/=this.pacientes.size();
	
		return ret;
	}
	
	public Paciente traerPacienteMayorEstatura() {
		int aux=0;
		float max=0;
		
		for(int i=0;i<this.pacientes.size();i++) {
			if(this.pacientes.get(i).getEstatura()>max) {
				aux=i;
				max=this.pacientes.get(i).getEstatura();
			}
		}
		Paciente p= this.pacientes.get(aux);
		
		return p;
	}
	
	public Paciente traerMenorIMC() {
		int aux=0;
		float min=1000;
		
		for(int i=0;i<this.pacientes.size();i++) {
			if(this.calcularIMC(this.pacientes.get(i))<min){
				aux=i;
				min=this.calcularIMC(this.pacientes.get(i));
			}
		}
		Paciente p= this.pacientes.get(aux);
		
		return p;
	}

}
