package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class vn1 implements rn3<qn> {

    /* renamed from: a  reason: collision with root package name */
    public final eo3<Context> f11130a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<String> f11131b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<zj0> f11132c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<yn> f11133d;

    /* renamed from: e  reason: collision with root package name */
    public final eo3<String> f11134e;

    public vn1(eo3<Context> eo3Var, eo3<String> eo3Var2, eo3<zj0> eo3Var3, eo3<yn> eo3Var4, eo3<String> eo3Var5) {
        this.f11130a = eo3Var;
        this.f11131b = eo3Var2;
        this.f11132c = eo3Var3;
        this.f11133d = eo3Var4;
        this.f11134e = eo3Var5;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        Context a10 = ((tr0) this.f11130a).a();
        final String zzb = ((ot1) this.f11131b).zzb();
        zj0 a11 = ((cs0) this.f11132c).a();
        final yn zzb2 = this.f11133d.zzb();
        final String zzb3 = this.f11134e.zzb();
        qn qnVar = new qn(new un(a10));
        qq B = rq.B();
        B.r(a11.f13014x);
        B.s(a11.f13015y);
        B.t(true != a11.f13016z ? 2 : 0);
        final rq n10 = B.n();
        qnVar.b(new pn(zzb2, zzb, n10, zzb3) { // from class: ai.un1

            /* renamed from: a  reason: collision with root package name */
            public final yn f10761a;

            /* renamed from: b  reason: collision with root package name */
            public final String f10762b;

            /* renamed from: c  reason: collision with root package name */
            public final rq f10763c;

            /* renamed from: d  reason: collision with root package name */
            public final String f10764d;

            {
                this.f10761a = zzb2;
                this.f10762b = zzb;
                this.f10763c = n10;
                this.f10764d = zzb3;
            }

            @Override // ai.pn
            public final void a(fp fpVar) {
                yn ynVar = this.f10761a;
                String str = this.f10762b;
                rq rqVar = this.f10763c;
                String str2 = this.f10764d;
                zn w10 = fpVar.x().w();
                w10.r(ynVar);
                fpVar.y(w10);
                xo w11 = fpVar.v().w();
                w11.r(str);
                w11.s(rqVar);
                fpVar.w(w11);
                fpVar.s(str2);
            }
        });
        return qnVar;
    }
}
