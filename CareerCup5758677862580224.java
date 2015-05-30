package careerCup;
/*
	Author: Christian Balderrama
	Email: softwaredevxtian@yahoo.com
	
  		Question:
		Given an unsorted array of integers find a minimum number which is not present in array.
		e.g -1 ,4, 5, -23,24 is array then answer should be -22.
 */
public class CareerCup5758677862580224 {
	public static void main(String[] args) {
		int[] sampleArray = {-1,4,5,-23,24};
		int minimum = 0;
		
		System.out.println(minValue(sampleArray,minimum));
	}
	public static int minValue(int[] sampleArray, int min){
		for(int x = 0; x < sampleArray.length; x++){
			if(sampleArray[x] < min)
				min=sampleArray[x];
		}
		return min+=1;
	}
}
