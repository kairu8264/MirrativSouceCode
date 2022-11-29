package u;

/* loaded from: classes.dex */
public interface d0 extends i<Float> {

    /* loaded from: classes.dex */
    public static final class a {
        public static float a(d0 d0Var, float f10, float f11, float f12) {
            jo.p.h(d0Var, "this");
            return d0Var.d(d0Var.e(f10, f11, f12), f10, f11, f12);
        }

        public static <V extends p> k1<V> b(d0 d0Var, c1<Float, V> c1Var) {
            jo.p.h(d0Var, "this");
            jo.p.h(c1Var, "converter");
            return new k1<>(d0Var);
        }
    }

    float b(float f10, float f11, float f12);

    float c(long j10, float f10, float f11, float f12);

    float d(long j10, float f10, float f11, float f12);

    long e(float f10, float f11, float f12);
}
