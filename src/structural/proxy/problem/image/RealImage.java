package structural.proxy.problem.image;

public class RealImage implements Image {
    
    private String fileName;
    private boolean isLoaded = false;
    
    public RealImage(String fileName) {
        this.fileName = fileName;
        // 생성자에서 즉시 로딩 - 불필요한 리소스 사용
        loadFromDisk();
    }
    
    private void loadFromDisk() {
        System.out.println("Loading " + fileName + " from disk (expensive operation)");
        try {
            Thread.sleep(1000); // 비싼 로딩 시뮬레이션
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        isLoaded = true;
    }
    
    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }
    
    @Override
    public String getFileName() {
        return fileName;
    }
    
    public String getFileExtension() {
        int lastIndex = fileName.lastIndexOf(".");
        if (lastIndex == -1) {
            return "";
        }
        return fileName.substring(lastIndex + 1);
    }
}