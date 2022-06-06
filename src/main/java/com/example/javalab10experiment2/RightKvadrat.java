package com.example.javalab10experiment2;

public class RightKvadrat {

    private int AB1;
    private int BC1;
    private int CD1;
    private int DA1;
    private double diag11;
    private double diag21;
    private int perimetr1;
    private double squar1;
    private int x11;
    private int y11;
    private int x21;
    private int y21;

    public RightKvadrat(int x1, int y1, int x2, int y2) {
        this.setX1(x1);
        this.setY1(y1);
        this.setX2(x2);
        this.setY2(y2);
        this.setAB();
        this.setBC();
        this.setCD();
        this.setDA();
        this.setDiag1();
        this.setDiag2();
        this.setSquar();
        this.setPerimetr();
    }

    public void setAB() {
        AB1 = (int) Math.sqrt(Math.pow((getX1() - getX1()), 2) + Math.pow((getY2() - getY1()), 2));
        AB1 = AB1 > 0 ? AB1 : 1;
    }

    public int getAB() {
        return AB1;
    }

    public void setBC() {
        BC1 = (int) Math.sqrt(Math.pow((getX2() - getX1()), 2) + Math.pow((getY2() - getY2()), 2));
        BC1 = BC1 > 0 ? BC1 : 1;
    }

    public int getBC() {
        return BC1;
    }

    public void setCD() {
        CD1 = (int) Math.sqrt(Math.pow((getX2() - getX2()), 2) + Math.pow((getY2() - getY1()), 2));
        CD1 = CD1 > 0 ? CD1 : 1;
    }

    public int getCD() {
        return CD1;
    }

    public void setDA() {
        DA1 = (int) Math.sqrt(Math.pow((getX2() - getX1()), 2) + Math.pow((getY1() - getY1()), 2));
        DA1 = DA1 > 0 ? DA1 : 1;
    }

    public int getDA() {
        return DA1;
    }

    public void setDiag1() {
        diag11 = Math.sqrt(Math.pow((getX2() - getX1()), 2) + Math.pow((getY2() - getY1()), 2));
    }

    public double getRightDiag1() {
        return diag11;
    }

    public void setDiag2() {
        diag21 = Math.sqrt(Math.pow((getX1() - getX2()), 2) + Math.pow((getY1() - getY2()), 2));
    }

    public double getRightDiag2() {
        return diag21;
    }

    public void setSquar() {
        squar1 = getAB() * getBC();
    }

    public void setPerimetr() {
        perimetr1 = getAB() + getBC() + getCD() + getDA();
    }

    public int getRightPerimetr() {
        return perimetr1;
    }

    public double getRightSquar() {
        return squar1;
    }

    public int getX1() {
        return x11;
    }

    public void setX1(int x1) {
        this.x11 = x1;
    }

    public int getY1() {
        return y11;
    }

    public void setY1(int y1) {
        this.y11 = y1;
    }

    public int getX2() {
        return x21;
    }

    public void setX2(int x2) {
        this.x21 = x2;
    }

    public int getY2() {
        return y21;
    }

    public void setY2(int y2) {
        this.y21 = y2;
    }


    @Override
    public String toString() {
        return "Right Kvadrat{" +
                "x1=" + getX1() +
                ", y1=" + getY1() +
                ", x2=" + getX1() +
                ", y2=" + getY2() +
                ", x3=" + getX2() +
                ", y3=" + getY2() +
                ", x4=" + getX2() +
                ", y4=" + getY1() +
                ", AB=" + getAB() +
                ", BC=" + getBC() +
                ", CD=" + getCD() +
                ", CD=" + getDA() +
                ", Diagonal1=" + getRightDiag1() +
                ", Diagonal2=" + getRightDiag2() +
                ", Perimetr=" + getRightPerimetr() +
                ", Squar=" + getRightSquar() +
                '}' + System.lineSeparator();
    }
}
