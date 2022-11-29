package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class e12 implements rn3<d12> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f3498a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<ge1> f3499b;

    public e12(eo3<Context> eo3Var, eo3<ge1> eo3Var2) {
        this.f3498a = eo3Var;
        this.f3499b = eo3Var2;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final d12 zzb() {
        return new d12(this.f3498a.zzb(), this.f3499b.zzb());
    }
}
