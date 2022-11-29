package com.dena.mirrorman.net.api.response;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;
import jo.p;
import ym.c;

/* loaded from: classes2.dex */
public final class UniqueEmomoGiftUnityFontConfig implements Serializable {
    public static final int $stable = 0;
    @c("font_id")

    /* renamed from: id  reason: collision with root package name */
    private final String f26164id;
    private final String outlineColor;
    private final String textColor;
    private final String unityFontName;

    public UniqueEmomoGiftUnityFontConfig(String str, String str2, String str3, String str4) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "unityFontName");
        p.h(str3, "outlineColor");
        p.h(str4, "textColor");
        this.f26164id = str;
        this.unityFontName = str2;
        this.outlineColor = str3;
        this.textColor = str4;
    }

    public static /* synthetic */ UniqueEmomoGiftUnityFontConfig copy$default(UniqueEmomoGiftUnityFontConfig uniqueEmomoGiftUnityFontConfig, String str, String str2, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = uniqueEmomoGiftUnityFontConfig.f26164id;
        }
        if ((i10 & 2) != 0) {
            str2 = uniqueEmomoGiftUnityFontConfig.unityFontName;
        }
        if ((i10 & 4) != 0) {
            str3 = uniqueEmomoGiftUnityFontConfig.outlineColor;
        }
        if ((i10 & 8) != 0) {
            str4 = uniqueEmomoGiftUnityFontConfig.textColor;
        }
        return uniqueEmomoGiftUnityFontConfig.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.f26164id;
    }

    public final String component2() {
        return this.unityFontName;
    }

    public final String component3() {
        return this.outlineColor;
    }

    public final String component4() {
        return this.textColor;
    }

    public final UniqueEmomoGiftUnityFontConfig copy(String str, String str2, String str3, String str4) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "unityFontName");
        p.h(str3, "outlineColor");
        p.h(str4, "textColor");
        return new UniqueEmomoGiftUnityFontConfig(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UniqueEmomoGiftUnityFontConfig) {
            UniqueEmomoGiftUnityFontConfig uniqueEmomoGiftUnityFontConfig = (UniqueEmomoGiftUnityFontConfig) obj;
            return p.c(this.f26164id, uniqueEmomoGiftUnityFontConfig.f26164id) && p.c(this.unityFontName, uniqueEmomoGiftUnityFontConfig.unityFontName) && p.c(this.outlineColor, uniqueEmomoGiftUnityFontConfig.outlineColor) && p.c(this.textColor, uniqueEmomoGiftUnityFontConfig.textColor);
        }
        return false;
    }

    public final String getId() {
        return this.f26164id;
    }

    public final String getOutlineColor() {
        return this.outlineColor;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final String getUnityFontName() {
        return this.unityFontName;
    }

    public int hashCode() {
        return (((((this.f26164id.hashCode() * 31) + this.unityFontName.hashCode()) * 31) + this.outlineColor.hashCode()) * 31) + this.textColor.hashCode();
    }

    public String toString() {
        return "UniqueEmomoGiftUnityFontConfig(id=" + this.f26164id + ", unityFontName=" + this.unityFontName + ", outlineColor=" + this.outlineColor + ", textColor=" + this.textColor + ')';
    }
}
