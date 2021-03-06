import javax.swing.*;

// будет содержать только метод main и служить точкой входа в наше приложение
public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        Controller controller = new Controller(model);
        JFrame game = new JFrame();


        game.setTitle("2048");
        game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game.setSize(450, 500);
        game.setResizable(false);

        game.add(controller.getView()); // передаем представление из контролера,
        // которое является JPane объектом и оно разворачивается на весь JFrame объект

        game.setLocationRelativeTo(null); // открытие окна по центру экрана
        game.setVisible(true);
    }
}
