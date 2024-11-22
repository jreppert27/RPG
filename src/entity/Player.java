package entity;

import java.awt.Color;
import java.awt.Graphics2D;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;
import main.KeyHandler;

public class Player extends Entity {

    GamePanel gp;
    KeyHandler keyH;

    public Player(GamePanel gp, KeyHandler keyH) {

        this.gp = gp;
        this.keyH = keyH;

        setDefaultValues();
    }

    public void setDefaultValues() {

        x = 100;
        y = 100;
        speed = 4;
    }

    public void getPlayerImage() {
        try {

            up1 = ImageIO.read(getClass().getResourceAsStream("/player/ZER0.png"));
            up2 = ImageIO.read(getClass().getResourceAsStream("/player/ZER0.png"));
            down1 = ImageIO.read(getClass().getResourceAsStream("/player/ZER0.png"));
            down2 = ImageIO.read(getClass().getResourceAsStream("/player/ZER0.png"));
            left1 = ImageIO.read(getClass().getResourceAsStream("/player/ZER0.png"));
            left2 = ImageIO.read(getClass().getResourceAsStream("/player/ZER0.png"));
            right1 = ImageIO.read(getClass().getResourceAsStream("/player/ZER0.png"));
            right2 = ImageIO.read(getClass().getResourceAsStream("/player/ZER0.png"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void update() {
        // if (keyH.upPressed == true & keyH.rightPressed) {
        // y -= strafSpeed;
        // x += strafSpeed;
        // }
        // if (keyH.upPressed == true & keyH.leftPressed) {
        // y -= strafSpeed;
        // x -= strafSpeed;
        // }
        // if (keyH.downPressed == true & keyH.rightPressed) {
        // y += strafSpeed;
        // x += strafSpeed;
        // }
        // if (keyH.downPressed == true & keyH.leftPressed) {
        // y += strafSpeed;
        // x -= strafSpeed;
        // }

        // if (keyH.upPressed == true) {
        // y -= speed;
        // } else if (keyH.downPressed == true) {
        // y += speed;
        // } else if (keyH.leftPressed == true) {
        // x -= speed;
        // } else if (keyH.rightPressed == true) {
        // x += speed;
        // }

        if (keyH.upPressed == true) {
            y -= speed;
        }
        if (keyH.downPressed == true) {
            y += speed;
        }
        if (keyH.leftPressed == true) {
            x -= speed;
        }
        if (keyH.rightPressed == true) {
            x += speed;
        }
    }

    public void draw(Graphics2D g2) {
        g2.setColor(Color.white);

        g2.fillRect(x, y, gp.tileSize, gp.tileSize);
    }

}
