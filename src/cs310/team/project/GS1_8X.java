package cs310.team.project;

import java.util.HashMap;
import java.util.regex.Pattern;

public class GS1_8X extends GS1 {
    
    public GS1_8X() {
        
        super(); 
        
        super.matchers = new HashMap<>();
        
        super.matchers.put("8001" , Pattern.compile("^8001[0-9]{14}[%\\x1D]"));
        super.matchers.put("8002" , Pattern.compile("^8002[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,20}[%\\x1D]"));
        super.matchers.put("8003" , Pattern.compile("^8003[0-9]{14}[0-9]{4}[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,16}[%\\x1D]"));
        super.matchers.put("8004" , Pattern.compile("^8004[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,30}[%\\x1D]"));
        super.matchers.put("8005" , Pattern.compile("^8005[0-9]{6}[%\\x1D]"));
        super.matchers.put("8006" , Pattern.compile("^8006[0-9]{4}[0-9]{14}[0-9]{2}[0-9]{2}[%\\x1D]"));
        super.matchers.put("8007" , Pattern.compile("^8007[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,34}[%\\x1D]"));
        super.matchers.put("8008" , Pattern.compile("^8008[0-9]{4}[0-9]{8}[0-9]{1,4}[%\\x1D]"));
        super.matchers.put("8009" , Pattern.compile("^8009[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,50}[%\\x1D]"));
        super.matchers.put("8010" , Pattern.compile("^8010[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,30}[%\\x1D]"));
        super.matchers.put("8011" , Pattern.compile("^8011[0-9]{1,12}[%\\x1D]"));
        super.matchers.put("8012" , Pattern.compile("^8012[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,20}[%\\x1D]"));
        super.matchers.put("8013" , Pattern.compile("^8013[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,30}[%\\x1D]"));
        super.matchers.put("8017" , Pattern.compile("^8017[0-9]{18}[%\\x1D]"));
        super.matchers.put("8018" , Pattern.compile("^8018[0-9]{18}[%\\x1D]"));
        super.matchers.put("8019" , Pattern.compile("^8019[0-9]{1,10}[%\\x1D]"));
        super.matchers.put("8020" , Pattern.compile("^8020[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,25}[%\\x1D]"));
        super.matchers.put("8026" , Pattern.compile("^8026[0-9]{4}[0-9]{14}[0-9]{2}[0-9]{2}[%\\x1D]"));
        super.matchers.put("8110" , Pattern.compile("^8110[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,70}[%\\x1D]"));
        super.matchers.put("8111" , Pattern.compile("^8111[0-9]{4}[%\\x1D]"));
        super.matchers.put("8112" , Pattern.compile("^8112[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,70}[%\\x1D]"));
        super.matchers.put("8200" , Pattern.compile("^8200[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,70}[%\\x1D]"));
        
        super.matchers.put("8001eol" , Pattern.compile("^8001[0-9]{14}[%\\x1D]"));
        super.matchers.put("8002eol" , Pattern.compile("^8002[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,20}$"));
        super.matchers.put("8003eol" , Pattern.compile("^8003[0-9]{14}[0-9]{4}[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,16}$"));
        super.matchers.put("8004eol" , Pattern.compile("^8004[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,30}$"));
        super.matchers.put("8005eol" , Pattern.compile("^8005[0-9]{6}$"));
        super.matchers.put("8006eol" , Pattern.compile("^8006[0-9]{4}[0-9]{14}[0-9]{2}[0-9]{2}$"));
        super.matchers.put("8007eol" , Pattern.compile("^8007[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,34}$"));
        super.matchers.put("8008eol" , Pattern.compile("^8008[0-9]{4}[0-9]{8}[0-9]{1,4}$"));
        super.matchers.put("8009eol" , Pattern.compile("^8009[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,50}$"));
        super.matchers.put("8010eol" , Pattern.compile("^8010[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,30}$"));
        super.matchers.put("8011eol" , Pattern.compile("^8011[0-9]{1,12}$"));
        super.matchers.put("8012eol" , Pattern.compile("^8012[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,20}$"));
        super.matchers.put("8013eol" , Pattern.compile("^8013[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,30}$"));
        super.matchers.put("8017eol" , Pattern.compile("^8017[0-9]{18}$"));
        super.matchers.put("8018eol" , Pattern.compile("^8018[0-9]{18}$"));
        super.matchers.put("8019eol" , Pattern.compile("^8019[0-9]{1,10}$"));
        super.matchers.put("8020eol" , Pattern.compile("^8020[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,25}$"));
        super.matchers.put("8026eol" , Pattern.compile("^8026[0-9]{4}[0-9]{14}[0-9]{2}[0-9]{2}$"));
        super.matchers.put("8110eol" , Pattern.compile("^8110[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,70}$"));
        super.matchers.put("8111eol" , Pattern.compile("^8111[0-9]{4}$"));
        super.matchers.put("8112eol" , Pattern.compile("^8112[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,70}$"));
        super.matchers.put("8200eol" , Pattern.compile("^8200[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,70}$"));    
    }
    
    public Object parse8001(String element) {
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "DIMENSIONS");
        output.put("ai", element.substring(0, 4));
        output.put("datafield", element.substring(4));
        output.put("width", element.substring(4, 8));
        output.put("length", element.substring(8,13));
        output.put("diameter", element.substring(13, 16));
        
        if (element.substring(16,17).equals("0")) {
            output.put("winding direction", "face out");}
        else if (element.substring(16,17).equals("1")) {
            output.put("winding direction", "face in");}   
        else {
            output.put("winding direction", "undefined");}
        
        if (element.substring(17,18).equals("9")) {
            output.put("splices", "number unkown");}
        else {
            output.put("splices", element.charAt(17));}
        
        
        output.put("element", element);
        
        return output;
    }
    
    public Object parse8001eol (String element) {
        return (parse8001(element));
    }
    
    public Object parse8002 (String element) {
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "CMT NO");
        output.put("ai", element.substring(0, 4));
        output.put("Cellular mobile telephone identifier" , element.charAt(4));
        output.put("element", element);
        
        char c = element.charAt(element.length() - 1);
        String datafield; 
           
        if (c == '%' || c == '\u001D') {
             datafield = element.substring(2, element.length() - 1);
        }
        else {
            datafield = element.substring(2);
        }
        
        output.put("datafield", datafield);
        
        return output;
    }
    
    public Object parse8002eol (String element) {
        return (parse8002(element));
    }
    
    public Object parse8003 (String element) {
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "GRAI");
        output.put("ai", element.substring(0,4));
        output.put("GS1 Company Prefix", element.substring(4,18));
        output.put("Check digit", element.charAt(18));
        output.put("Serial component", element.substring(19));
        output.put("element", element);
        
        char c = element.charAt(element.length() - 1);
        String datafield;

        if (c == '%' || c == '\u001D') {
            datafield = element.substring(2, element.length() - 1);
        }
        else {
            datafield = element.substring(2);
        }
        
        output.put("datafield", datafield);
        
        return output;
    }
    
    public Object parse8003eol (String element) {
        return (parse8003(element));
    }
    
    public Object parse8004 (String element) {
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "GIAI");
        output.put("ai", element.substring(0,4));
        output.put("GIAI", element.substring(4));
        output.put("element", element);
        
        char c = element.charAt(element.length() - 1);
        String datafield;

        if (c == '%' || c == '\u001D') {
            datafield = element.substring(2, element.length() - 1);
        }
        else {
            datafield = element.substring(2);
        }
        
        output.put("datafield", datafield);
        
        return output;                
    }
    
    public Object parse8004eol (String element) {
        return (parse8004(element));
    }
    
    public Object parse8005 (String element) {
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "PRICE PER UNIT");
        output.put("ai", element.substring(0,4));
        output.put("price per unit of measure", element.substring(4));
        output.put("element", element);
        
        return output;
    }
    
    public Object parse8005eol (String element) {
        return (parse8005(element));
    }
    
    public Object parse8006 (String element) {
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "ITIP or GCTIN");
        output.put("ai", element.substring(0,4));
        output.put("datafield", element.substring(4));
        output.put("GTIN", element.substring(4,18));
        output.put("piece number", element.substring(18,20));
        output.put("total count", element.substring(20,22));
        output.put("element", element);
        
        return output;
    }
    
    public Object parse8006eol (String element) {
        return (parse8006(element));
    }
    
    public Object parse8007 (String element) {
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "IBAN");
        output.put("ai", element.substring(0,4));
        output.put("IBAN", element.substring(4));
        output.put("element", element);
        
        char c = element.charAt(element.length() - 1);
        String datafield;

        if (c == '%' || c == '\u001D') {
            datafield = element.substring(2, element.length() - 1);
        }
        else {
            datafield = element.substring(2);
        }
        
        output.put("datafield", datafield);
        
        return output;
    }
    
    public Object parse8007eol (String element) {
        return (parse8007(element));
    }
    
    public Object parse8008 (String element) {
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "PROD TIME");
        output.put("ai", element.substring(0,4));
        output.put("datafield", element.substring(4));
        output.put("year", element.substring(4,6));
        output.put("month", element.substring(6,8));
        output.put("day", element.substring(8,10));
        output.put("hour", element.substring(10,12));
        output.put("minutes", element.substring(12,14));
        output.put("seconds", element.substring(14,16));
        output.put("element", element);
        
        char c = element.charAt(element.length() - 1);
        String datafield;

        if (c == '%' || c == '\u001D') {
            datafield = element.substring(2, element.length() - 1);
        }
        else {
            datafield = element.substring(2);
        }
        
        output.put("datafield", datafield);
        
        return output;
    }
    
    public Object parse8008eol (String element) {
        return (parse8008(element));
    }
    
    public Object parse8009 (String element) {
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "OPTSEN");
        output.put("ai", element.substring(0,4));
        output.put("AIM parameters", element.substring(4));
        output.put("element", element);
        
        char c = element.charAt(element.length() - 1);
        String datafield;

        if (c == '%' || c == '\u001D') {
            datafield = element.substring(2, element.length() - 1);
        }
        else {
            datafield = element.substring(2);
        }
        
        output.put("datafield", datafield);
        
        return output;
    }
    
    public Object parse8009eol (String element) {
        return (parse8009(element));
    }
    
    public Object parse8010 (String element) {
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "CPID");
        output.put("ai", element.substring(0,4));
        output.put("CPID", element.substring(4));
        output.put("element", element);
        
        char c = element.charAt(element.length() - 1);
        String datafield;

        if (c == '%' || c == '\u001D') {
            datafield = element.substring(2, element.length() - 1);
        }
        else {
            datafield = element.substring(2);
        }
        
        output.put("datafield", datafield);
        
        return output;
    }
    
    public Object parse8010eol (String element) {
        return (parse8010(element));
    }
    
    public Object parse8011 (String element) {
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "CPID serial");
        output.put("ai", element.substring(0,4));
        output.put("serial", element.substring(4));
        output.put("element", element);
        
        char c = element.charAt(element.length() - 1);
        String datafield;

        if (c == '%' || c == '\u001D') {
            datafield = element.substring(2, element.length() - 1);
        }
        else {
            datafield = element.substring(2);
        }
        
        output.put("datafield", datafield);
        
        return output;
    }
    
    public Object parse8011eol (String element) {
        return (parse8010(element));
    }
    
    public Object parse8012 (String element) {
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "VERSION");
        output.put("ai", element.substring(0,4));
        output.put("version", element.substring(4));
        output.put("element", element);
        
        char c = element.charAt(element.length() - 1);
        String datafield;

        if (c == '%' || c == '\u001D') {
            datafield = element.substring(2, element.length() - 1);
        }
        else {
            datafield = element.substring(2);
        }
        
        output.put("datafield", datafield);
        
        return output;
    }
    
    public Object parse8012eol (String element) {
        return (parse8012(element));
    }
    
    public Object parse8013 (String element) {
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "GMN");
        output.put("ai", element.substring(0, 4));
        output.put("GMN", element.substring(4));
        output.put("element", element);
        
        char c = element.charAt(element.length() - 1);
        String datafield;

        if (c == '%' || c == '\u001D') {
            datafield = element.substring(2, element.length() - 1);
        }
        else {
            datafield = element.substring(2);
        }
        
        output.put("datafield", datafield);
        
        return output;
    }
    
    public Object parse8013eol (String element) {
        return (parse8013(element));
    }
    
    public Object parse8017 (String element) {
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "GSRN-PROVIDER");
        output.put("ai", element.substring(0,4));
        output.put("datafield", element.substring(4));
        output.put("GSRN Provider", element.substring(4, 21));
        output.put("Check digit", element.charAt(21));
        output.put("element", element);
        
        return output;
    }
    
    public Object parse8017eol (String element) {
        return (parse8017(element));
    }
    
    public Object parse8018 (String element) {
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "GSRN-RECIPIENT");
        output.put("ai", element.substring(0,4));
        output.put("datafield", element.substring(4));
        output.put("GSRN Recipient", element.substring(4,21));
        output.put("Chech digit", element.charAt(21));
        output.put("element", element);
        
        return output;
    }
    
    public Object parse8018eol (String element) {
        return (parse8018(element));
    }
    
    public Object parse8019 (String element) {
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "SRIN");
        output.put("ai", element.substring(0,4));
        output.put("SRIN", element.substring(4));
        output.put("element", element);
        
        char c = element.charAt(element.length() - 1);
        String datafield;

        if (c == '%' || c == '\u001D') {
            datafield = element.substring(2, element.length() - 1);
        }
        else {
            datafield = element.substring(2);
        }
        
        output.put("datafield", datafield);
        
        return output;
    }
    
    public Object parse8019eol (String element) {
        return (parse8019(element));
    }
    
    public Object parse8020 (String element) {
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "REF NO");
        output.put("ai", element.substring(0,4));
        output.put("reference number", element.substring(4));
        output.put("element", element);
        
        char c = element.charAt(element.length() - 1);
        String datafield;

        if (c == '%' || c == '\u001D') {
            datafield = element.substring(2, element.length() - 1);
        }
        else {
            datafield = element.substring(2);
        }
        
        output.put("datafield", datafield);
        
        return output;
    }
    
    public Object parse8020eol (String element) {
        return (parse8020(element));
    }
    
    public Object parse8026 (String element) {
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "ITIP CONTENT");
        output.put("ai", element.substring(0,4));
        output.put("datafield", element.substring(4));
        output.put("GTIN", element.substring(4, 18));
        output.put("piece number", element.substring(18, 20));
        output.put("total count", element.substring(20, 22));
        output.put("element", element);
        
        return output;
    }
    
    public Object parse8026eol (String element) {
        return (parse8026(element));
    }
    
    public Object parse8110 (String element) {
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "COUPON CODE");
        output.put("ai", element.substring(0,4));
        output.put("coupon code", element.substring(4));
        output.put("element", element);
        
        char c = element.charAt(element.length() - 1);
        String datafield;

        if (c == '%' || c == '\u001D') {
            datafield = element.substring(2, element.length() - 1);
        }
        else {
            datafield = element.substring(2);
        }
        
        output.put("datafield", datafield);
                
        return output;      
    }
    
    public Object parse8110eol (String element) {
        return (parse8110(element));
    }
    
    public Object parse8111 (String element){
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "POINTS");
        output.put("ai", element.substring(0,4));
        output.put("points", element.substring(4,8));
        output.put("element", element);
        
        return output;
    }

    public Object parse8111eol (String element) {
        return (parse8111(element));
    }
    
    public Object parse8112 (String element) {
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "coupon code");
        output.put("ai", element.substring(0,4));
        output.put("coupon code", element.substring(4));
        output.put("element", element);
        
        char c = element.charAt(element.length() - 1);
        String datafield;

        if (c == '%' || c == '\u001D') {
            datafield = element.substring(2, element.length() - 1);
        }
        else {
            datafield = element.substring(2);
        }
        
        output.put("datafield", datafield);
        
        return output;
    }
    
    public Object parse8112eol (String element) {
        return (parse8112(element));
    }
    
    public Object parse8200 (String element) {
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "PRODUCT URL");
        output.put("ai", element.substring(0,4));
        output.put("URL", element.substring(4));
        output.put("element", element);
        
        char c = element.charAt(element.length() - 1);
        String datafield;

        if (c == '%' || c == '\u001D') {
            datafield = element.substring(2, element.length() - 1);
        }
        else {
            datafield = element.substring(2);
        }
        
        output.put("datafield", datafield);
        
        return output;
    }
    
    public Object parse8200eol (String element) {
        return (parse8200(element));
    }
 }


