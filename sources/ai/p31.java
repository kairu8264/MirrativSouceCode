package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class p31 implements rn3<bx2<fl2, yg.w>> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f8282a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<zj0> f8283b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<yl2> f8284c;

    public p31(eo3<Context> eo3Var, eo3<zj0> eo3Var2, eo3<yl2> eo3Var3) {
        this.f8282a = eo3Var;
        this.f8283b = eo3Var2;
        this.f8284c = eo3Var3;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context zzb = this.f8282a.zzb();
        final zj0 a10 = ((cs0) this.f8283b).a();
        final yl2 a11 = ((l41) this.f8284c).a();
        return new bx2(zzb, a10, a11) { // from class: ai.o31

            /* renamed from: a  reason: collision with root package name */
            public final Context f7632a;

            /* renamed from: b  reason: collision with root package name */
            public final zj0 f7633b;

            /* renamed from: c  reason: collision with root package name */
            public final yl2 f7634c;

            {
                this.f7632a = zzb;
                this.f7633b = a10;
                this.f7634c = a11;
            }

            @Override // ai.bx2
            public final Object apply(Object obj) {
                Context context = this.f7632a;
                zj0 zj0Var = this.f7633b;
                yl2 yl2Var = this.f7634c;
                fl2 fl2Var = (fl2) obj;
                yg.w wVar = new yg.w(context);
                wVar.e(fl2Var.B);
                wVar.f(fl2Var.C.toString());
                wVar.d(zj0Var.f13013w);
                wVar.c(yl2Var.f12652f);
                return wVar;
            }
        };
    }
}
