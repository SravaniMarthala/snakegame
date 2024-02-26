package game;
import java.awt.Point;
import java.util.List;

public class Snake {
    private int length;
    private Direction direction;
    private List<Point> body;

    // Constructor, methods to move, grow, check collisions, etc.
}

enum Direction {
    UP, DOWN, LEFT, RIGHT
}