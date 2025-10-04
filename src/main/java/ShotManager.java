import java.util.HashMap;
import java.util.Map;

public class ShotManager {
    private Map<String, ShotPrototype> prototypes = new HashMap<>();

    public ShotManager() {
        prototypes.put("DEFAULT", new Shot());
    }

    public Shot getShot(String type, int x, int y) {
        ShotPrototype prototype = prototypes.get(type);
        if (prototype != null) {
            Shot s = (Shot) prototype.cloneShot();
            s.setX(x);
            s.setY(y);
            s.setVisible(true);
            return s;
        }
        return null;
    }
}
