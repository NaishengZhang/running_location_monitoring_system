package demo.enums;

public enum RunnerMovementType {
    STOPPED, IN_MOTION;

    public boolean isMoving() {
        return this != STOPPED;
    }
}
