package game.engine;

import java.util.ArrayList;
import java.util.List;

public abstract class Scene {

    private boolean isRunning = false;
    protected List<GameObject> gameObjects = new ArrayList<>();

    public Scene() { }

    public void init() { }

    public void start() {
        if(!isRunning) {
            for(GameObject g: gameObjects) {
                g.start();
            }
            isRunning = true;
        }
    }

    public void addGameObjectToScene(GameObject gameObject) {
        if(!isRunning) {
            gameObjects.add(gameObject);
        } else {
            gameObjects.add(gameObject);
            gameObject.start();
        }
    }

    public abstract void update(float dt);

}
