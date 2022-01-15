package game.engine;


/*
 * @created 16/01/2022
 * @project JGE2D
 * @author nihar
 */
public abstract class Component {
    public GameObject gameObject = null;
    public abstract void update(float dt);

    public void start() {

    }
}
