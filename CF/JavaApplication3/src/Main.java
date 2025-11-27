import main.TelaLogin;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

       
        Image icon = new ImageIcon("src/img/logoPlanCode.jpg").getImage();
        UIManager.put("Application.iconImage", icon);

        SwingUtilities.invokeLater(() -> {
            TelaLogin tela = new TelaLogin();
            tela.setIconImage(icon);
            tela.setVisible(true);
        });
    }
}
