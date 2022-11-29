package c1;

import java.util.List;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: b  reason: collision with root package name */
    public static final a f18773b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final long f18774a;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ u b(a aVar, List list, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = l1.f18718a.a();
            }
            return aVar.a(list, f10, f11, i10);
        }

        public static /* synthetic */ u e(a aVar, List list, float f10, float f11, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                f10 = 0.0f;
            }
            if ((i11 & 4) != 0) {
                f11 = Float.POSITIVE_INFINITY;
            }
            if ((i11 & 8) != 0) {
                i10 = l1.f18718a.a();
            }
            return aVar.d(list, f10, f11, i10);
        }

        public final u a(List<c0> list, float f10, float f11, int i10) {
            jo.p.h(list, "colors");
            return c(list, b1.g.a(f10, 0.0f), b1.g.a(f11, 0.0f), i10);
        }

        public final u c(List<c0> list, long j10, long j11, int i10) {
            jo.p.h(list, "colors");
            return new n0(list, null, j10, j11, i10, null);
        }

        public final u d(List<c0> list, float f10, float f11, int i10) {
            jo.p.h(list, "colors");
            return c(list, b1.g.a(0.0f, f10), b1.g.a(0.0f, f11), i10);
        }
    }

    public u() {
        this.f18774a = b1.l.f16742b.a();
    }

    public /* synthetic */ u(jo.h hVar) {
        this();
    }

    public abstract void a(long j10, s0 s0Var, float f10);
}
