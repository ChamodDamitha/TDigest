/**
 * Created by chamod on 7/18/17.
 */
public class Main {
    public static void main(String[] args) {
        TDigest tdigest = TDigest.createDigest(100);

        for(double i = 0; i< 1000; i++){
            tdigest.add(i);
            System.out.print(tdigest.quantile(0.5)+", ");
        }
    }
}
