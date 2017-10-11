package ArrayExamples;

import java.util.HashSet;
import java.util.Set;

public class Random {

private static final Set<String> generatedNumbers = new HashSet<String>();

public Random() {
}

public static void main(String[] args) {
    @SuppressWarnings("unused")
	final int maxLength = 4;
    @SuppressWarnings("unused")
	final int maxTry = 1;
    
    for(int i =0; i<1; i++){

        int randomInt = (int)(1575.0 * Math.random());

        System.out.println( randomInt );

  }
    }


public static String getRandomId(final int maxLength, final int maxTry) {
    final Random random = new Random();
    final int max = (int) Math.pow(10, maxLength);
    final int maxMin = (int) Math.pow(10, maxLength-1);
    int i = 0;
    boolean unique = false;
    int randomId = -1;
    while (i < maxTry) {
        randomId = random.nextInt(max - maxMin - 1) + maxMin;

        synchronized (generatedNumbers) {
            if (generatedNumbers.contains(randomId) == false) {
                unique = true;
                break;
            }
        }
        i++;
    }
    if (unique == false) {
        throw new RuntimeException("Cannot generate unique id!");
    }

    synchronized (generatedNumbers) {
        generatedNumbers.add(String.valueOf(randomId));
    }

    return String.valueOf(randomId);
}

private int nextInt(int i) {
	// TODO Auto-generated method stub
	return 0;
}

}
