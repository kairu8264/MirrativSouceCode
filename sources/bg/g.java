package bg;

import bg.m;
import java.util.List;

/* loaded from: classes3.dex */
public final class g extends m {

    /* renamed from: a  reason: collision with root package name */
    public final long f18440a;

    /* renamed from: b  reason: collision with root package name */
    public final long f18441b;

    /* renamed from: c  reason: collision with root package name */
    public final k f18442c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f18443d;

    /* renamed from: e  reason: collision with root package name */
    public final String f18444e;

    /* renamed from: f  reason: collision with root package name */
    public final List<l> f18445f;

    /* renamed from: g  reason: collision with root package name */
    public final p f18446g;

    /* loaded from: classes3.dex */
    public static final class b extends m.a {

        /* renamed from: a  reason: collision with root package name */
        public Long f18447a;

        /* renamed from: b  reason: collision with root package name */
        public Long f18448b;

        /* renamed from: c  reason: collision with root package name */
        public k f18449c;

        /* renamed from: d  reason: collision with root package name */
        public Integer f18450d;

        /* renamed from: e  reason: collision with root package name */
        public String f18451e;

        /* renamed from: f  reason: collision with root package name */
        public List<l> f18452f;

        /* renamed from: g  reason: collision with root package name */
        public p f18453g;

        @Override // bg.m.a
        public m a() {
            String str = "";
            if (this.f18447a == null) {
                str = " requestTimeMs";
            }
            if (this.f18448b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new g(this.f18447a.longValue(), this.f18448b.longValue(), this.f18449c, this.f18450d, this.f18451e, this.f18452f, this.f18453g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // bg.m.a
        public m.a b(k kVar) {
            this.f18449c = kVar;
            return this;
        }

        @Override // bg.m.a
        public m.a c(List<l> list) {
            this.f18452f = list;
            return this;
        }

        @Override // bg.m.a
        public m.a d(Integer num) {
            this.f18450d = num;
            return this;
        }

        @Override // bg.m.a
        public m.a e(String str) {
            this.f18451e = str;
            return this;
        }

        @Override // bg.m.a
        public m.a f(p pVar) {
            this.f18453g = pVar;
            return this;
        }

        @Override // bg.m.a
        public m.a g(long j10) {
            this.f18447a = Long.valueOf(j10);
            return this;
        }

        @Override // bg.m.a
        public m.a h(long j10) {
            this.f18448b = Long.valueOf(j10);
            return this;
        }
    }

    @Override // bg.m
    public k b() {
        return this.f18442c;
    }

    @Override // bg.m
    public List<l> c() {
        return this.f18445f;
    }

    @Override // bg.m
    public Integer d() {
        return this.f18443d;
    }

    @Override // bg.m
    public String e() {
        return this.f18444e;
    }

    public boolean equals(Object obj) {
        k kVar;
        Integer num;
        String str;
        List<l> list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f18440a == mVar.g() && this.f18441b == mVar.h() && ((kVar = this.f18442c) != null ? kVar.equals(mVar.b()) : mVar.b() == null) && ((num = this.f18443d) != null ? num.equals(mVar.d()) : mVar.d() == null) && ((str = this.f18444e) != null ? str.equals(mVar.e()) : mVar.e() == null) && ((list = this.f18445f) != null ? list.equals(mVar.c()) : mVar.c() == null)) {
                p pVar = this.f18446g;
                if (pVar == null) {
                    if (mVar.f() == null) {
                        return true;
                    }
                } else if (pVar.equals(mVar.f())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // bg.m
    public p f() {
        return this.f18446g;
    }

    @Override // bg.m
    public long g() {
        return this.f18440a;
    }

    @Override // bg.m
    public long h() {
        return this.f18441b;
    }

    public int hashCode() {
        long j10 = this.f18440a;
        long j11 = this.f18441b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        k kVar = this.f18442c;
        int hashCode = (i10 ^ (kVar == null ? 0 : kVar.hashCode())) * 1000003;
        Integer num = this.f18443d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f18444e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<l> list = this.f18445f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        p pVar = this.f18446g;
        return hashCode4 ^ (pVar != null ? pVar.hashCode() : 0);
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f18440a + ", requestUptimeMs=" + this.f18441b + ", clientInfo=" + this.f18442c + ", logSource=" + this.f18443d + ", logSourceName=" + this.f18444e + ", logEvents=" + this.f18445f + ", qosTier=" + this.f18446g + "}";
    }

    public g(long j10, long j11, k kVar, Integer num, String str, List<l> list, p pVar) {
        this.f18440a = j10;
        this.f18441b = j11;
        this.f18442c = kVar;
        this.f18443d = num;
        this.f18444e = str;
        this.f18445f = list;
        this.f18446g = pVar;
    }
}
