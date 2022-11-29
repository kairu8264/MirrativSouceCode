package ai;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class bh2 implements rn3<ah2> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f2346a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f2347b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<or0> f2348c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<ti2<gy0, my0>> f2349d;

    /* renamed from: e  reason: collision with root package name */
    public final eo3<yg2> f2350e;

    /* renamed from: f  reason: collision with root package name */
    public final eo3<wl2> f2351f;

    public bh2(eo3<Context> eo3Var, eo3<Executor> eo3Var2, eo3<or0> eo3Var3, eo3<ti2<gy0, my0>> eo3Var4, eo3<yg2> eo3Var5, eo3<wl2> eo3Var6) {
        this.f2346a = eo3Var;
        this.f2347b = eo3Var2;
        this.f2348c = eo3Var3;
        this.f2349d = eo3Var4;
        this.f2350e = eo3Var5;
        this.f2351f = eo3Var6;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new ah2(this.f2346a.zzb(), this.f2347b.zzb(), this.f2348c.zzb(), ((wi2) this.f2349d).zzb(), this.f2350e.zzb(), new wl2());
    }
}
