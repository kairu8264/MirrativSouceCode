package e2;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: f  reason: collision with root package name */
    public static final a f30096f = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final u f30097a;

    /* renamed from: b  reason: collision with root package name */
    public int f30098b;

    /* renamed from: c  reason: collision with root package name */
    public int f30099c;

    /* renamed from: d  reason: collision with root package name */
    public int f30100d;

    /* renamed from: e  reason: collision with root package name */
    public int f30101e;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public g(y1.a aVar, long j10) {
        this.f30097a = new u(aVar.g());
        this.f30098b = y1.b0.l(j10);
        this.f30099c = y1.b0.k(j10);
        this.f30100d = -1;
        this.f30101e = -1;
        int l10 = y1.b0.l(j10);
        int k10 = y1.b0.k(j10);
        if (l10 >= 0 && l10 <= aVar.length()) {
            if (k10 < 0 || k10 > aVar.length()) {
                throw new IndexOutOfBoundsException("end (" + k10 + ") offset is outside of text region " + aVar.length());
            } else if (l10 <= k10) {
                return;
            } else {
                throw new IllegalArgumentException("Do not set reversed range: " + l10 + " > " + k10);
            }
        }
        throw new IndexOutOfBoundsException("start (" + l10 + ") offset is outside of text region " + aVar.length());
    }

    public /* synthetic */ g(y1.a aVar, long j10, jo.h hVar) {
        this(aVar, j10);
    }

    public final void a() {
        this.f30100d = -1;
        this.f30101e = -1;
    }

    public final void b(int i10, int i11) {
        long b10 = y1.c0.b(i10, i11);
        this.f30097a.c(i10, i11, "");
        long a10 = h.a(y1.c0.b(this.f30098b, this.f30099c), b10);
        this.f30098b = y1.b0.l(a10);
        this.f30099c = y1.b0.k(a10);
        if (l()) {
            long a11 = h.a(y1.c0.b(this.f30100d, this.f30101e), b10);
            if (y1.b0.h(a11)) {
                a();
                return;
            }
            this.f30100d = y1.b0.l(a11);
            this.f30101e = y1.b0.k(a11);
        }
    }

    public final char c(int i10) {
        return this.f30097a.a(i10);
    }

    public final y1.b0 d() {
        if (l()) {
            return y1.b0.b(y1.c0.b(this.f30100d, this.f30101e));
        }
        return null;
    }

    public final int e() {
        return this.f30101e;
    }

    public final int f() {
        return this.f30100d;
    }

    public final int g() {
        int i10 = this.f30098b;
        int i11 = this.f30099c;
        if (i10 == i11) {
            return i11;
        }
        return -1;
    }

    public final int h() {
        return this.f30097a.b();
    }

    public final long i() {
        return y1.c0.b(this.f30098b, this.f30099c);
    }

    public final int j() {
        return this.f30099c;
    }

    public final int k() {
        return this.f30098b;
    }

    public final boolean l() {
        return this.f30100d != -1;
    }

    public final void m(int i10, int i11, String str) {
        jo.p.h(str, "text");
        if (i10 >= 0 && i10 <= this.f30097a.b()) {
            if (i11 < 0 || i11 > this.f30097a.b()) {
                throw new IndexOutOfBoundsException("end (" + i11 + ") offset is outside of text region " + this.f30097a.b());
            } else if (i10 <= i11) {
                this.f30097a.c(i10, i11, str);
                this.f30098b = str.length() + i10;
                this.f30099c = i10 + str.length();
                this.f30100d = -1;
                this.f30101e = -1;
                return;
            } else {
                throw new IllegalArgumentException("Do not set reversed range: " + i10 + " > " + i11);
            }
        }
        throw new IndexOutOfBoundsException("start (" + i10 + ") offset is outside of text region " + this.f30097a.b());
    }

    public final void n(int i10, int i11) {
        if (i10 >= 0 && i10 <= this.f30097a.b()) {
            if (i11 < 0 || i11 > this.f30097a.b()) {
                throw new IndexOutOfBoundsException("end (" + i11 + ") offset is outside of text region " + this.f30097a.b());
            } else if (i10 < i11) {
                this.f30100d = i10;
                this.f30101e = i11;
                return;
            } else {
                throw new IllegalArgumentException("Do not set reversed or empty range: " + i10 + " > " + i11);
            }
        }
        throw new IndexOutOfBoundsException("start (" + i10 + ") offset is outside of text region " + this.f30097a.b());
    }

    public final void o(int i10) {
        p(i10, i10);
    }

    public final void p(int i10, int i11) {
        if (i10 >= 0 && i10 <= this.f30097a.b()) {
            if (i11 < 0 || i11 > this.f30097a.b()) {
                throw new IndexOutOfBoundsException("end (" + i11 + ") offset is outside of text region " + this.f30097a.b());
            } else if (i10 <= i11) {
                this.f30098b = i10;
                this.f30099c = i11;
                return;
            } else {
                throw new IllegalArgumentException("Do not set reversed range: " + i10 + " > " + i11);
            }
        }
        throw new IndexOutOfBoundsException("start (" + i10 + ") offset is outside of text region " + this.f30097a.b());
    }

    public final y1.a q() {
        return new y1.a(toString(), null, null, 6, null);
    }

    public String toString() {
        return this.f30097a.toString();
    }
}
