package creational.singleton.problem.theme;

public class Client {

    public static void main(String[] args) {
        Button button = new Button("Submit");
        TextField textField = new TextField("Enter your name");
        Label label = new Label("Username");

        button.display();
        textField.display();
        label.display();

        // 각 컴포넌트가 가진 Theme가 서로 달라 일관성 붕괴
        button.getTheme().setThemeColor("dark");

        button.display();
        textField.display();
        label.display();
    }
}
