
public class Ponto3D extends Ponto2D {
	
	/**
	 * Metodo para Pegar uma coordenada 3D
	 */

	private double z;
	
	public Ponto3D(double x, double y, double z) {
		super(x, y);
		this.z = z;
	}
	
	/**
	 * Metodo para Imprimir
	 */
	
	public String toString() {
		return super.toString() +  "e z = " + z;
	}

	/**
	 * Metodo Getter
	 * @return z
	 */
	public double getZ() {
		return z;
	}
	
}
