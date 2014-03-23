import java.applet.Applet;
import java.awt.*;

/**
 * Created by Administrator on 14-3-22.
 */
public class J_HelloApplet extends Applet {
    @Override
    public void paint(Graphics g) {
        g.clearRect(0, 0, getWidth(), getHeight());
        g.drawString("Hello, Applet!", 10, 20);
    }
}
