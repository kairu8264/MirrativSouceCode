package com.dena.mirrativ.mirrativapi.closet;

import android.text.TextUtils;
import java.io.Serializable;
import jo.p;

/* loaded from: classes2.dex */
public final class ClosetBackground implements Serializable {
    private final String assetBundleName;
    private final String assetBundlePrefabName;
    private final GameEffect gameEffect;

    /* renamed from: id  reason: collision with root package name */
    private final int f21649id;
    private final String position;
    private final String url;

    public ClosetBackground(int i10, String str, String str2, String str3, String str4, GameEffect gameEffect) {
        p.h(str, "url");
        this.f21649id = i10;
        this.url = str;
        this.assetBundleName = str2;
        this.assetBundlePrefabName = str3;
        this.position = str4;
        this.gameEffect = gameEffect;
    }

    public static /* synthetic */ ClosetBackground copy$default(ClosetBackground closetBackground, int i10, String str, String str2, String str3, String str4, GameEffect gameEffect, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = closetBackground.f21649id;
        }
        if ((i11 & 2) != 0) {
            str = closetBackground.url;
        }
        String str5 = str;
        if ((i11 & 4) != 0) {
            str2 = closetBackground.assetBundleName;
        }
        String str6 = str2;
        if ((i11 & 8) != 0) {
            str3 = closetBackground.assetBundlePrefabName;
        }
        String str7 = str3;
        if ((i11 & 16) != 0) {
            str4 = closetBackground.position;
        }
        String str8 = str4;
        if ((i11 & 32) != 0) {
            gameEffect = closetBackground.gameEffect;
        }
        return closetBackground.copy(i10, str5, str6, str7, str8, gameEffect);
    }

    public final int component1() {
        return this.f21649id;
    }

    public final String component2() {
        return this.url;
    }

    public final String component3() {
        return this.assetBundleName;
    }

    public final String component4() {
        return this.assetBundlePrefabName;
    }

    public final String component5() {
        return this.position;
    }

    public final GameEffect component6() {
        return this.gameEffect;
    }

    public final ClosetBackground copy(int i10, String str, String str2, String str3, String str4, GameEffect gameEffect) {
        p.h(str, "url");
        return new ClosetBackground(i10, str, str2, str3, str4, gameEffect);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClosetBackground) {
            ClosetBackground closetBackground = (ClosetBackground) obj;
            return this.f21649id == closetBackground.f21649id && p.c(this.url, closetBackground.url) && p.c(this.assetBundleName, closetBackground.assetBundleName) && p.c(this.assetBundlePrefabName, closetBackground.assetBundlePrefabName) && p.c(this.position, closetBackground.position) && p.c(this.gameEffect, closetBackground.gameEffect);
        }
        return false;
    }

    public final String getAssetBundleName() {
        return this.assetBundleName;
    }

    public final String getAssetBundlePrefabName() {
        return this.assetBundlePrefabName;
    }

    public final String getAssetBundleString() {
        if (TextUtils.isEmpty(this.assetBundleName) || TextUtils.isEmpty(this.assetBundlePrefabName) || TextUtils.isEmpty(this.position)) {
            return null;
        }
        return this.assetBundleName + ',' + this.assetBundlePrefabName + ',' + this.position;
    }

    public final GameEffect getGameEffect() {
        return this.gameEffect;
    }

    public final int getId() {
        return this.f21649id;
    }

    public final String getPosition() {
        return this.position;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f21649id) * 31) + this.url.hashCode()) * 31;
        String str = this.assetBundleName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.assetBundlePrefabName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.position;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        GameEffect gameEffect = this.gameEffect;
        return hashCode4 + (gameEffect != null ? gameEffect.hashCode() : 0);
    }

    public String toString() {
        return "ClosetBackground(id=" + this.f21649id + ", url=" + this.url + ", assetBundleName=" + this.assetBundleName + ", assetBundlePrefabName=" + this.assetBundlePrefabName + ", position=" + this.position + ", gameEffect=" + this.gameEffect + ')';
    }
}
