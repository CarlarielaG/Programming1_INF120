package negocio;

public class Natural {
	private int number;
	
	/*==================== Constructores ====================*/	
	
	/**
	 * Constructor: Se inicializa con el parametro recibido
	 * @param number
	 */
	public Natural(int number) {
		super();
		this.number = number;
	}
	
	/**
	 * Constructor: Se inicializa con 0
	 */
	public Natural() {
		super();
		this.number = 0;
	}
	
	/*==================== Getter ====================*/
	
	/**
	 * Getter: Obtiene el numero
	 * @return
	 */
	public int getNumber() {
		return number;
	}
	
	/*==================== Setter ====================*/
	/**
	 * Setter: Fija el numero con el parametro recibido
	 * @param number
	 */
	public void setNumber(int number) {
		this.number = number;
	}
	
	
	/*==================== Otros metodos ====================*/
	
	
}
