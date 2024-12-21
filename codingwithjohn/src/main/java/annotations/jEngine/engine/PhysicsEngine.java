package annotations.jEngine.engine;

public class PhysicsEngine extends Engine implements Gravity<PhysicalObject>{
    private final int gravity;

    public PhysicsEngine(int gravity) {
        this.gravity = gravity;
    }

    @Override
    public double pull(PhysicalObject object){
        return object.getMass() * gravity;
    }
}
