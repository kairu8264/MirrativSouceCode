package ud;

/* loaded from: classes2.dex */
public interface r3 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f55440a = a.f55441a;

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f55441a = new a();

        public final s3 a() {
            return new s3(null, 1, null);
        }

        public final t3 b(jf.m0 m0Var, jf.k0 k0Var, int i10, boolean z10, boolean z11) {
            jo.p.h(m0Var, "partsLargeCategory");
            jo.p.h(k0Var, "partsCategory");
            return new t3(m0Var, k0Var, i10, z10, z11, null, 32, null);
        }

        public final u3 c(int i10) {
            return new u3(i10, null, 2, null);
        }
    }

    /* loaded from: classes2.dex */
    public enum b {
        TITLE,
        CATEGORY,
        DIVIDER
    }

    b getType();
}
