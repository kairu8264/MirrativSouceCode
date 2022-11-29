package com.dena.mirrativ.mirrativapi.closet;

import java.io.Serializable;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class ClosetSetupClotheAsset implements Serializable {
    private String assetBundleName;
    private String assetBundlePrefabName;
    private List<String> excludeParts;
    private final GameEffect gameEffect;

    /* renamed from: id  reason: collision with root package name */
    private int f21654id;

    public ClosetSetupClotheAsset(int i10, String str, String str2, List<String> list, GameEffect gameEffect) {
        p.h(str, "assetBundleName");
        p.h(str2, "assetBundlePrefabName");
        p.h(list, "excludeParts");
        this.f21654id = i10;
        this.assetBundleName = str;
        this.assetBundlePrefabName = str2;
        this.excludeParts = list;
        this.gameEffect = gameEffect;
    }

    public static /* synthetic */ ClosetSetupClotheAsset copy$default(ClosetSetupClotheAsset closetSetupClotheAsset, int i10, String str, String str2, List list, GameEffect gameEffect, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = closetSetupClotheAsset.f21654id;
        }
        if ((i11 & 2) != 0) {
            str = closetSetupClotheAsset.assetBundleName;
        }
        String str3 = str;
        if ((i11 & 4) != 0) {
            str2 = closetSetupClotheAsset.assetBundlePrefabName;
        }
        String str4 = str2;
        List<String> list2 = list;
        if ((i11 & 8) != 0) {
            list2 = closetSetupClotheAsset.excludeParts;
        }
        List list3 = list2;
        if ((i11 & 16) != 0) {
            gameEffect = closetSetupClotheAsset.gameEffect;
        }
        return closetSetupClotheAsset.copy(i10, str3, str4, list3, gameEffect);
    }

    public final int component1() {
        return this.f21654id;
    }

    public final String component2() {
        return this.assetBundleName;
    }

    public final String component3() {
        return this.assetBundlePrefabName;
    }

    public final List<String> component4() {
        return this.excludeParts;
    }

    public final GameEffect component5() {
        return this.gameEffect;
    }

    public final ClosetSetupClotheAsset copy(int i10, String str, String str2, List<String> list, GameEffect gameEffect) {
        p.h(str, "assetBundleName");
        p.h(str2, "assetBundlePrefabName");
        p.h(list, "excludeParts");
        return new ClosetSetupClotheAsset(i10, str, str2, list, gameEffect);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClosetSetupClotheAsset) {
            ClosetSetupClotheAsset closetSetupClotheAsset = (ClosetSetupClotheAsset) obj;
            return this.f21654id == closetSetupClotheAsset.f21654id && p.c(this.assetBundleName, closetSetupClotheAsset.assetBundleName) && p.c(this.assetBundlePrefabName, closetSetupClotheAsset.assetBundlePrefabName) && p.c(this.excludeParts, closetSetupClotheAsset.excludeParts) && p.c(this.gameEffect, closetSetupClotheAsset.gameEffect);
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

    public final List<String> getExcludeParts() {
        return this.excludeParts;
    }

    public final GameEffect getGameEffect() {
        return this.gameEffect;
    }

    public final int getId() {
        return this.f21654id;
    }

    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.f21654id) * 31) + this.assetBundleName.hashCode()) * 31) + this.assetBundlePrefabName.hashCode()) * 31) + this.excludeParts.hashCode()) * 31;
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

    public final void setExcludeParts(List<String> list) {
        p.h(list, "<set-?>");
        this.excludeParts = list;
    }

    public final void setId(int i10) {
        this.f21654id = i10;
    }

    public String toString() {
        return "ClosetSetupClotheAsset(id=" + this.f21654id + ", assetBundleName=" + this.assetBundleName + ", assetBundlePrefabName=" + this.assetBundlePrefabName + ", excludeParts=" + this.excludeParts + ", gameEffect=" + this.gameEffect + ')';
    }
}
