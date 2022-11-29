package ai;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class ij2 implements rn3<hj2> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f5258a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f5259b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<or0> f5260c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<b62> f5261d;

    /* renamed from: e  reason: collision with root package name */
    public final eo3<ik2> f5262e;

    /* renamed from: f  reason: collision with root package name */
    public final eo3<wl2> f5263f;

    public ij2(eo3<Context> eo3Var, eo3<Executor> eo3Var2, eo3<or0> eo3Var3, eo3<b62> eo3Var4, eo3<ik2> eo3Var5, eo3<wl2> eo3Var6) {
        this.f5258a = eo3Var;
        this.f5259b = eo3Var2;
        this.f5260c = eo3Var3;
        this.f5261d = eo3Var4;
        this.f5262e = eo3Var5;
        this.f5263f = eo3Var6;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new hj2(this.f5258a.zzb(), this.f5259b.zzb(), this.f5260c.zzb(), this.f5261d.zzb(), this.f5262e.zzb(), new wl2());
    }
}
