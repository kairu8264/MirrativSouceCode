package cl;

import cl.a0;

/* loaded from: classes4.dex */
public final class s extends a0.e.d.c {

    /* renamed from: a  reason: collision with root package name */
    public final Double f19962a;

    /* renamed from: b  reason: collision with root package name */
    public final int f19963b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f19964c;

    /* renamed from: d  reason: collision with root package name */
    public final int f19965d;

    /* renamed from: e  reason: collision with root package name */
    public final long f19966e;

    /* renamed from: f  reason: collision with root package name */
    public final long f19967f;

    /* loaded from: classes4.dex */
    public static final class b extends a0.e.d.c.a {

        /* renamed from: a  reason: collision with root package name */
        public Double f19968a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f19969b;

        /* renamed from: c  reason: collision with root package name */
        public Boolean f19970c;

        /* renamed from: d  reason: collision with root package name */
        public Integer f19971d;

        /* renamed from: e  reason: collision with root package name */
        public Long f19972e;

        /* renamed from: f  reason: collision with root package name */
        public Long f19973f;

        @Override // cl.a0.e.d.c.a
        public a0.e.d.c a() {
            String str = "";
            if (this.f19969b == null) {
                str = " batteryVelocity";
            }
            if (this.f19970c == null) {
                str = str + " proximityOn";
            }
            if (this.f19971d == null) {
                str = str + " orientation";
            }
            if (this.f19972e == null) {
                str = str + " ramUsed";
            }
            if (this.f19973f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new s(this.f19968a, this.f19969b.intValue(), this.f19970c.booleanValue(), this.f19971d.intValue(), this.f19972e.longValue(), this.f19973f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // cl.a0.e.d.c.a
        public a0.e.d.c.a b(Double d10) {
            this.f19968a = d10;
            return this;
        }

        @Override // cl.a0.e.d.c.a
        public a0.e.d.c.a c(int i10) {
            this.f19969b = Integer.valueOf(i10);
            return this;
        }

        @Override // cl.a0.e.d.c.a
        public a0.e.d.c.a d(long j10) {
            this.f19973f = Long.valueOf(j10);
            return this;
        }

        @Override // cl.a0.e.d.c.a
        public a0.e.d.c.a e(int i10) {
            this.f19971d = Integer.valueOf(i10);
            return this;
        }

        @Override // cl.a0.e.d.c.a
        public a0.e.d.c.a f(boolean z10) {
            this.f19970c = Boolean.valueOf(z10);
            return this;
        }

        @Override // cl.a0.e.d.c.a
        public a0.e.d.c.a g(long j10) {
            this.f19972e = Long.valueOf(j10);
            return this;
        }
    }

    @Override // cl.a0.e.d.c
    public Double b() {
        return this.f19962a;
    }

    @Override // cl.a0.e.d.c
    public int c() {
        return this.f19963b;
    }

    @Override // cl.a0.e.d.c
    public long d() {
        return this.f19967f;
    }

    @Override // cl.a0.e.d.c
    public int e() {
        return this.f19965d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.c) {
            a0.e.d.c cVar = (a0.e.d.c) obj;
            Double d10 = this.f19962a;
            if (d10 != null ? d10.equals(cVar.b()) : cVar.b() == null) {
                if (this.f19963b == cVar.c() && this.f19964c == cVar.g() && this.f19965d == cVar.e() && this.f19966e == cVar.f() && this.f19967f == cVar.d()) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // cl.a0.e.d.c
    public long f() {
        return this.f19966e;
    }

    @Override // cl.a0.e.d.c
    public boolean g() {
        return this.f19964c;
    }

    public int hashCode() {
        Double d10 = this.f19962a;
        int hashCode = ((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f19963b) * 1000003;
        int i10 = this.f19964c ? 1231 : 1237;
        long j10 = this.f19966e;
        long j11 = this.f19967f;
        return ((((((hashCode ^ i10) * 1000003) ^ this.f19965d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.f19962a + ", batteryVelocity=" + this.f19963b + ", proximityOn=" + this.f19964c + ", orientation=" + this.f19965d + ", ramUsed=" + this.f19966e + ", diskUsed=" + this.f19967f + "}";
    }

    public s(Double d10, int i10, boolean z10, int i11, long j10, long j11) {
        this.f19962a = d10;
        this.f19963b = i10;
        this.f19964c = z10;
        this.f19965d = i11;
        this.f19966e = j10;
        this.f19967f = j11;
    }
}
