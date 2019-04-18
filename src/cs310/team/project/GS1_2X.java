package cs310.team.project;

import java.util.HashMap;
import java.util.regex.Pattern;

public class GS1_2X extends GS1 {
    
    public GS1_2X() {
        
        super();
        
        super.matchers = new HashMap<>();
         
        super.matchers.put( "20", Pattern.compile("^20[0-9]{2}") );         // AI #20

        super.matchers.put( "21", Pattern.compile("^21(.){1,20}[%\\x1D]") ); // AI #21
        super.matchers.put( "21eol", Pattern.compile("^21(.){1,20}$") );     // AI #21 (eol)

        super.matchers.put( "22", Pattern.compile("^22(.){1,20}[%\\x1D]") ); // AI #22
        super.matchers.put( "22eol", Pattern.compile("^22(.){1,20}$") );     // AI #22 (eol)

        super.matchers.put( "240", Pattern.compile("^240(.){1,30}[%\\x1D]") ); // AI #240
        super.matchers.put( "240eol", Pattern.compile("^240(.){1,30}$") );     // AI #240 (eol)

        super.matchers.put( "241", Pattern.compile("^241(.){1,30}[%\\x1D]") ); // AI #241
        super.matchers.put( "241eol", Pattern.compile("^241(.){1,30}$") );     // AI #241 (eol)

        super.matchers.put( "242", Pattern.compile("^242(.){1,6}[%\\x1D]") ); // AI #242
        super.matchers.put( "242eol", Pattern.compile("^242(.){1,6}$") );     // AI #242 (eol)

        super.matchers.put( "243", Pattern.compile("^243(.){1,20}[%\\x1D]") ); // AI #243
        super.matchers.put( "243eol", Pattern.compile("^243(.){1,20}$") );     // AI #243 (eol)

        super.matchers.put( "250", Pattern.compile("^250(.){1,30}[%\\x1D]") ); // AI #250
        super.matchers.put( "250eol", Pattern.compile("^250(.){1,30}$") );     // AI #250 (eol)

        super.matchers.put( "251", Pattern.compile("^251(.){1,30}[%\\x1D]") ); // AI #251
        super.matchers.put( "251eol", Pattern.compile("^251(.){1,30}$") );     // AI #251 (eol)

        super.matchers.put( "253", Pattern.compile("^253(.){1,13}[%\\x1D]") ); // AI #253
        super.matchers.put( "253eol", Pattern.compile("^253(.){1,13}$") );     // AI #253 (eol)

        super.matchers.put( "254", Pattern.compile("^254(.){1,20}[%\\x1D]") ); // AI #254
        super.matchers.put( "254eol", Pattern.compile("^254(.){1,20}$") );     // AI #254 (eol)

        super.matchers.put( "255", Pattern.compile("^255(.){1,13}[%\\x1D]") ); // AI #255
        super.matchers.put( "255eol", Pattern.compile("^255(.){1,13}$") );     // AI #255 (eol)
    
    }

    public Object parse20(String element) {

        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);

        output.put("title", "VARIANT");
        output.put("ai", element.substring(0, 2) );
        output.put("datafield", element.substring(2) );
        output.put("element", element);

        return output;

    }

    public Object parse21(String element) {

        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);

        output.put("title", "SERIAL");
        output.put("ai", element.substring(0, 2) );
        output.put("number", element.substring(2) );
        output.put("element", element);
        
        char c = element.charAt(element.length() - 1);
        String datafield;

        if (c == '%' || c == '\u001D')
            datafield = element.substring(2, element.length() - 1);
        else
            datafield = element.substring(2);
        
        output.put("datafield", datafield);

        return output;

    }

    public Object parse21eol(String element) {

        return ( parse21(element) );
    }

    public Object parse22(String element) {

        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);

        output.put("title", "CPV");
        output.put("ai", element.substring(0, 2) );
        output.put("number", element.substring(2) );
        output.put("element", element);
        
        char c = element.charAt(element.length() - 1);
        String datafield;

        if (c == '%' || c == '\u001D')
            datafield = element.substring(2, element.length() - 1);
        else
            datafield = element.substring(2);
        
        output.put("datafield", datafield);

        return output;

    }

    public Object parse22eol(String element) {

    return ( parse22(element) );

    }

    public Object parse240(String element) {

        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);

        output.put("title", "ADDITIONAL ID");
        output.put("ai", element.substring(0, 3) );
        output.put("number", element.substring(4) );
        output.put("element", element);
        
        char c = element.charAt(element.length() - 1);
        String datafield;

        if (c == '%' || c == '\u001D')
            datafield = element.substring(3, element.length() - 1);
        else
            datafield = element.substring(3);
        
        output.put("datafield", datafield);

        return output;

    }

    public Object parse240eol(String element) {

    return ( parse240(element) );

}

    public Object parse241(String element) {

        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);

        output.put("title", "CUST. PART NO.");
        output.put("ai", element.substring(0, 3) );
        output.put("number", element.substring(4) );
        output.put("element", element);
        
        char c = element.charAt(element.length() - 1);
        String datafield;

        if (c == '%' || c == '\u001D')
            datafield = element.substring(3, element.length() - 1);
        else
            datafield = element.substring(3);
        
        output.put("datafield", datafield);

        return output;

    }

    public Object parse241eol(String element) {

        return ( parse241(element) );

    }

    public Object parse242(String element) {

        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);

        output.put("title", "MTO VARIANT");
        output.put("ai", element.substring(0, 3) );
        output.put("number", element.substring(4, 6) );
        output.put("element", element);
        
        char c = element.charAt(element.length() - 1);
        String datafield;

        if (c == '%' || c == '\u001D')
            datafield = element.substring(3, element.length() - 1);
        else
            datafield = element.substring(3);
        
        output.put("datafield", datafield);

        return output;

    }

    public Object parse242eol(String element) {

        return ( parse242(element) );

    }

    public Object parse243(String element) {

        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);

        output.put("title", "PCN");
        output.put("ai", element.substring(0, 3) );
        output.put("number", element.substring(4) );
        output.put("element", element);
        
        char c = element.charAt(element.length() - 1);
        String datafield;

        if (c == '%' || c == '\u001D')
            datafield = element.substring(3, element.length() - 1);
        else
            datafield = element.substring(3);
        
        output.put("datafield", datafield);

        return output;

    }

    public Object parse243eol(String element) {

        return ( parse243(element) );

    }

    public Object parse250(String element) {

        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);

        output.put("title", "SECONDARY SERIAL");
        output.put("ai", element.substring(0, 3) );
        output.put("number", element.substring(4) );
        output.put("element", element);
        
        char c = element.charAt(element.length() - 1);
        String datafield;

        if (c == '%' || c == '\u001D')
            datafield = element.substring(3, element.length() - 1);
        else
            datafield = element.substring(3);
        
        output.put("datafield", datafield);

        return output;

    }

    public Object parse250eol(String element) {

        return ( parse250(element) );

    }

    public Object parse251(String element) {

        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);

        output.put("title", "REF. TO SOURCE");
        output.put("ai", element.substring(0, 3) );
        output.put("number", element.substring(4) );
        output.put("element", element);
        
        char c = element.charAt(element.length() - 1);
        String datafield;

        if (c == '%' || c == '\u001D')
            datafield = element.substring(3, element.length() - 1);
        else
            datafield = element.substring(3);
        
        output.put("datafield", datafield);

        return output;

    }

    public Object parse251eol(String element) {

        return ( parse251(element) );

    }

    public Object parse253(String element) {

        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);

        output.put("title", "GDTI");
        output.put("ai", element.substring(0, 3) );
        output.put("number", element.substring(4, 12) );
        output.put("number #2", element.substring(13) );
        output.put("element", element);
        
        char c = element.charAt(element.length() - 1);
        String datafield;

        if (c == '%' || c == '\u001D')
            datafield = element.substring(3, element.length() - 1);
        else
            datafield = element.substring(3);
        
        output.put("datafield", datafield);

        return output;

    }

    public Object parse253eol(String element) {

        return ( parse253(element) );

    }

    public Object parse254(String element) {

        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);

        output.put("title", "GLN EXTENSION COMPONENT");
        output.put("ai", element.substring(0, 3) );
        output.put("number", element.substring(4) );
        output.put("element", element);
        
        char c = element.charAt(element.length() - 1);
        String datafield;

        if (c == '%' || c == '\u001D')
            datafield = element.substring(3, element.length() - 1);
        else
            datafield = element.substring(3);
        
        output.put("datafield", datafield);

        return output;

    }

    public Object parse254eol(String element) {

        return ( parse254(element) );

    }

    public Object parse255(String element) {

        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);

        output.put("title", "GDTI");
        output.put("ai", element.substring(0, 3) );
        output.put("number", element.substring(4, 12) );
        output.put("number #2", element.substring(13) );
        output.put("element", element);
        
        char c = element.charAt(element.length() - 1);
        String datafield;

        if (c == '%' || c == '\u001D')
            datafield = element.substring(3, element.length() - 1);
        else
            datafield = element.substring(3);
        
        output.put("datafield", datafield);

        return output;

    }

    public Object parse255eol(String element) {

        return ( parse255(element) );
    }

}
