package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class hq2 implements rn3<y70> {

    /* renamed from: a  reason: collision with root package name */
    public final gq2 f4931a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Context> f4932b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<zj0> f4933c;

    public hq2(gq2 gq2Var, eo3<Context> eo3Var, eo3<zj0> eo3Var2) {
        this.f4931a = gq2Var;
        this.f4932b = eo3Var;
        this.f4933c = eo3Var2;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        y70 b10 = new o70().b(((tr0) this.f4932b).a(), ((cs0) this.f4933c).a());
        zn3.b(b10);
        return b10;
    }
}
