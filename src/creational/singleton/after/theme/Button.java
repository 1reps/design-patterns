package creational.singleton.after.theme;

public class Button {
    private final String label;

    public Button(String label) {
        this.label = label;
    }

    public void display() {
        System.out.println("[Button:" + label + "] theme=" + Theme.getInstance().getThemeColor());
    }
}

