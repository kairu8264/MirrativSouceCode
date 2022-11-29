package com.dena.mirrorman.net.fme;

import jo.p;

/* loaded from: classes2.dex */
public final class RubyData {
    public static final int $stable = 0;
    private final String chara;
    private final int length;
    private final int positionX;

    public RubyData(int i10, int i11, String str) {
        p.h(str, "chara");
        this.length = i10;
        this.positionX = i11;
        this.chara = str;
    }

    public static /* synthetic */ RubyData copy$default(RubyData rubyData, int i10, int i11, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = rubyData.length;
        }
        if ((i12 & 2) != 0) {
            i11 = rubyData.positionX;
        }
        if ((i12 & 4) != 0) {
            str = rubyData.chara;
        }
        return rubyData.copy(i10, i11, str);
    }

    public final int component1() {
        return this.length;
    }

    public final int component2() {
        return this.positionX;
    }

    public final String component3() {
        return this.chara;
    }

    public final RubyData copy(int i10, int i11, String str) {
        p.h(str, "chara");
        return new RubyData(i10, i11, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RubyData) {
            RubyData rubyData = (RubyData) obj;
            return this.length == rubyData.length && this.positionX == rubyData.positionX && p.c(this.chara, rubyData.chara);
        }
        return false;
    }

    public final String getChara() {
        return this.chara;
    }

    public final int getLength() {
        return this.length;
    }

    public final int getPositionX() {
        return this.positionX;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.length) * 31) + Integer.hashCode(this.positionX)) * 31) + this.chara.hashCode();
    }

    public String toString() {
        return "x: " + this.positionX + ", l: " + this.length + ", c: " + this.chara;
    }
}
