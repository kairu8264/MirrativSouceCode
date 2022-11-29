package ai;

import android.content.Context;
import android.view.View;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class xy0 implements rn3<wy0> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<t01> f12357a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Context> f12358b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<il2> f12359c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<View> f12360d;

    /* renamed from: e  reason: collision with root package name */
    public final eo3<rp0> f12361e;

    /* renamed from: f  reason: collision with root package name */
    public final eo3<s01> f12362f;

    /* renamed from: g  reason: collision with root package name */
    public final eo3<zg1> f12363g;

    /* renamed from: h  reason: collision with root package name */
    public final eo3<pc1> f12364h;

    /* renamed from: i  reason: collision with root package name */
    public final eo3<b52> f12365i;

    /* renamed from: j  reason: collision with root package name */
    public final eo3<Executor> f12366j;

    public xy0(eo3<t01> eo3Var, eo3<Context> eo3Var2, eo3<il2> eo3Var3, eo3<View> eo3Var4, eo3<rp0> eo3Var5, eo3<s01> eo3Var6, eo3<zg1> eo3Var7, eo3<pc1> eo3Var8, eo3<b52> eo3Var9, eo3<Executor> eo3Var10) {
        this.f12357a = eo3Var;
        this.f12358b = eo3Var2;
        this.f12359c = eo3Var3;
        this.f12360d = eo3Var4;
        this.f12361e = eo3Var5;
        this.f12362f = eo3Var6;
        this.f12363g = eo3Var7;
        this.f12364h = eo3Var8;
        this.f12365i = eo3Var9;
        this.f12366j = eo3Var10;
    }

    public static wy0 b(t01 t01Var, Context context, il2 il2Var, View view, rp0 rp0Var, s01 s01Var, zg1 zg1Var, pc1 pc1Var, kn3<b52> kn3Var, Executor executor) {
        return new wy0(t01Var, context, il2Var, view, rp0Var, s01Var, zg1Var, pc1Var, kn3Var, executor);
    }

    @Override // ai.eo3
    /* renamed from: a */
    public final wy0 zzb() {
        return new wy0(((r21) this.f12357a).zzb(), this.f12358b.zzb(), ((dz0) this.f12359c).a(), ((cz0) this.f12360d).a(), ((pz0) this.f12361e).a(), ((ez0) this.f12362f).a(), ((ze1) this.f12363g).a(), this.f12364h.zzb(), pn3.b(this.f12365i), this.f12366j.zzb());
    }
}
