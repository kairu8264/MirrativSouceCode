package y;

import android.graphics.Insets;
import y.u1;

/* loaded from: classes.dex */
public interface c1 {

    /* renamed from: a  reason: collision with root package name */
    public static final a f60687a = a.f60688a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f60688a = new a();

        /* renamed from: b  reason: collision with root package name */
        public static final b f60689b = new b();

        /* renamed from: c  reason: collision with root package name */
        public static final d f60690c = new d();

        /* renamed from: d  reason: collision with root package name */
        public static final c f60691d = new c();

        /* renamed from: e  reason: collision with root package name */
        public static final C1026a f60692e = new C1026a();

        /* renamed from: y.c1$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1026a implements c1 {
            @Override // y.c1
            public float b(float f10, float f11) {
                return -f11;
            }

            @Override // y.c1
            public Insets c(Insets insets, int i10) {
                jo.p.h(insets, "oldInsets");
                Insets of2 = Insets.of(insets.left, insets.top, insets.right, i10);
                jo.p.g(of2, "of(oldInsets.left, oldIn…ldInsets.right, newValue)");
                return of2;
            }

            @Override // y.c1
            public int e(Insets insets) {
                jo.p.h(insets, "insets");
                return insets.bottom;
            }

            @Override // y.c1
            public long f(long j10) {
                return b1.g.a(0.0f, b1.f.n(j10));
            }

            @Override // y.c1
            public long g(long j10, float f10) {
                return m2.v.a(0.0f, m2.u.i(j10) + f10);
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements c1 {
            @Override // y.c1
            public float b(float f10, float f11) {
                return f10;
            }

            @Override // y.c1
            public Insets c(Insets insets, int i10) {
                jo.p.h(insets, "oldInsets");
                Insets of2 = Insets.of(i10, insets.top, insets.right, insets.bottom);
                jo.p.g(of2, "of(newValue, oldInsets.t….right, oldInsets.bottom)");
                return of2;
            }

            @Override // y.c1
            public int e(Insets insets) {
                jo.p.h(insets, "insets");
                return insets.left;
            }

            @Override // y.c1
            public long f(long j10) {
                return b1.g.a(b1.f.m(j10), 0.0f);
            }

            @Override // y.c1
            public long g(long j10, float f10) {
                return m2.v.a(m2.u.h(j10) - f10, 0.0f);
            }
        }

        /* loaded from: classes.dex */
        public static final class c implements c1 {
            @Override // y.c1
            public float b(float f10, float f11) {
                return -f10;
            }

            @Override // y.c1
            public Insets c(Insets insets, int i10) {
                jo.p.h(insets, "oldInsets");
                Insets of2 = Insets.of(insets.left, insets.top, i10, insets.bottom);
                jo.p.g(of2, "of(oldInsets.left, oldIn…wValue, oldInsets.bottom)");
                return of2;
            }

            @Override // y.c1
            public int e(Insets insets) {
                jo.p.h(insets, "insets");
                return insets.right;
            }

            @Override // y.c1
            public long f(long j10) {
                return b1.g.a(b1.f.m(j10), 0.0f);
            }

            @Override // y.c1
            public long g(long j10, float f10) {
                return m2.v.a(m2.u.h(j10) + f10, 0.0f);
            }
        }

        /* loaded from: classes.dex */
        public static final class d implements c1 {
            @Override // y.c1
            public float b(float f10, float f11) {
                return f11;
            }

            @Override // y.c1
            public Insets c(Insets insets, int i10) {
                jo.p.h(insets, "oldInsets");
                Insets of2 = Insets.of(insets.left, i10, insets.right, insets.bottom);
                jo.p.g(of2, "of(oldInsets.left, newVa….right, oldInsets.bottom)");
                return of2;
            }

            @Override // y.c1
            public int e(Insets insets) {
                jo.p.h(insets, "insets");
                return insets.top;
            }

            @Override // y.c1
            public long f(long j10) {
                return b1.g.a(0.0f, b1.f.n(j10));
            }

            @Override // y.c1
            public long g(long j10, float f10) {
                return m2.v.a(0.0f, m2.u.i(j10) - f10);
            }
        }

        public final c1 a(int i10, m2.q qVar) {
            jo.p.h(qVar, "layoutDirection");
            u1.a aVar = u1.f60981a;
            if (u1.l(i10, aVar.g())) {
                return f60689b;
            }
            if (u1.l(i10, aVar.j())) {
                return f60690c;
            }
            if (u1.l(i10, aVar.h())) {
                return f60691d;
            }
            if (u1.l(i10, aVar.e())) {
                return f60692e;
            }
            if (u1.l(i10, aVar.i())) {
                if (qVar == m2.q.Ltr) {
                    return f60689b;
                }
                return f60691d;
            } else if (u1.l(i10, aVar.f())) {
                if (qVar == m2.q.Ltr) {
                    return f60691d;
                }
                return f60689b;
            } else {
                throw new IllegalStateException("Only Left, Top, Right, Bottom, Start and End are allowed".toString());
            }
        }
    }

    default float a(float f10, float f11) {
        return po.n.c(b(f10, f11), 0.0f);
    }

    float b(float f10, float f11);

    Insets c(Insets insets, int i10);

    default float d(float f10, float f11) {
        return po.n.h(b(f10, f11), 0.0f);
    }

    int e(Insets insets);

    long f(long j10);

    long g(long j10, float f10);
}
