package com.dena.mirrativ.mirrativapi.emomo.event;

import android.graphics.Color;
import java.io.Serializable;
import java.util.Arrays;
import jo.i0;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class GradientColor implements Serializable {
    @c("end_color")
    private final String endColorText;
    @c("start_color")
    private final String startColorText;

    public GradientColor(String str, String str2) {
        p.h(str, "startColorText");
        p.h(str2, "endColorText");
        this.startColorText = str;
        this.endColorText = str2;
    }

    private final String component1() {
        return this.startColorText;
    }

    private final String component2() {
        return this.endColorText;
    }

    public static /* synthetic */ GradientColor copy$default(GradientColor gradientColor, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = gradientColor.startColorText;
        }
        if ((i10 & 2) != 0) {
            str2 = gradientColor.endColorText;
        }
        return gradientColor.copy(str, str2);
    }

    public final GradientColor copy(String str, String str2) {
        p.h(str, "startColorText");
        p.h(str2, "endColorText");
        return new GradientColor(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GradientColor) {
            GradientColor gradientColor = (GradientColor) obj;
            return p.c(this.startColorText, gradientColor.startColorText) && p.c(this.endColorText, gradientColor.endColorText);
        }
        return false;
    }

    public final int getEndColorInt() {
        i0 i0Var = i0.f38149a;
        String format = String.format("#%s", Arrays.copyOf(new Object[]{this.endColorText}, 1));
        p.g(format, "format(format, *args)");
        return Color.parseColor(format);
    }

    public final int getStartColorInt() {
        i0 i0Var = i0.f38149a;
        String format = String.format("#%s", Arrays.copyOf(new Object[]{this.startColorText}, 1));
        p.g(format, "format(format, *args)");
        return Color.parseColor(format);
    }

    public int hashCode() {
        return (this.startColorText.hashCode() * 31) + this.endColorText.hashCode();
    }

    public String toString() {
        return "GradientColor(startColorText=" + this.startColorText + ", endColorText=" + this.endColorText + ')';
    }
}
