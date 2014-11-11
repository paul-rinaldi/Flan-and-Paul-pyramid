package pyramid;

public class pyramid {
	public static void main(String[] args) {
		int size = 8;
		for (int a=size; a>=1; a--){
			for (int b=1; b<=a; b++){
				System.out.print(b+ " ");
			}
			System.out.println("");
		}
		for(int i=1;i <= size; i++) {
			for (int j=1; j <= i; j++) {
				System.out.print(j+ " ");
			}
			System.out.println("");
		}
	}
}
