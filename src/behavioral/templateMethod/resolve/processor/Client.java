package behavioral.templateMethod.resolve.processor;

public class Client {

    public static void main(String[] args) {
        DataProcessor csvProcessor = new CSVDataProcessor();
        csvProcessor.process("CSV data");

        System.out.println();

        DataProcessor jsonProcessor = new JSONDataProcessor();
        jsonProcessor.process("JSON data");
    }
}
