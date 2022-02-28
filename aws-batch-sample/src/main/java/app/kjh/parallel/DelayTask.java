package app.kjh.parallel;

import java.util.HashMap;

import app.kjh.utils.Params;

public class DelayTask {
	
	public static void process(HashMap<String,String> params) {
        String delay = params.get("milliseconds");
        System.out.println("DelayTask.process Run!!");
        System.out.println("DelayTask.process Delay : " + Integer.parseInt(delay));
        System.out.println("DelayTask.process Start Time!!");
        try {
            Thread.sleep(Integer.parseInt(params.get("milliseconds")));
        } catch (NumberFormatException|InterruptedException  e) {
            throw new RuntimeException(e.getMessage(), e);
        }

        System.out.println("DelayTask.process Success!!");
	}

    public static void main(String[] args) {
        System.getenv().entrySet().stream().map(e -> "ENV-" + e.getKey() + " : " + e.getValue()).forEach(System.out::println);

        HashMap<String,String> params = Params.argsToMap(args);
        DelayTask.process(params);
    }

}
