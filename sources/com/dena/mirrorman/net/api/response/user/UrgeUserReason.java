package com.dena.mirrorman.net.api.response.user;

import java.io.Serializable;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class UrgeUserReason implements Serializable {
    public static final int $stable = 8;
    private int color;
    private String text;

    public UrgeUserReason() {
        this(null, 0, 3, null);
    }

    public UrgeUserReason(String str, int i10) {
        p.h(str, "text");
        this.text = str;
        this.color = i10;
    }

    public static /* synthetic */ UrgeUserReason copy$default(UrgeUserReason urgeUserReason, String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = urgeUserReason.text;
        }
        if ((i11 & 2) != 0) {
            i10 = urgeUserReason.color;
        }
        return urgeUserReason.copy(str, i10);
    }

    public final String component1() {
        return this.text;
    }

    public final int component2() {
        return this.color;
    }

    public final UrgeUserReason copy(String str, int i10) {
        p.h(str, "text");
        return new UrgeUserReason(str, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UrgeUserReason) {
            UrgeUserReason urgeUserReason = (UrgeUserReason) obj;
            return p.c(this.text, urgeUserReason.text) && this.color == urgeUserReason.color;
        }
        return false;
    }

    public final int getColor() {
        return this.color;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + Integer.hashCode(this.color);
    }

    public final void setColor(int i10) {
        this.color = i10;
    }

    public final void setText(String str) {
        p.h(str, "<set-?>");
        this.text = str;
    }

    public String toString() {
        return "UrgeUserReason(text=" + this.text + ", color=" + this.color + ')';
    }

    public /* synthetic */ UrgeUserReason(String str, int i10, int i11, h hVar) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 0 : i10);
    }
}
