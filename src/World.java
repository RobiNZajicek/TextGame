import java.util.HashMap;

public class World {
    private HashMap<Integer, Room> rooms;

    public World() {
        rooms = new HashMap<>();
        createRooms();
    }

    private void createRooms() {
        for (int i = 0; i < 9; i++) {
            Room room = new Room("Room " + (i + 1));
            rooms.put(i, room);
        }

        // Connect the rooms

        rooms.get(0).connect("north", rooms.get(1));
        rooms.get(1).connect("south", rooms.get(0));
        rooms.get(1).connect("north", rooms.get(2));
// Side link
        rooms.get(1).connect("east", rooms.get(7));
        rooms.get(7).connect("west", rooms.get(1));
        rooms.get(7).connect("other", rooms.get(8));
// End of side link
        rooms.get(2).connect("south", rooms.get(1));
        rooms.get(2).connect("west", rooms.get(3));
        rooms.get(3).connect("west", rooms.get(4));
        rooms.get(3).connect("east", rooms.get(2));
        rooms.get(4).connect("west", rooms.get(3));
        rooms.get(4).connect("north", rooms.get(5));
        rooms.get(5).connect("south", rooms.get(4));
        rooms.get(5).connect("west", rooms.get(6));
        rooms.get(6).connect("east", rooms.get(5));
        rooms.get(6).connect("south", rooms.get(9));


        /*
        rooms.get(1).connect("south", rooms.get(0));
        rooms.get(1).connect("east", rooms.get(2));
        rooms.get(1).connect("west", rooms.get(7));
        rooms.get(2).connect("west", rooms.get(1));
        rooms.get(2).connect("south", rooms.get(3));
        rooms.get(3).connect("north", rooms.get(2));
        rooms.get(3).connect("east", rooms.get(4));
        rooms.get(3).connect("south", rooms.get(8));
        rooms.get(4).connect("west", rooms.get(3));
        rooms.get(4).connect("south", rooms.get(5));
        rooms.get(5).connect("north", rooms.get(4));
        rooms.get(5).connect("east", rooms.get(6));
        rooms.get(6).connect("west", rooms.get(5));
        rooms.get(6).connect("south", rooms.get(9)); // End room
        rooms.get(7).connect("east", rooms.get(1));
        rooms.get(7).connect("south", rooms.get(8));
        rooms.get(8).connect("north", rooms.get(7));
        rooms.get(8).connect("north", rooms.get(3));

        */

    }

    public Room getRoom(int roomId) {
        return rooms.get(roomId);
    }
}
