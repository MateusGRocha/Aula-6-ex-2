
public class Ponto2D {

	/**
	 * Metodo para Pegar uma coordenada 2D
	 */
	
	protected double x;
	protected double y;

	public Ponto2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Metodo para Imprimir
	 */

	public String toString() {
		
		return "As coordenada são: X = " + x + ", Y = " + y;
	}

	/**
	 * Metodos Getters
	 */
	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
}
