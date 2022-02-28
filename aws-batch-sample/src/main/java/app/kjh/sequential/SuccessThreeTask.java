package app.kjh.sequential;

import java.util.HashMap;

import app.kjh.utils.Params;

public class SuccessThreeTask {
	
	public static void process(HashMap<String,String> params) {
        System.out.println("SuccessThreeTask.process Run!!");
        System.out.println("SuccessThreeTask Params globalJobId : " + params.get("globalJobId") );
        System.out.println("SuccessThreeTask.process Success!!");
	}

    public static void main(String[] args) {
        HashMap<String,String> params = Params.argsToMap(args);
        SuccessThreeTask.process(params);
    }

}
