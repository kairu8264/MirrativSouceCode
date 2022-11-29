package com.dena.mirrativ.mirrativapi.closet;

import android.graphics.Color;
import java.io.Serializable;
import java.util.Arrays;
import jo.i0;
import jo.p;

/* loaded from: classes2.dex */
public final class ClosetAvatarGradientColor implements Serializable {
    private final int end;

    /* renamed from: id  reason: collision with root package name */
    private final int f21646id;
    private float percentage;
    private final int start;

    public ClosetAvatarGradientColor(int i10, int i11, int i12, float f10) {
        this.f21646id = i10;
        this.start = i11;
        this.end = i12;
        this.percentage = f10;
    }

    public static /* synthetic */ ClosetAvatarGradientColor copy$default(ClosetAvatarGradientColor closetAvatarGradientColor, int i10, int i11, int i12, float f10, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = closetAvatarGradientColor.f21646id;
        }
        if ((i13 & 2) != 0) {
            i11 = closetAvatarGradientColor.start;
        }
        if ((i13 & 4) != 0) {
            i12 = closetAvatarGradientColor.end;
        }
        if ((i13 & 8) != 0) {
            f10 = closetAvatarGradientColor.percentage;
        }
        return closetAvatarGradientColor.copy(i10, i11, i12, f10);
    }

    public final int component1() {
        return this.f21646id;
    }

    public final int component2() {
        return this.start;
    }

    public final int component3() {
        return this.end;
    }

    public final float component4() {
        return this.percentage;
    }

    public final ClosetAvatarGradientColor copy(int i10, int i11, int i12, float f10) {
        return new ClosetAvatarGradientColor(i10, i11, i12, f10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClosetAvatarGradientColor) {
            ClosetAvatarGradientColor closetAvatarGradientColor = (ClosetAvatarGradientColor) obj;
            return this.f21646id == closetAvatarGradientColor.f21646id && this.start == closetAvatarGradientColor.start && this.end == closetAvatarGradientColor.end && p.c(Float.valueOf(this.percentage), Float.valueOf(closetAvatarGradientColor.percentage));
        }
        return false;
    }

    public final String getColorHex() {
        int red = (((int) (((Color.red(this.start) - Color.red(this.end)) * this.percentage) + Color.red(this.end))) << 16) | (-16777216) | (((int) (((Color.green(this.start) - Color.green(this.end)) * this.percentage) + Color.green(this.end))) << 8) | ((int) (((Color.blue(this.start) - Color.blue(this.end)) * this.percentage) + Color.blue(this.end)));
        i0 i0Var = i0.f38149a;
        String format = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(red & 16777215)}, 1));
        p.g(format, "format(format, *args)");
        return format;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getId() {
        return this.f21646id;
    }

    public final float getPercentage() {
        return this.percentage;
    }

    public final int getStarColor() {
        i0 i0Var = i0.f38149a;
        String format = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(this.start & 16777215)}, 1));
        p.g(format, "format(format, *args)");
        return Color.parseColor(format);
    }

    public final int getStart() {
        return this.start;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f21646id) * 31) + Integer.hashCode(this.start)) * 31) + Integer.hashCode(this.end)) * 31) + Float.hashCode(this.percentage);
    }

    public final void setPercentage(float f10) {
        this.percentage = f10;
    }

    public String toString() {
        return "ClosetAvatarGradientColor(id=" + this.f21646id + ", start=" + this.start + ", end=" + this.end + ", percentage=" + this.percentage + ')';
    }
}
