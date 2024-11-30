package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Meth extends SuperObject {
    public OBJ_Meth() {
        name = "Meth";
        try {
            image = ImageIO.read(getClass().getResourceAsStream("/res/objects/meth_object.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}