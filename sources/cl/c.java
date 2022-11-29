package cl;

import cl.a0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class c extends a0.a {

    /* renamed from: a  reason: collision with root package name */
    public final int f19809a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19810b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19811c;

    /* renamed from: d  reason: collision with root package name */
    public final int f19812d;

    /* renamed from: e  reason: collision with root package name */
    public final long f19813e;

    /* renamed from: f  reason: collision with root package name */
    public final long f19814f;

    /* renamed from: g  reason: collision with root package name */
    public final long f19815g;

    /* renamed from: h  reason: collision with root package name */
    public final String f19816h;

    /* loaded from: classes4.dex */
    public static final class b extends a0.a.AbstractC0158a {

        /* renamed from: a  reason: collision with root package name */
        public Integer f19817a;

        /* renamed from: b  reason: collision with root package name */
        public String f19818b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f19819c;

        /* renamed from: d  reason: collision with root package name */
        public Integer f19820d;

        /* renamed from: e  reason: collision with root package name */
        public Long f19821e;

        /* renamed from: f  reason: collision with root package name */
        public Long f19822f;

        /* renamed from: g  reason: collision with root package name */
        public Long f19823g;

        /* renamed from: h  reason: collision with root package name */
        public String f19824h;

        @Override // cl.a0.a.AbstractC0158a
        public a0.a a() {
            String str = "";
            if (this.f19817a == null) {
                str = " pid";
            }
            if (this.f19818b == null) {
                str = str + " processName";
            }
            if (this.f19819c == null) {
                str = str + " reasonCode";
            }
            if (this.f19820d == null) {
                str = str + " importance";
            }
            if (this.f19821e == null) {
                str = str + " pss";
            }
            if (this.f19822f == null) {
                str = str + " rss";
            }
            if (this.f19823g == null) {
                str = str + " timestamp";
            }
            if (str.isEmpty()) {
                return new c(this.f19817a.intValue(), this.f19818b, this.f19819c.intValue(), this.f19820d.intValue(), this.f19821e.longValue(), this.f19822f.longValue(), this.f19823g.longValue(), this.f19824h);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // cl.a0.a.AbstractC0158a
        public a0.a.AbstractC0158a b(int i10) {
            this.f19820d = Integer.valueOf(i10);
            return this;
        }

        @Override // cl.a0.a.AbstractC0158a
        public a0.a.AbstractC0158a c(int i10) {
            this.f19817a = Integer.valueOf(i10);
            return this;
        }

        @Override // cl.a0.a.AbstractC0158a
        public a0.a.AbstractC0158a d(String str) {
            Objects.requireNonNull(str, "Null processName");
            this.f19818b = str;
            return this;
        }

        @Override // cl.a0.a.AbstractC0158a
        public a0.a.AbstractC0158a e(long j10) {
            this.f19821e = Long.valueOf(j10);
            return this;
        }

        @Override // cl.a0.a.AbstractC0158a
        public a0.a.AbstractC0158a f(int i10) {
            this.f19819c = Integer.valueOf(i10);
            return this;
        }

        @Override // cl.a0.a.AbstractC0158a
        public a0.a.AbstractC0158a g(long j10) {
            this.f19822f = Long.valueOf(j10);
            return this;
        }

        @Override // cl.a0.a.AbstractC0158a
        public a0.a.AbstractC0158a h(long j10) {
            this.f19823g = Long.valueOf(j10);
            return this;
        }

        @Override // cl.a0.a.AbstractC0158a
        public a0.a.AbstractC0158a i(String str) {
            this.f19824h = str;
            return this;
        }
    }

    @Override // cl.a0.a
    public int b() {
        return this.f19812d;
    }

    @Override // cl.a0.a
    public int c() {
        return this.f19809a;
    }

    @Override // cl.a0.a
    public String d() {
        return this.f19810b;
    }

    @Override // cl.a0.a
    public long e() {
        return this.f19813e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.a) {
            a0.a aVar = (a0.a) obj;
            if (this.f19809a == aVar.c() && this.f19810b.equals(aVar.d()) && this.f19811c == aVar.f() && this.f19812d == aVar.b() && this.f19813e == aVar.e() && this.f19814f == aVar.g() && this.f19815g == aVar.h()) {
                String str = this.f19816h;
                if (str == null) {
                    if (aVar.i() == null) {
                        return true;
                    }
                } else if (str.equals(aVar.i())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // cl.a0.a
    public int f() {
        return this.f19811c;
    }

    @Override // cl.a0.a
    public long g() {
        return this.f19814f;
    }

    @Override // cl.a0.a
    public long h() {
        return this.f19815g;
    }

    public int hashCode() {
        long j10 = this.f19813e;
        long j11 = this.f19814f;
        long j12 = this.f19815g;
        int hashCode = (((((((((((((this.f19809a ^ 1000003) * 1000003) ^ this.f19810b.hashCode()) * 1000003) ^ this.f19811c) * 1000003) ^ this.f19812d) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ ((int) (j12 ^ (j12 >>> 32)))) * 1000003;
        String str = this.f19816h;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    @Override // cl.a0.a
    public String i() {
        return this.f19816h;
    }

    public String toString() {
        return "ApplicationExitInfo{pid=" + this.f19809a + ", processName=" + this.f19810b + ", reasonCode=" + this.f19811c + ", importance=" + this.f19812d + ", pss=" + this.f19813e + ", rss=" + this.f19814f + ", timestamp=" + this.f19815g + ", traceFile=" + this.f19816h + "}";
    }

    public c(int i10, String str, int i11, int i12, long j10, long j11, long j12, String str2) {
        this.f19809a = i10;
        this.f19810b = str;
        this.f19811c = i11;
        this.f19812d = i12;
        this.f19813e = j10;
        this.f19814f = j11;
        this.f19815g = j12;
        this.f19816h = str2;
    }
}
