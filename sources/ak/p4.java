package ak;

import android.content.Context;

/* loaded from: classes3.dex */
public final class p4 implements dk.f0<u4> {

    /* renamed from: a  reason: collision with root package name */
    public final dk.f0<Context> f13585a;

    /* renamed from: b  reason: collision with root package name */
    public final dk.f0<c0> f13586b;

    /* renamed from: c  reason: collision with root package name */
    public final dk.f0<u2> f13587c;

    public p4(dk.f0<Context> f0Var, dk.f0<c0> f0Var2, dk.f0<u2> f0Var3) {
        this.f13585a = f0Var;
        this.f13586b = f0Var2;
        this.f13587c = f0Var3;
    }

    @Override // dk.f0
    public final /* bridge */ /* synthetic */ u4 zza() {
        u4 u4Var;
        Context a10 = ((q4) this.f13585a).a();
        dk.b0 a11 = dk.d0.a(this.f13586b);
        dk.b0 a12 = dk.d0.a(this.f13587c);
        if (l4.b(a10) == null) {
            u4Var = (u4) a11.zza();
        } else {
            u4Var = (u4) a12.zza();
        }
        dk.e0.a(u4Var);
        return u4Var;
    }
}
