package app.kjh;

import java.util.HashMap;

public class RandomFailTask {
	
	public static void process(HashMap<String,String> params) {
		double value = Math.random() * 10;
		if(value > 3) {
			throw new RuntimeException("Fail!");
		}
	}

    public static void main(String[] args) {

        HashMap<String,String> params = argsToMap(args);
        RandomFailTask.process(params);
    }


    public static HashMap<String, String> argsToMap(String[] args) {
        HashMap<String,String> parameters=new HashMap<String, String>();

        for (int i = 0; i <=args.length-2; i=i+2) {
            parameters.put(args[i].trim(),args[i+1].trim());
        }
        return parameters;
    }

}
