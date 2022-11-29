package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class t21 implements rn3<wg.b> {

    /* renamed from: a  reason: collision with root package name */
    public final s21 f10075a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Context> f10076b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<wg0> f10077c;

    public t21(s21 s21Var, eo3<Context> eo3Var, eo3<wg0> eo3Var2) {
        this.f10075a = s21Var;
        this.f10076b = eo3Var;
        this.f10077c = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new wg.b(this.f10076b.zzb(), this.f10077c.zzb(), null);
    }
}
