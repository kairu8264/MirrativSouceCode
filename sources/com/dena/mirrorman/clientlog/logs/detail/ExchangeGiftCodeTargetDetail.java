package com.dena.mirrorman.clientlog.logs.detail;

import jo.p;
import xm.e;
import ym.c;

/* loaded from: classes2.dex */
public final class ExchangeGiftCodeTargetDetail {
    public static final int $stable = 0;
    @c("code_type")
    private final String codeType;
    @c("exchange_orb")
    private final int exchangeOrb;

    public ExchangeGiftCodeTargetDetail(String str, int i10) {
        p.h(str, "codeType");
        this.codeType = str;
        this.exchangeOrb = i10;
    }

    public final String getCodeType() {
        return this.codeType;
    }

    public final int getExchangeOrb() {
        return this.exchangeOrb;
    }

    public final String toJson() {
        String s10 = new e().s(this);
        p.g(s10, "Gson().toJson(this)");
        return s10;
    }
}
