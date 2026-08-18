package RelationshipBetweenClasses.Composition;

import java.util.ArrayList;
import java.util.List;

public class House {
    public List<Room> rooms;

    public House(){
        this.rooms = new ArrayList<>();
        rooms.add(new Room("Living Room"));
    }
}
