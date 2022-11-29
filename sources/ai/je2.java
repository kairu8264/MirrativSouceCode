package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class je2 implements rn3<he2> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<en> f5709a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<t43> f5710b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<Context> f5711c;

    public je2(eo3<en> eo3Var, eo3<t43> eo3Var2, eo3<Context> eo3Var3) {
        this.f5709a = eo3Var;
        this.f5710b = eo3Var2;
        this.f5711c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        en enVar = new en();
        t43 t43Var = hk0.f4878a;
        zn3.b(t43Var);
        return new he2(enVar, t43Var, ((tr0) this.f5711c).a(), null);
    }
}
