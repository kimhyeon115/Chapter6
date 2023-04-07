package Package_2;

import java.util.Arrays;

public class P154 {

	public static void main(String[] args) {
		int[] arr[];
		int[] arr1 = {1,2,3,};
		int[] arr3 = new int[5];
//		int[] arr4 = new int[5] {1,2,3,4,5};      //int[]로 사용해야함
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1);
		int[] arr2 = new int[5];
		arr2[0] = 77;
		arr2[1] = 21;
		arr2[2] = 54;
		arr2[3] = 34;
		arr2[4] = 64;
		for(int i=0; i<arr2.length;i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(arr2));
		
		int[][] arr5 = {
				{5,5,5,5,5},
				{10,10,10},
				{20,20,20,20},
				{30,30}
		};		
		System.out.println(arr5.length);		//열의 길이
		System.out.println(arr5[3].length);		//행의 index 3번째 길이
	}											//행은 설정하면 불변
												//열은 열마다 다를수 있음
}
