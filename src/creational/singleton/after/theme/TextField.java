package creational.singleton.after.theme;

public class TextField {
    private final String placeholder;

    public TextField(String placeholder) {
        this.placeholder = placeholder;
    }

    public void display() {
        System.out.println("[TextField:" + placeholder + "] theme=" + Theme.getInstance().getThemeColor());
    }
}

