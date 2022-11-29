package ak;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class j0 implements dk.f0<i0> {

    /* renamed from: a  reason: collision with root package name */
    public final dk.f0<Context> f13468a;

    /* renamed from: b  reason: collision with root package name */
    public final dk.f0<k2> f13469b;

    /* renamed from: c  reason: collision with root package name */
    public final dk.f0<q1> f13470c;

    /* renamed from: d  reason: collision with root package name */
    public final dk.f0<u4> f13471d;

    /* renamed from: e  reason: collision with root package name */
    public final dk.f0<t1> f13472e;

    /* renamed from: f  reason: collision with root package name */
    public final dk.f0<b1> f13473f;

    /* renamed from: g  reason: collision with root package name */
    public final dk.f0<Executor> f13474g;

    /* renamed from: h  reason: collision with root package name */
    public final dk.f0<Executor> f13475h;

    /* renamed from: i  reason: collision with root package name */
    public final dk.f0<i3> f13476i;

    public j0(dk.f0<Context> f0Var, dk.f0<k2> f0Var2, dk.f0<q1> f0Var3, dk.f0<u4> f0Var4, dk.f0<t1> f0Var5, dk.f0<b1> f0Var6, dk.f0<Executor> f0Var7, dk.f0<Executor> f0Var8, dk.f0<i3> f0Var9) {
        this.f13468a = f0Var;
        this.f13469b = f0Var2;
        this.f13470c = f0Var3;
        this.f13471d = f0Var4;
        this.f13472e = f0Var5;
        this.f13473f = f0Var6;
        this.f13474g = f0Var7;
        this.f13475h = f0Var8;
        this.f13476i = f0Var9;
    }

    @Override // dk.f0
    public final /* bridge */ /* synthetic */ i0 zza() {
        Context a10 = ((q4) this.f13468a).a();
        k2 zza = this.f13469b.zza();
        q1 zza2 = this.f13470c.zza();
        dk.b0 a11 = dk.d0.a(this.f13471d);
        t1 zza3 = this.f13472e.zza();
        return new i0(a10, zza, zza2, a11, zza3, this.f13473f.zza(), dk.d0.a(this.f13474g), dk.d0.a(this.f13475h), this.f13476i.zza());
    }
}
