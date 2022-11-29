package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class d02 implements rn3<c02> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f3091a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<rz0> f3092b;

    public d02(eo3<Context> eo3Var, eo3<rz0> eo3Var2) {
        this.f3091a = eo3Var;
        this.f3092b = eo3Var2;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final c02 zzb() {
        return new c02(this.f3091a.zzb(), this.f3092b.zzb());
    }
}
