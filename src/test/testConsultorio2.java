package test;

import consultorio.Medico;
import consultorio.Paciente;

public class testConsultorio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Medico medico= new Medico("Daniel", "Lopez", "Kinesiologo");
		
		Paciente paciente_1 = new Paciente("Jose","Perez",85 , 1.80f);
		Paciente paciente_2 = new Paciente("Jorge","Frenandez",90 , 1.60f);
		
		System.out.println("Visita 1");
		System.out.println("Medico: "+ medico.getNombre()+" "+medico.getApellido());
		System.out.println("Paciente   "+paciente_1.getNombreCompleto()+": IMC "+medico.calcularIMC(paciente_1));
		System.out.println("Paciente   "+paciente_2.getNombreCompleto()+": IMC "+medico.calcularIMC(paciente_2));
		
		
		paciente_1.setPeso(80);
		paciente_2.setPeso(110);
		
		System.out.println("Visita 2");
		System.out.println("Medico: "+ medico.getNombre()+" "+medico.getApellido());
		System.out.println("Paciente   "+paciente_1.getNombreCompleto()+": IMC "+medico.calcularIMC(paciente_1));
		System.out.println("Paciente   "+paciente_2.getNombreCompleto()+": IMC "+medico.calcularIMC(paciente_2));
	}

}
