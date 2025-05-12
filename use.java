import java.util.HashMap;
import java.util.Map;

public class use {
  static Map<String, String> tenantIdMap = new HashMap<>();
  public static void setter(String value1) {
    value1 = "ajay";
    tenantIdMap.put(value1, "CXUNITYSI-dmintgb2bpn1_APPID");
  }

  public static void setter2(String value1) {
    if(value1 == "ajay") {
      System.out.println("Done");
    };
    tenantIdMap.put(value1, "CXUNITYSI-dmintgb2bpn1_APPID");
  }

  public void getter() {
    for (Map.Entry<String, String> entry : tenantIdMap.entrySet()) {
        System.out.println(entry.getKey());
    }
  }
}
