package n6;

import android.graphics.drawable.Drawable;
import j6.e;
import j6.j;
import j6.p;
import jo.h;
import k6.g;
import n6.c;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public final d f41583a;

    /* renamed from: b  reason: collision with root package name */
    public final j f41584b;

    /* renamed from: c  reason: collision with root package name */
    public final int f41585c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f41586d;

    public a(d dVar, j jVar, int i10, boolean z10) {
        this.f41583a = dVar;
        this.f41584b = jVar;
        this.f41585c = i10;
        this.f41586d = z10;
        if (!(i10 > 0)) {
            throw new IllegalArgumentException("durationMillis must be > 0.".toString());
        }
    }

    @Override // n6.c
    public void a() {
        Drawable l10 = this.f41583a.l();
        Drawable a10 = this.f41584b.a();
        g J = this.f41584b.b().J();
        int i10 = this.f41585c;
        j jVar = this.f41584b;
        c6.a aVar = new c6.a(l10, a10, J, i10, ((jVar instanceof p) && ((p) jVar).d()) ? false : true, this.f41586d);
        j jVar2 = this.f41584b;
        if (jVar2 instanceof p) {
            this.f41583a.e(aVar);
        } else if (jVar2 instanceof e) {
            this.f41583a.k(aVar);
        }
    }

    public final int b() {
        return this.f41585c;
    }

    public final boolean c() {
        return this.f41586d;
    }

    /* renamed from: n6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0616a implements c.a {

        /* renamed from: c  reason: collision with root package name */
        public final int f41587c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f41588d;

        public C0616a() {
            this(0, false, 3, null);
        }

        public C0616a(int i10, boolean z10) {
            this.f41587c = i10;
            this.f41588d = z10;
            if (!(i10 > 0)) {
                throw new IllegalArgumentException("durationMillis must be > 0.".toString());
            }
        }

        @Override // n6.c.a
        public c a(d dVar, j jVar) {
            if (!(jVar instanceof p)) {
                return c.a.f41592b.a(dVar, jVar);
            }
            if (((p) jVar).c() == a6.d.MEMORY_CACHE) {
                return c.a.f41592b.a(dVar, jVar);
            }
            return new a(dVar, jVar, this.f41587c, this.f41588d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0616a) {
                C0616a c0616a = (C0616a) obj;
                if (this.f41587c == c0616a.f41587c && this.f41588d == c0616a.f41588d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f41587c * 31) + Boolean.hashCode(this.f41588d);
        }

        public /* synthetic */ C0616a(int i10, boolean z10, int i11, h hVar) {
            this((i11 & 1) != 0 ? 100 : i10, (i11 & 2) != 0 ? false : z10);
        }
    }
}
