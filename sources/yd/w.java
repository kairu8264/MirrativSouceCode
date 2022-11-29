package yd;

import com.dena.mirrorman.customview.GiftGachaView;

/* loaded from: classes2.dex */
public final class w extends jo.q implements io.l<ud.m0, wn.v> {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ GiftGachaView f61804w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(GiftGachaView giftGachaView) {
        super(1);
        this.f61804w = giftGachaView;
    }

    public final void a(ud.m0 m0Var) {
        jo.p.h(m0Var, "it");
        io.l<ud.m0, wn.v> onClickGiftGachaStock = this.f61804w.getOnClickGiftGachaStock();
        if (onClickGiftGachaStock != null) {
            onClickGiftGachaStock.invoke(m0Var);
        }
    }

    @Override // io.l
    public /* bridge */ /* synthetic */ wn.v invoke(ud.m0 m0Var) {
        a(m0Var);
        return wn.v.f59242a;
    }
}
