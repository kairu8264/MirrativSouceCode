package com.dena.mirrativ.mirrativapi.closet;

import android.graphics.Color;
import java.io.Serializable;
import java.util.Arrays;
import jo.i0;
import jo.p;

/* loaded from: classes2.dex */
public final class ClosetAvatarSimpleColor implements Serializable {

    /* renamed from: id  reason: collision with root package name */
    private final int f21647id;
    private final int value;

    public ClosetAvatarSimpleColor(int i10, int i11) {
        this.f21647id = i10;
        this.value = i11;
    }

    public static /* synthetic */ ClosetAvatarSimpleColor copy$default(ClosetAvatarSimpleColor closetAvatarSimpleColor, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = closetAvatarSimpleColor.f21647id;
        }
        if ((i12 & 2) != 0) {
            i11 = closetAvatarSimpleColor.value;
        }
        return closetAvatarSimpleColor.copy(i10, i11);
    }

    public final int component1() {
        return this.f21647id;
    }

    public final int component2() {
        return this.value;
    }

    public final ClosetAvatarSimpleColor copy(int i10, int i11) {
        return new ClosetAvatarSimpleColor(i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClosetAvatarSimpleColor) {
            ClosetAvatarSimpleColor closetAvatarSimpleColor = (ClosetAvatarSimpleColor) obj;
            return this.f21647id == closetAvatarSimpleColor.f21647id && this.value == closetAvatarSimpleColor.value;
        }
        return false;
    }

    public final int getColor() {
        i0 i0Var = i0.f38149a;
        String format = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(this.value & 16777215)}, 1));
        p.g(format, "format(format, *args)");
        return Color.parseColor(format);
    }

    public final String getColorHex() {
        i0 i0Var = i0.f38149a;
        String format = String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(this.value & 16777215)}, 1));
        p.g(format, "format(format, *args)");
        return format;
    }

    public final int getId() {
        return this.f21647id;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f21647id) * 31) + Integer.hashCode(this.value);
    }

    public String toString() {
        return "ClosetAvatarSimpleColor(id=" + this.f21647id + ", value=" + this.value + ')';
    }
}
