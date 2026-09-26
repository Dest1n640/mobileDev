enum class Direction {
    UP, DOWN, RIGHT, LEFT
}

class Robot(var x: Int, var y: Int, var direction: Direction) {

    fun turnLeft() {
        direction = when (direction) {
            Direction.UP -> Direction.LEFT
            Direction.LEFT -> Direction.DOWN
            Direction.DOWN -> Direction.RIGHT
            Direction.RIGHT -> Direction.UP
        }
    }

    fun turnRight() {
        direction = when (direction) {
            Direction.UP -> Direction.RIGHT
            Direction.RIGHT -> Direction.DOWN
            Direction.DOWN -> Direction.LEFT
            Direction.LEFT -> Direction.UP
        }
    }

    fun stepForward() {
        when (direction) {
            Direction.UP -> y += 1
            Direction.DOWN -> y -= 1
            Direction.RIGHT -> x += 1
            Direction.LEFT -> x -= 1
        }
    }

    override fun toString(): String {
        return "x: $x, y: $y, dir: $direction"
    }
}

fun turnTo(robot: Robot, target: Direction) {
    while (robot.direction != target) {
        robot.turnRight()
    }
}

fun moveRobot(robot: Robot, toX: Int, toY: Int) {
    if (toX > robot.x) {
        turnTo(robot, Direction.RIGHT)
        repeat(toX - robot.x) { robot.stepForward() }
    } else if (toX < robot.x) {
        turnTo(robot, Direction.LEFT)
        repeat(robot.x - toX) { robot.stepForward() }
    }

    if (toY > robot.y) {
        turnTo(robot, Direction.UP)
        repeat(toY - robot.y) { robot.stepForward() }
    } else if (toY < robot.y) {
        turnTo(robot, Direction.DOWN)
        repeat(robot.y - toY) { robot.stepForward() }
    }
}
