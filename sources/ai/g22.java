package ai;

import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import com.google.android.gms.internal.ads.zzeeg;

/* loaded from: classes3.dex */
public final class g22 {

    /* renamed from: a  reason: collision with root package name */
    public final lm2 f4294a;

    /* renamed from: b  reason: collision with root package name */
    public final jn1 f4295b;

    /* renamed from: c  reason: collision with root package name */
    public final pp1 f4296c;

    /* renamed from: d  reason: collision with root package name */
    public final nq2 f4297d;

    public g22(lm2 lm2Var, jn1 jn1Var, pp1 pp1Var, nq2 nq2Var) {
        this.f4294a = lm2Var;
        this.f4295b = jn1Var;
        this.f4296c = pp1Var;
        this.f4297d = nq2Var;
    }

    public final void a(kl2 kl2Var, fl2 fl2Var, int i10, zzeeg zzeegVar, long j10) {
        if (((Boolean) ft.c().c(ox.f8011i6)).booleanValue()) {
            mq2 a10 = mq2.a("adapter_status");
            a10.h(kl2Var);
            a10.i(fl2Var);
            a10.c("adapter_l", String.valueOf(j10));
            a10.c("sc", Integer.toString(i10));
            if (zzeegVar != null) {
                a10.c("arec", Integer.toString(zzeegVar.b().f9916w));
                String a11 = this.f4294a.a(zzeegVar.getMessage());
                if (a11 != null) {
                    a10.c("areec", a11);
                }
            }
            in1 d10 = this.f4295b.d(fl2Var.f4109t);
            if (d10 != null) {
                a10.c("ancn", d10.f5304a);
                lb0 lb0Var = d10.f5305b;
                if (lb0Var != null) {
                    a10.c("adapter_v", lb0Var.toString());
                }
                lb0 lb0Var2 = d10.f5306c;
                if (lb0Var2 != null) {
                    a10.c("adapter_sv", lb0Var2.toString());
                }
            }
            this.f4297d.a(a10);
            return;
        }
        op1 d11 = this.f4296c.d();
        d11.b(kl2Var);
        d11.c(fl2Var);
        d11.d(ActionLogBase.ACTION, "adapter_status");
        d11.d("adapter_l", String.valueOf(j10));
        d11.d("sc", Integer.toString(i10));
        if (zzeegVar != null) {
            d11.d("arec", Integer.toString(zzeegVar.b().f9916w));
            String a12 = this.f4294a.a(zzeegVar.getMessage());
            if (a12 != null) {
                d11.d("areec", a12);
            }
        }
        in1 d12 = this.f4295b.d(fl2Var.f4109t);
        if (d12 != null) {
            d11.d("ancn", d12.f5304a);
            lb0 lb0Var3 = d12.f5305b;
            if (lb0Var3 != null) {
                d11.d("adapter_v", lb0Var3.toString());
            }
            lb0 lb0Var4 = d12.f5306c;
            if (lb0Var4 != null) {
                d11.d("adapter_sv", lb0Var4.toString());
            }
        }
        d11.e();
    }
}
