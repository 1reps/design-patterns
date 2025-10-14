package creational.singleton.after.theme;

public class Label {
    private final String text;

    public Label(String text) {
        this.text = text;
    }

    public void display() {
        System.out.println("[Label:" + text + "] theme=" + Theme.getInstance().getThemeColor());
    }
}

