package ph;

import android.app.Dialog;

/* loaded from: classes3.dex */
public final class e1 extends h0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Dialog f47484a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ f1 f47485b;

    public e1(f1 f1Var, Dialog dialog) {
        this.f47485b = f1Var;
        this.f47484a = dialog;
    }

    @Override // ph.h0
    public final void a() {
        this.f47485b.f47494x.o();
        if (this.f47484a.isShowing()) {
            this.f47484a.dismiss();
        }
    }
}
