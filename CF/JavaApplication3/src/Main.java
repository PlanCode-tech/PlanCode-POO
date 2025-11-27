import telaselecao.TelaLogin; // importa a tela de login/autenticação
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        // Define o ícone da aplicação
        Image icon = new ImageIcon("src/img/logoPlanCode.jpg").getImage();
        UIManager.put("Application.iconImage", icon);

        SwingUtilities.invokeLater(() -> {
            TelaLogin telaSelecao = new TelaLogin(); // <<< ABRE A TELA DE LOGIN
            telaSelecao.setIconImage(icon);
            telaSelecao.setVisible(true);
        });
    }
}
