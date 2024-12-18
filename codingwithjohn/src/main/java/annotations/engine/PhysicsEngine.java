package annotations.engine;

public class PhysicsEngine extends Engine implements Gravity{
    private final int gravity;

    public PhysicsEngine(int gravity) {
        this.gravity = gravity;
    }

    @Override
    public double pull(PhysicalObject object){
        return 0;
    }
}
