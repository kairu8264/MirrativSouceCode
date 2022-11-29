package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class vd1 implements rn3<hh0> {

    /* renamed from: a  reason: collision with root package name */
    public final md1 f11031a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Context> f11032b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<yl2> f11033c;

    public vd1(md1 md1Var, eo3<Context> eo3Var, eo3<yl2> eo3Var2) {
        this.f11031a = md1Var;
        this.f11032b = eo3Var;
        this.f11033c = eo3Var2;
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final hh0 zzb() {
        return new hh0(((cn2) this.f11032b).a(), ((l41) this.f11033c).a().f12652f);
    }
}
