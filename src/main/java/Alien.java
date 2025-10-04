import javax.swing.ImageIcon;

public class Alien extends Sprite {
    protected Bomb bomb;
    protected int health;
    public Alien(int x, int y, String imagePath, int health) {
        this.x = x;
        this.y = y;
        this.health = health;
        this.bomb = new Bomb(x, y);

        ImageIcon ii = new ImageIcon(this.getClass().getResource(imagePath));
        this.setImage(ii.getImage());
    }

    public void act(int direction) {
        this.x += direction;
    }

    public Bomb getBomb() { return bomb; }
    public int getHealth() { return health; }
}
