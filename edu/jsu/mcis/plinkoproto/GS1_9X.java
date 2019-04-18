package edu.jsu.mcis.plinkoproto;

import java.util.HashMap;
import java.util.regex.Pattern;

public class GS1_9X extends GS1 {
    
    public GS1_9X() {
        super();

        super.matchers = new HashMap<>();
        
        
        super.matchers.put("90", Pattern.compile("^90[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,30}[%\\x1D]"));
        super.matchers.put("90eol", Pattern.compile("^90[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,30}$"));
        super.matchers.put("91", Pattern.compile("^91[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,90}[%\\x1D]"));
        super.matchers.put("91eol", Pattern.compile("^91[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,90}$"));
        super.matchers.put("92", Pattern.compile("^92[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,90}[%\\x1D]"));
        super.matchers.put("92eol", Pattern.compile("^92[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,90}$"));
        super.matchers.put("93", Pattern.compile("^93[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,90}[%\\x1D]"));
        super.matchers.put("93eol", Pattern.compile("^93[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,90}$"));
        super.matchers.put("94", Pattern.compile("^94[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,90}[%\\x1D]"));
        super.matchers.put("94eol", Pattern.compile("^94[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,90}$"));
        super.matchers.put("95", Pattern.compile("^95[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,90}[%\\x1D]"));
        super.matchers.put("95eol", Pattern.compile("^95[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,90}$"));
        super.matchers.put("96", Pattern.compile("^96[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,90}[%\\x1D]"));
        super.matchers.put("96eol", Pattern.compile("^96[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,90}$"));
        super.matchers.put("97", Pattern.compile("^97[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,90}[%\\x1D]"));
        super.matchers.put("97eol", Pattern.compile("^97[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,90}$"));
        super.matchers.put("98", Pattern.compile("^98[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,90}[%\\x1D]"));
        super.matchers.put("98eol", Pattern.compile("^98[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,90}$"));
        super.matchers.put("99", Pattern.compile("^99[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,90}[%\\x1D]"));
        super.matchers.put("99eol", Pattern.compile("^99[!\"&'()*+,\\-./0-9:;<=>?A-Z_a-z]{1,90}$"));
        
    }
        
        
        public Object parse90(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        
        
        output.put("title", "INTERNAL");
        output.put("ai", element.substring(0, 2) );
        output.put("data", element.substring(2));
        output.put("element", element);
        
        String datafield;
        char c = element.charAt(element.length() - 1);
        
        if (c == '%' || c == '\u001D')
            datafield = element.substring(2, element.length() - 1);
        else
            datafield = element.substring(2);
        
        output.put("datafield", datafield);
        
        return output;
        
        }
        
        public Object parse90eol(String element) {
        
        return ( parse90(element) );
        
        }
        
        public Object parse91(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
       
        
        output.put("title", "INTERNAL");
        output.put("ai", element.substring(0, 2) );
        output.put("data", element.substring(2));
        output.put("element", element);
        
        String datafield;
        char c = element.charAt(element.length() - 1);
        
        if (c == '%' || c == '\u001D')
            datafield = element.substring(2, element.length() - 1);
        else
            datafield = element.substring(2);
        
        output.put("datafield", datafield);
        
        return output;
        
        }
        
        public Object parse91eol(String element) {
        
        return ( parse91(element) );
        
        }
        
        public Object parse92(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "INTERNAL");
        output.put("ai", element.substring(0, 2) );
        output.put("data", element.substring(2));
        output.put("element", element);
        
        String datafield;
        char c = element.charAt(element.length() - 1);
        
        if (c == '%' || c == '\u001D')
            datafield = element.substring(2, element.length() - 1);
        else
            datafield = element.substring(2);
        
        output.put("datafield", datafield);
        return output;
        
        }
        
        public Object parse92eol(String element) {
        
        return ( parse92(element) );
        
        }
        
        public Object parse93(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "INTERNAL");
        output.put("ai", element.substring(0, 2) );
        output.put("data", element.substring(2));
        output.put("element", element);
        
        String datafield;
        char c = element.charAt(element.length() - 1);
        
        if (c == '%' || c == '\u001D')
            datafield = element.substring(2, element.length() - 1);
        else
            datafield = element.substring(2);
        
        output.put("datafield", datafield);
        
        return output;
        
        }
        
        public Object parse93eol(String element) {
        
        return ( parse93(element) );
        
        }
    
        public Object parse94(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "INTERNAL");
        output.put("ai", element.substring(0, 2) );
        output.put("data", element.substring(2));
        output.put("element", element);
        
        String datafield;
        char c = element.charAt(element.length() - 1);
        
        if (c == '%' || c == '\u001D')
            datafield = element.substring(2, element.length() - 1);
        else
            datafield = element.substring(2);
        
        output.put("datafield", datafield);
        
        return output;
        
        }
        
        public Object parse94eol(String element) {
        
        return ( parse94(element) );
        
        }

        public Object parse95(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "INTERNAL");
        output.put("ai", element.substring(0, 2) );
        output.put("data", element.substring(2));
        output.put("element", element);
        
        String datafield;
        char c = element.charAt(element.length() - 1);
        
        if (c == '%' || c == '\u001D')
            datafield = element.substring(2, element.length() - 1);
        else
            datafield = element.substring(2);
        
        output.put("datafield", datafield);
        
        return output;
        
        }
        
        public Object parse95eol(String element) {
        
        return ( parse95(element) );
        
        }
        
        public Object parse96(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "INTERNAL");
        output.put("ai", element.substring(0, 2) );
        output.put("data", element.substring(2));
        output.put("element", element);
        
        String datafield;
        char c = element.charAt(element.length() - 1);
        
        if (c == '%' || c == '\u001D')
            datafield = element.substring(2, element.length() - 1);
        else
            datafield = element.substring(2);
        
        output.put("datafield", datafield);
        
        return output;
        
        }
        
        public Object parse96eol(String element) {
        
        return ( parse96(element) );
        
        }
        
        public Object parse97(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "INTERNAL");
        output.put("ai", element.substring(0, 2) );
        output.put("data", element.substring(2));
        output.put("element", element);
        
        String datafield;
        char c = element.charAt(element.length() - 1);
        
        if (c == '%' || c == '\u001D')
            datafield = element.substring(2, element.length() - 1);
        else
            datafield = element.substring(2);
        
        output.put("datafield", datafield);
        
        return output;
        
        }
        
        public Object parse97eol(String element) {
        
        return ( parse97(element) );
        
        }
        
        public Object parse98(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "INTERNAL");
        output.put("ai", element.substring(0, 2) );
        output.put("data", element.substring(2));
        output.put("element", element);
        
        String datafield;
        char c = element.charAt(element.length() - 1);
        
        if (c == '%' || c == '\u001D')
            datafield = element.substring(2, element.length() - 1);
        else
            datafield = element.substring(2);
        
        output.put("datafield", datafield);
        
        return output;
        
        }
        
        public Object parse98eol(String element) {
        
        return ( parse98(element) );
        
        }
        
        public Object parse99(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "INTERNAL");
        output.put("ai", element.substring(0, 2) );
        output.put("data", element.substring(2));
        output.put("element", element);
        
        String datafield;
        char c = element.charAt(element.length() - 1);
        
        if (c == '%' || c == '\u001D')
            datafield = element.substring(2, element.length() - 1);
        else
            datafield = element.substring(2);
        
        output.put("datafield", datafield);
        
        return output;
        
        }
        
        public Object parse99eol(String element) {
        
        return ( parse99(element) );
        
        }
        
        
        
        
        
        
        
}