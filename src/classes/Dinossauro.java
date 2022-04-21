package classes;

public class Dinossauro {
	
	private int energia;
	private int velocidade;
	private int temperatura;
	private String humor;
	
	public void setStatus(int energia, int velocidade, int temperatura, String humor) {
		this.energia = energia;
		this.velocidade = velocidade;
		this.temperatura = temperatura;
		this.humor = humor;
	}
	
	public void getStatus() {
		System.out.printf(
				 "%nEnergia: %d%n"
				+"Velocidade: %d%n"
				+"Temperatura: %d%n"
				+"Humor: %s%n",
				energia, velocidade, temperatura, humor);
	}
	
	public void pular() {
		System.out.println("O Skeep está pulando...");
		if(energia>=10) {
			energia-=10;
		}
		if(velocidade>=10) {
			velocidade-=10;
		}
		humor="Feliz";
	}
	
	public void correr() {
		System.out.println("O Skeep está correndo...");
		if(energia>=10) {
			energia-=10;
		}
		if(velocidade>=10) {
			velocidade-=10;
		}
		humor="Feliz";
		
	}
	
	public void comer() {
		System.out.println("O Skeep está comendo...");
		if(energia<=90) {
			energia+=10;
		}
		if(velocidade>=10) {
			velocidade-=10;
		}
		humor="Feliz";
	}
	
	public void cantar() {
		System.out.println("O Skeep está cantando...");
		if(energia>=10) {
			energia-=10;
		}
		humor="Feliz";
	}
	
	public void tomarSol() {
		System.out.println("O Skeep está tomando sol...");
		if(velocidade<=90) {
			velocidade += 10;
		}
		if(temperatura<=90) {
			temperatura += 10;
		}
		humor = "Feliz";
	}
	
	public void ficarNaSombra() {
		System.out.println("O Skeep está na sombra...");
		if(energia<=90) {
			energia+=10;
		}
		if(temperatura>=10) {
			temperatura-=10;
		}
		humor="Triste";
	}
}
