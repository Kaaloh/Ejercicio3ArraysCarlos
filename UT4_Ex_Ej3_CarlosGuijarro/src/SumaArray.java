import java.util.Arrays;

public class SumaArray {
	/**
	 * 
	 * @param array
	 */
	
	
	private int [] array;
		/**
		 * 
		 * @param array
		 * @return
		 */
	
	
	public SumaArray(int[] array) {
		super();
		this.array = array;
	}
	/**
	 * 
	 */

		
		

	public String sumandoArray(int[] array) {
		int total=0;
		for (int i = 0; i < array.length; i++) {
			if (array[i]%2!=0) {
				total = total + array[i];
			}
		}
		
		return "La suma total del array es de " + total;
	}
	/**
	 * 
	 */
		public int[] getArray() {
			return array;
		}
		public void setArray(int[] array) {
			this.array = array;
		}
		/**
		 * 
		 */
		
		@Override
		public String toString() {
			return  "Su array   ("+array+")" + "Y el metodo de sumaArray"+ sumandoArray(array);
		}
		/**
		 * 
		 */
}
