import java.util.HashMap;

public class Room {
    private String name;
    private HashMap<String, Room> exits;

    public Room(String name) {
        this.name = name;
        this.exits = new HashMap<>();
    }

    public void connect(String direction, Room room) {
        exits.put(direction, room);
    }

    public Room getExit(String direction) {
        return exits.get(direction);
    }

    public String getName() {
        return name;
    }
}
