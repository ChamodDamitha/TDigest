/**
 * Created by chamod on 7/18/17.
 */
public class Main {
    public static void main(String[] args) {
        TDigest tdigest = TDigest.createDigest(0.1, 0.01);

        for(double i = 0; i< 1000000; i++){
            tdigest.add(i);
            System.out.println(tdigest.percentile(0.1)+" ");
//            tdigest.percentile(0.5);
        }
    }
}
