package ai;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class sf2 implements rn3<rf2> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f9818a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f9819b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<or0> f9820c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<ti2<vx0, by0>> f9821d;

    /* renamed from: e  reason: collision with root package name */
    public final eo3<yg2> f9822e;

    /* renamed from: f  reason: collision with root package name */
    public final eo3<wl2> f9823f;

    public sf2(eo3<Context> eo3Var, eo3<Executor> eo3Var2, eo3<or0> eo3Var3, eo3<ti2<vx0, by0>> eo3Var4, eo3<yg2> eo3Var5, eo3<wl2> eo3Var6) {
        this.f9818a = eo3Var;
        this.f9819b = eo3Var2;
        this.f9820c = eo3Var3;
        this.f9821d = eo3Var4;
        this.f9822e = eo3Var5;
        this.f9823f = eo3Var6;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new rf2(this.f9818a.zzb(), this.f9819b.zzb(), this.f9820c.zzb(), ((xi2) this.f9821d).zzb(), this.f9822e.zzb(), new wl2());
    }
}
