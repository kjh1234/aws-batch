package app.kjh.sequential;

import java.util.HashMap;
import app.kjh.utils.Params;

public class RandomFailTask {
	
	public static void process(HashMap<String,String> params) {
        System.out.println("RandomFailTask.process Run!!");
        String callCntStr = params.get("callCnt");
        callCntStr = callCntStr == null ? "0" : callCntStr;
        int callCnt = Integer.valueOf(callCntStr) + 1;
        // System.out.println("RandomFailTask Params : " + params.entrySet().stream().map(e -> e.getKey() + " : " + e.getValue()).collect(Collectors.joining(",")) );

        if(callCnt > 2) {
			throw new RuntimeException("Call Count Max.");
        }

		double value = Math.random() * 10;
		if(value > 3) {
            System.out.println("RandomFailTask.process Fail!!");
			throw new RuntimeException("Fail!");
		}
        
        System.out.println("RandomFailTask.process Success!!");
	}

    public static void main(String[] args) {
        System.getenv().entrySet().stream().map(e -> "ENV-" + e.getKey() + " : " + e.getValue()).forEach(System.out::println);

        HashMap<String,String> params = Params.argsToMap(args);
        RandomFailTask.process(params);
    }

}
