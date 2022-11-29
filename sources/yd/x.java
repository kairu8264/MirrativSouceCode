package yd;

import com.dena.mirrorman.customview.GiftGachaView;

/* loaded from: classes2.dex */
public final class x extends jo.q implements io.l<ud.o0, wn.v> {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ GiftGachaView f61806w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(GiftGachaView giftGachaView) {
        super(1);
        this.f61806w = giftGachaView;
    }

    public final void a(ud.o0 o0Var) {
        jo.p.h(o0Var, "it");
        io.l<ud.o0, wn.v> onClickGiftGachaMutualGift = this.f61806w.getOnClickGiftGachaMutualGift();
        if (onClickGiftGachaMutualGift != null) {
            onClickGiftGachaMutualGift.invoke(o0Var);
        }
    }

    @Override // io.l
    public /* bridge */ /* synthetic */ wn.v invoke(ud.o0 o0Var) {
        a(o0Var);
        return wn.v.f59242a;
    }
}
