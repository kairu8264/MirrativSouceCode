package com.dena.mirrativ.mirrativapi.otherfeatures.coin;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.p;

/* loaded from: classes2.dex */
public final class GetCoinProductsResponse {
    private final int freeCoin;
    private final int paidCoin;
    private final List<CoinProduct> products;
    private final Status status;

    public GetCoinProductsResponse(Status status, int i10, int i11, List<CoinProduct> list) {
        p.h(status, "status");
        p.h(list, "products");
        this.status = status;
        this.paidCoin = i10;
        this.freeCoin = i11;
        this.products = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetCoinProductsResponse copy$default(GetCoinProductsResponse getCoinProductsResponse, Status status, int i10, int i11, List list, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            status = getCoinProductsResponse.status;
        }
        if ((i12 & 2) != 0) {
            i10 = getCoinProductsResponse.paidCoin;
        }
        if ((i12 & 4) != 0) {
            i11 = getCoinProductsResponse.freeCoin;
        }
        if ((i12 & 8) != 0) {
            list = getCoinProductsResponse.products;
        }
        return getCoinProductsResponse.copy(status, i10, i11, list);
    }

    public final Status component1() {
        return this.status;
    }

    public final int component2() {
        return this.paidCoin;
    }

    public final int component3() {
        return this.freeCoin;
    }

    public final List<CoinProduct> component4() {
        return this.products;
    }

    public final GetCoinProductsResponse copy(Status status, int i10, int i11, List<CoinProduct> list) {
        p.h(status, "status");
        p.h(list, "products");
        return new GetCoinProductsResponse(status, i10, i11, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GetCoinProductsResponse) {
            GetCoinProductsResponse getCoinProductsResponse = (GetCoinProductsResponse) obj;
            return p.c(this.status, getCoinProductsResponse.status) && this.paidCoin == getCoinProductsResponse.paidCoin && this.freeCoin == getCoinProductsResponse.freeCoin && p.c(this.products, getCoinProductsResponse.products);
        }
        return false;
    }

    public final int getFreeCoin() {
        return this.freeCoin;
    }

    public final int getPaidCoin() {
        return this.paidCoin;
    }

    public final List<CoinProduct> getProducts() {
        return this.products;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        return (((((this.status.hashCode() * 31) + Integer.hashCode(this.paidCoin)) * 31) + Integer.hashCode(this.freeCoin)) * 31) + this.products.hashCode();
    }

    public String toString() {
        return "GetCoinProductsResponse(status=" + this.status + ", paidCoin=" + this.paidCoin + ", freeCoin=" + this.freeCoin + ", products=" + this.products + ')';
    }
}
