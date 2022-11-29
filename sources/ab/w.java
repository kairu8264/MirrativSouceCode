package ab;

import com.android.billingclient.api.SkuDetails;
import com.dena.mirrativ.mirrativapi.otherfeatures.coin.CoinProduct;

/* loaded from: classes2.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public final SkuDetails f849a;

    /* renamed from: b  reason: collision with root package name */
    public final CoinProduct f850b;

    public w(SkuDetails skuDetails, CoinProduct coinProduct) {
        jo.p.h(skuDetails, "skuDetails");
        jo.p.h(coinProduct, "coinProduct");
        this.f849a = skuDetails;
        this.f850b = coinProduct;
    }

    public final CoinProduct a() {
        return this.f850b;
    }

    public final SkuDetails b() {
        return this.f849a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            return jo.p.c(this.f849a, wVar.f849a) && jo.p.c(this.f850b, wVar.f850b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f849a.hashCode() * 31) + this.f850b.hashCode();
    }

    public String toString() {
        return "SkuDetailsWithCoinProduct(skuDetails=" + this.f849a + ", coinProduct=" + this.f850b + ')';
    }
}
