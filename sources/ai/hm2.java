package ai;

import java.util.Map;

/* loaded from: classes3.dex */
public final class hm2 {
    public static r30<rp0> a(final ey1 ey1Var, final fr2 fr2Var, final nc1 nc1Var) {
        return new r30(nc1Var, fr2Var, ey1Var) { // from class: ai.dm2

            /* renamed from: a  reason: collision with root package name */
            public final nc1 f3349a;

            /* renamed from: b  reason: collision with root package name */
            public final fr2 f3350b;

            /* renamed from: c  reason: collision with root package name */
            public final ey1 f3351c;

            {
                this.f3349a = nc1Var;
                this.f3350b = fr2Var;
                this.f3351c = ey1Var;
            }

            @Override // ai.r30
            public final void a(Object obj, Map map) {
                nc1 nc1Var2 = this.f3349a;
                fr2 fr2Var2 = this.f3350b;
                ey1 ey1Var2 = this.f3351c;
                rp0 rp0Var = (rp0) obj;
                q30.c(map, nc1Var2);
                String str = (String) map.get("u");
                if (str == null) {
                    uj0.f("URL missing from click GMSG.");
                } else {
                    j43.p(q30.a(rp0Var, str), new fm2(rp0Var, fr2Var2, ey1Var2), hk0.f4878a);
                }
            }
        };
    }

    public static <T extends ip0 & oq0 & tq0 & br0> r30<T> b(final ey1 ey1Var, final fr2 fr2Var) {
        return new r30(fr2Var, ey1Var) { // from class: ai.em2

            /* renamed from: a  reason: collision with root package name */
            public final fr2 f3726a;

            /* renamed from: b  reason: collision with root package name */
            public final ey1 f3727b;

            {
                this.f3726a = fr2Var;
                this.f3727b = ey1Var;
            }

            @Override // ai.r30
            public final void a(Object obj, Map map) {
                fr2 fr2Var2 = this.f3726a;
                ey1 ey1Var2 = this.f3727b;
                ip0 ip0Var = (ip0) obj;
                String str = (String) map.get("u");
                if (str == null) {
                    uj0.f("URL missing from httpTrack GMSG.");
                } else if (!ip0Var.D().f4091f0) {
                    fr2Var2.b(str);
                } else {
                    ey1Var2.h(new gy1(wg.t.k().currentTimeMillis(), ((oq0) ip0Var).E().f6277b, str, 2));
                }
            }
        };
    }
}
