import javax.swing.*;
import java.awt.*;

public class MyUI extends JFrame implements BaseUI {
    private Graphics g;

    MyUI() {
        JFrame frame = new JFrame("16130188018ysm");
        frame.setSize(1000,1000);
        frame.setVisible(true);
        g = frame.getGraphics();
    }

    public void showMessage(String text) {
        int msgCode = JOptionPane.showConfirmDialog(
                null, text, "Info",
                JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE);
        System.out.println(msgCode);
    }

    public void drawPixel(int x, int y, uiPixelAttrib pixelAttrib) {
        g.setColor(new Color(pixelAttrib.r, pixelAttrib.g, pixelAttrib.b));
        g.drawLine(x, y, x, y);
    }
}
