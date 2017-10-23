package com.github.f0rk777.model;

/**
 * Created by vendin on 23.10.2017.
 */
public class URShift implements URShiftModel {
    private int ID;

    private int i;

    public URShift() {
    }

    @Override
    public int doUnsignedShift(int i) {
        int newI = i >>> 10;
        System.out.println(Integer.toBinaryString(newI));
        return newI;
    }

    @Override
    public long doUnsignedShift(long i) {
        long newI = i >>> 10;
        System.out.println(Long.toBinaryString(newI));
        return newI;
    }

    @Override
    public int doUnsignedShift(short i) {
        int newI = i >>> 10;
        System.out.println(Integer.toBinaryString(newI));
        return newI;
    }

    @Override
    public int doUnsignedShift(byte i) {
        int newI = i >>> 10;
        System.out.println(Integer.toBinaryString(newI));
        return newI;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
