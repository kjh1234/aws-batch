package app.kjh;

import java.util.HashMap;
import java.util.stream.Collectors;

import com.amazonaws.services.s3.model.JSONOutput;

import app.kjh.utils.Params;

public class BypassTask {
	
	public static void process(HashMap<String,String> params) {
        System.out.println("BypassTask.process Run!!");
        int callCnt = Integer.valueOf(params.get("callCnt")) + 1;

        System.out.println("user.dir" + System.getProperty("user.dir"));


        System.out.println("RandomFailTask Params : " + "callCnt" + ":" + callCnt );
        System.out.println("BypassTask.process Success!!");
	}

    public static void main(String[] args) {
        System.getenv().entrySet().stream().map(e -> "ENV-" + e.getKey() + " : " + e.getValue()).forEach(System.out::println);

        HashMap<String,String> params = Params.argsToMap(args);
        BypassTask.process(params);
    }

}
