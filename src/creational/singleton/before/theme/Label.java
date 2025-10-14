package creational.singleton.before.theme;

public class Label {

    private final String text;
    private final Theme theme;

    public Label(String text) {
        this.text = text;
        this.theme = new Theme();
    }

    public void display() {
        System.out.println("[Label:" + text + "] theme=" + theme.getThemeColor());
    }

    public Theme getTheme() {
        return theme;
    }
}

