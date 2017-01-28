package pack1;
import java.util.Scanner;

public class Main_class {

	public static void main(String[] args) {
		/*
		 
		 //--------------------------------
		 // Переменные: 
		System.out.println("Hello");
		System.out.println("SSS");
		byte a = 121;		// -128 .. 127
		int b = 10000;	
		long c = 142141251;
		float d = 124.12f;
		double e = 112412.123d;
		boolean f = true;
		char g = 'r';
		String h = "Hello";
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		
		//--------------------------------------
		// Ввод данных пользователем:
		 
		Scanner num = new Scanner(System.in);
   		System.out.println("YOUR: : " + num.nextLine());
		
		int first, second, result = 0;
		System.out.println("ENTERE FIRST NUM: ");
		first = num.nextInt();
		System.out.println("ENTERE SECOND NUM: ");
		second = num.nextInt();
		
		//------------------------------------------
		// Ветвление:
		if (first >= 5) {
			result = first + second;
			System.out.println("Result: " + result);
		}else if (second != 10) {
			System.out.println("Second num is not 10");
		}
		else {
			System.out.println("First num may be > 5");
		}
		
		
		//--------------------------------------------
		// Циклы:
		int[] mas = {1,2,4,7,1,4,7};
		for (int i = 0; i <= mas.length - 1; i++) {
			System.out.println("El. № " + "[" + i + "]" + " = " + mas[i]);
		}
		
		int i = 0;
		System.out.println("_____________________");
		
		while (i <= 10) {
			System.out.println("Element № " + i);
			i++;
		}
		
		i = 0;
		System.out.println("_____________________");
		
		do {
			System.out.println("El. num: " + i);
			i++;
		} while (i <= 10);
		
		
		//--------------------------------------------
		//Массивы (одномерные)
		int[] arr;   // Обьявление массива и его размера
		int n;
		Scanner in = new Scanner(System.in);  // Обьявление сканнера
		System.out.print("ENTERE N = ");
		n = in.nextInt();   // Ввод размера массива
		arr = new int[n];   // Присвоение размера массиву
		for (int i = 0; i <= n - 1; i++) {    // Цикл ввода массива
			System.out.print("El. № " + "[" + i + "]" + " = ");
			arr[i] = in.nextInt();
			
		}
		System.out.println("Your array: ");
		for (int i = 0; i <= n - 1; i++) {   // Цикл вывода массива
			System.out.println("El. № " + "[" + i + "]" + " = " + arr[i]);
		}
		
		
		//-----------------------------------------------
		//Массивы (многомерные)

		int n,m;
		int summ = 0;
		Scanner in = new Scanner(System.in);  // Обьявление сканнера
		System.out.print("ENTERE SIZE N x M = ");
		n = in.nextInt(); 
		m = in.nextInt();
		int[][] array = new int[n][m];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print("El. № " + "[" + i + "]" + "[" + j + "]" + " = ");
				array[i][j] = in.nextInt();
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(array[i][j] + " ");
				summ += array[i][j];
			}
			System.out.println();
		}
		System.out.println("CYMA = " + summ);
		
		
		//-----------------------------------------------
		//Функции
		
		// Вызов функции ввода массива
		int[] arrr = readArray();
		System.out.println("Your array: ");
		for (int i = 0; i <= arrr.length - 1; i++) {   // Цикл вывода массива
			System.out.println("El. № " + "[" + i + "]" + " = " + arrr[i]);
		}
		// Вызов функции степени
		int temp = func (2,4);
		System.out.println(temp);
		// Вызов функции факториала
		int facr = fact(5);
		System.out.println(facr);
		}
	
	// Функция возведения числа в степень
	public static int func(int a, int b) {
		int res = 1;
		for (int i = 0; i < b; i++) {
			res *= a;	
		}
		return res;
	}
	
	//Функция вычесления факториала
	public static int fact(int fac){
		int result = 1;
		for (int i = 1; i <= fac; i++) {
			result = result * i;
		}
		return result;
	}
	
	// Функция ввода элементов массива
	public static int[] readArray() {
		int[] arr;   // Обьявление массива и его размера
		int n;
		Scanner in = new Scanner(System.in);  // Обьявление сканнера
		System.out.print("ENTERE N = ");
		n = in.nextInt();   // Ввод размера массива
		arr = new int[n];   // Присвоение размера массиву
		for (int i = 0; i <= n - 1; i++) {    // Цикл ввода массива
			System.out.print("El. № " + "[" + i + "]" + " = ");
			arr[i] = in.nextInt();
			
		} return arr;
	}
	*/
	for (int i=0; i <= 10; i++) {
			System.out.println("------");
		}	
		
}
}
