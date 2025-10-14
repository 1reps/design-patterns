package creational.singleton.problem.theme;

public class Button {

    private final String label;
    private final Theme theme; // 각 컴포넌트가 제각각 Theme 인스턴스를 가짐

    public Button(String label) {
        this.label = label;
        this.theme = new Theme();
    }

    public void display() {
        System.out.println("[Button:" + label + "] theme=" + theme.getThemeColor());
    }

    public Theme getTheme() {
        return theme;
    }
}
