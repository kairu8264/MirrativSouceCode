package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class wq2 implements rn3<vq2> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f11719a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<zj0> f11720b;

    public wq2(eo3<Context> eo3Var, eo3<zj0> eo3Var2) {
        this.f11719a = eo3Var;
        this.f11720b = eo3Var2;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final vq2 zzb() {
        return new vq2(((tr0) this.f11719a).a(), ((cs0) this.f11720b).a());
    }
}
