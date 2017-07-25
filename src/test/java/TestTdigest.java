import org.junit.Before;
import org.junit.Test;

/**
 * Created by chamod on 7/24/17.
 */
public class TestTdigest {

    @Before
    public void init() {
    }

    @Test
    public void testTdigest(){
        TDigest tdigest = TDigest.createDigest(100);

        for(double i = 0; i< 1000000000; i++){
            tdigest.add(i);
//            System.out.print(tdigest.percentile(0.5)+", ");
            tdigest.percentile(0.5);
        }
    }
}
