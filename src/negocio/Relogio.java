package negocio;

public class Relogio{

	private int segundos;
	
	public void conte(Partida part, Relogio rel) {
		
		//Provisoria esse tipo de verificacao
		while(part.verificarVitoria() == false) {
			rel.segundos+=1;

		}	
	}
	
	public Relogio(int segundos) {
		super();
		this.segundos = segundos = 0;
	}
	
	public int getSegundos() {
		return segundos;
	}
	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
}