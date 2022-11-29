package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class p42 implements rn3<o42> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f8297a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<ge1> f8298b;

    public p42(eo3<Context> eo3Var, eo3<ge1> eo3Var2) {
        this.f8297a = eo3Var;
        this.f8298b = eo3Var2;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final o42 zzb() {
        return new o42(this.f8297a.zzb(), this.f8298b.zzb());
    }
}
