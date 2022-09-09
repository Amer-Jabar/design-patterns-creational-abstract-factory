package Entities;

import Factories.MazeFactory;

import java.util.Arrays;
import java.util.stream.Stream;

public class Maze {

    public Room[] rooms;

    public Maze() {
        rooms = new Room[0];
    }

    public static Maze createMaze(MazeFactory factory) {
        Maze maze = factory.makeMaze();
        Room room_1 = factory.makeRoom(1);
        Room room_2 = factory.makeRoom(2);

        Door door = factory.makeDoor(room_1, room_2);

        room_1.setSide(Directions.West, factory.makeWall());
        room_1.setSide(Directions.East, factory.makeWall());
        room_1.setSide(Directions.North, factory.makeWall());
        room_1.setSide(Directions.South, door);

        room_2.setSide(Directions.West, factory.makeWall());
        room_2.setSide(Directions.East, factory.makeWall());
        room_2.setSide(Directions.North, door);
        room_2.setSide(Directions.South, factory.makeWall());

        maze.addRoom(room_1);
        maze.addRoom(room_2);
        return maze;
    }

    public void addRoom(Room roomToAdd) {
        Room[] newRooms = Arrays.copyOf(rooms, rooms.length + 1);
        newRooms[newRooms.length - 1] = roomToAdd;
        rooms = newRooms;
    }

    public Room findRoom(int roomId) {
        if (rooms.length == 0) throw new IllegalStateException("rooms has length of zero");
        return Stream.of(rooms).filter(room -> room.roomNumber == roomId).findFirst().get();
    }

}
