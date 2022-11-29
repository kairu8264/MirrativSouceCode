package ai;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class kk1 implements rn3<ik1> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Executor> f6253a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<lx0> f6254b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<ic1> f6255c;

    public kk1(eo3<Executor> eo3Var, eo3<lx0> eo3Var2, eo3<ic1> eo3Var3) {
        this.f6253a = eo3Var;
        this.f6254b = eo3Var2;
        this.f6255c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new ik1(this.f6253a.zzb(), this.f6254b.zzb(), this.f6255c.zzb());
    }
}
