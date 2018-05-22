package Advanced.PrimeNumbers;

import java.util.ArrayList;

public class Primes {
        int range = 100;
        ArrayList<Prime> bigList = new ArrayList<>();
    public void Populate() {

        for (int i = 0; i < range; i++) {
            bigList.add( new Prime( i + 1 ) );
//            System.out.println( bigList.get( i ).getValue() );
        }
    }
    public void removeNonPrime (){
        int j = 2;
        for (int k = 0; k < range; k++) {
            j = 2;
            System.out.println("j is " + j);
            for (int i = j*j; i <= (range/j) +1; i += j) {
                System.out.println("i is "+ i);
                bigList.remove( i );
                i-=1;
            }
        }
        for (int i = 0; i <= bigList.size(); i++) {
            System.out.println(bigList.get(i).getValue());
        }
    }

    public class Populate {
    }
}
