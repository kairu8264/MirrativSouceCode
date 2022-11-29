package ak;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class s3 implements dk.f0<r3> {

    /* renamed from: a  reason: collision with root package name */
    public final dk.f0<o0> f13642a;

    /* renamed from: b  reason: collision with root package name */
    public final dk.f0<u4> f13643b;

    /* renamed from: c  reason: collision with root package name */
    public final dk.f0<k2> f13644c;

    /* renamed from: d  reason: collision with root package name */
    public final dk.f0<Executor> f13645d;

    /* renamed from: e  reason: collision with root package name */
    public final dk.f0<t1> f13646e;

    public s3(dk.f0<o0> f0Var, dk.f0<u4> f0Var2, dk.f0<k2> f0Var3, dk.f0<Executor> f0Var4, dk.f0<t1> f0Var5) {
        this.f13642a = f0Var;
        this.f13643b = f0Var2;
        this.f13644c = f0Var3;
        this.f13645d = f0Var4;
        this.f13646e = f0Var5;
    }

    @Override // dk.f0
    public final /* bridge */ /* synthetic */ r3 zza() {
        o0 zza = this.f13642a.zza();
        return new r3(zza, dk.d0.a(this.f13643b), this.f13644c.zza(), dk.d0.a(this.f13645d), this.f13646e.zza());
    }
}
