package Entities;

public class Door extends MapSite {

    private Room previous, next;
    boolean isOpen;

    public Door(Room previous, Room next) {
        this.previous = previous;
        this.next = next;
    }

    @Override
    public void enter() {

    }

    public Room otherSideRoom(Room room) {
        return null;
    }

}
