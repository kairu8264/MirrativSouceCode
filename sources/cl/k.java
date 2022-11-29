package cl;

import cl.a0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class k extends a0.e.d {

    /* renamed from: a  reason: collision with root package name */
    public final long f19892a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19893b;

    /* renamed from: c  reason: collision with root package name */
    public final a0.e.d.a f19894c;

    /* renamed from: d  reason: collision with root package name */
    public final a0.e.d.c f19895d;

    /* renamed from: e  reason: collision with root package name */
    public final a0.e.d.AbstractC0171d f19896e;

    /* loaded from: classes4.dex */
    public static final class b extends a0.e.d.b {

        /* renamed from: a  reason: collision with root package name */
        public Long f19897a;

        /* renamed from: b  reason: collision with root package name */
        public String f19898b;

        /* renamed from: c  reason: collision with root package name */
        public a0.e.d.a f19899c;

        /* renamed from: d  reason: collision with root package name */
        public a0.e.d.c f19900d;

        /* renamed from: e  reason: collision with root package name */
        public a0.e.d.AbstractC0171d f19901e;

        @Override // cl.a0.e.d.b
        public a0.e.d a() {
            String str = "";
            if (this.f19897a == null) {
                str = " timestamp";
            }
            if (this.f19898b == null) {
                str = str + " type";
            }
            if (this.f19899c == null) {
                str = str + " app";
            }
            if (this.f19900d == null) {
                str = str + " device";
            }
            if (str.isEmpty()) {
                return new k(this.f19897a.longValue(), this.f19898b, this.f19899c, this.f19900d, this.f19901e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // cl.a0.e.d.b
        public a0.e.d.b b(a0.e.d.a aVar) {
            Objects.requireNonNull(aVar, "Null app");
            this.f19899c = aVar;
            return this;
        }

        @Override // cl.a0.e.d.b
        public a0.e.d.b c(a0.e.d.c cVar) {
            Objects.requireNonNull(cVar, "Null device");
            this.f19900d = cVar;
            return this;
        }

        @Override // cl.a0.e.d.b
        public a0.e.d.b d(a0.e.d.AbstractC0171d abstractC0171d) {
            this.f19901e = abstractC0171d;
            return this;
        }

        @Override // cl.a0.e.d.b
        public a0.e.d.b e(long j10) {
            this.f19897a = Long.valueOf(j10);
            return this;
        }

        @Override // cl.a0.e.d.b
        public a0.e.d.b f(String str) {
            Objects.requireNonNull(str, "Null type");
            this.f19898b = str;
            return this;
        }

        public b() {
        }

        public b(a0.e.d dVar) {
            this.f19897a = Long.valueOf(dVar.e());
            this.f19898b = dVar.f();
            this.f19899c = dVar.b();
            this.f19900d = dVar.c();
            this.f19901e = dVar.d();
        }
    }

    @Override // cl.a0.e.d
    public a0.e.d.a b() {
        return this.f19894c;
    }

    @Override // cl.a0.e.d
    public a0.e.d.c c() {
        return this.f19895d;
    }

    @Override // cl.a0.e.d
    public a0.e.d.AbstractC0171d d() {
        return this.f19896e;
    }

    @Override // cl.a0.e.d
    public long e() {
        return this.f19892a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d) {
            a0.e.d dVar = (a0.e.d) obj;
            if (this.f19892a == dVar.e() && this.f19893b.equals(dVar.f()) && this.f19894c.equals(dVar.b()) && this.f19895d.equals(dVar.c())) {
                a0.e.d.AbstractC0171d abstractC0171d = this.f19896e;
                if (abstractC0171d == null) {
                    if (dVar.d() == null) {
                        return true;
                    }
                } else if (abstractC0171d.equals(dVar.d())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // cl.a0.e.d
    public String f() {
        return this.f19893b;
    }

    @Override // cl.a0.e.d
    public a0.e.d.b g() {
        return new b(this);
    }

    public int hashCode() {
        long j10 = this.f19892a;
        int hashCode = (((((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f19893b.hashCode()) * 1000003) ^ this.f19894c.hashCode()) * 1000003) ^ this.f19895d.hashCode()) * 1000003;
        a0.e.d.AbstractC0171d abstractC0171d = this.f19896e;
        return hashCode ^ (abstractC0171d == null ? 0 : abstractC0171d.hashCode());
    }

    public String toString() {
        return "Event{timestamp=" + this.f19892a + ", type=" + this.f19893b + ", app=" + this.f19894c + ", device=" + this.f19895d + ", log=" + this.f19896e + "}";
    }

    public k(long j10, String str, a0.e.d.a aVar, a0.e.d.c cVar, a0.e.d.AbstractC0171d abstractC0171d) {
        this.f19892a = j10;
        this.f19893b = str;
        this.f19894c = aVar;
        this.f19895d = cVar;
        this.f19896e = abstractC0171d;
    }
}
