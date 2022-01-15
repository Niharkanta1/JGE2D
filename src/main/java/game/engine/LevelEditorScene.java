package game.engine;

import game.components.SpriteRenderer;

import java.awt.event.KeyEvent;

public class LevelEditorScene extends Scene {
    private  boolean changingScene = false;
    private float timeToChangeScene = 2.0f;
    public LevelEditorScene() {
        System.out.println("Inside Level Editor");
    }
    GameObject testObject;
    @Override
    public void update(float dt) {
        if(!changingScene && KeyListener.isKeyPressed(KeyEvent.VK_SPACE)) {
            changingScene = true;
        }
        if(changingScene && timeToChangeScene > 0) {
            timeToChangeScene -= dt;
            Window.getInstance().r -= dt * 5.0f;
            Window.getInstance().g -= dt * 5.0f;
            Window.getInstance().b -= dt * 5.0f;
            Window.getInstance().a -= dt * 5.0f;
        } else if(changingScene) {
            Window.changeScene(1);
        }

        for(GameObject go: this.gameObjects) {
            go.update(dt);
        }
    }

    @Override
    public void init() {
        System.out.println("Creating test game object");
        this.testObject = new GameObject("Test Object");
        this.testObject.addComponent(new SpriteRenderer());
        this.addGameObjectToScene(this.testObject);
    }

}
