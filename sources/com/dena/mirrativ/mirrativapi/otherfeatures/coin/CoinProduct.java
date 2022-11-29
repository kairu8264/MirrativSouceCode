package com.dena.mirrativ.mirrativapi.otherfeatures.coin;

import com.dena.mirrativ.mirrativapi.core.BooleanTypeAdapter;
import jo.p;
import ym.b;

/* loaded from: classes2.dex */
public final class CoinProduct {
    private String androidProductIdentifier;
    private final int coin;
    private final int freeCoin;
    @b(BooleanTypeAdapter.class)
    private final boolean isSpecial;
    private final int productId;
    private final String specialRibbonUrl;

    public CoinProduct(int i10, String str, int i11, int i12, boolean z10, String str2) {
        p.h(str, "androidProductIdentifier");
        p.h(str2, "specialRibbonUrl");
        this.productId = i10;
        this.androidProductIdentifier = str;
        this.coin = i11;
        this.freeCoin = i12;
        this.isSpecial = z10;
        this.specialRibbonUrl = str2;
    }

    public static /* synthetic */ CoinProduct copy$default(CoinProduct coinProduct, int i10, String str, int i11, int i12, boolean z10, String str2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = coinProduct.productId;
        }
        if ((i13 & 2) != 0) {
            str = coinProduct.androidProductIdentifier;
        }
        String str3 = str;
        if ((i13 & 4) != 0) {
            i11 = coinProduct.coin;
        }
        int i14 = i11;
        if ((i13 & 8) != 0) {
            i12 = coinProduct.freeCoin;
        }
        int i15 = i12;
        if ((i13 & 16) != 0) {
            z10 = coinProduct.isSpecial;
        }
        boolean z11 = z10;
        if ((i13 & 32) != 0) {
            str2 = coinProduct.specialRibbonUrl;
        }
        return coinProduct.copy(i10, str3, i14, i15, z11, str2);
    }

    public final int component1() {
        return this.productId;
    }

    public final String component2() {
        return this.androidProductIdentifier;
    }

    public final int component3() {
        return this.coin;
    }

    public final int component4() {
        return this.freeCoin;
    }

    public final boolean component5() {
        return this.isSpecial;
    }

    public final String component6() {
        return this.specialRibbonUrl;
    }

    public final CoinProduct copy(int i10, String str, int i11, int i12, boolean z10, String str2) {
        p.h(str, "androidProductIdentifier");
        p.h(str2, "specialRibbonUrl");
        return new CoinProduct(i10, str, i11, i12, z10, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CoinProduct) {
            CoinProduct coinProduct = (CoinProduct) obj;
            return this.productId == coinProduct.productId && p.c(this.androidProductIdentifier, coinProduct.androidProductIdentifier) && this.coin == coinProduct.coin && this.freeCoin == coinProduct.freeCoin && this.isSpecial == coinProduct.isSpecial && p.c(this.specialRibbonUrl, coinProduct.specialRibbonUrl);
        }
        return false;
    }

    public final String getAndroidProductIdentifier() {
        return this.androidProductIdentifier;
    }

    public final int getCoin() {
        return this.coin;
    }

    public final int getFreeCoin() {
        return this.freeCoin;
    }

    public final int getProductId() {
        return this.productId;
    }

    public final String getSpecialRibbonUrl() {
        return this.specialRibbonUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((Integer.hashCode(this.productId) * 31) + this.androidProductIdentifier.hashCode()) * 31) + Integer.hashCode(this.coin)) * 31) + Integer.hashCode(this.freeCoin)) * 31;
        boolean z10 = this.isSpecial;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return ((hashCode + i10) * 31) + this.specialRibbonUrl.hashCode();
    }

    public final boolean isSpecial() {
        return this.isSpecial;
    }

    public final void setAndroidProductIdentifier(String str) {
        p.h(str, "<set-?>");
        this.androidProductIdentifier = str;
    }

    public String toString() {
        return "CoinProduct(productId=" + this.productId + ", androidProductIdentifier=" + this.androidProductIdentifier + ", coin=" + this.coin + ", freeCoin=" + this.freeCoin + ", isSpecial=" + this.isSpecial + ", specialRibbonUrl=" + this.specialRibbonUrl + ')';
    }
}
