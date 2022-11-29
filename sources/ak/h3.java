package ak;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class h3 implements dk.f0<f3> {

    /* renamed from: a  reason: collision with root package name */
    public final dk.f0<o0> f13387a;

    /* renamed from: b  reason: collision with root package name */
    public final dk.f0<u4> f13388b;

    /* renamed from: c  reason: collision with root package name */
    public final dk.f0<k2> f13389c;

    /* renamed from: d  reason: collision with root package name */
    public final dk.f0<Executor> f13390d;

    /* renamed from: e  reason: collision with root package name */
    public final dk.f0<t1> f13391e;

    /* renamed from: f  reason: collision with root package name */
    public final dk.f0<ck.b> f13392f;

    /* renamed from: g  reason: collision with root package name */
    public final dk.f0<i3> f13393g;

    public h3(dk.f0<o0> f0Var, dk.f0<u4> f0Var2, dk.f0<k2> f0Var3, dk.f0<Executor> f0Var4, dk.f0<t1> f0Var5, dk.f0<ck.b> f0Var6, dk.f0<i3> f0Var7) {
        this.f13387a = f0Var;
        this.f13388b = f0Var2;
        this.f13389c = f0Var3;
        this.f13390d = f0Var4;
        this.f13391e = f0Var5;
        this.f13392f = f0Var6;
        this.f13393g = f0Var7;
    }

    @Override // dk.f0
    public final /* bridge */ /* synthetic */ f3 zza() {
        o0 zza = this.f13387a.zza();
        dk.b0 a10 = dk.d0.a(this.f13388b);
        k2 zza2 = this.f13389c.zza();
        return new f3(zza, a10, zza2, dk.d0.a(this.f13390d), this.f13391e.zza(), this.f13392f.zza(), this.f13393g.zza());
    }
}
