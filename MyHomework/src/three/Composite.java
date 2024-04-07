package three;

import java.util.ArrayList;
import java.util.List;
interface Component {
    void operation();
}
class Leaf implements Component {
    @Override
    public void operation() {
        System.out.println("Leaf");
    }
}
class Composite implements Component {
    private List<Component> components = new ArrayList<>();
    public void add(Component component) {
        components.add(component);
    }
    @Override
    public void operation() {
        for (Component component : components) {
            component.operation();
        }
    }
}
