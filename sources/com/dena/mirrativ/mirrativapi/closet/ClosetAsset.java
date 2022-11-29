package com.dena.mirrativ.mirrativapi.closet;

import java.io.Serializable;
import jo.p;

/* loaded from: classes2.dex */
public final class ClosetAsset implements Serializable {
    private String assetBundleName;
    private String assetBundlePrefabName;
    private final GameEffect gameEffect;

    /* renamed from: id  reason: collision with root package name */
    private int f21644id;

    public ClosetAsset(int i10, String str, String str2, GameEffect gameEffect) {
        p.h(str, "assetBundleName");
        p.h(str2, "assetBundlePrefabName");
        this.f21644id = i10;
        this.assetBundleName = str;
        this.assetBundlePrefabName = str2;
        this.gameEffect = gameEffect;
    }

    public static /* synthetic */ ClosetAsset copy$default(ClosetAsset closetAsset, int i10, String str, String str2, GameEffect gameEffect, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = closetAsset.f21644id;
        }
        if ((i11 & 2) != 0) {
            str = closetAsset.assetBundleName;
        }
        if ((i11 & 4) != 0) {
            str2 = closetAsset.assetBundlePrefabName;
        }
        if ((i11 & 8) != 0) {
            gameEffect = closetAsset.gameEffect;
        }
        return closetAsset.copy(i10, str, str2, gameEffect);
    }

    public final int component1() {
        return this.f21644id;
    }

    public final String component2() {
        return this.assetBundleName;
    }

    public final String component3() {
        return this.assetBundlePrefabName;
    }

    public final GameEffect component4() {
        return this.gameEffect;
    }

    public final ClosetAsset copy(int i10, String str, String str2, GameEffect gameEffect) {
        p.h(str, "assetBundleName");
        p.h(str2, "assetBundlePrefabName");
        return new ClosetAsset(i10, str, str2, gameEffect);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClosetAsset) {
            ClosetAsset closetAsset = (ClosetAsset) obj;
            return this.f21644id == closetAsset.f21644id && p.c(this.assetBundleName, closetAsset.assetBundleName) && p.c(this.assetBundlePrefabName, closetAsset.assetBundlePrefabName) && p.c(this.gameEffect, closetAsset.gameEffect);
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
        return this.assetBundleName + ',' + this.assetBundlePrefabName;
    }

    public final GameEffect getGameEffect() {
        return this.gameEffect;
    }

    public final int getId() {
        return this.f21644id;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f21644id) * 31) + this.assetBundleName.hashCode()) * 31) + this.assetBundlePrefabName.hashCode()) * 31;
        GameEffect gameEffect = this.gameEffect;
        return hashCode + (gameEffect == null ? 0 : gameEffect.hashCode());
    }

    public final void setAssetBundleName(String str) {
        p.h(str, "<set-?>");
        this.assetBundleName = str;
    }

    public final void setAssetBundlePrefabName(String str) {
        p.h(str, "<set-?>");
        this.assetBundlePrefabName = str;
    }

    public final void setId(int i10) {
        this.f21644id = i10;
    }

    public String toString() {
        return "ClosetAsset(id=" + this.f21644id + ", assetBundleName=" + this.assetBundleName + ", assetBundlePrefabName=" + this.assetBundlePrefabName + ", gameEffect=" + this.gameEffect + ')';
    }
}
