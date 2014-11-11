package pyramid;

public class pyramid {
	public static void main(String[] args) {
		int size = 8;
		for(int i=0;i <= size; i++) {
			for (int j=0; j <= i; j++) {
				System.out.print(j+ " ");
			}
			System.out.println("");
		}
	}
}
