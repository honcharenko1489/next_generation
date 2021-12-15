import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapTotoreal {
    public static void main(String[] args) {
        /*Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        for (Map.Entry<Integer, String> m:map.entrySet()) {
            System.out.println(m.getKey()+" : "+m.getValue());
        }
        Map<String, String> translateMap = new HashMap<>();
        translateMap.put("Frog", "Zgaba");
        translateMap.put("Kat", "Kit");
        translateMap.put("Dog", "Pes");
        for (Map.Entry<String, String> am: translateMap.entrySet()) {
            System.out.println(am.getKey()+ " :  "+am.getValue());
        }*/
        Map<Integer,  String>  lhm = new LinkedHashMap<>();
        /*lhm.put(3, "Prtro");
        lhm.put(2, "Dmytro");
        lhm.put(5, "Pavlo");
        lhm.put(1, "Grysha");
        System.out.println(lhm);*/

        Map<Integer,  String>  tm = new TreeMap<>();
        /*tm.put(3, "Prtro");
        tm.put(2, "Dmytro");
        tm.put(5, "Pavlo");
        tm.put(1, "Grysha");
        System.out.println(tm);*/

        testMap(tm);
        testMap(lhm);

    }
    public  static void testMap(Map<Integer, String>  map){
        map.put(39,  "Toliyan");
        map.put(9,  "Tania");
        map.put(1,  "Kostia");
        map.put(3,  "Boris");
        for (Map.Entry<Integer, String> mapEntry:map.entrySet()) {
            System.out.println(mapEntry.getKey()+ " : "+mapEntry.getValue());
        }
    }
}
