package com.dena.mirrativ.mirrativapi.otherfeatures.coin;

import com.dena.mirrativ.mirrativapi.core.Status;
import java.util.List;
import jo.p;
import xn.s;
import ym.c;

/* loaded from: classes2.dex */
public final class Coin {

    /* loaded from: classes2.dex */
    public final class CoinProduct {
        private int coin;
        private int freeCoin;

        public CoinProduct() {
        }

        public final int getCoin() {
            return this.coin;
        }

        public final int getFreeCoin() {
            return this.freeCoin;
        }

        public final void setCoin(int i10) {
            this.coin = i10;
        }

        public final void setFreeCoin(int i10) {
            this.freeCoin = i10;
        }
    }

    /* loaded from: classes2.dex */
    public static final class CoinProducts {
        private int freeCoin;
        private int isMaintenance;
        private int paidCoin;
        private Status status = Status.Companion.createEmptyStatus();
        private List<CoinProduct> products = s.k();

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

        public final int isMaintenance() {
            return this.isMaintenance;
        }

        public final void setFreeCoin(int i10) {
            this.freeCoin = i10;
        }

        public final void setMaintenance(int i10) {
            this.isMaintenance = i10;
        }

        public final void setPaidCoin(int i10) {
            this.paidCoin = i10;
        }

        public final void setProducts(List<CoinProduct> list) {
            p.h(list, "<set-?>");
            this.products = list;
        }

        public final void setStatus(Status status) {
            p.h(status, "<set-?>");
            this.status = status;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Purchase {
        @c("purchase_status")
        private int purchaseStatus;
        private Status status = Status.Companion.createEmptyStatus();
        @c("order_id")
        private String OrderId = "";

        public final String getOrderId() {
            return this.OrderId;
        }

        public final int getPurchaseStatus() {
            return this.purchaseStatus;
        }

        public final Status getStatus() {
            return this.status;
        }

        public final void setOrderId(String str) {
            p.h(str, "<set-?>");
            this.OrderId = str;
        }

        public final void setPurchaseStatus(int i10) {
            this.purchaseStatus = i10;
        }

        public final void setStatus(Status status) {
            p.h(status, "<set-?>");
            this.status = status;
        }
    }
}
