package demo.enums;

public enum Location {
    STOPPED, IN_MOTION;

    public boolean isMoving() {
        return this != STOPPED;
    }
}
