package g1;

import c1.c0;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: j  reason: collision with root package name */
    public static final b f32351j = new b(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f32352a;

    /* renamed from: b  reason: collision with root package name */
    public final float f32353b;

    /* renamed from: c  reason: collision with root package name */
    public final float f32354c;

    /* renamed from: d  reason: collision with root package name */
    public final float f32355d;

    /* renamed from: e  reason: collision with root package name */
    public final float f32356e;

    /* renamed from: f  reason: collision with root package name */
    public final o f32357f;

    /* renamed from: g  reason: collision with root package name */
    public final long f32358g;

    /* renamed from: h  reason: collision with root package name */
    public final int f32359h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f32360i;

    /* loaded from: classes.dex */
    public static final class b {
        public b() {
        }

        public /* synthetic */ b(jo.h hVar) {
            this();
        }
    }

    public c(String str, float f10, float f11, float f12, float f13, o oVar, long j10, int i10, boolean z10) {
        this.f32352a = str;
        this.f32353b = f10;
        this.f32354c = f11;
        this.f32355d = f12;
        this.f32356e = f13;
        this.f32357f = oVar;
        this.f32358g = j10;
        this.f32359h = i10;
        this.f32360i = z10;
    }

    public /* synthetic */ c(String str, float f10, float f11, float f12, float f13, o oVar, long j10, int i10, boolean z10, jo.h hVar) {
        this(str, f10, f11, f12, f13, oVar, j10, i10, z10);
    }

    public final boolean a() {
        return this.f32360i;
    }

    public final float b() {
        return this.f32354c;
    }

    public final float c() {
        return this.f32353b;
    }

    public final String d() {
        return this.f32352a;
    }

    public final o e() {
        return this.f32357f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (jo.p.c(this.f32352a, cVar.f32352a) && m2.g.n(this.f32353b, cVar.f32353b) && m2.g.n(this.f32354c, cVar.f32354c)) {
                if (this.f32355d == cVar.f32355d) {
                    return ((this.f32356e > cVar.f32356e ? 1 : (this.f32356e == cVar.f32356e ? 0 : -1)) == 0) && jo.p.c(this.f32357f, cVar.f32357f) && c0.m(this.f32358g, cVar.f32358g) && c1.r.G(this.f32359h, cVar.f32359h) && this.f32360i == cVar.f32360i;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int f() {
        return this.f32359h;
    }

    public final long g() {
        return this.f32358g;
    }

    public final float h() {
        return this.f32356e;
    }

    public int hashCode() {
        return (((((((((((((((this.f32352a.hashCode() * 31) + m2.g.o(this.f32353b)) * 31) + m2.g.o(this.f32354c)) * 31) + Float.hashCode(this.f32355d)) * 31) + Float.hashCode(this.f32356e)) * 31) + this.f32357f.hashCode()) * 31) + c0.s(this.f32358g)) * 31) + c1.r.H(this.f32359h)) * 31) + Boolean.hashCode(this.f32360i);
    }

    public final float i() {
        return this.f32355d;
    }

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f32361a;

        /* renamed from: b  reason: collision with root package name */
        public final float f32362b;

        /* renamed from: c  reason: collision with root package name */
        public final float f32363c;

        /* renamed from: d  reason: collision with root package name */
        public final float f32364d;

        /* renamed from: e  reason: collision with root package name */
        public final float f32365e;

        /* renamed from: f  reason: collision with root package name */
        public final long f32366f;

        /* renamed from: g  reason: collision with root package name */
        public final int f32367g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f32368h;

        /* renamed from: i  reason: collision with root package name */
        public final ArrayList<C0373a> f32369i;

        /* renamed from: j  reason: collision with root package name */
        public C0373a f32370j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f32371k;

        public /* synthetic */ a(String str, float f10, float f11, float f12, float f13, long j10, int i10, jo.h hVar) {
            this(str, f10, f11, f12, f13, j10, i10);
        }

        public a(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10) {
            this.f32361a = str;
            this.f32362b = f10;
            this.f32363c = f11;
            this.f32364d = f12;
            this.f32365e = f13;
            this.f32366f = j10;
            this.f32367g = i10;
            this.f32368h = z10;
            ArrayList<C0373a> b10 = i.b(null, 1, null);
            this.f32369i = b10;
            C0373a c0373a = new C0373a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, AnalyticsListener.EVENT_DROPPED_VIDEO_FRAMES, null);
            this.f32370j = c0373a;
            i.f(b10, c0373a);
        }

        public /* synthetic */ a(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10, jo.h hVar) {
            this(str, f10, f11, f12, f13, j10, i10, z10);
        }

        public final a a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List<? extends f> list) {
            jo.p.h(str, "name");
            jo.p.h(list, "clipPathData");
            h();
            i.f(this.f32369i, new C0373a(str, f10, f11, f12, f13, f14, f15, f16, list, null, 512, null));
            return this;
        }

        public final a c(List<? extends f> list, int i10, String str, c1.u uVar, float f10, c1.u uVar2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
            jo.p.h(list, "pathData");
            jo.p.h(str, "name");
            h();
            i().a().add(new t(str, list, i10, uVar, f10, uVar2, f11, f12, i11, i12, f13, f14, f15, f16, null));
            return this;
        }

        public final o e(C0373a c0373a) {
            return new o(c0373a.c(), c0373a.f(), c0373a.d(), c0373a.e(), c0373a.g(), c0373a.h(), c0373a.i(), c0373a.j(), c0373a.b(), c0373a.a());
        }

        public final c f() {
            h();
            while (i.c(this.f32369i) > 1) {
                g();
            }
            c cVar = new c(this.f32361a, this.f32362b, this.f32363c, this.f32364d, this.f32365e, e(this.f32370j), this.f32366f, this.f32367g, this.f32368h, null);
            this.f32371k = true;
            return cVar;
        }

        public final a g() {
            h();
            i().a().add(e((C0373a) i.e(this.f32369i)));
            return this;
        }

        public final void h() {
            if (!(!this.f32371k)) {
                throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
            }
        }

        public final C0373a i() {
            return (C0373a) i.d(this.f32369i);
        }

        /* renamed from: g1.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0373a {

            /* renamed from: a  reason: collision with root package name */
            public String f32372a;

            /* renamed from: b  reason: collision with root package name */
            public float f32373b;

            /* renamed from: c  reason: collision with root package name */
            public float f32374c;

            /* renamed from: d  reason: collision with root package name */
            public float f32375d;

            /* renamed from: e  reason: collision with root package name */
            public float f32376e;

            /* renamed from: f  reason: collision with root package name */
            public float f32377f;

            /* renamed from: g  reason: collision with root package name */
            public float f32378g;

            /* renamed from: h  reason: collision with root package name */
            public float f32379h;

            /* renamed from: i  reason: collision with root package name */
            public List<? extends f> f32380i;

            /* renamed from: j  reason: collision with root package name */
            public List<q> f32381j;

            public C0373a() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, AnalyticsListener.EVENT_DROPPED_VIDEO_FRAMES, null);
            }

            public C0373a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List<? extends f> list, List<q> list2) {
                jo.p.h(str, "name");
                jo.p.h(list, "clipPathData");
                jo.p.h(list2, "children");
                this.f32372a = str;
                this.f32373b = f10;
                this.f32374c = f11;
                this.f32375d = f12;
                this.f32376e = f13;
                this.f32377f = f14;
                this.f32378g = f15;
                this.f32379h = f16;
                this.f32380i = list;
                this.f32381j = list2;
            }

            public final List<q> a() {
                return this.f32381j;
            }

            public final List<f> b() {
                return this.f32380i;
            }

            public final String c() {
                return this.f32372a;
            }

            public final float d() {
                return this.f32374c;
            }

            public final float e() {
                return this.f32375d;
            }

            public final float f() {
                return this.f32373b;
            }

            public final float g() {
                return this.f32376e;
            }

            public final float h() {
                return this.f32377f;
            }

            public final float i() {
                return this.f32378g;
            }

            public final float j() {
                return this.f32379h;
            }

            public /* synthetic */ C0373a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2, int i10, jo.h hVar) {
                this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 0.0f : f11, (i10 & 8) != 0 ? 0.0f : f12, (i10 & 16) != 0 ? 1.0f : f13, (i10 & 32) == 0 ? f14 : 1.0f, (i10 & 64) != 0 ? 0.0f : f15, (i10 & 128) == 0 ? f16 : 0.0f, (i10 & 256) != 0 ? p.e() : list, (i10 & 512) != 0 ? new ArrayList() : list2);
            }
        }

        public /* synthetic */ a(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10, int i11, jo.h hVar) {
            this((i11 & 1) != 0 ? "" : str, f10, f11, f12, f13, (i11 & 32) != 0 ? c0.f18634b.e() : j10, (i11 & 64) != 0 ? c1.r.f18740b.z() : i10, (i11 & 128) != 0 ? false : z10, (jo.h) null);
        }

        public /* synthetic */ a(String str, float f10, float f11, float f12, float f13, long j10, int i10, int i11, jo.h hVar) {
            this((i11 & 1) != 0 ? "" : str, f10, f11, f12, f13, (i11 & 32) != 0 ? c0.f18634b.e() : j10, (i11 & 64) != 0 ? c1.r.f18740b.z() : i10, (jo.h) null);
        }

        public a(String str, float f10, float f11, float f12, float f13, long j10, int i10) {
            this(str, f10, f11, f12, f13, j10, i10, false, (jo.h) null);
        }
    }
}
