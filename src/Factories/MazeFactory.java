package Factories;

import Entities.Door;
import Entities.Maze;
import Entities.Room;
import Entities.Wall;

public class MazeFactory implements AbstractMazeFactory {


    @Override
    public Maze makeMaze() {
        return new Maze();
    }

    @Override
    public Wall makeWall() {
        return new Wall();
    }

    @Override
    public Door makeDoor(Room room_1, Room room_2) {
        return new Door(room_1, room_2);
    }

    @Override
    public Room makeRoom(int roomNumber) {
        return new Room(roomNumber);
    }
}
