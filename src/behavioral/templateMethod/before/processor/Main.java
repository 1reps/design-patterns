package behavioral.templateMethod.before.processor;

public class Main {

    public static void main(String[] args) {
        DataPipeline pipeline = new DataPipeline();
        pipeline.process("name,age\nkim,20", "CSV");
        pipeline.process("{\"name\":\"kim\"}", "JSON");
    }
}

