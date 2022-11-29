package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class fh1 implements rn3<hh0> {

    /* renamed from: a  reason: collision with root package name */
    public final ah1 f4036a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Context> f4037b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<yl2> f4038c;

    public fh1(ah1 ah1Var, eo3<Context> eo3Var, eo3<yl2> eo3Var2) {
        this.f4036a = ah1Var;
        this.f4037b = eo3Var;
        this.f4038c = eo3Var2;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final hh0 zzb() {
        return new hh0(((cn2) this.f4037b).a(), ((l41) this.f4038c).a().f12652f);
    }
}
