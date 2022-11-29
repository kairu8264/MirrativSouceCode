package ai;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class d72 implements rn3<b72> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<t43> f3164a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Context> f3165b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<yl2> f3166c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<ViewGroup> f3167d;

    public d72(eo3<t43> eo3Var, eo3<Context> eo3Var2, eo3<yl2> eo3Var3, eo3<ViewGroup> eo3Var4) {
        this.f3164a = eo3Var;
        this.f3165b = eo3Var2;
        this.f3166c = eo3Var3;
        this.f3167d = eo3Var4;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new b72(this.f3164a.zzb(), ((cn2) this.f3165b).a(), ((l41) this.f3166c).a(), ((ry0) this.f3167d).a());
    }
}
