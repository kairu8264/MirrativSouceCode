package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zi1 implements rn3<yi1> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<yg.s0> f13006a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<vh.f> f13007b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<Executor> f13008c;

    public zi1(eo3<yg.s0> eo3Var, eo3<vh.f> eo3Var2, eo3<Executor> eo3Var3) {
        this.f13006a = eo3Var;
        this.f13007b = eo3Var2;
        this.f13008c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new yi1(this.f13006a.zzb(), this.f13007b.zzb(), t43Var);
    }
}
