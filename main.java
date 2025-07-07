import javax.swing.SwingUtilities;

public class main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            APLICACION frame = new APLICACION();
            frame.setVisible(true);
        });
    }
}
