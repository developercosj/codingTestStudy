package developercosj;

import java.util.Scanner;

public class MainClass {
	
	public static void main (String[] args ) {
		
		System.out.println("Hello world"); 
		
		// 역순 정렬하기 
		
	}	
	public void list(int n) {
		for (int i = 0 ; i < n/2 ; i++) {
			
		}
	}
	
	
	// 주어진 배열 내부 값 서로교환 메서드
	
	public void change(int[] array, int b, int c) {
		int t = array[b];
		array[b] = array[c];
		array[c] = t; 
	}
	

	
	
	public void equalsMain() {
		
		Scanner  scanner = new Scanner(System.in);
		
		// 배열 수량 설
		int n = scanner.nextInt(); 
		// 배열 선
		int[] array = new int[n];
		// 배열 내부 아이템쌓기
		for (int i = 0; i < n; i++) {
			int b = scanner.nextInt();
			array[i] = b; 
		}
		
		int m = scanner.nextInt();
		
		int[] array2 = new int[m];
		
		for (int i = 0; i < m; i++) {
			array2[i] = scanner.nextInt(); 
		}
		
		Boolean result = equals(array, array2);
		
		System.out.println("두 배열의 값은 " + (result ? "같다 " : "다르다 " ));
	}
	
	
	// 두 배열의 비교 
	public boolean equals(int[] a, int[] b) {
		
		if (a.length != b.length) {
			return false;
		}
		
		for (int i = 0; i < a.length ; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true; 
	}

}
