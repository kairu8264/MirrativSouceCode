package cg;

import cg.i;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class b extends i {

    /* renamed from: a  reason: collision with root package name */
    public final String f19582a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f19583b;

    /* renamed from: c  reason: collision with root package name */
    public final h f19584c;

    /* renamed from: d  reason: collision with root package name */
    public final long f19585d;

    /* renamed from: e  reason: collision with root package name */
    public final long f19586e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, String> f19587f;

    /* renamed from: cg.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0156b extends i.a {

        /* renamed from: a  reason: collision with root package name */
        public String f19588a;

        /* renamed from: b  reason: collision with root package name */
        public Integer f19589b;

        /* renamed from: c  reason: collision with root package name */
        public h f19590c;

        /* renamed from: d  reason: collision with root package name */
        public Long f19591d;

        /* renamed from: e  reason: collision with root package name */
        public Long f19592e;

        /* renamed from: f  reason: collision with root package name */
        public Map<String, String> f19593f;

        @Override // cg.i.a
        public i d() {
            String str = "";
            if (this.f19588a == null) {
                str = " transportName";
            }
            if (this.f19590c == null) {
                str = str + " encodedPayload";
            }
            if (this.f19591d == null) {
                str = str + " eventMillis";
            }
            if (this.f19592e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f19593f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new b(this.f19588a, this.f19589b, this.f19590c, this.f19591d.longValue(), this.f19592e.longValue(), this.f19593f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // cg.i.a
        public Map<String, String> e() {
            Map<String, String> map = this.f19593f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // cg.i.a
        public i.a f(Map<String, String> map) {
            Objects.requireNonNull(map, "Null autoMetadata");
            this.f19593f = map;
            return this;
        }

        @Override // cg.i.a
        public i.a g(Integer num) {
            this.f19589b = num;
            return this;
        }

        @Override // cg.i.a
        public i.a h(h hVar) {
            Objects.requireNonNull(hVar, "Null encodedPayload");
            this.f19590c = hVar;
            return this;
        }

        @Override // cg.i.a
        public i.a i(long j10) {
            this.f19591d = Long.valueOf(j10);
            return this;
        }

        @Override // cg.i.a
        public i.a j(String str) {
            Objects.requireNonNull(str, "Null transportName");
            this.f19588a = str;
            return this;
        }

        @Override // cg.i.a
        public i.a k(long j10) {
            this.f19592e = Long.valueOf(j10);
            return this;
        }
    }

    @Override // cg.i
    public Map<String, String> c() {
        return this.f19587f;
    }

    @Override // cg.i
    public Integer d() {
        return this.f19583b;
    }

    @Override // cg.i
    public h e() {
        return this.f19584c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            return this.f19582a.equals(iVar.j()) && ((num = this.f19583b) != null ? num.equals(iVar.d()) : iVar.d() == null) && this.f19584c.equals(iVar.e()) && this.f19585d == iVar.f() && this.f19586e == iVar.k() && this.f19587f.equals(iVar.c());
        }
        return false;
    }

    @Override // cg.i
    public long f() {
        return this.f19585d;
    }

    public int hashCode() {
        int hashCode = (this.f19582a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f19583b;
        int hashCode2 = num == null ? 0 : num.hashCode();
        long j10 = this.f19585d;
        long j11 = this.f19586e;
        return ((((((((hashCode ^ hashCode2) * 1000003) ^ this.f19584c.hashCode()) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ this.f19587f.hashCode();
    }

    @Override // cg.i
    public String j() {
        return this.f19582a;
    }

    @Override // cg.i
    public long k() {
        return this.f19586e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.f19582a + ", code=" + this.f19583b + ", encodedPayload=" + this.f19584c + ", eventMillis=" + this.f19585d + ", uptimeMillis=" + this.f19586e + ", autoMetadata=" + this.f19587f + "}";
    }

    public b(String str, Integer num, h hVar, long j10, long j11, Map<String, String> map) {
        this.f19582a = str;
        this.f19583b = num;
        this.f19584c = hVar;
        this.f19585d = j10;
        this.f19586e = j11;
        this.f19587f = map;
    }
}
