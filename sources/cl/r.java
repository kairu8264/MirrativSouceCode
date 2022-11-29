package cl;

import cl.a0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class r extends a0.e.d.a.b.AbstractC0167e.AbstractC0169b {

    /* renamed from: a  reason: collision with root package name */
    public final long f19952a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19953b;

    /* renamed from: c  reason: collision with root package name */
    public final String f19954c;

    /* renamed from: d  reason: collision with root package name */
    public final long f19955d;

    /* renamed from: e  reason: collision with root package name */
    public final int f19956e;

    /* loaded from: classes4.dex */
    public static final class b extends a0.e.d.a.b.AbstractC0167e.AbstractC0169b.AbstractC0170a {

        /* renamed from: a  reason: collision with root package name */
        public Long f19957a;

        /* renamed from: b  reason: collision with root package name */
        public String f19958b;

        /* renamed from: c  reason: collision with root package name */
        public String f19959c;

        /* renamed from: d  reason: collision with root package name */
        public Long f19960d;

        /* renamed from: e  reason: collision with root package name */
        public Integer f19961e;

        @Override // cl.a0.e.d.a.b.AbstractC0167e.AbstractC0169b.AbstractC0170a
        public a0.e.d.a.b.AbstractC0167e.AbstractC0169b a() {
            String str = "";
            if (this.f19957a == null) {
                str = " pc";
            }
            if (this.f19958b == null) {
                str = str + " symbol";
            }
            if (this.f19960d == null) {
                str = str + " offset";
            }
            if (this.f19961e == null) {
                str = str + " importance";
            }
            if (str.isEmpty()) {
                return new r(this.f19957a.longValue(), this.f19958b, this.f19959c, this.f19960d.longValue(), this.f19961e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // cl.a0.e.d.a.b.AbstractC0167e.AbstractC0169b.AbstractC0170a
        public a0.e.d.a.b.AbstractC0167e.AbstractC0169b.AbstractC0170a b(String str) {
            this.f19959c = str;
            return this;
        }

        @Override // cl.a0.e.d.a.b.AbstractC0167e.AbstractC0169b.AbstractC0170a
        public a0.e.d.a.b.AbstractC0167e.AbstractC0169b.AbstractC0170a c(int i10) {
            this.f19961e = Integer.valueOf(i10);
            return this;
        }

        @Override // cl.a0.e.d.a.b.AbstractC0167e.AbstractC0169b.AbstractC0170a
        public a0.e.d.a.b.AbstractC0167e.AbstractC0169b.AbstractC0170a d(long j10) {
            this.f19960d = Long.valueOf(j10);
            return this;
        }

        @Override // cl.a0.e.d.a.b.AbstractC0167e.AbstractC0169b.AbstractC0170a
        public a0.e.d.a.b.AbstractC0167e.AbstractC0169b.AbstractC0170a e(long j10) {
            this.f19957a = Long.valueOf(j10);
            return this;
        }

        @Override // cl.a0.e.d.a.b.AbstractC0167e.AbstractC0169b.AbstractC0170a
        public a0.e.d.a.b.AbstractC0167e.AbstractC0169b.AbstractC0170a f(String str) {
            Objects.requireNonNull(str, "Null symbol");
            this.f19958b = str;
            return this;
        }
    }

    @Override // cl.a0.e.d.a.b.AbstractC0167e.AbstractC0169b
    public String b() {
        return this.f19954c;
    }

    @Override // cl.a0.e.d.a.b.AbstractC0167e.AbstractC0169b
    public int c() {
        return this.f19956e;
    }

    @Override // cl.a0.e.d.a.b.AbstractC0167e.AbstractC0169b
    public long d() {
        return this.f19955d;
    }

    @Override // cl.a0.e.d.a.b.AbstractC0167e.AbstractC0169b
    public long e() {
        return this.f19952a;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.d.a.b.AbstractC0167e.AbstractC0169b) {
            a0.e.d.a.b.AbstractC0167e.AbstractC0169b abstractC0169b = (a0.e.d.a.b.AbstractC0167e.AbstractC0169b) obj;
            return this.f19952a == abstractC0169b.e() && this.f19953b.equals(abstractC0169b.f()) && ((str = this.f19954c) != null ? str.equals(abstractC0169b.b()) : abstractC0169b.b() == null) && this.f19955d == abstractC0169b.d() && this.f19956e == abstractC0169b.c();
        }
        return false;
    }

    @Override // cl.a0.e.d.a.b.AbstractC0167e.AbstractC0169b
    public String f() {
        return this.f19953b;
    }

    public int hashCode() {
        long j10 = this.f19952a;
        int hashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f19953b.hashCode()) * 1000003;
        String str = this.f19954c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j11 = this.f19955d;
        return ((((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f19956e;
    }

    public String toString() {
        return "Frame{pc=" + this.f19952a + ", symbol=" + this.f19953b + ", file=" + this.f19954c + ", offset=" + this.f19955d + ", importance=" + this.f19956e + "}";
    }

    public r(long j10, String str, String str2, long j11, int i10) {
        this.f19952a = j10;
        this.f19953b = str;
        this.f19954c = str2;
        this.f19955d = j11;
        this.f19956e = i10;
    }
}
