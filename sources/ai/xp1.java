package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class xp1 implements rn3<up1> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Executor> f12056a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<yj0> f12057b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<vq2> f12058c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<xq2> f12059d;

    public xp1(eo3<Executor> eo3Var, eo3<yj0> eo3Var2, eo3<vq2> eo3Var3, eo3<xq2> eo3Var4) {
        this.f12056a = eo3Var;
        this.f12057b = eo3Var2;
        this.f12058c = eo3Var3;
        this.f12059d = eo3Var4;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new up1(t43Var, this.f12057b.zzb(), ((wq2) this.f12058c).zzb(), new xq2());
    }
}
