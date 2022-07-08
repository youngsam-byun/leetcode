import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

    @Test
    void test(){
        TreeMap<Integer,Integer> map = new TreeMap<>();
        map.put(1,1);
        map.put(2,1);
        map.put(3,1);

        for(Map.Entry<Integer,Integer> et: map.entrySet()){
            System.out.println(et.getKey());
        }


    }

}
