package Main;

import Entities.Maze;
import Factories.MazeFactory;

public class MazeBuilder {

    public static void main(String[] args) {

        MazeFactory factory = new MazeFactory();

        Maze.createMaze(factory);

    }

}
