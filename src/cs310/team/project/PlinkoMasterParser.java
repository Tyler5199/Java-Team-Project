package cs310.team.project;

import java.lang.reflect.Constructor;
import org.json.simple.JSONValue;
import java.util.ArrayList;
import java.util.HashMap;

public class PlinkoMasterParser {
    
    ArrayList exclusions = new ArrayList<String>();
    
    /* TOP-LEVEL PARSE METHOD */
    
    public String parse(String code) {
                
        /* Create empty GS1 data collections */
        
        ArrayList<Object> data = new ArrayList<>();
        HashMap<String, Object> results = null;
        
        /* Continue parsing until entire GS1 code has been processed */
        
        while ( !code.isEmpty() ) {
            
            results = null;
            
            /* Sample first digit in code */
            
            char d = code.charAt(0);
            System.out.println("Code Digit " + d + " Found");
            
            /* Is digit valid? */
            
            if ((d >= '0') && (d <= '9')) {
                            
                try {
                    
                    /* If so, instantiate the corresponding matcher/parser collection */

                    Class c = Class.forName("cs310.team.project.GS1_" + d + "X");
                    Constructor constructor = c.getConstructor();
                    GS1 p = (GS1)(constructor.newInstance());

                    /* Delegate match/parse to collection; capture results */
                    
                    results = (HashMap)(p.parse(code));
                    
                    exclusions.add(results.get("ai"));
                    
                    if (exclusions.contains("01") && (exclusions.contains("02") || exclusions.contains("37")
                            || exclusions.contains("255"))) {
                        System.out.println("Break\n");
                        break;
                    } 
                    
                    if (exclusions.contains("420") && exclusions.contains("421")) {
                        System.out.println("Break\n");
                        break;
                    }
                    
                    
                     if (exclusions.contains("392") && exclusions.contains("393")) {

                        System.out.println("Break\n");
                        break;
                    }

                     if (exclusions.contains("394") && exclusions.contains("8111")) {

                        System.out.println("Break\n");
                        break;
                    }
                    
                    if (exclusions.contains("8006") && (exclusions.contains("01") || exclusions.contains("37"))) {
                        System.out.println("Break\n");
                        break;
                    }
                    
                    if (exclusions.contains("8018") && exclusions.contains("8017")) {
                        System.out.println("Break\n");
                        break;
                    }
                    
                    if (exclusions.contains("8026") && (exclusions.contains("02") || exclusions.contains("8006") || exclusions.contains("255"))) {
                        System.out.println("Break\n");
                        break;
                    }  
                    
                    if (exclusions.contains("392") && exclusions.contains("393")) {

                        System.out.println("Break\n");
                        break;
                    }

                    if (exclusions.contains("394") && exclusions.contains("8111")) {

                        System.out.println("Break\n");
                        break;
                    }
                    
                    if(exclusions.contains("422") && exclusions.contains("426")){
                        System.out.println("Break\n");
                        break;
                    }
                  
                    if(exclusions.contains("423") && exclusions.contains("426")){
                        System.out.println("Break\n");
                        break;
                    }
                   
                    if(exclusions.contains("424") && exclusions.contains("426")){
                        System.out.println("Break\n");

                        break;
                    }
                   
                    if(exclusions.contains("425") && exclusions.contains("426")){
                        System.out.println("Break\n");
                        break;
                    }                    
                 
                    
                    if (exclusions.contains("8006") && (exclusions.contains("01") || exclusions.contains("37"))) {
                        System.out.println("Break\n");
                        break;
                    }
                    
                    if (exclusions.contains("8018") && exclusions.contains("8017")) {
                        System.out.println("Break\n");
                        break;
                    }
                    
                    if (exclusions.contains("8026") && (exclusions.contains("02") || exclusions.contains("8006")|| exclusions.contains("255"))) {
                        System.out.println("Break\n");
                        break;
                    } 
                    
                    if(exclusions.contains("22") && !exclusions.contains("01")) {
                        System.out.println("Break\n");
                    }
        
                     if (exclusions.contains("240") && (exclusions.contains("01") || exclusions.contains("02") || exclusions.contains("8006") || exclusions.contains("8026"))) {
                        System.out.println("Mandatory Data Relationship Error");    
                    }

                    if(exclusions.contains("243") && exclusions.contains("01")) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }
                     
                    if(exclusions.contains("7001") && (!exclusions.contains("01")||!exclusions.contains("02"))||(!exclusions.contains("8006")||!exclusions.contains("8026"))) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }
                    
                    if(exclusions.contains("7002") && (!exclusions.contains("01")||!exclusions.contains("02"))) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }

                    if(exclusions.contains("7003") && (!exclusions.contains("01")||!exclusions.contains("02"))) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }

                    if(exclusions.contains("7004") && (!exclusions.contains("01")||!exclusions.contains("10"))) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }

                    if(exclusions.contains("7005") && (!exclusions.contains("01")||!exclusions.contains("02"))) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }

                    if(exclusions.contains("7006") && (!exclusions.contains("01")||!exclusions.contains("02"))) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }

                    if(exclusions.contains("7007") && (!exclusions.contains("01")||!exclusions.contains("02"))) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }
                    
                    if(exclusions.contains("7008") && (!exclusions.contains("01")||!exclusions.contains("02"))) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }

                    if(exclusions.contains("7009") && (!exclusions.contains("01")||exclusions.contains("02"))) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }

                    if(exclusions.contains("7010") && (!exclusions.contains("01")||!exclusions.contains("02"))) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }

                    if(exclusions.contains("703s") && (!exclusions.contains("01")||!exclusions.contains("02"))) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }

                    if(exclusions.contains("710") && !exclusions.contains("01")) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }

                    if(exclusions.contains("711") && !exclusions.contains("01")) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }

                    if(exclusions.contains("712") && !exclusions.contains("01")) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }

                    if(exclusions.contains("713") && !exclusions.contains("01")) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }
                    
                    if(exclusions.contains("714") && !exclusions.contains("01")) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }
                    
                    if(exclusions.contains("7020") && ( (!exclusions.contains("01") || !exclusions.contains("8006") ) && !exclusions.contains("416"))) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }
                    
                    if(exclusions.contains("7021") && (!exclusions.contains("01") || !exclusions.contains("8006"))) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }

                    if(exclusions.contains("7022") && ( (!exclusions.contains("01") || !exclusions.contains("8006") ) && !exclusions.contains("7021"))) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }
                    
                    if(exclusions.contains("723s") && (!exclusions.contains("01") || !exclusions.contains("8004"))) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }
                    
                    if(exclusions.contains("8001") && !exclusions.contains("01")) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }
                    
                    if(exclusions.contains("8005") && (!exclusions.contains("01") || !exclusions.contains("02"))) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }
                    
                    if(exclusions.contains("8007") && (!exclusions.contains("8020") && !exclusions.contains("415"))) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }
                    
                    if(exclusions.contains("8008") && (!exclusions.contains("01") || !exclusions.contains("02"))) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }
                    
                    if(exclusions.contains("8009") && (!exclusions.contains("01") || !exclusions.contains("00"))) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }
                    
                    if(exclusions.contains("8011") && exclusions.contains("8010")) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }
                    
                    if(exclusions.contains("8012") && (!exclusions.contains("01") || !exclusions.contains("8006"))) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }
                    
                    if(exclusions.contains("8019") && (!exclusions.contains("8017") || !exclusions.contains("8018"))) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }
                    
                    if(exclusions.contains("8020") && !exclusions.contains("415")) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }
                    
                    if(exclusions.contains("8026") && (!exclusions.contains("00") && !exclusions.contains("37"))) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }
                    
                    if(exclusions.contains("8111") && (!exclusions.contains("255"))) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }
                    
                    if(exclusions.contains("8200") && !exclusions.contains("01")) {
                        System.out.println("Mandatory Data Relationship Error"); 
                    }

                    System.out.println(results);

                }
                catch (Exception e) {System.err.println("GS1 Class Exception: " + e.toString());}

            }
            
            
            
            if (results != null) {
                
                /* If valid results were returned, add to array */

                data.add(results);
                
                /* Strip parsed element string from beginning of code */
                
                String element = (String)results.get("element");
                code = code.substring(element.length()).trim();
                
            }
            
            /* If element string could not be identified, abort the parse */
            
            else {
                break;
            }
            
        }
        
        /* Return array of parsed GS1 data as a JSON string */
        
        return(JSONValue.toJSONString(data));
        
    }
    
}
