package example.interf1;

import java.util.Random;

public class SortMain
{
	public static void main( String[] args )
	{
		//Bubble bubble = new Bubble();
		//Brush brush = new Brush();
		//Shaker shaker = new Shaker();
		Random random = new Random();
		int razmer = random.nextInt(51);
		int [] array1 = new int[razmer];

		Sortirovat [] sortArray = {new Bubble(), new Brush(), new Shaker(), new EvenOdd()
//		, new Bubble(), new Brush(), new EvenOdd()
		};

		for (int i = 0; i < sortArray.length; i++){

			for (int j =0; j < array1.length;j++){
				array1[j]= random.nextInt(999);
			}
			System.out.println("Исходный массив:");
			for (int dig1 : array1){
				System.out.print(dig1 + " ");
			}
			System.out.println();

			array1 = sortArray[i].sortirovka(array1);

			System.out.println("Отсортированный" + sortArray[i].name() + "массив:");
			for (int dig1 : array1){
				System.out.print(dig1 + " ");
			}
			System.out.println();
			System.out.println();
		}
	}
}
