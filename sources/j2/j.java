package j2;

import m2.r;
import m2.s;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c  reason: collision with root package name */
    public static final a f37103c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    public static final j f37104d = new j(0, 0, 3, null);

    /* renamed from: a  reason: collision with root package name */
    public final long f37105a;

    /* renamed from: b  reason: collision with root package name */
    public final long f37106b;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final j a() {
            return j.f37104d;
        }
    }

    public j(long j10, long j11) {
        this.f37105a = j10;
        this.f37106b = j11;
    }

    public /* synthetic */ j(long j10, long j11, jo.h hVar) {
        this(j10, j11);
    }

    public final long b() {
        return this.f37105a;
    }

    public final long c() {
        return this.f37106b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return r.e(this.f37105a, jVar.f37105a) && r.e(this.f37106b, jVar.f37106b);
        }
        return false;
    }

    public int hashCode() {
        return (r.i(this.f37105a) * 31) + r.i(this.f37106b);
    }

    public String toString() {
        return "TextIndent(firstLine=" + ((Object) r.j(this.f37105a)) + ", restLine=" + ((Object) r.j(this.f37106b)) + ')';
    }

    public /* synthetic */ j(long j10, long j11, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? s.d(0) : j10, (i10 & 2) != 0 ? s.d(0) : j11, null);
    }
}
