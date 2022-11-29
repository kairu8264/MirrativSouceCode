package ai;

import android.content.Context;

/* loaded from: classes3.dex */
public final class qd1 implements rn3<gc1<k61>> {

    /* renamed from: a  reason: collision with root package name */
    public final md1 f8900a;

    /* renamed from: b  reason: collision with root package name */
    public final eo3<Context> f8901b;

    /* renamed from: c  reason: collision with root package name */
    public final eo3<zj0> f8902c;

    /* renamed from: d  reason: collision with root package name */
    public final eo3<fl2> f8903d;

    /* renamed from: e  reason: collision with root package name */
    public final eo3<yl2> f8904e;

    public qd1(md1 md1Var, eo3<Context> eo3Var, eo3<zj0> eo3Var2, eo3<fl2> eo3Var3, eo3<yl2> eo3Var4) {
        this.f8900a = md1Var;
        this.f8901b = eo3Var;
        this.f8902c = eo3Var2;
        this.f8903d = eo3Var3;
        this.f8904e = eo3Var4;
    }

    @Override // ai.eo3
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context zzb = this.f8901b.zzb();
        final zj0 a10 = ((cs0) this.f8902c).a();
        final fl2 a11 = ((k11) this.f8903d).a();
        final yl2 a12 = ((l41) this.f8904e).a();
        return new gc1(new k61(zzb, a10, a11, a12) { // from class: ai.kd1

            /* renamed from: w  reason: collision with root package name */
            public final Context f6172w;

            /* renamed from: x  reason: collision with root package name */
            public final zj0 f6173x;

            /* renamed from: y  reason: collision with root package name */
            public final fl2 f6174y;

            /* renamed from: z  reason: collision with root package name */
            public final yl2 f6175z;

            {
                this.f6172w = zzb;
                this.f6173x = a10;
                this.f6174y = a11;
                this.f6175z = a12;
            }

            @Override // ai.k61
            public final void a() {
                wg.t.n().g(this.f6172w, this.f6173x.f13013w, this.f6174y.C.toString(), this.f6175z.f12652f);
            }
        }, hk0.f4883f);
    }
}
