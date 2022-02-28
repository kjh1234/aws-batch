package app.kjh.sequential;

import java.util.HashMap;

import app.kjh.utils.Params;

public class SuccessTwoTask {
	
	public static void process(HashMap<String,String> params) {
        System.out.println("SuccessTwoTask.process Run!!");
        System.out.println("SuccessTwoTask Params globalJobId : " + params.get("globalJobId") );
        System.out.println("SuccessTwoTask.process Success!!");
	}

    public static void main(String[] args) {
        HashMap<String,String> params = Params.argsToMap(args);
        SuccessTwoTask.process(params);
    }

}
