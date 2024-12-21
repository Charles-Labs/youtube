package annotations.jEngine.engine;

public interface AeroDynamics<T extends PhysicalObject> {
    public T blow(T object);
}
