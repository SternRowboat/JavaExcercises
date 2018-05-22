package Advanced.PrimeNumbers;

public class Main {
    public static void main(String[] args) {
        Primes findThem = new Primes();
        findThem.Populate();
        findThem.removeNonPrime();
    }
}
