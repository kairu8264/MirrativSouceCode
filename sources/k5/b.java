package k5;

import android.os.Build;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: i  reason: collision with root package name */
    public static final b f38391i = new a().a();

    /* renamed from: a  reason: collision with root package name */
    public k f38392a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f38393b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f38394c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f38395d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f38396e;

    /* renamed from: f  reason: collision with root package name */
    public long f38397f;

    /* renamed from: g  reason: collision with root package name */
    public long f38398g;

    /* renamed from: h  reason: collision with root package name */
    public c f38399h;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f38400a = false;

        /* renamed from: b  reason: collision with root package name */
        public boolean f38401b = false;

        /* renamed from: c  reason: collision with root package name */
        public k f38402c = k.NOT_REQUIRED;

        /* renamed from: d  reason: collision with root package name */
        public boolean f38403d = false;

        /* renamed from: e  reason: collision with root package name */
        public boolean f38404e = false;

        /* renamed from: f  reason: collision with root package name */
        public long f38405f = -1;

        /* renamed from: g  reason: collision with root package name */
        public long f38406g = -1;

        /* renamed from: h  reason: collision with root package name */
        public c f38407h = new c();

        public b a() {
            return new b(this);
        }

        public a b(k kVar) {
            this.f38402c = kVar;
            return this;
        }
    }

    public b() {
        this.f38392a = k.NOT_REQUIRED;
        this.f38397f = -1L;
        this.f38398g = -1L;
        this.f38399h = new c();
    }

    public c a() {
        return this.f38399h;
    }

    public k b() {
        return this.f38392a;
    }

    public long c() {
        return this.f38397f;
    }

    public long d() {
        return this.f38398g;
    }

    public boolean e() {
        return this.f38399h.c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f38393b == bVar.f38393b && this.f38394c == bVar.f38394c && this.f38395d == bVar.f38395d && this.f38396e == bVar.f38396e && this.f38397f == bVar.f38397f && this.f38398g == bVar.f38398g && this.f38392a == bVar.f38392a) {
            return this.f38399h.equals(bVar.f38399h);
        }
        return false;
    }

    public boolean f() {
        return this.f38395d;
    }

    public boolean g() {
        return this.f38393b;
    }

    public boolean h() {
        return this.f38394c;
    }

    public int hashCode() {
        long j10 = this.f38397f;
        long j11 = this.f38398g;
        return (((((((((((((this.f38392a.hashCode() * 31) + (this.f38393b ? 1 : 0)) * 31) + (this.f38394c ? 1 : 0)) * 31) + (this.f38395d ? 1 : 0)) * 31) + (this.f38396e ? 1 : 0)) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + this.f38399h.hashCode();
    }

    public boolean i() {
        return this.f38396e;
    }

    public void j(c cVar) {
        this.f38399h = cVar;
    }

    public void k(k kVar) {
        this.f38392a = kVar;
    }

    public void l(boolean z10) {
        this.f38395d = z10;
    }

    public void m(boolean z10) {
        this.f38393b = z10;
    }

    public void n(boolean z10) {
        this.f38394c = z10;
    }

    public void o(boolean z10) {
        this.f38396e = z10;
    }

    public void p(long j10) {
        this.f38397f = j10;
    }

    public void q(long j10) {
        this.f38398g = j10;
    }

    public b(a aVar) {
        this.f38392a = k.NOT_REQUIRED;
        this.f38397f = -1L;
        this.f38398g = -1L;
        this.f38399h = new c();
        this.f38393b = aVar.f38400a;
        int i10 = Build.VERSION.SDK_INT;
        this.f38394c = i10 >= 23 && aVar.f38401b;
        this.f38392a = aVar.f38402c;
        this.f38395d = aVar.f38403d;
        this.f38396e = aVar.f38404e;
        if (i10 >= 24) {
            this.f38399h = aVar.f38407h;
            this.f38397f = aVar.f38405f;
            this.f38398g = aVar.f38406g;
        }
    }

    public b(b bVar) {
        this.f38392a = k.NOT_REQUIRED;
        this.f38397f = -1L;
        this.f38398g = -1L;
        this.f38399h = new c();
        this.f38393b = bVar.f38393b;
        this.f38394c = bVar.f38394c;
        this.f38392a = bVar.f38392a;
        this.f38395d = bVar.f38395d;
        this.f38396e = bVar.f38396e;
        this.f38399h = bVar.f38399h;
    }
}
