package com.dena.mirrorman.net.api.response.live;

import android.os.Parcel;
import android.os.Parcelable;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class ColoredText implements Parcelable {
    public static final int $stable = 0;
    public static final CREATOR CREATOR = new CREATOR(null);
    private final Integer color;
    private final String text;

    /* loaded from: classes2.dex */
    public static final class CREATOR implements Parcelable.Creator<ColoredText> {
        private CREATOR() {
        }

        public /* synthetic */ CREATOR(h hVar) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ColoredText createFromParcel(Parcel parcel) {
            p.h(parcel, "parcel");
            return new ColoredText(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ColoredText[] newArray(int i10) {
            return new ColoredText[i10];
        }
    }

    public ColoredText(String str, Integer num) {
        this.text = str;
        this.color = num;
    }

    public static /* synthetic */ ColoredText copy$default(ColoredText coloredText, String str, Integer num, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = coloredText.text;
        }
        if ((i10 & 2) != 0) {
            num = coloredText.color;
        }
        return coloredText.copy(str, num);
    }

    public final String component1() {
        return this.text;
    }

    public final Integer component2() {
        return this.color;
    }

    public final ColoredText copy(String str, Integer num) {
        return new ColoredText(str, num);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ColoredText) {
            ColoredText coloredText = (ColoredText) obj;
            return p.c(this.text, coloredText.text) && p.c(this.color, coloredText.color);
        }
        return false;
    }

    public final Integer getColor() {
        return this.color;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.color;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "ColoredText(text=" + this.text + ", color=" + this.color + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        p.h(parcel, "parcel");
        parcel.writeString(this.text);
        parcel.writeValue(this.color);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ColoredText(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = "parcel"
            jo.p.h(r3, r0)
            java.lang.String r0 = r3.readString()
            java.lang.Class r1 = java.lang.Integer.TYPE
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Object r3 = r3.readValue(r1)
            boolean r1 = r3 instanceof java.lang.Integer
            if (r1 == 0) goto L1a
            java.lang.Integer r3 = (java.lang.Integer) r3
            goto L1b
        L1a:
            r3 = 0
        L1b:
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.net.api.response.live.ColoredText.<init>(android.os.Parcel):void");
    }
}
