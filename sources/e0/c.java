package e0;

import jo.p;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final b f30026a = new a();

    /* loaded from: classes.dex */
    public static final class a implements b {
        @Override // e0.b
        public float a(long j10, m2.d dVar) {
            p.h(dVar, "density");
            return 0.0f;
        }

        public String toString() {
            return "ZeroCornerSize";
        }
    }

    public static final b a(int i10) {
        return new e(i10);
    }

    public static final b b(float f10) {
        return new d(f10, null);
    }
}
