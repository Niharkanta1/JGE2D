package engine;

public class LevelScene extends Scene {
    public LevelScene() {
        System.out.println("Inside Level Scene");
    }

    @Override
    public void update(float dt) {
        Window.getInstance().r = 1;
        Window.getInstance().g = 1;
        Window.getInstance().b = 1;
        Window.getInstance().a = 1;
    }
}
