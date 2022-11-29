package yg;

import ai.bv;
import ai.sr;
import android.content.Context;

/* loaded from: classes3.dex */
public final class x extends bv {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Context f61994w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ a0 f61995x;

    public x(a0 a0Var, Context context) {
        this.f61995x = a0Var;
        this.f61994w = context;
    }

    @Override // ai.cv
    public final void x0(sr srVar) {
        if (srVar == null) {
            return;
        }
        this.f61995x.n(this.f61994w, srVar.f9917x, true, true);
    }
}
