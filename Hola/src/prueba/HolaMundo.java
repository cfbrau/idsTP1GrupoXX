package prueba;

public class HolaMundo {
	private String saludo;
	
	public String getSaludo() {
		return saludo;
	}
	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	public static void main(String[] args) {
		HolaMundo hola = new HolaMundo();
		
		hola.setSaludo("locooooooooooooooooooooooooooooooooooooooooo");
		System.out.println(hola.getSaludo());

	}

}
