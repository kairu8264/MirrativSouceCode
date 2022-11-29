package com.dena.mirrorman.net.api.response;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.io.Serializable;
import java.util.List;
import jo.h;
import jo.p;
import xn.s;
import ym.c;

/* loaded from: classes2.dex */
public final class UniqueEmomoGiftPreset implements Serializable {
    public static final int $stable = 8;
    private final List<UniqueEmomoGiftUnityTextConfig> defaultTexts;
    private final List<UniqueEmomoGiftUnityFontConfig> fonts;
    @c("preset_id")

    /* renamed from: id  reason: collision with root package name */
    private final String f26163id;
    private final String imageUrl;
    private final int textLength;
    private final int textNum;
    private final String unityPresetName;

    public UniqueEmomoGiftPreset(String str, String str2, String str3, List<UniqueEmomoGiftUnityFontConfig> list, int i10, int i11, List<UniqueEmomoGiftUnityTextConfig> list2) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "unityPresetName");
        p.h(str3, "imageUrl");
        p.h(list, "fonts");
        p.h(list2, "defaultTexts");
        this.f26163id = str;
        this.unityPresetName = str2;
        this.imageUrl = str3;
        this.fonts = list;
        this.textNum = i10;
        this.textLength = i11;
        this.defaultTexts = list2;
    }

    public static /* synthetic */ UniqueEmomoGiftPreset copy$default(UniqueEmomoGiftPreset uniqueEmomoGiftPreset, String str, String str2, String str3, List list, int i10, int i11, List list2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = uniqueEmomoGiftPreset.f26163id;
        }
        if ((i12 & 2) != 0) {
            str2 = uniqueEmomoGiftPreset.unityPresetName;
        }
        String str4 = str2;
        if ((i12 & 4) != 0) {
            str3 = uniqueEmomoGiftPreset.imageUrl;
        }
        String str5 = str3;
        List<UniqueEmomoGiftUnityFontConfig> list3 = list;
        if ((i12 & 8) != 0) {
            list3 = uniqueEmomoGiftPreset.fonts;
        }
        List list4 = list3;
        if ((i12 & 16) != 0) {
            i10 = uniqueEmomoGiftPreset.textNum;
        }
        int i13 = i10;
        if ((i12 & 32) != 0) {
            i11 = uniqueEmomoGiftPreset.textLength;
        }
        int i14 = i11;
        List<UniqueEmomoGiftUnityTextConfig> list5 = list2;
        if ((i12 & 64) != 0) {
            list5 = uniqueEmomoGiftPreset.defaultTexts;
        }
        return uniqueEmomoGiftPreset.copy(str, str4, str5, list4, i13, i14, list5);
    }

    public final String component1() {
        return this.f26163id;
    }

    public final String component2() {
        return this.unityPresetName;
    }

    public final String component3() {
        return this.imageUrl;
    }

    public final List<UniqueEmomoGiftUnityFontConfig> component4() {
        return this.fonts;
    }

    public final int component5() {
        return this.textNum;
    }

    public final int component6() {
        return this.textLength;
    }

    public final List<UniqueEmomoGiftUnityTextConfig> component7() {
        return this.defaultTexts;
    }

    public final UniqueEmomoGiftPreset copy(String str, String str2, String str3, List<UniqueEmomoGiftUnityFontConfig> list, int i10, int i11, List<UniqueEmomoGiftUnityTextConfig> list2) {
        p.h(str, TtmlNode.ATTR_ID);
        p.h(str2, "unityPresetName");
        p.h(str3, "imageUrl");
        p.h(list, "fonts");
        p.h(list2, "defaultTexts");
        return new UniqueEmomoGiftPreset(str, str2, str3, list, i10, i11, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UniqueEmomoGiftPreset) {
            UniqueEmomoGiftPreset uniqueEmomoGiftPreset = (UniqueEmomoGiftPreset) obj;
            return p.c(this.f26163id, uniqueEmomoGiftPreset.f26163id) && p.c(this.unityPresetName, uniqueEmomoGiftPreset.unityPresetName) && p.c(this.imageUrl, uniqueEmomoGiftPreset.imageUrl) && p.c(this.fonts, uniqueEmomoGiftPreset.fonts) && this.textNum == uniqueEmomoGiftPreset.textNum && this.textLength == uniqueEmomoGiftPreset.textLength && p.c(this.defaultTexts, uniqueEmomoGiftPreset.defaultTexts);
        }
        return false;
    }

    public final List<UniqueEmomoGiftUnityTextConfig> getDefaultTexts() {
        return this.defaultTexts;
    }

    public final List<UniqueEmomoGiftUnityFontConfig> getFonts() {
        return this.fonts;
    }

    public final String getId() {
        return this.f26163id;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final int getTextLength() {
        return this.textLength;
    }

    public final int getTextNum() {
        return this.textNum;
    }

    public final String getUnityPresetName() {
        return this.unityPresetName;
    }

    public int hashCode() {
        return (((((((((((this.f26163id.hashCode() * 31) + this.unityPresetName.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.fonts.hashCode()) * 31) + Integer.hashCode(this.textNum)) * 31) + Integer.hashCode(this.textLength)) * 31) + this.defaultTexts.hashCode();
    }

    public String toString() {
        return "UniqueEmomoGiftPreset(id=" + this.f26163id + ", unityPresetName=" + this.unityPresetName + ", imageUrl=" + this.imageUrl + ", fonts=" + this.fonts + ", textNum=" + this.textNum + ", textLength=" + this.textLength + ", defaultTexts=" + this.defaultTexts + ')';
    }

    public /* synthetic */ UniqueEmomoGiftPreset(String str, String str2, String str3, List list, int i10, int i11, List list2, int i12, h hVar) {
        this(str, str2, str3, (i12 & 8) != 0 ? s.k() : list, i10, i11, (i12 & 64) != 0 ? s.k() : list2);
    }
}
