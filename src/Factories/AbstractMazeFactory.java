package Factories;

import Entities.Door;
import Entities.Maze;
import Entities.Room;
import Entities.Wall;

public interface AbstractMazeFactory {

    Maze makeMaze();
    Wall makeWall();
    Door makeDoor(Room room_1, Room room_2);
    Room makeRoom(int roomNumber);

}
