package ai;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class h02 implements rn3<g02> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f4671a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f4672b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<ge1> f4673c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<el2> f4674d;

    public h02(eo3<Context> eo3Var, eo3<Executor> eo3Var2, eo3<ge1> eo3Var3, eo3<el2> eo3Var4) {
        this.f4671a = eo3Var;
        this.f4672b = eo3Var2;
        this.f4673c = eo3Var3;
        this.f4674d = eo3Var4;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new g02(this.f4671a.zzb(), this.f4672b.zzb(), this.f4673c.zzb(), this.f4674d.zzb());
    }
}
