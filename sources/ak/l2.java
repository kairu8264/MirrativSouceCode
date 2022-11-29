package ak;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class l2 implements dk.f0<k2> {

    /* renamed from: a  reason: collision with root package name */
    public final dk.f0<o0> f13521a;

    /* renamed from: b  reason: collision with root package name */
    public final dk.f0<u4> f13522b;

    /* renamed from: c  reason: collision with root package name */
    public final dk.f0<t1> f13523c;

    /* renamed from: d  reason: collision with root package name */
    public final dk.f0<Executor> f13524d;

    public l2(dk.f0<o0> f0Var, dk.f0<u4> f0Var2, dk.f0<t1> f0Var3, dk.f0<Executor> f0Var4) {
        this.f13521a = f0Var;
        this.f13522b = f0Var2;
        this.f13523c = f0Var3;
        this.f13524d = f0Var4;
    }

    @Override // dk.f0
    public final /* bridge */ /* synthetic */ k2 zza() {
        o0 zza = this.f13521a.zza();
        return new k2(zza, dk.d0.a(this.f13522b), this.f13523c.zza(), dk.d0.a(this.f13524d));
    }
}
