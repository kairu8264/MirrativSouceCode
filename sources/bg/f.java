package bg;

import bg.l;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class f extends l {

    /* renamed from: a  reason: collision with root package name */
    public final long f18426a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f18427b;

    /* renamed from: c  reason: collision with root package name */
    public final long f18428c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f18429d;

    /* renamed from: e  reason: collision with root package name */
    public final String f18430e;

    /* renamed from: f  reason: collision with root package name */
    public final long f18431f;

    /* renamed from: g  reason: collision with root package name */
    public final o f18432g;

    /* loaded from: classes3.dex */
    public static final class b extends l.a {

        /* renamed from: a  reason: collision with root package name */
        public Long f18433a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f18434b;

        /* renamed from: c  reason: collision with root package name */
        public Long f18435c;

        /* renamed from: d  reason: collision with root package name */
        public byte[] f18436d;

        /* renamed from: e  reason: collision with root package name */
        public String f18437e;

        /* renamed from: f  reason: collision with root package name */
        public Long f18438f;

        /* renamed from: g  reason: collision with root package name */
        public o f18439g;

        @Override // bg.l.a
        public l a() {
            String str = "";
            if (this.f18433a == null) {
                str = " eventTimeMs";
            }
            if (this.f18435c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f18438f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f18433a.longValue(), this.f18434b, this.f18435c.longValue(), this.f18436d, this.f18437e, this.f18438f.longValue(), this.f18439g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // bg.l.a
        public l.a b(Integer num) {
            this.f18434b = num;
            return this;
        }

        @Override // bg.l.a
        public l.a c(long j10) {
            this.f18433a = Long.valueOf(j10);
            return this;
        }

        @Override // bg.l.a
        public l.a d(long j10) {
            this.f18435c = Long.valueOf(j10);
            return this;
        }

        @Override // bg.l.a
        public l.a e(o oVar) {
            this.f18439g = oVar;
            return this;
        }

        @Override // bg.l.a
        public l.a f(byte[] bArr) {
            this.f18436d = bArr;
            return this;
        }

        @Override // bg.l.a
        public l.a g(String str) {
            this.f18437e = str;
            return this;
        }

        @Override // bg.l.a
        public l.a h(long j10) {
            this.f18438f = Long.valueOf(j10);
            return this;
        }
    }

    @Override // bg.l
    public Integer b() {
        return this.f18427b;
    }

    @Override // bg.l
    public long c() {
        return this.f18426a;
    }

    @Override // bg.l
    public long d() {
        return this.f18428c;
    }

    @Override // bg.l
    public o e() {
        return this.f18432g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (this.f18426a == lVar.c() && ((num = this.f18427b) != null ? num.equals(lVar.b()) : lVar.b() == null) && this.f18428c == lVar.d()) {
                if (Arrays.equals(this.f18429d, lVar instanceof f ? ((f) lVar).f18429d : lVar.f()) && ((str = this.f18430e) != null ? str.equals(lVar.g()) : lVar.g() == null) && this.f18431f == lVar.h()) {
                    o oVar = this.f18432g;
                    if (oVar == null) {
                        if (lVar.e() == null) {
                            return true;
                        }
                    } else if (oVar.equals(lVar.e())) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }

    @Override // bg.l
    public byte[] f() {
        return this.f18429d;
    }

    @Override // bg.l
    public String g() {
        return this.f18430e;
    }

    @Override // bg.l
    public long h() {
        return this.f18431f;
    }

    public int hashCode() {
        long j10 = this.f18426a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f18427b;
        int hashCode = num == null ? 0 : num.hashCode();
        long j11 = this.f18428c;
        int hashCode2 = (((((i10 ^ hashCode) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f18429d)) * 1000003;
        String str = this.f18430e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j12 = this.f18431f;
        int i11 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        o oVar = this.f18432g;
        return i11 ^ (oVar != null ? oVar.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f18426a + ", eventCode=" + this.f18427b + ", eventUptimeMs=" + this.f18428c + ", sourceExtension=" + Arrays.toString(this.f18429d) + ", sourceExtensionJsonProto3=" + this.f18430e + ", timezoneOffsetSeconds=" + this.f18431f + ", networkConnectionInfo=" + this.f18432g + "}";
    }

    public f(long j10, Integer num, long j11, byte[] bArr, String str, long j12, o oVar) {
        this.f18426a = j10;
        this.f18427b = num;
        this.f18428c = j11;
        this.f18429d = bArr;
        this.f18430e = str;
        this.f18431f = j12;
        this.f18432g = oVar;
    }
}
