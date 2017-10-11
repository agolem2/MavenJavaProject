package utiity;

public class MostCommon {
	
	private static int getMostPopularElement(int[] a){
	    int counter = 0, curr, maxvalue, maxcounter = -1;
	    maxvalue = curr = a[0];

	    for (int e : a){
	        if (curr == e){
	            counter++;
	        } else {
	            if (counter > maxcounter){
	                maxcounter = counter;
	                maxvalue = curr;
	            }
	            counter = 0;
	            curr = e;
	        }
	    }
	    if (counter > maxcounter){
	        maxvalue = curr;
	    }

	    return maxvalue;
	}


	public static void main(String[] args) {
	    System.out.println(getMostPopularElement(new int[]{1,2,3,4,5,6,7,7,7,7}));
	}

}
