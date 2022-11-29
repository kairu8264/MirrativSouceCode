package com.dena.mirrorman.net.api.response;

import java.io.Serializable;
import jo.h;
import jo.p;

/* loaded from: classes2.dex */
public final class UniqueEmomoGiftUnityTextConfig implements Serializable {
    public static final int $stable = 0;
    private final String fontId;
    private final int index;
    private final boolean isDirty;
    private final String text;
    private final String unityFontName;

    public UniqueEmomoGiftUnityTextConfig(String str, String str2, int i10, String str3, boolean z10) {
        p.h(str, "fontId");
        p.h(str2, "unityFontName");
        p.h(str3, "text");
        this.fontId = str;
        this.unityFontName = str2;
        this.index = i10;
        this.text = str3;
        this.isDirty = z10;
    }

    public static /* synthetic */ UniqueEmomoGiftUnityTextConfig copy$default(UniqueEmomoGiftUnityTextConfig uniqueEmomoGiftUnityTextConfig, String str, String str2, int i10, String str3, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = uniqueEmomoGiftUnityTextConfig.fontId;
        }
        if ((i11 & 2) != 0) {
            str2 = uniqueEmomoGiftUnityTextConfig.unityFontName;
        }
        String str4 = str2;
        if ((i11 & 4) != 0) {
            i10 = uniqueEmomoGiftUnityTextConfig.index;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            str3 = uniqueEmomoGiftUnityTextConfig.text;
        }
        String str5 = str3;
        if ((i11 & 16) != 0) {
            z10 = uniqueEmomoGiftUnityTextConfig.isDirty;
        }
        return uniqueEmomoGiftUnityTextConfig.copy(str, str4, i12, str5, z10);
    }

    public final String component1() {
        return this.fontId;
    }

    public final String component2() {
        return this.unityFontName;
    }

    public final int component3() {
        return this.index;
    }

    public final String component4() {
        return this.text;
    }

    public final boolean component5() {
        return this.isDirty;
    }

    public final UniqueEmomoGiftUnityTextConfig copy(String str, String str2, int i10, String str3, boolean z10) {
        p.h(str, "fontId");
        p.h(str2, "unityFontName");
        p.h(str3, "text");
        return new UniqueEmomoGiftUnityTextConfig(str, str2, i10, str3, z10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UniqueEmomoGiftUnityTextConfig) {
            UniqueEmomoGiftUnityTextConfig uniqueEmomoGiftUnityTextConfig = (UniqueEmomoGiftUnityTextConfig) obj;
            return p.c(this.fontId, uniqueEmomoGiftUnityTextConfig.fontId) && p.c(this.unityFontName, uniqueEmomoGiftUnityTextConfig.unityFontName) && this.index == uniqueEmomoGiftUnityTextConfig.index && p.c(this.text, uniqueEmomoGiftUnityTextConfig.text) && this.isDirty == uniqueEmomoGiftUnityTextConfig.isDirty;
        }
        return false;
    }

    public final String getFontId() {
        return this.fontId;
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUnityFontName() {
        return this.unityFontName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((this.fontId.hashCode() * 31) + this.unityFontName.hashCode()) * 31) + Integer.hashCode(this.index)) * 31) + this.text.hashCode()) * 31;
        boolean z10 = this.isDirty;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public final boolean isDirty() {
        return this.isDirty;
    }

    public String toString() {
        return "UniqueEmomoGiftUnityTextConfig(fontId=" + this.fontId + ", unityFontName=" + this.unityFontName + ", index=" + this.index + ", text=" + this.text + ", isDirty=" + this.isDirty + ')';
    }

    public /* synthetic */ UniqueEmomoGiftUnityTextConfig(String str, String str2, int i10, String str3, boolean z10, int i11, h hVar) {
        this(str, str2, i10, str3, (i11 & 16) != 0 ? false : z10);
    }
}
