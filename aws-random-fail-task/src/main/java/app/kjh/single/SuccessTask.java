package app.kjh.single;

import java.util.HashMap;

import app.kjh.utils.Params;

public class SuccessTask {
	
	public static void process(HashMap<String,String> params) {
        System.out.println("SuccessTask.process Run!!");
        System.out.println("SuccessTask.process Success!!");
	}

    public static void main(String[] args) {
        HashMap<String,String> params = Params.argsToMap(args);
        SuccessTask.process(params);
    }

}
