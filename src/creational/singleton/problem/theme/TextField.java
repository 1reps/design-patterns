package creational.singleton.problem.theme;

public class TextField {

    private final String placeholder;
    private final Theme theme;

    public TextField(String placeholder) {
        this.placeholder = placeholder;
        this.theme = new Theme();
    }

    public void display() {
        System.out.println("[TextField:" + placeholder + "] theme=" + theme.getThemeColor());
    }

    public Theme getTheme() {
        return theme;
    }
}
