package game.components;


import game.engine.Component;

/*
 * @created 16/01/2022
 * @project JGE2D
 * @author nihar
 */
public class SpriteRenderer extends Component {

    private boolean firstTime = false;

    @Override
    public void start() {
        System.out.println("I am starting!");
    }

    @Override
    public void update(float dt) {
        if(!firstTime) {
            System.out.println("I am updating!");
            firstTime = true;
        }
    }
}
