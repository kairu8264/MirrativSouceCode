package com.dena.mirrorman.unity;

/* loaded from: classes3.dex */
public enum AccessoryPosition {
    EYE_FRONT("eyefront"),
    HEAD_TOP("headtop"),
    NECK_ORIGIN("neckorigin"),
    PET("pet"),
    WEAPON("weapon"),
    SPINEBACK("spineback"),
    BACK_WINGS("backwings"),
    EFFECT("effect"),
    LEFT_INTERIOR("leftinterior"),
    CENTER_INTERIOR("centerinterior"),
    RIGHT_INTERIOR("rightinterior"),
    BACKGROUND("background"),
    CAP_V2("capv2"),
    HAIR_ORNAMENT("hairornament"),
    HEAD_BAND("headband"),
    GLASSES_V2("glassesv2"),
    MASK("mask"),
    EARRING("earring"),
    LEFT_WEAPON("lefthandweapon"),
    RIGHT_WEAPON("righthandweapon"),
    BOTH_WEAPON("bothhandweapon"),
    KEMOMIMI("kemomimi"),
    NECKLACE("necklace"),
    MACHINE("machine");
    
    private final String rawValue;

    AccessoryPosition(String str) {
        this.rawValue = str;
    }

    public final String getRawValue() {
        return this.rawValue;
    }
}
