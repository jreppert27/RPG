package main;

import object.OBJ_Chest;
import object.OBJ_Door;
import object.OBJ_Key;
import object.OBJ_Meth;

public class AssetSetter {
    GamePanel gp;

    public AssetSetter(GamePanel gp) {
        this.gp = gp;
    }

    public void setObject() {
        gp.obj[0] = new OBJ_Key();
        gp.obj[0].worldX = 15 * gp.tileSize;
        gp.obj[0].worldY = 11 * gp.tileSize;

        gp.obj[1] = new OBJ_Key();
        gp.obj[1].worldX = 30 * gp.tileSize;
        gp.obj[1].worldY = 30 * gp.tileSize;

        gp.obj[2] = new OBJ_Door();
        gp.obj[2].worldX = 8 * gp.tileSize;
        gp.obj[2].worldY = 0 * gp.tileSize;

        gp.obj[3] = new OBJ_Chest();
        gp.obj[3].worldX = 25 * gp.tileSize;
        gp.obj[3].worldY = 1 * gp.tileSize;

        gp.obj[4] = new OBJ_Meth();
        gp.obj[4].worldX = 6 * gp.tileSize;
        gp.obj[4].worldY = 0 * gp.tileSize;

        gp.obj[5] = new OBJ_Meth();
        gp.obj[5].worldX = 5 * gp.tileSize;
        gp.obj[5].worldY = 0 * gp.tileSize;
    }
}
