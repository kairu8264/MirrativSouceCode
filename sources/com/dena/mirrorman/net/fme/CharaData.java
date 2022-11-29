package com.dena.mirrorman.net.fme;

import jo.p;

/* loaded from: classes2.dex */
public final class CharaData {
    public static final int $stable = 0;
    private final String chara;
    private final int charaWidth;
    private final FontType fontType;

    public CharaData(FontType fontType, int i10, String str) {
        p.h(fontType, "fontType");
        p.h(str, "chara");
        this.fontType = fontType;
        this.charaWidth = i10;
        this.chara = str;
    }

    public static /* synthetic */ CharaData copy$default(CharaData charaData, FontType fontType, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            fontType = charaData.fontType;
        }
        if ((i11 & 2) != 0) {
            i10 = charaData.charaWidth;
        }
        if ((i11 & 4) != 0) {
            str = charaData.chara;
        }
        return charaData.copy(fontType, i10, str);
    }

    public final FontType component1() {
        return this.fontType;
    }

    public final int component2() {
        return this.charaWidth;
    }

    public final String component3() {
        return this.chara;
    }

    public final CharaData copy(FontType fontType, int i10, String str) {
        p.h(fontType, "fontType");
        p.h(str, "chara");
        return new CharaData(fontType, i10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CharaData) {
            CharaData charaData = (CharaData) obj;
            return this.fontType == charaData.fontType && this.charaWidth == charaData.charaWidth && p.c(this.chara, charaData.chara);
        }
        return false;
    }

    public final String getChara() {
        return this.chara;
    }

    public final int getCharaWidth() {
        return this.charaWidth;
    }

    public final FontType getFontType() {
        return this.fontType;
    }

    public int hashCode() {
        return (((this.fontType.hashCode() * 31) + Integer.hashCode(this.charaWidth)) * 31) + this.chara.hashCode();
    }

    public String toString() {
        return this.chara + '[' + this.charaWidth + ']';
    }
}
