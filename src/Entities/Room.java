package Entities;

public class Room extends MapSite {

    public int roomNumber;
    MapSite[] sides;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void enter() {

    }

    public MapSite getSide(Directions direction) {
        return null;
    }

    public void setSide(Directions direction, MapSite site) {
    }

    @Override
    public String toString() {
        return String.valueOf("room number:" + roomNumber);
    }
}
