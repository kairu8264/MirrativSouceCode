package ai;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class wp1 {

    /* renamed from: a  reason: collision with root package name */
    public final String f11708a = xy.f12355b.e();

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, String> f11709b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final Executor f11710c;

    /* renamed from: d  reason: collision with root package name */
    public final yj0 f11711d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f11712e;

    /* renamed from: f  reason: collision with root package name */
    public final xq2 f11713f;

    public wp1(Executor executor, yj0 yj0Var, xq2 xq2Var) {
        this.f11710c = executor;
        this.f11711d = yj0Var;
        if (((Boolean) ft.c().c(ox.f8030l1)).booleanValue()) {
            this.f11712e = ((Boolean) ft.c().c(ox.f8062p1)).booleanValue();
        } else {
            this.f11712e = ((double) dt.e().nextFloat()) <= xy.f12354a.e().doubleValue();
        }
        this.f11713f = xq2Var;
    }

    public final void a(Map<String, String> map) {
        final String a10 = this.f11713f.a(map);
        if (this.f11712e) {
            this.f11710c.execute(new Runnable(this, a10) { // from class: ai.vp1

                /* renamed from: w  reason: collision with root package name */
                public final wp1 f11150w;

                /* renamed from: x  reason: collision with root package name */
                public final String f11151x;

                {
                    this.f11150w = this;
                    this.f11151x = a10;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    wp1 wp1Var = this.f11150w;
                    wp1Var.f11711d.v(this.f11151x);
                }
            });
        }
        yg.p1.k(a10);
    }

    public final String b(Map<String, String> map) {
        return this.f11713f.a(map);
    }
}
