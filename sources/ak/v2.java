package ak;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class v2 implements dk.f0<u2> {

    /* renamed from: a  reason: collision with root package name */
    public final dk.f0<String> f13690a;

    /* renamed from: b  reason: collision with root package name */
    public final dk.f0<i0> f13691b;

    /* renamed from: c  reason: collision with root package name */
    public final dk.f0<t1> f13692c;

    /* renamed from: d  reason: collision with root package name */
    public final dk.f0<Context> f13693d;

    /* renamed from: e  reason: collision with root package name */
    public final dk.f0<k3> f13694e;

    /* renamed from: f  reason: collision with root package name */
    public final dk.f0<Executor> f13695f;

    /* renamed from: g  reason: collision with root package name */
    public final dk.f0<i3> f13696g;

    public v2(dk.f0<String> f0Var, dk.f0<i0> f0Var2, dk.f0<t1> f0Var3, dk.f0<Context> f0Var4, dk.f0<k3> f0Var5, dk.f0<Executor> f0Var6, dk.f0<i3> f0Var7) {
        this.f13690a = f0Var;
        this.f13691b = f0Var2;
        this.f13692c = f0Var3;
        this.f13693d = f0Var4;
        this.f13694e = f0Var5;
        this.f13695f = f0Var6;
        this.f13696g = f0Var7;
    }

    @Override // dk.f0
    public final /* bridge */ /* synthetic */ u2 zza() {
        File externalFilesDir;
        String zza = this.f13690a.zza();
        i0 zza2 = this.f13691b.zza();
        t1 zza3 = this.f13692c.zza();
        Context a10 = ((q4) this.f13693d).a();
        k3 zza4 = this.f13694e.zza();
        dk.b0 a11 = dk.d0.a(this.f13695f);
        i0 i0Var = zza2;
        t1 t1Var = zza3;
        k3 k3Var = zza4;
        i3 zza5 = this.f13696g.zza();
        if (zza != null) {
            externalFilesDir = new File(a10.getExternalFilesDir(null), zza);
        } else {
            externalFilesDir = a10.getExternalFilesDir(null);
        }
        return new u2(externalFilesDir, i0Var, t1Var, a10, k3Var, a11, zza5);
    }
}
