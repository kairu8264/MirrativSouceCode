package com.dena.mirrorman.net.fme;

import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class FmeLyricsData {
    public static final int $stable = 8;
    private final int afterColor;
    private final int afterContoursColor;
    private final int beforeColor;
    private final int beforeContoursColor;
    private final ChangeColorFlag changeColorFlag;
    private final List<CharaData> charaDataList;
    private final int charaLength;
    private final int positionX;
    private final int positionY;
    private final List<RubyData> rubyDataList;

    public FmeLyricsData(ChangeColorFlag changeColorFlag, int i10, int i11, int i12, int i13, int i14, int i15, int i16, List<CharaData> list, List<RubyData> list2) {
        p.h(changeColorFlag, "changeColorFlag");
        p.h(list, "charaDataList");
        p.h(list2, "rubyDataList");
        this.changeColorFlag = changeColorFlag;
        this.positionX = i10;
        this.positionY = i11;
        this.beforeColor = i12;
        this.afterColor = i13;
        this.beforeContoursColor = i14;
        this.afterContoursColor = i15;
        this.charaLength = i16;
        this.charaDataList = list;
        this.rubyDataList = list2;
    }

    public final ChangeColorFlag component1() {
        return this.changeColorFlag;
    }

    public final List<RubyData> component10() {
        return this.rubyDataList;
    }

    public final int component2() {
        return this.positionX;
    }

    public final int component3() {
        return this.positionY;
    }

    public final int component4() {
        return this.beforeColor;
    }

    public final int component5() {
        return this.afterColor;
    }

    public final int component6() {
        return this.beforeContoursColor;
    }

    public final int component7() {
        return this.afterContoursColor;
    }

    public final int component8() {
        return this.charaLength;
    }

    public final List<CharaData> component9() {
        return this.charaDataList;
    }

    public final FmeLyricsData copy(ChangeColorFlag changeColorFlag, int i10, int i11, int i12, int i13, int i14, int i15, int i16, List<CharaData> list, List<RubyData> list2) {
        p.h(changeColorFlag, "changeColorFlag");
        p.h(list, "charaDataList");
        p.h(list2, "rubyDataList");
        return new FmeLyricsData(changeColorFlag, i10, i11, i12, i13, i14, i15, i16, list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FmeLyricsData) {
            FmeLyricsData fmeLyricsData = (FmeLyricsData) obj;
            return this.changeColorFlag == fmeLyricsData.changeColorFlag && this.positionX == fmeLyricsData.positionX && this.positionY == fmeLyricsData.positionY && this.beforeColor == fmeLyricsData.beforeColor && this.afterColor == fmeLyricsData.afterColor && this.beforeContoursColor == fmeLyricsData.beforeContoursColor && this.afterContoursColor == fmeLyricsData.afterContoursColor && this.charaLength == fmeLyricsData.charaLength && p.c(this.charaDataList, fmeLyricsData.charaDataList) && p.c(this.rubyDataList, fmeLyricsData.rubyDataList);
        }
        return false;
    }

    public final int getAfterColor() {
        return this.afterColor;
    }

    public final int getAfterContoursColor() {
        return this.afterContoursColor;
    }

    public final int getBeforeColor() {
        return this.beforeColor;
    }

    public final int getBeforeContoursColor() {
        return this.beforeContoursColor;
    }

    public final ChangeColorFlag getChangeColorFlag() {
        return this.changeColorFlag;
    }

    public final List<CharaData> getCharaDataList() {
        return this.charaDataList;
    }

    public final int getCharaLength() {
        return this.charaLength;
    }

    public final int getPositionX() {
        return this.positionX;
    }

    public final int getPositionY() {
        return this.positionY;
    }

    public final List<RubyData> getRubyDataList() {
        return this.rubyDataList;
    }

    public int hashCode() {
        return (((((((((((((((((this.changeColorFlag.hashCode() * 31) + Integer.hashCode(this.positionX)) * 31) + Integer.hashCode(this.positionY)) * 31) + Integer.hashCode(this.beforeColor)) * 31) + Integer.hashCode(this.afterColor)) * 31) + Integer.hashCode(this.beforeContoursColor)) * 31) + Integer.hashCode(this.afterContoursColor)) * 31) + Integer.hashCode(this.charaLength)) * 31) + this.charaDataList.hashCode()) * 31) + this.rubyDataList.hashCode();
    }

    public String toString() {
        return "FmeLyricsData(changeColorFlag=" + this.changeColorFlag + ", positionX=" + this.positionX + ", positionY=" + this.positionY + ", beforeColor=" + this.beforeColor + ", afterColor=" + this.afterColor + ", beforeContoursColor=" + this.beforeContoursColor + ", afterContoursColor=" + this.afterContoursColor + ", charaLength=" + this.charaLength + ", charaDataList=" + this.charaDataList + ", rubyDataList=" + this.rubyDataList + ')';
    }
}
