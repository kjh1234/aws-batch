package app.kjh.parallel;

import java.util.HashMap;
import app.kjh.utils.Params;

public class IndexPrintTask {
	
	public static void process(HashMap<String,String> params) {
        System.out.println("IndexPrintTask.process Run!!");
        System.out.println("IndexPrintTask Map index: " + params.get("index"));
        System.out.println("IndexPrintTask.process Success!!");
	}

    public static void main(String[] args) {
        System.getenv().entrySet().stream().map(e -> "ENV-" + e.getKey() + " : " + e.getValue()).forEach(System.out::println);

        HashMap<String,String> params = Params.argsToMap(args);
        IndexPrintTask.process(params);
    }

}
