package app.kjh.utils;

import java.util.HashMap;

public class Params {

    public static HashMap<String, String> argsToMap(String[] args) {
        HashMap<String,String> parameters=new HashMap<String, String>();

        for (int i = 0; i <=args.length-2; i=i+2) {
            parameters.put(args[i].trim(),args[i+1].trim());
        }
        return parameters;
    }

}
