public class AlienFactory {

    public Alien createAlien(String type, int x, int y) {
        if (type == null) return null;

        if (type.equalsIgnoreCase("NORMAL")) {
            return new Alien(x, y, "/img/alien.png", 50);
        } else if (type.equalsIgnoreCase("ARMORED")) {
            return new Alien(x, y, "/img/armored-alien.png", 700);
            // default
        }
        return new Alien(x, y, "/img/alien.png", 50);
    }
}
