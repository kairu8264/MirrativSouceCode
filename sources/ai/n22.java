package ai;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class n22 implements rn3<m22> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f7161a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Executor> f7162b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<hm1> f7163c;

    public n22(eo3<Context> eo3Var, eo3<Executor> eo3Var2, eo3<hm1> eo3Var3) {
        this.f7161a = eo3Var;
        this.f7162b = eo3Var2;
        this.f7163c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new m22(this.f7161a.zzb(), this.f7162b.zzb(), this.f7163c.zzb());
    }
}
