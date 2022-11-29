package com.dena.mirrativ.mirrativapi.closet;

import java.io.Serializable;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class ClosetAvatarCompanion implements Serializable {
    private final List<ClosetBuyableAccessoryAsset> hats;
    private final List<ClosetBuyableAccessoryAsset> scarfs;
    private final List<ClosetBuyableAccessoryAsset> tops;
    private final List<ClosetBuyableAccessoryAsset> types;

    public ClosetAvatarCompanion(List<ClosetBuyableAccessoryAsset> list, List<ClosetBuyableAccessoryAsset> list2, List<ClosetBuyableAccessoryAsset> list3, List<ClosetBuyableAccessoryAsset> list4) {
        p.h(list, "types");
        p.h(list2, "tops");
        p.h(list3, "hats");
        p.h(list4, "scarfs");
        this.types = list;
        this.tops = list2;
        this.hats = list3;
        this.scarfs = list4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ClosetAvatarCompanion copy$default(ClosetAvatarCompanion closetAvatarCompanion, List list, List list2, List list3, List list4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = closetAvatarCompanion.types;
        }
        if ((i10 & 2) != 0) {
            list2 = closetAvatarCompanion.tops;
        }
        if ((i10 & 4) != 0) {
            list3 = closetAvatarCompanion.hats;
        }
        if ((i10 & 8) != 0) {
            list4 = closetAvatarCompanion.scarfs;
        }
        return closetAvatarCompanion.copy(list, list2, list3, list4);
    }

    public final List<ClosetBuyableAccessoryAsset> component1() {
        return this.types;
    }

    public final List<ClosetBuyableAccessoryAsset> component2() {
        return this.tops;
    }

    public final List<ClosetBuyableAccessoryAsset> component3() {
        return this.hats;
    }

    public final List<ClosetBuyableAccessoryAsset> component4() {
        return this.scarfs;
    }

    public final ClosetAvatarCompanion copy(List<ClosetBuyableAccessoryAsset> list, List<ClosetBuyableAccessoryAsset> list2, List<ClosetBuyableAccessoryAsset> list3, List<ClosetBuyableAccessoryAsset> list4) {
        p.h(list, "types");
        p.h(list2, "tops");
        p.h(list3, "hats");
        p.h(list4, "scarfs");
        return new ClosetAvatarCompanion(list, list2, list3, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClosetAvatarCompanion) {
            ClosetAvatarCompanion closetAvatarCompanion = (ClosetAvatarCompanion) obj;
            return p.c(this.types, closetAvatarCompanion.types) && p.c(this.tops, closetAvatarCompanion.tops) && p.c(this.hats, closetAvatarCompanion.hats) && p.c(this.scarfs, closetAvatarCompanion.scarfs);
        }
        return false;
    }

    public final List<ClosetBuyableAccessoryAsset> getHats() {
        return this.hats;
    }

    public final List<ClosetBuyableAccessoryAsset> getScarfs() {
        return this.scarfs;
    }

    public final List<ClosetBuyableAccessoryAsset> getTops() {
        return this.tops;
    }

    public final List<ClosetBuyableAccessoryAsset> getTypes() {
        return this.types;
    }

    public int hashCode() {
        return (((((this.types.hashCode() * 31) + this.tops.hashCode()) * 31) + this.hats.hashCode()) * 31) + this.scarfs.hashCode();
    }

    public String toString() {
        return "ClosetAvatarCompanion(types=" + this.types + ", tops=" + this.tops + ", hats=" + this.hats + ", scarfs=" + this.scarfs + ')';
    }
}
