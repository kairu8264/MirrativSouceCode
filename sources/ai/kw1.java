package ai;

import android.content.Context;
import android.text.TextUtils;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.ads.zzdkm;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class kw1 implements t91, or, p51, z41 {
    public final ey1 A;
    public Boolean B;
    public final boolean C = ((Boolean) ft.c().c(ox.f7961c5)).booleanValue();
    public final nq2 D;
    public final String E;

    /* renamed from: w  reason: collision with root package name */
    public final Context f6383w;

    /* renamed from: x  reason: collision with root package name */
    public final lm2 f6384x;

    /* renamed from: y  reason: collision with root package name */
    public final sl2 f6385y;

    /* renamed from: z  reason: collision with root package name */
    public final fl2 f6386z;

    public kw1(Context context, lm2 lm2Var, sl2 sl2Var, fl2 fl2Var, ey1 ey1Var, nq2 nq2Var, String str) {
        this.f6383w = context;
        this.f6384x = lm2Var;
        this.f6385y = sl2Var;
        this.f6386z = fl2Var;
        this.A = ey1Var;
        this.D = nq2Var;
        this.E = str;
    }

    public final boolean a() {
        if (this.B == null) {
            synchronized (this) {
                if (this.B == null) {
                    String str = (String) ft.c().c(ox.Y0);
                    wg.t.d();
                    String c02 = yg.d2.c0(this.f6383w);
                    boolean z10 = false;
                    if (str != null && c02 != null) {
                        try {
                            z10 = Pattern.matches(str, c02);
                        } catch (RuntimeException e10) {
                            wg.t.h().k(e10, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.B = Boolean.valueOf(z10);
                }
            }
        }
        return this.B.booleanValue();
    }

    @Override // ai.t91
    public final void b() {
        if (a()) {
            this.D.a(h("adapter_impression"));
        }
    }

    @Override // ai.t91
    public final void c() {
        if (a()) {
            this.D.a(h("adapter_shown"));
        }
    }

    @Override // ai.z41
    public final void d() {
        if (this.C) {
            nq2 nq2Var = this.D;
            mq2 h10 = h("ifts");
            h10.c("reason", "blocked");
            nq2Var.a(h10);
        }
    }

    @Override // ai.p51
    public final void f() {
        if (a() || this.f6386z.f4091f0) {
            n(h("impression"));
        }
    }

    public final mq2 h(String str) {
        mq2 a10 = mq2.a(str);
        a10.g(this.f6385y, null);
        a10.i(this.f6386z);
        a10.c("request_id", this.E);
        if (!this.f6386z.f4109t.isEmpty()) {
            a10.c("ancn", this.f6386z.f4109t.get(0));
        }
        if (this.f6386z.f4091f0) {
            wg.t.d();
            a10.c("device_connectivity", true != yg.d2.i(this.f6383w) ? "offline" : "online");
            a10.c("event_timestamp", String.valueOf(wg.t.k().currentTimeMillis()));
            a10.c("offline_ad", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        return a10;
    }

    @Override // ai.z41
    public final void j0(zzdkm zzdkmVar) {
        if (this.C) {
            mq2 h10 = h("ifts");
            h10.c("reason", "exception");
            if (!TextUtils.isEmpty(zzdkmVar.getMessage())) {
                h10.c("msg", zzdkmVar.getMessage());
            }
            this.D.a(h10);
        }
    }

    public final void n(mq2 mq2Var) {
        if (this.f6386z.f4091f0) {
            this.A.h(new gy1(wg.t.k().currentTimeMillis(), this.f6385y.f9876b.f9497b.f6277b, this.D.b(mq2Var), 2));
            return;
        }
        this.D.a(mq2Var);
    }

    @Override // ai.or
    public final void onAdClicked() {
        if (this.f6386z.f4091f0) {
            n(h(MRLog.ACTION_TYPE_CLICK));
        }
    }

    @Override // ai.z41
    public final void y(sr srVar) {
        sr srVar2;
        if (this.C) {
            int i10 = srVar.f9916w;
            String str = srVar.f9917x;
            if (srVar.f9918y.equals("com.google.android.gms.ads") && (srVar2 = srVar.f9919z) != null && !srVar2.f9918y.equals("com.google.android.gms.ads")) {
                sr srVar3 = srVar.f9919z;
                i10 = srVar3.f9916w;
                str = srVar3.f9917x;
            }
            String a10 = this.f6384x.a(str);
            mq2 h10 = h("ifts");
            h10.c("reason", "adapter");
            if (i10 >= 0) {
                h10.c("arec", String.valueOf(i10));
            }
            if (a10 != null) {
                h10.c("areec", a10);
            }
            this.D.a(h10);
        }
    }
}
