package edu.jsu.mcis.plinkoproto;

import java.util.HashMap;
import java.util.regex.Pattern;

public class GS1_3X extends GS1 {

    public GS1_3X() {
        
        super();
        
        super.matchers = new HashMap<>();
        
        super.matchers.put( "30", Pattern.compile("^30[0-9]{1,8}[%//x1D]") );   // AI #30        
        super.matchers.put( "30eol", Pattern.compile("^30[0-9]{1,8}$") );       // AI #30 (eol)
        super.matchers.put( "310n", Pattern.compile("^310[0-9]{1}[0-9]{6}");    // AI #310n
        super.matchers.put( "311n", Pattern.compile("^311[0-9]{1}[0-9]{6}");    // AI #311n
        super.matchers.put( "312n", Pattern.compile("^312[0-9]{1}[0-9]{6}");    // AI #312n
        super.matchers.put( "313n", Pattern.compile("^313[0-9]{1}[0-9]{6}");    // AI #313n
        super.matchers.put( "314n", Pattern.compile("^314[0-9]{1}[0-9]{6}");    // AI #314n
        super.matchers.put( "315n", Pattern.compile("^315[0-9]{1}[0-9]{6}");    // AI #315n
        super.matchers.put( "316n", Pattern.compile("^316[0-9]{1}[0-9]{6}");    // AI #316n
        super.matchers.put( "320n", Pattern.compile("^320[0-9]{1}[0-9]{6}");    // AI #320n
        super.matchers.put( "321n", Pattern.compile("^321[0-9]{1}[0-9]{6}");    // AI #321n
        super.matchers.put( "322n", Pattern.compile("^322[0-9]{1}[0-9]{6}");    // AI #322n
        super.matchers.put( "323n", Pattern.compile("^323[0-9]{1}[0-9]{6}");    // AI #323n
        super.matchers.put( "324n", Pattern.compile("^324[0-9]{1}[0-9]{6}");    // AI #324n
        super.matchers.put( "325n", Pattern.compile("^325[0-9]{1}[0-9]{6}");    // AI #325n
        super.matchers.put( "326n", Pattern.compile("^326[0-9]{1}[0-9]{6}");    // AI #326n
        super.matchers.put( "327n", Pattern.compile("^327[0-9]{1}[0-9]{6}");    // AI #327n
        super.matchers.put( "328n", Pattern.compile("^328[0-9]{1}[0-9]{6}");    // AI #328n
        super.matchers.put( "329n", Pattern.compile("^329[0-9]{1}[0-9]{6}");    // AI #329n
        super.matchers.put( "330n", Pattern.compile("^330n[0-9]{1}[0-9]{6}");   // AI #330n
        super.matchers.put( "331n", Pattern.compile("^331n[0-9]{1}[0-9]{6}");   // AI #331n
        
        super.matchers.put( "332", Pattern.compile("^332[0-9](.){6}") );              
        super.matchers.put( "333", Pattern.compile("^333[0-9](.){6}") ); 
        super.matchers.put( "334", Pattern.compile("^334[0-9](.){6}") );              
        super.matchers.put( "335", Pattern.compile("^335[0-9](.){6}") );
        super.matchers.put( "336", Pattern.compile("^336[0-9](.){6}") ); 
        super.matchers.put( "337", Pattern.compile("^337[0-9](.){6}") );
        super.matchers.put( "340", Pattern.compile("^340[0-9](.){6}") ); 
        super.matchers.put( "341", Pattern.compile("^341[0-9](.){6}") );              
        super.matchers.put( "342", Pattern.compile("^342[0-9](.){6}") );
        super.matchers.put( "343", Pattern.compile("^343[0-9](.){6}") );              
        super.matchers.put( "344", Pattern.compile("^344-9](.){6}") ); 
        super.matchers.put( "345", Pattern.compile("^345[0-9](.){6}") );              
        super.matchers.put( "346", Pattern.compile("^346[0-9](.){6}") );
        super.matchers.put( "347", Pattern.compile("^347[0-9](.){6}") );              
        super.matchers.put( "348", Pattern.compile("^348[0-9](.){6}") ); 
        super.matchers.put( "349", Pattern.compile("^349[0-9](.){6}") ); 
        super.matchers.put( "350", Pattern.compile("^350[0-9](.){6}") );
        super.matchers.put( "351", Pattern.compile("^351[0-9](.){6}") );
        super.matchers.put( "352", Pattern.compile("^352[0-9](.){6}") );
        
        super.matchers.put( "354", Pattern.compile("^354[0-9](.){6}") );              
        super.matchers.put( "355", Pattern.compile("^355[0-9](.){6}") ); 
        super.matchers.put( "356", Pattern.compile("^356[0-9](.){6}") );              
        super.matchers.put( "357", Pattern.compile("^357[0-9](.){6}") );

        super.matchers.put( "360", Pattern.compile("^360[0-9](.){6}") );              
        super.matchers.put( "361", Pattern.compile("^361[0-9](.){6}") ); 
        super.matchers.put( "362", Pattern.compile("^362[0-9](.){6}") );              
        super.matchers.put( "363", Pattern.compile("^363[0-9](.){6}") );
        super.matchers.put( "364", Pattern.compile("^364[0-9](.){6}") );              
        super.matchers.put( "365", Pattern.compile("^365[0-9](.){6}") ); 
        super.matchers.put( "366", Pattern.compile("^366[0-9](.){6}") );              
        super.matchers.put( "367", Pattern.compile("^367[0-9](.){6}") );
        super.matchers.put( "368", Pattern.compile("^368[0-9](.){6}") );              
        super.matchers.put( "369", Pattern.compile("^369[0-9](.){6}") ); 
       
         
        super.matchers.put( "37", Pattern.compile("^37[0-9]{1,8}[%\\x1D") );  
        super.matchers.put( "37eol", Pattern.compile("^^37[0-9]{1,8}$") ); 
        super.matchers.put( "390", Pattern.compile("^390[0-9]{6}(.)[%\\x1D]") );    
        super.matchers.put( "390eol", Pattern.compile("^390[0-9]{6}(.)$") );  
        super.matchers.put( "391", Pattern.compile("^391[0-9]{3}(.){1,15}[%\\x1D]") );  
        super.matchers.put( "391eol", Pattern.compile("^391[0-9]{3}(.){1,15}{1,15}$") );    
        super.matchers.put( "392", Pattern.compile("^392[0-9](.){1,15}[%\\x1D]") );  
        super.matchers.put( "392eol", Pattern.compile("^392[0-9](.){1,15}$") );
        super.matchers.put( "393", Pattern.compile("^393[0-9]{3}(.){1,15}[%\\x1D]") );  
        super.matchers.put( "393eol", Pattern.compile("^393[0-9]{3}(.){1,15}{1,15}$") );
        super.matchers.put( "394", Pattern.compile("^394[0-9](.){4}[%\\x1D]") );  
        super.matchers.put( "394eol", Pattern.compile("^394[0-9](.){4}$") ); 

        
    }
    
    public Object parse30(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "VAR. COUNT");
        output.put("ai", element.substring(0, 2) );
        output.put("variable count", Integer.parseInt( element.substring(2, 8) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse30eol(String element) {
        
        return (parse30(element));
        
    }
    
    public Object parse310n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "NET WEIGHT (kg)");
        output.put("ai", element.substring(0, 4) );
        output.put("weight (kg)", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }

    public Object parse311n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "LENGTH (m)");
        output.put("ai", element.substring(0, 4) );
        output.put("weight", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse312n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "WIDTH (m)");
        output.put("ai", element.substring(0, 4) );
        output.put("width", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse313n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "HEIGHT (m)");
        output.put("ai", element.substring(0, 4) );
        output.put("height", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse314n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "AREA (m2)");
        output.put("ai", element.substring(0, 4) );
        output.put("area", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse315n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "NET VOLUME (l)");
        output.put("ai", element.substring(0, 4) );
        output.put("net volume", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse316n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "NET VOLUME (m2)");
        output.put("ai", element.substring(0, 4) );
        output.put("net volume", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse320n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "NET WEIGHT (lb)");
        output.put("ai", element.substring(0, 4) );
        output.put("weight (lb)", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse321n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "LENGTH (i)");
        output.put("ai", element.substring(0, 4) );
        output.put("length", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse322n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "LENGTH (f)");
        output.put("ai", element.substring(0, 4) );
        output.put("length", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse323n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "LENGTH (y)");
        output.put("ai", element.substring(0, 4) );
        output.put("length", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse324n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "WIDTH (i)");
        output.put("ai", element.substring(0, 4) );
        output.put("width", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse325n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "WIDTH (f)");
        output.put("ai", element.substring(0, 4) );
        output.put("width", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse326n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "WIDTH (y)");
        output.put("ai", element.substring(0, 4) );
        output.put("width", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse327n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "HEIGHT (i)");
        output.put("ai", element.substring(0, 4) );
        output.put("height", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse328n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "HEIGHT (f)");
        output.put("ai", element.substring(0, 4) );
        output.put("height", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse329n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "HEIGHT (y)");
        output.put("ai", element.substring(0, 4) );
        output.put("height", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse330n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "GROSS WEIGHT (kg)");
        output.put("ai", element.substring(0, 4) );
        output.put("gross weight", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse331n(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "LENGTH (m), log");
        output.put("ai", element.substring(0, 4) );
        output.put("length", Integer.parseInt( element.substring(4, 6) ));
        output.put("element", element);
        
        return output;
        
    }
    
        public Object parse332(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "WIDTH (m), log");
        output.put("ai", element.substring(0, 4) );
        output.put("metres", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse333(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "HEIGHT (m), log");
        output.put("ai", element.substring(0, 4) );
        output.put("metres", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }

        public Object parse334(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "AREA (m^2), log");
        output.put("ai", element.substring(0, 4) );
        output.put("square metres", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }
        public Object parse335(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "VOLUME (l), log");
        output.put("ai", element.substring(0, 4) );
        output.put("litres", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }
        public Object parse336(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "VOLUME m^3, log");
        output.put("ai", element.substring(0, 4) );
        output.put("cubic metres", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }

    public Object parse336(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "KG PER m^2");
        output.put("ai", element.substring(0, 4) );
        output.put("cubic metres", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }

        public Object parse340(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "GROSS WEIGHT (lb)");
        output.put("ai", element.substring(0, 4) );
        output.put("pounds", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }

        public Object parse341(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "LENGTH (i), log");
        output.put("ai", element.substring(0, 4) );
        output.put("inches", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }
        public Object parse342(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "LENGTH (f), log");
        output.put("ai", element.substring(0, 4) );
        output.put("feet", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }

        public Object parse343(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "LENGTH (y), log");
        output.put("ai", element.substring(0, 4) );
        output.put("yards", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }

        public Object parse344(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "WIDTH (i), log");
        output.put("ai", element.substring(0, 4) );
        output.put("inches", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;

    }

        public Object parse345(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "WIDTH (f), log");
        output.put("ai", element.substring(0, 4) );
        output.put("feet", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }

        public Object parse346(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "WIDTH (y), log");
        output.put("ai", element.substring(0, 4) );
        output.put("yards", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }

        public Object parse347(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "HEIGHT (i), log");
        output.put("ai", element.substring(0, 4) );
        output.put("inches", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }
        public Object parse348(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "HEIGHT (f), log");
        output.put("ai", element.substring(0, 4) );
        output.put("feet", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }


      public Object parse349(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "HEIGHT (y), log");
        output.put("ai", element.substring(0, 2) );
        output.put("yards", Integer.parseInt( element.substring(2) ));
        output.put("element", element);
        
        return output;
        
    }


     public Object parse350(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "AREA (i^2)");
        output.put("ai", element.substring(0, 4) );
        output.put("square inches", Integer.parseInt( element.substring(4) ));
        output.put("element", element);
        
        return output;
        
    }    

        public Object parse351(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "AREA (f^2)");
        output.put("ai", element.substring(0, 4) );
        output.put("ISOccode", Integer.parseInt( element.substring(4, 7) ));
        output.put("square feet", Integer.parseInt( element.substring(7) ));
        output.put("element", element);
        
        return output;
        
    }

        public Object parse352(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "AREA (y^2)");
        output.put("ai", element.substring(0, 4) );
        output.put("square yards", Integer.parseInt( element.substring(4) ));
        output.put("element", element);
        
        return output;
        
    }
        public Object parse354(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "AREA SQUARE FEET");
        output.put("ai", element.substring(0, 4) );
        output.put("squarefeet", Integer.parseInt( element.substring(4, 10) ));
        output.put("number", Integer.parseInt( element.substring(4, 10) ));
        output.put("element", element);
        
        return output;
        
    }                    
    
        public Object parse355(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "AREA SQUARE YARDS");
        output.put("ai", element.substring(0, 4) );
        output.put("squareyards", Integer.parseInt( element.substring(4, 10) ));
        output.put("number", Integer.parseInt( element.substring(4, 10) ));

        output.put("element", element);
        
        return output;
        
    }

        public Object parse356(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "NET WEIGHT (t)");
        output.put("ai", element.substring(0, 4) );
        output.put("netweight(t)", Integer.parseInt( element.substring(4, 10) ));
        output.put("number", Integer.parseInt( element.substring(4, 10) ));

        output.put("element", element);
        
        return output;
        
    }
        public Object parse357(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "NET VOLUME (oz)");
        output.put("ai", element.substring(0, 4) );
        output.put("netvolume(oz)", Integer.parseInt( element.substring(4, 10) ));
        output.put("number", Integer.parseInt( element.substring(4, 10) ));
            
        output.put("element", element);
        
        return output;
        
    }
        public Object parse360(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "NET VOLUME (qt)");
        output.put("ai", element.substring(0, 4) );
        output.put("netvolume(qt)", Integer.parseInt( element.substring(4, 10) ));
        output.put("number", Integer.parseInt( element.substring(4, 10) ));
          
        output.put("element", element);
        
        return output;
        
    }
        public Object parse361(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "NET VOLUME (g)");
        output.put("ai", element.substring(0, 4) );
        output.put("netvolume(g)", Integer.parseInt( element.substring(4, 10) ));
        output.put("number", Integer.parseInt( element.substring(4, 10) ));
            
        output.put("element", element);
        
        return output;
        
    }

        public Object parse362(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "NET VOLUME (q)");
        output.put("ai", element.substring(0, 4) );
        output.put("netvolume(q)", Integer.parseInt( element.substring(4, 10) ));
        output.put("number", Integer.parseInt( element.substring(4, 10) ));
            
        output.put("element", element);
        
        return output;
        
    }
        public Object parse363(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "NET VOLUME (g),log");
        output.put("ai", element.substring(0, 4) );
        output.put("netvolume(g)log", Integer.parseInt( element.substring(4, 10) ));
        output.put("number", Integer.parseInt( element.substring(4, 10) ));
            
        output.put("element", element);
        
        return output;
        
    }

        public Object parse364(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "VOLUME (i^3)");
        output.put("ai", element.substring(0, 4) );
        output.put("volume(i^3)", Integer.parseInt( element.substring(4, 10) ));
        output.put("number", Integer.parseInt( element.substring(4, 10) ));

        output.put("element", element);
        
        return output;
        
    }

        public Object parse365(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "VOLUME (f^3)");
        output.put("ai", element.substring(0, 4) );
        output.put("volume(f^3)", Integer.parseInt( element.substring(4, 10) ));
        output.put("number", Integer.parseInt( element.substring(4, 10) ));
            
        output.put("element", element);
        
        return output;

    }

        public Object parse366(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "VOLUME (y^3)");
        output.put("ai", element.substring(0, 4) );
        output.put("volume(y^3)", Integer.parseInt( element.substring(4, 10) ));
        output.put("number", Integer.parseInt( element.substring(4, 10) ));
            
        output.put("element", element);
        
        return output;
        
    }

        public Object parse367(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "VOLUME (i^3),log");
        output.put("ai", element.substring(0, 4) );
        output.put("volume(i^3)log", Integer.parseInt( element.substring(4, 10) ));
        output.put("number", Integer.parseInt( element.substring(4, 10) ));
            
        output.put("element", element);
        
        return output;
        
    }

        public Object parse368(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "VOLUME (f^3),log");
        output.put("ai", element.substring(0, 4) );
        output.put("volume(f^3)log", Integer.parseInt( element.substring(4, 10) ));
        output.put("number", Integer.parseInt( element.substring(4, 10) ));
            
        output.put("element", element);
        
        return output;
        
    }
        public Object parse369(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "VOLUME (y^3),log");
        output.put("ai", element.substring(0, 4) );
        output.put("volume(y^3)log", Integer.parseInt( element.substring(4, 10) ));
        output.put("number", Integer.parseInt( element.substring(4, 10) ));
            
        output.put("element", element);
        
        return output;
        
    }


      public Object parse37(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "COUNT IN UNIT");
        output.put("ai", element.substring(0, 2) );
        output.put("count", Integer.parseInt( element.substring(2) ));
        output.put("number", Integer.parseInt( element.substring(2) ));
          
        output.put("element", element);
        
        return output;
        
    }
    
    public Object parse37eol(String element) {
        return ( parse37(element) ); 
    }



     public Object parse390(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "AMOUNT");
        output.put("ai", element.substring(0, 4) );
        output.put("amount", Integer.parseInt( element.substring(4) ));
        output.put("number", Integer.parseInt( element.substring(4) ));
         
        output.put("element", element);
        
        return output;
        
    }
        public Object parse390eol(String element) {
        return ( parse390(element) );

    }

        public Object parse391(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "AMOUNT");
        output.put("ai", element.substring(0, 4) );
        output.put("ISOccode", Integer.parseInt( element.substring(4, 7) ));
        output.put("amount", Integer.parseInt( element.substring(7) ));
        output.put("number", Integer.parseInt( element.substring(4) ));
            
        output.put("element", element);
        
        return output;
        
    }
        public Object parse391eol(String element) {
        return ( parse391(element) );

    }

        public Object parse392(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "PRICE");
        output.put("ai", element.substring(0, 4) );
        output.put("price", Integer.parseInt( element.substring(4) ));
        output.put("number", Integer.parseInt( element.substring(4) ));
            
        output.put("element", element);
        
        return output;
        
    }
        public Object parse392eol(String element) {
        return ( parse392(element) );

    }

        public Object parse393(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "PRICE");
        output.put("ai", element.substring(0, 4) );
        output.put("ISOccode", Integer.parseInt( element.substring(4, 7) ));
        output.put("price", Integer.parseInt( element.substring(7) ));
        output.put("number", Integer.parseInt( element.substring(4) ));
            
        output.put("element", element);
        
        return output;
        
    }
        public Object parse393eol(String element) {
        return ( parse393(element) );

    }

        public Object parse394(String element) {
        
        HashMap<String, Object> output = new HashMap<>();
        System.out.println("Found Element String: " + element);
        
        output.put("title", "PRCNT OFF");
        output.put("ai", element.substring(0, 4) );
        output.put("prcnt off", Integer.parseInt( element.substring(4) ));
        output.put("number", Integer.parseInt( element.substring(4) ));
            
        output.put("element", element);
        
        return output;
        
    }
    
        public Object parse394eol(String element) {
        return ( parse394(element) );

    }
}
