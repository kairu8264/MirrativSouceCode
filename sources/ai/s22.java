package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class s22 implements rn3<r22> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f9683a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<hm1> f9684b;

    public s22(eo3<Context> eo3Var, eo3<hm1> eo3Var2) {
        this.f9683a = eo3Var;
        this.f9684b = eo3Var2;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final r22 zzb() {
        return new r22(this.f9683a.zzb(), this.f9684b.zzb());
    }
}
