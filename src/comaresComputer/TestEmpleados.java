package comaresComputer;

public class TestEmpleados {

	public static void main(String[] args) {
		Programador p=new Programador(1,"12345678V","pepe",2016,"programador",1000,"java");
		
		p.setLineacod(150);
		System.out.println(p.comision());
		System.out.println(p.comision()+p.getSalario());
		System.out.println(p);
		
		Tecnico t=new Tecnico(2,"12345678P","juana",2015,"tecnico",1200,"hardware");
		
		t.setArregloEspecialista(7);
		t.setArregloNoespecialista(3);
		System.out.println(t.comision());
		System.out.println(t.comision()+t.getSalario());
		System.out.println(t);
		
	}

}
