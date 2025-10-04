import javax.swing.ImageIcon;
import java.awt.Image;

public class Shot implements ShotPrototype {

    private int x, y;
    private boolean visible;
    private Image image;

    public Shot() {
        this.x = 0;
        this.y = 0;
        this.visible = false;
        this.image = new ImageIcon(this.getClass().getResource("/img/shot.png")).getImage();
    }

    // Copy constructor for cloning
    public Shot(Shot s) {
        this.x = s.x;
        this.y = s.y;
        this.visible = s.visible;
        this.image = s.image;
    }

    @Override
    public ShotPrototype cloneShot() {
        return new Shot(this);
    }

    // Getters & setters
    public int getX() { return x; }
    public int getY() { return y; }
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
    public boolean isVisible() { return visible; }
    public void setVisible(boolean visible) { this.visible = visible; }
    public Image getImage() { return image; }

    public void die() { visible = false; }
}
