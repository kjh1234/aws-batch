package app.kjh.sequential;

import java.util.HashMap;

import app.kjh.utils.Params;

public class SuccessOneTask {
	
	public static void process(HashMap<String,String> params) {
        System.out.println("SuccessOneTask.process Run!!");
        System.out.println("SuccessOneTask Params globalJobId : " + params.get("globalJobId") );
        System.out.println("SuccessOneTask.process Success!!");
	}

    public static void main(String[] args) {
        HashMap<String,String> params = Params.argsToMap(args);
        SuccessOneTask.process(params);
    }

}
