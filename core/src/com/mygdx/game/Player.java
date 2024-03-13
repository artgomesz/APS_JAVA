package com.mygdx.game;

import com.badlogic.gdx.math.Vector2;

public class Player {
    private Vector2 position;
    private Vector2 velocity;
    private float speed;

    public Player(float x, float y, float speed) {
        position = new Vector2(x, y);
        velocity = new Vector2();
        this.speed = speed;
    }

    public void update(float deltaTime) {
        position.add(velocity.x * deltaTime, velocity.y * deltaTime);
    }

    public void moveLeft() {
        velocity.x = -speed;
    }

    public void moveRight() {
        velocity.x = speed;
    }

    public void stopMoving() {
        velocity.x = 0;
    }

    public void shoot(float targetX, float targetY) {
    }

    public Vector2 getPosition() {
        return position;
    }
}
