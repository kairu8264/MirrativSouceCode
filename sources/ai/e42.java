package ai;

import android.view.View;

/* loaded from: classes3.dex */
public final class e42 implements wg.f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ mk0 f3530a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ sl2 f3531b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ fl2 f3532c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ k42 f3533d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ f42 f3534e;

    public e42(f42 f42Var, mk0 mk0Var, sl2 sl2Var, fl2 fl2Var, k42 k42Var) {
        this.f3534e = f42Var;
        this.f3530a = mk0Var;
        this.f3531b = sl2Var;
        this.f3532c = fl2Var;
        this.f3533d = k42Var;
    }

    @Override // wg.f
    public final void a(View view) {
        o42 o42Var;
        mk0 mk0Var = this.f3530a;
        o42Var = this.f3534e.f3943d;
        mk0Var.d(o42Var.a(this.f3531b, this.f3532c, view, this.f3533d));
    }

    @Override // wg.f
    public final void b() {
    }

    @Override // wg.f
    public final void zzb() {
    }
}
