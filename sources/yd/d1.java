package yd;

import com.dena.mirrorman.customview.RibbonRemainingLabelView;

/* loaded from: classes2.dex */
public final class d1 extends tj.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RibbonRemainingLabelView f61719a;

    public d1(RibbonRemainingLabelView ribbonRemainingLabelView) {
        this.f61719a = ribbonRemainingLabelView;
    }

    @Override // tj.f
    public void c(float f10, float f11, float f12, tj.m mVar) {
        jo.p.h(mVar, "shapePath");
        float f13 = 2;
        float a10 = (f10 / f13) - (de.n.a(this.f61719a, 8.0f) / f13);
        mVar.m(a10, 0.0f);
        mVar.m(de.n.a(this.f61719a, 4.0f) + a10, -de.n.a(this.f61719a, 4.0f));
        mVar.m(a10 + de.n.a(this.f61719a, 8.0f), 0.0f);
        mVar.m(f10, 0.0f);
    }
}
