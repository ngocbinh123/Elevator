package hcm.nnbinh.elevator.model;

/**
 * Created by nguyenngocbinh on 4/22/17.
 */

public class Vector {
    private int mPosX;
    private int mPosY;
    private String title;
    private boolean isAtHere = false;

    public Vector(int posX, int posY, String name) {
        mPosX = posX;
        mPosY = posY;
        title = name;
    }

    public int getPostX() {
        return mPosX;
    }

    public void setPostX(int postX) {
        mPosX = postX;
    }

    public int getPosY() {
        return mPosY;
    }

    public void setPosY(int posY) {
        mPosY = posY;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isAtHere() {
        return isAtHere;
    }

    public void setAtHere(boolean atHere) {
        isAtHere = atHere;
    }
}
