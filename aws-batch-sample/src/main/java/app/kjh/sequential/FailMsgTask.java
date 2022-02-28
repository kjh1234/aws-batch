package app.kjh.sequential;

import java.util.HashMap;
import java.util.stream.Collectors;

import app.kjh.utils.Params;

public class FailMsgTask {
	
	public static void process(HashMap<String,String> params) {
        System.out.println("FailMsgTask.process Run!!");
        System.out.println("FailMsgTask Params : " + params.entrySet().stream().map(e -> e.getKey() + ":" + e.getValue()).collect(Collectors.joining(",")) );
        System.out.println("FailMsgTask.process Success!!");
	}

    public static void main(String[] args) {
        System.getenv().entrySet().stream().map(e -> "ENV-" + e.getKey() + " : " + e.getValue()).forEach(System.out::println);

        HashMap<String,String> params = Params.argsToMap(args);
        FailMsgTask.process(params);
    }

}
