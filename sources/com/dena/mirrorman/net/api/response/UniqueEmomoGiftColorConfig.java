package com.dena.mirrorman.net.api.response;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class UniqueEmomoGiftColorConfig implements Serializable {
    public static final int $stable = 0;
    @c("color_id")

    /* renamed from: id  reason: collision with root package name */
    private final String f26162id;
    private final String outlineColor;
    private final String textColor;

    public UniqueEmomoGiftColorConfig(String str, String str2, String str3) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "outlineColor");
        p.h(str3, "textColor");
        this.f26162id = str;
        this.outlineColor = str2;
        this.textColor = str3;
    }

    public static /* synthetic */ UniqueEmomoGiftColorConfig copy$default(UniqueEmomoGiftColorConfig uniqueEmomoGiftColorConfig, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = uniqueEmomoGiftColorConfig.f26162id;
        }
        if ((i10 & 2) != 0) {
            str2 = uniqueEmomoGiftColorConfig.outlineColor;
        }
        if ((i10 & 4) != 0) {
            str3 = uniqueEmomoGiftColorConfig.textColor;
        }
        return uniqueEmomoGiftColorConfig.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f26162id;
    }

    public final String component2() {
        return this.outlineColor;
    }

    public final String component3() {
        return this.textColor;
    }

    public final UniqueEmomoGiftColorConfig copy(String str, String str2, String str3) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "outlineColor");
        p.h(str3, "textColor");
        return new UniqueEmomoGiftColorConfig(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UniqueEmomoGiftColorConfig) {
            UniqueEmomoGiftColorConfig uniqueEmomoGiftColorConfig = (UniqueEmomoGiftColorConfig) obj;
            return p.c(this.f26162id, uniqueEmomoGiftColorConfig.f26162id) && p.c(this.outlineColor, uniqueEmomoGiftColorConfig.outlineColor) && p.c(this.textColor, uniqueEmomoGiftColorConfig.textColor);
        }
        return false;
    }

    public final String getId() {
        return this.f26162id;
    }

    public final String getOutlineColor() {
        return this.outlineColor;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return (((this.f26162id.hashCode() * 31) + this.outlineColor.hashCode()) * 31) + this.textColor.hashCode();
    }

    public String toString() {
        return "UniqueEmomoGiftColorConfig(id=" + this.f26162id + ", outlineColor=" + this.outlineColor + ", textColor=" + this.textColor + ')';
    }
}
