package com.dena.mirrativ.mirrativapi.closet;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import java.io.Serializable;
import jo.h;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class ClosetAccessoryAsset implements Serializable {
    @b(BooleanTypeAdapter.class)
    private final Boolean addPartTextEnabled;
    private final String assetBundleName;
    private final String assetBundlePrefabName;
    private final GameEffect gameEffect;
    private final String helpImageUrl;

    /* renamed from: id  reason: collision with root package name */
    private final int f21643id;
    private final String name;
    private String partText;
    private final String position;

    public ClosetAccessoryAsset(int i10, String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, GameEffect gameEffect) {
        p.h(str3, "assetBundleName");
        p.h(str4, "assetBundlePrefabName");
        this.f21643id = i10;
        this.partText = str;
        this.addPartTextEnabled = bool;
        this.helpImageUrl = str2;
        this.assetBundleName = str3;
        this.assetBundlePrefabName = str4;
        this.position = str5;
        this.name = str6;
        this.gameEffect = gameEffect;
    }

    public final int component1() {
        return this.f21643id;
    }

    public final String component2() {
        return this.partText;
    }

    public final Boolean component3() {
        return this.addPartTextEnabled;
    }

    public final String component4() {
        return this.helpImageUrl;
    }

    public final String component5() {
        return this.assetBundleName;
    }

    public final String component6() {
        return this.assetBundlePrefabName;
    }

    public final String component7() {
        return this.position;
    }

    public final String component8() {
        return this.name;
    }

    public final GameEffect component9() {
        return this.gameEffect;
    }

    public final ClosetAccessoryAsset copy(int i10, String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, GameEffect gameEffect) {
        p.h(str3, "assetBundleName");
        p.h(str4, "assetBundlePrefabName");
        return new ClosetAccessoryAsset(i10, str, bool, str2, str3, str4, str5, str6, gameEffect);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClosetAccessoryAsset) {
            ClosetAccessoryAsset closetAccessoryAsset = (ClosetAccessoryAsset) obj;
            return this.f21643id == closetAccessoryAsset.f21643id && p.c(this.partText, closetAccessoryAsset.partText) && p.c(this.addPartTextEnabled, closetAccessoryAsset.addPartTextEnabled) && p.c(this.helpImageUrl, closetAccessoryAsset.helpImageUrl) && p.c(this.assetBundleName, closetAccessoryAsset.assetBundleName) && p.c(this.assetBundlePrefabName, closetAccessoryAsset.assetBundlePrefabName) && p.c(this.position, closetAccessoryAsset.position) && p.c(this.name, closetAccessoryAsset.name) && p.c(this.gameEffect, closetAccessoryAsset.gameEffect);
        }
        return false;
    }

    public final Boolean getAddPartTextEnabled() {
        return this.addPartTextEnabled;
    }

    public final String getAssetBundleName() {
        return this.assetBundleName;
    }

    public final String getAssetBundlePrefabName() {
        return this.assetBundlePrefabName;
    }

    public final String getAssetBundleString() {
        return this.assetBundleName + ',' + this.assetBundlePrefabName + ',' + this.position;
    }

    public final GameEffect getGameEffect() {
        return this.gameEffect;
    }

    public final String getHelpImageUrl() {
        return this.helpImageUrl;
    }

    public final int getId() {
        return this.f21643id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPartText() {
        return this.partText;
    }

    public final String getPosition() {
        return this.position;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.f21643id) * 31;
        String str = this.partText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.addPartTextEnabled;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.helpImageUrl;
        int hashCode4 = (((((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.assetBundleName.hashCode()) * 31) + this.assetBundlePrefabName.hashCode()) * 31;
        String str3 = this.position;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        GameEffect gameEffect = this.gameEffect;
        return hashCode6 + (gameEffect != null ? gameEffect.hashCode() : 0);
    }

    public final void setPartText(String str) {
        this.partText = str;
    }

    public String toString() {
        return "ClosetAccessoryAsset(id=" + this.f21643id + ", partText=" + this.partText + ", addPartTextEnabled=" + this.addPartTextEnabled + ", helpImageUrl=" + this.helpImageUrl + ", assetBundleName=" + this.assetBundleName + ", assetBundlePrefabName=" + this.assetBundlePrefabName + ", position=" + this.position + ", name=" + this.name + ", gameEffect=" + this.gameEffect + ')';
    }

    public /* synthetic */ ClosetAccessoryAsset(int i10, String str, Boolean bool, String str2, String str3, String str4, String str5, String str6, GameEffect gameEffect, int i11, h hVar) {
        this(i10, str, bool, str2, str3, str4, str5, (i11 & 128) != 0 ? null : str6, (i11 & 256) != 0 ? null : gameEffect);
    }
}
