package ai;

import android.content.Context;
import android.text.TextUtils;
import com.dena.mirrorman.clientlog.logs.ActionLogBase;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.ads.zzdkm;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class ap1 implements t91, or, p51, z41 {
    public final fl2 A;
    public final ey1 B;
    public Boolean C;
    public final boolean D = ((Boolean) ft.c().c(ox.f7961c5)).booleanValue();

    /* renamed from: w  reason: collision with root package name */
    public final Context f1965w;

    /* renamed from: x  reason: collision with root package name */
    public final lm2 f1966x;

    /* renamed from: y  reason: collision with root package name */
    public final pp1 f1967y;

    /* renamed from: z  reason: collision with root package name */
    public final sl2 f1968z;

    public ap1(Context context, lm2 lm2Var, pp1 pp1Var, sl2 sl2Var, fl2 fl2Var, ey1 ey1Var) {
        this.f1965w = context;
        this.f1966x = lm2Var;
        this.f1967y = pp1Var;
        this.f1968z = sl2Var;
        this.A = fl2Var;
        this.B = ey1Var;
    }

    public final boolean a() {
        if (this.C == null) {
            synchronized (this) {
                if (this.C == null) {
                    String str = (String) ft.c().c(ox.Y0);
                    wg.t.d();
                    String c02 = yg.d2.c0(this.f1965w);
                    boolean z10 = false;
                    if (str != null && c02 != null) {
                        try {
                            z10 = Pattern.matches(str, c02);
                        } catch (RuntimeException e10) {
                            wg.t.h().k(e10, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.C = Boolean.valueOf(z10);
                }
            }
        }
        return this.C.booleanValue();
    }

    @Override // ai.t91
    public final void b() {
        if (a()) {
            h("adapter_impression").e();
        }
    }

    @Override // ai.t91
    public final void c() {
        if (a()) {
            h("adapter_shown").e();
        }
    }

    @Override // ai.z41
    public final void d() {
        if (this.D) {
            op1 h10 = h("ifts");
            h10.d("reason", "blocked");
            h10.e();
        }
    }

    @Override // ai.p51
    public final void f() {
        if (a() || this.A.f4091f0) {
            n(h("impression"));
        }
    }

    public final op1 h(String str) {
        op1 d10 = this.f1967y.d();
        d10.b(this.f1968z.f9876b.f9497b);
        d10.c(this.A);
        d10.d(ActionLogBase.ACTION, str);
        if (!this.A.f4109t.isEmpty()) {
            d10.d("ancn", this.A.f4109t.get(0));
        }
        if (this.A.f4091f0) {
            wg.t.d();
            d10.d("device_connectivity", true != yg.d2.i(this.f1965w) ? "offline" : "online");
            d10.d("event_timestamp", String.valueOf(wg.t.k().currentTimeMillis()));
            d10.d("offline_ad", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        if (((Boolean) ft.c().c(ox.f8034l5)).booleanValue()) {
            boolean a10 = eh.o.a(this.f1968z);
            d10.d("scar", String.valueOf(a10));
            if (a10) {
                String b10 = eh.o.b(this.f1968z);
                if (!TextUtils.isEmpty(b10)) {
                    d10.d("ragent", b10);
                }
                String c10 = eh.o.c(this.f1968z);
                if (!TextUtils.isEmpty(c10)) {
                    d10.d("rtype", c10);
                }
            }
        }
        return d10;
    }

    @Override // ai.z41
    public final void j0(zzdkm zzdkmVar) {
        if (this.D) {
            op1 h10 = h("ifts");
            h10.d("reason", "exception");
            if (!TextUtils.isEmpty(zzdkmVar.getMessage())) {
                h10.d("msg", zzdkmVar.getMessage());
            }
            h10.e();
        }
    }

    public final void n(op1 op1Var) {
        if (this.A.f4091f0) {
            this.B.h(new gy1(wg.t.k().currentTimeMillis(), this.f1968z.f9876b.f9497b.f6277b, op1Var.f(), 2));
            return;
        }
        op1Var.e();
    }

    @Override // ai.or
    public final void onAdClicked() {
        if (this.A.f4091f0) {
            n(h(MRLog.ACTION_TYPE_CLICK));
        }
    }

    @Override // ai.z41
    public final void y(sr srVar) {
        sr srVar2;
        if (this.D) {
            op1 h10 = h("ifts");
            h10.d("reason", "adapter");
            int i10 = srVar.f9916w;
            String str = srVar.f9917x;
            if (srVar.f9918y.equals("com.google.android.gms.ads") && (srVar2 = srVar.f9919z) != null && !srVar2.f9918y.equals("com.google.android.gms.ads")) {
                sr srVar3 = srVar.f9919z;
                i10 = srVar3.f9916w;
                str = srVar3.f9917x;
            }
            if (i10 >= 0) {
                h10.d("arec", String.valueOf(i10));
            }
            String a10 = this.f1966x.a(str);
            if (a10 != null) {
                h10.d("areec", a10);
            }
            h10.e();
        }
    }
}
