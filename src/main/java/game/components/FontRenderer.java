package game.components;


import game.engine.Component;

/*
 * @created 16/01/2022
 * @project JGE2D
 * @author nihar
 */
public class FontRenderer extends Component {

    @Override
    public void start() {
        if(gameObject.getComponent(SpriteRenderer.class) != null) {
            System.out.println("Found font renderer!");
        }
    }

    @Override
    public void update(float dt) {

    }
}
