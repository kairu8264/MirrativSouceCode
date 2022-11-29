package ai;

import android.content.Context;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class uu1 implements r71 {

    /* renamed from: w  reason: collision with root package name */
    public final Context f10845w;

    /* renamed from: x  reason: collision with root package name */
    public final ai0 f10846x;

    public uu1(Context context, ai0 ai0Var) {
        this.f10845w = context;
        this.f10846x = ai0Var;
    }

    @Override // ai.r71
    public final void s(ie0 ie0Var) {
    }

    @Override // ai.r71
    public final void u(sl2 sl2Var) {
        if (TextUtils.isEmpty(sl2Var.f9876b.f9497b.f6279d)) {
            return;
        }
        this.f10846x.i(this.f10845w, sl2Var.f9875a.f8473a.f12650d);
        this.f10846x.u(this.f10845w, sl2Var.f9876b.f9497b.f6279d);
    }
}
