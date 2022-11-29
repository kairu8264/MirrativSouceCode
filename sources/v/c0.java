package v;

import android.os.Build;
import com.google.android.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: g  reason: collision with root package name */
    public static final a f56165g = new a(null);

    /* renamed from: h  reason: collision with root package name */
    public static final c0 f56166h;

    /* renamed from: i  reason: collision with root package name */
    public static final c0 f56167i;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f56168a;

    /* renamed from: b  reason: collision with root package name */
    public final long f56169b;

    /* renamed from: c  reason: collision with root package name */
    public final float f56170c;

    /* renamed from: d  reason: collision with root package name */
    public final float f56171d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f56172e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f56173f;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public static /* synthetic */ boolean d(a aVar, c0 c0Var, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = Build.VERSION.SDK_INT;
            }
            return aVar.c(c0Var, i10);
        }

        public final c0 a() {
            return c0.f56166h;
        }

        public final c0 b() {
            return c0.f56167i;
        }

        public final boolean c(c0 c0Var, int i10) {
            jo.p.h(c0Var, TtmlNode.TAG_STYLE);
            return b0.b(i10) && !c0Var.f() && (c0Var.h() || jo.p.c(c0Var, a()) || i10 >= 29);
        }
    }

    static {
        c0 c0Var = new c0(0L, 0.0f, 0.0f, false, false, 31, (jo.h) null);
        f56166h = c0Var;
        f56167i = new c0(true, c0Var.f56169b, c0Var.f56170c, c0Var.f56171d, c0Var.f56172e, c0Var.f56173f, (jo.h) null);
    }

    public /* synthetic */ c0(long j10, float f10, float f11, boolean z10, boolean z11, jo.h hVar) {
        this(j10, f10, f11, z10, z11);
    }

    public c0(boolean z10, long j10, float f10, float f11, boolean z11, boolean z12) {
        this.f56168a = z10;
        this.f56169b = j10;
        this.f56170c = f10;
        this.f56171d = f11;
        this.f56172e = z11;
        this.f56173f = z12;
    }

    public /* synthetic */ c0(boolean z10, long j10, float f10, float f11, boolean z11, boolean z12, jo.h hVar) {
        this(z10, j10, f10, f11, z11, z12);
    }

    public final boolean c() {
        return this.f56172e;
    }

    public final float d() {
        return this.f56170c;
    }

    public final float e() {
        return this.f56171d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            return this.f56168a == c0Var.f56168a && m2.j.f(this.f56169b, c0Var.f56169b) && m2.g.n(this.f56170c, c0Var.f56170c) && m2.g.n(this.f56171d, c0Var.f56171d) && this.f56172e == c0Var.f56172e && this.f56173f == c0Var.f56173f;
        }
        return false;
    }

    public final boolean f() {
        return this.f56173f;
    }

    public final long g() {
        return this.f56169b;
    }

    public final boolean h() {
        return this.f56168a;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.f56168a) * 31) + m2.j.i(this.f56169b)) * 31) + m2.g.o(this.f56170c)) * 31) + m2.g.o(this.f56171d)) * 31) + Boolean.hashCode(this.f56172e)) * 31) + Boolean.hashCode(this.f56173f);
    }

    public final boolean i() {
        return a.d(f56165g, this, 0, 2, null);
    }

    public String toString() {
        if (this.f56168a) {
            return "MagnifierStyle.TextDefault";
        }
        return "MagnifierStyle(size=" + ((Object) m2.j.j(this.f56169b)) + ", cornerRadius=" + ((Object) m2.g.p(this.f56170c)) + ", elevation=" + ((Object) m2.g.p(this.f56171d)) + ", clippingEnabled=" + this.f56172e + ", fishEyeEnabled=" + this.f56173f + ')';
    }

    public /* synthetic */ c0(long j10, float f10, float f11, boolean z10, boolean z11, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? m2.j.f40524b.a() : j10, (i10 & 2) != 0 ? m2.g.f40516x.b() : f10, (i10 & 4) != 0 ? m2.g.f40516x.b() : f11, (i10 & 8) != 0 ? true : z10, (i10 & 16) != 0 ? false : z11, (jo.h) null);
    }

    public c0(long j10, float f10, float f11, boolean z10, boolean z11) {
        this(false, j10, f10, f11, z10, z11, (jo.h) null);
    }
}
