package ai;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class a12 implements rn3<z02> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f1673a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<zj0> f1674b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<ge1> f1675c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<Executor> f1676d;

    public a12(eo3<Context> eo3Var, eo3<zj0> eo3Var2, eo3<ge1> eo3Var3, eo3<Executor> eo3Var4) {
        this.f1673a = eo3Var;
        this.f1674b = eo3Var2;
        this.f1675c = eo3Var3;
        this.f1676d = eo3Var4;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new z02(this.f1673a.zzb(), ((cs0) this.f1674b).a(), this.f1675c.zzb(), t43Var);
    }
}
