package annotations.engine;

public interface Gravity<T extends PhysicalObject> {

    double pull(T object);
}
