package g0;

import c1.e0;
import l0.c1;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public static final c1<z> f32200a = l0.r.c(null, a.f32203w, 1, null);

    /* renamed from: b  reason: collision with root package name */
    public static final long f32201b;

    /* renamed from: c  reason: collision with root package name */
    public static final z f32202c;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<z> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f32203w = new a();

        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final z invoke() {
            return a0.f32202c;
        }
    }

    static {
        long c10 = e0.c(4282550004L);
        f32201b = c10;
        f32202c = new z(c10, c1.c0.k(c10, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    public static final c1<z> b() {
        return f32200a;
    }
}
