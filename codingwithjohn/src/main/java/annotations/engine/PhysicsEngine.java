package annotations.engine;

public class PhysicsEngine extends Engine implements Gravity{
    private final int gravity;

    public PhysicsEngine(int gravity) {
        this.gravity = gravity;
    }

    public int pull(int object){
        return 0;
    }
}
