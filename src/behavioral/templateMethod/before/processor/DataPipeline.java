package behavioral.templateMethod.before.processor;

public class DataPipeline {

    public void process(String data, String format) {
        String loaded = loadData(data);
        if (!isValidData(loaded, format)) {
            System.out.println("Data is invalid, processing aborted.");
            return;
        }
        if ("CSV".equals(format)) {
            processCsv(loaded);
        } else if ("JSON".equals(format)) {
            processJson(loaded);
        }
        saveData(loaded);
    }

    private String loadData(String data) { System.out.println("Loading data"); return data; }
    private boolean isValidData(String data, String format) { System.out.println("Validating " + format); return data != null; }
    private void processCsv(String data) { System.out.println("Processing CSV"); }
    private void processJson(String data) { System.out.println("Processing JSON"); }
    private void saveData(String data) { System.out.println("Saving data"); }
}

