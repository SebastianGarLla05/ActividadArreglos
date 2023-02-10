package actividadarreglos;

public class arreglos {
	
	public static void main(String[] args) {
	
		int[] array = new int[15];
		String[] arreyNombre1 = new String[20];
		int[] arraypos = new int[15];
		array[9] = 5;
		Estudiante[] estudiantes = new Estudiante[100];
		for (int i = 0; i < estudiantes.length; i++) {
		estudiantes[i] = new Estudiante(null, i);
		}
		String[] arreyNombre = new String[20];
		arreyNombre[0] = "Francisco";
		}
		{
		}
		public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
		System.out.print(array[i] + " ");
		}
		System.out.println();
		}
		public static int searchArray(int[] array, int value) {
		for (int i = 0; i < array.length; i++) {
		if (array[i] == value) {
		return i;
		}
		}
		return -1;
		}
		public static int[] removeValue(int[] array, int value) {
		int index = searchArray(array, value);
		if (index == -1) {
		return array;
		}
		int[] result = new int[array.length - 1];
		for (int i = 0, j = 0; i < array.length; i++) {
		if (i == index) {
		continue;
		}
		result[j++] = array[i];
		}
		return result;
		}
}

