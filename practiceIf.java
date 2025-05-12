import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class practiceIf {
  static boolean flag = true;
  static boolean flag2 = true;
  static boolean reportsUploadedStatusForTenant = true;
  static int count = 0;
  static Map<String, String> tenantIdMap = new HashMap<>();

  public static void main(String[] args) {

    if (flag) {
      System.out.println("true");
    } else if (flag == false) {
      // user can't override masking policies and is using older format. throw
      // exception is that
      // case.
      System.out.println("true2");

    } else if (flag2 == true) {
      // no output attributes information have been passed or there was en error
      // parsing the same.
      System.out.println("true3");
    } else {
      // process query response and mask it as per policies.
      System.out.println("true4");
    }
    List<String> supplierNames = new ArrayList<String>();
    List<String> supplierNamesFailed = new ArrayList<String>();
    supplierNames.add("sup1");
    supplierNames.add("sup2");
    System.out.println(supplierNames.size());
    System.out.println("sup" + supplierNames);
    supplierNames = new ArrayList<String>();
    supplierNames.add("sup3");
    System.out.println("sup" + supplierNames);
    System.out.println(supplierNames.size());
    int i = 0;

    System.out.println("Hello, World!");
    tenantIdMap.put("101034", "CXUNITYSI-dmintgb2bpn1_APPID");
    //tenantIdMap.put("101035", "CXUNITYSI-dmintgb2cpn1_APPID");
    System.out.println("true4" + check(tenantIdMap));

    List<String> tenantList = new ArrayList<>();
    //tenantList.add("101034");
    tenantList.add("101035");
    for (int tenantNo = 0; tenantNo < tenantList.size(); tenantNo++) {
      if(tenantIdMap.get(tenantList.get(tenantNo)) != null && !tenantIdMap.get(tenantList.get(tenantNo)).equals("101035")) {
          System.out.println("...........fixed................");
        }
    }

    Map<String, String> tenantIdMapInt = new HashMap<>();
    Map<Integer, String> failedTenantIdMap = new HashMap<>();
    tenantIdMapInt.put("101034","1");
    tenantIdMapInt.put("101035","2");
    tenantIdMapInt.put("101036","3");

    List<String> tenantProcessIds = new ArrayList<>();
    tenantProcessIds.add("101034");
    tenantProcessIds.add("101035");

    Map<String, Map<String, String>> tenantReportsMap = new HashMap<>();
    tenantReportsMap.put("101034", tenantIdMapInt);
    tenantReportsMap.put("101035", tenantIdMapInt);

    // System.out.println("processedTenant " + getProcessedTenants(tenantIdMap, 0));
    //System.out.println("switching " + switchAndSaveTenant(tenantProcessIds, tenantIdMap, "2",  0));
    System.out.println("statusFailedTenant " + updateTenantsRecordToNullIfExists1(tenantProcessIds, tenantIdMap, tenantReportsMap));
    System.out.println(tenantIdMap.get("101034"));
    System.out.println(tenantIdMap.get("101034"));
    List<String> allTenantIdsList = null;
    List<String> allcTenantIdsList = null;
    allTenantIdsList = tenantIdMap.values()
        .stream()
        .collect(Collectors.toCollection(ArrayList::new));
    allcTenantIdsList = tenantIdMap.keySet()
        .stream()
        .collect(Collectors.toCollection(ArrayList::new));
    // //TenantContext.setCurrentTenant(entry.getKey());
    System.out.println("array" + allTenantIdsList);
    System.out.println("in");
    System.out.println("array1" + allcTenantIdsList);
    i =2;
    for (Map.Entry<String, String> entry : tenantIdMapInt.entrySet()) {
      // if ("CXUNITYSI-dmintgb2cpn1_APPID".equals(entry.getValue())) {
        System.out.println("mapValue " + entry.getValue());
        //i += entry.getKey();
        System.out.println("mapKey " + entry.getKey());
        System.out.println("map" + reportsUploadedStatusForTenant);
        //failedTenantIdMap.put(entry.getKey(), entry.getValue());
        System.out.println("i = " + i);
      //}
    }
    System.out.println("failedMap" + failedTenantIdMap);
    if(allTenantIdsList.contains("CXUNITYSI-dmintgb2cpn1_APPID")) { System.out.println("CXUNITYSI-dmintgb");}
    System.out.println("i = " + i);

  }
  static List<String> tenantReports = new ArrayList<>();
  public static boolean check(Map<String, String> tenantIdMap) {
    reportsUploadedStatusForTenant = false;
    try {
      for (Map.Entry<String, String> entry : tenantIdMap.entrySet()) {
        reportsUploadedStatusForTenant = true;
      }
    } catch (Exception e) {
    }
    return reportsUploadedStatusForTenant;
  }
  static Map<String, String> failedTenantIdMap = new HashMap<>();
  public static List<String> getProcessedTenants(Map<String, String> tenantIdMap, int fCount) {


    System.out.println("switching........");
         for (Map.Entry<String,String> entry : tenantIdMap.entrySet()) {
                System.out.println("size........" + failedTenantIdMap.size());
                System.out.println("entry.getKey()........" + entry.getKey());
                if (failedTenantIdMap.size()>=1) {
                  failedTenantIdMap.put("ajay", "in");
                  tenantReports.add("ajay");
                }
                else if ("101034".equals(entry.getKey())) {
                  failedTenantIdMap.put(entry.getKey(), entry.getValue());
                  System.out.println("failedTenantIdMap " + failedTenantIdMap);
                  tenantReports.add(entry.getKey());
                }
                System.out.println("tenantReports............... " + tenantReports);
         }
         System.out.println("failedTenantIdMap " + failedTenantIdMap);
         fCount++;
             if(fCount<=1) {
              getProcessedTenants(failedTenantIdMap, fCount);
             }

             System.out.println("count" + fCount);
             System.out.println("failedTenantIdMap " + failedTenantIdMap);
             System.out.println("tenantReports............... " + tenantReports);
      return tenantReports;
  }


  private static boolean switchAndSaveTenant(Map<String, String> tenantIdMap, String logAggregatorAuditId,
  int failedCount) {
boolean status = false;
for (Map.Entry<String, String> entry : tenantIdMap.entrySet()) {
  System.out.println("size........" + failedTenantIdMap.size());
  System.out.println("entry.getKey()........" + entry.getKey());
  if (failedTenantIdMap.size()>=1) {
    failedTenantIdMap.put("ajay", "in");
    tenantReports.add("ajay");
  }
  else if ("101034".equals(entry.getKey())) {
    failedTenantIdMap.put(entry.getKey(), entry.getValue());
    System.out.println("failedTenantIdMap " + failedTenantIdMap);
    tenantReports.add(entry.getKey());
  }
  System.out.println("failedTenantIdMap........" + failedTenantIdMap);
    status = true;
  }


  failedCount++;
  if (failedCount <= 1) {
    switchAndSaveTenant(failedTenantIdMap, logAggregatorAuditId,
        failedCount);
  }
return status;
}



public static int updateTenantsRecordToNullIfExists12(List<String> tenantProcessIds,
    Map<String, String> tenantIdMap, Map<String, Map<String, String>> tenantReportsMap) {
  int updatedRecordsCount = 0;
  for (String singleTenantProcessId : tenantProcessIds) {
    for (Map.Entry<String, Map<String, String>> entry : tenantReportsMap.entrySet()) {
      System.out.println("Outside singleTenantProcessId........" + singleTenantProcessId);
      System.out.println("OutMappppp........" + entry.getValue());
     // System.out.println("Insideentry.getValue()........" + entry.getValue().get("101034"));
      if (singleTenantProcessId == entry.getValue().get("101034")) {
        System.out.println("In");
        System.out.println("Inside singleTenantProcessId........" + singleTenantProcessId);
        System.out.println("InMappppp........" + entry.getValue());
        // System.out.println("Insideentry.getValue()........" + entry.getValue());
        // System.out.println("tenantIdMap.get(entry.getValue().getTenantId())........" + tenantIdMap.get(entry.getValue().get("101034")));
        System.out.println("singleTenantProcessId........" + singleTenantProcessId);
      }
    }
  }
  return updatedRecordsCount;
}

public static int updateTenantsRecordToNullIfExists1(List<String> tenantIds,
Map<String, String> tenantIdMap, Map<String, Map<String, String>> tenantReportsMap) {
int updatedRecordsCount = 0;
for (String tenantId:  tenantIds) {
  System.out.println("Inside tenantIdMap.get(tenantId)........" + tenantIdMap.get(tenantId));
  Map<String, String> tenantReport = tenantReportsMap.get(tenantId);
  System.out.println("Inside tenantIdMap.get(tenantId)........" + tenantReport);
String singleTenantProcessId = tenantReport.get(tenantId);
System.out.println("Inside tenantIdMap.get(tenantId)........" + tenantReport.get(tenantId));
System.out.println("Inside singleTenantProcessId........" + singleTenantProcessId);
}
// for (String singleTenantProcessId : tenantProcessIds) {
//   for (Map.Entry<String, TenantReports> entry : tenantReportsMap.entrySet()) {
//     if (singleTenantProcessId.equals(entry.getValue().getId())) {
//       TenantContext.setCurrentTenant(tenantIdMap.get(entry.getValue().getTenantId()));
//       updatedRecordsCount += tenantReportsRepo.updateTenantsRecordToNullIfExists(singleTenantProcessId, status,
//           TimeCalcUtility.getDateOfTimeZone(cxPodTimeZone), logAggregatorId);
//     }
//   }
// }
return updatedRecordsCount;
}


}
