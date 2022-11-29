package cl;

import cl.a0;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class j extends a0.e.c {

    /* renamed from: a  reason: collision with root package name */
    public final int f19874a;

    /* renamed from: b  reason: collision with root package name */
    public final String f19875b;

    /* renamed from: c  reason: collision with root package name */
    public final int f19876c;

    /* renamed from: d  reason: collision with root package name */
    public final long f19877d;

    /* renamed from: e  reason: collision with root package name */
    public final long f19878e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f19879f;

    /* renamed from: g  reason: collision with root package name */
    public final int f19880g;

    /* renamed from: h  reason: collision with root package name */
    public final String f19881h;

    /* renamed from: i  reason: collision with root package name */
    public final String f19882i;

    /* loaded from: classes4.dex */
    public static final class b extends a0.e.c.a {

        /* renamed from: a  reason: collision with root package name */
        public Integer f19883a;

        /* renamed from: b  reason: collision with root package name */
        public String f19884b;

        /* renamed from: c  reason: collision with root package name */
        public Integer f19885c;

        /* renamed from: d  reason: collision with root package name */
        public Long f19886d;

        /* renamed from: e  reason: collision with root package name */
        public Long f19887e;

        /* renamed from: f  reason: collision with root package name */
        public Boolean f19888f;

        /* renamed from: g  reason: collision with root package name */
        public Integer f19889g;

        /* renamed from: h  reason: collision with root package name */
        public String f19890h;

        /* renamed from: i  reason: collision with root package name */
        public String f19891i;

        @Override // cl.a0.e.c.a
        public a0.e.c a() {
            String str = "";
            if (this.f19883a == null) {
                str = " arch";
            }
            if (this.f19884b == null) {
                str = str + " model";
            }
            if (this.f19885c == null) {
                str = str + " cores";
            }
            if (this.f19886d == null) {
                str = str + " ram";
            }
            if (this.f19887e == null) {
                str = str + " diskSpace";
            }
            if (this.f19888f == null) {
                str = str + " simulator";
            }
            if (this.f19889g == null) {
                str = str + " state";
            }
            if (this.f19890h == null) {
                str = str + " manufacturer";
            }
            if (this.f19891i == null) {
                str = str + " modelClass";
            }
            if (str.isEmpty()) {
                return new j(this.f19883a.intValue(), this.f19884b, this.f19885c.intValue(), this.f19886d.longValue(), this.f19887e.longValue(), this.f19888f.booleanValue(), this.f19889g.intValue(), this.f19890h, this.f19891i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // cl.a0.e.c.a
        public a0.e.c.a b(int i10) {
            this.f19883a = Integer.valueOf(i10);
            return this;
        }

        @Override // cl.a0.e.c.a
        public a0.e.c.a c(int i10) {
            this.f19885c = Integer.valueOf(i10);
            return this;
        }

        @Override // cl.a0.e.c.a
        public a0.e.c.a d(long j10) {
            this.f19887e = Long.valueOf(j10);
            return this;
        }

        @Override // cl.a0.e.c.a
        public a0.e.c.a e(String str) {
            Objects.requireNonNull(str, "Null manufacturer");
            this.f19890h = str;
            return this;
        }

        @Override // cl.a0.e.c.a
        public a0.e.c.a f(String str) {
            Objects.requireNonNull(str, "Null model");
            this.f19884b = str;
            return this;
        }

        @Override // cl.a0.e.c.a
        public a0.e.c.a g(String str) {
            Objects.requireNonNull(str, "Null modelClass");
            this.f19891i = str;
            return this;
        }

        @Override // cl.a0.e.c.a
        public a0.e.c.a h(long j10) {
            this.f19886d = Long.valueOf(j10);
            return this;
        }

        @Override // cl.a0.e.c.a
        public a0.e.c.a i(boolean z10) {
            this.f19888f = Boolean.valueOf(z10);
            return this;
        }

        @Override // cl.a0.e.c.a
        public a0.e.c.a j(int i10) {
            this.f19889g = Integer.valueOf(i10);
            return this;
        }
    }

    @Override // cl.a0.e.c
    public int b() {
        return this.f19874a;
    }

    @Override // cl.a0.e.c
    public int c() {
        return this.f19876c;
    }

    @Override // cl.a0.e.c
    public long d() {
        return this.f19878e;
    }

    @Override // cl.a0.e.c
    public String e() {
        return this.f19881h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0.e.c) {
            a0.e.c cVar = (a0.e.c) obj;
            return this.f19874a == cVar.b() && this.f19875b.equals(cVar.f()) && this.f19876c == cVar.c() && this.f19877d == cVar.h() && this.f19878e == cVar.d() && this.f19879f == cVar.j() && this.f19880g == cVar.i() && this.f19881h.equals(cVar.e()) && this.f19882i.equals(cVar.g());
        }
        return false;
    }

    @Override // cl.a0.e.c
    public String f() {
        return this.f19875b;
    }

    @Override // cl.a0.e.c
    public String g() {
        return this.f19882i;
    }

    @Override // cl.a0.e.c
    public long h() {
        return this.f19877d;
    }

    public int hashCode() {
        long j10 = this.f19877d;
        long j11 = this.f19878e;
        return ((((((((((((((((this.f19874a ^ 1000003) * 1000003) ^ this.f19875b.hashCode()) * 1000003) ^ this.f19876c) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ (this.f19879f ? 1231 : 1237)) * 1000003) ^ this.f19880g) * 1000003) ^ this.f19881h.hashCode()) * 1000003) ^ this.f19882i.hashCode();
    }

    @Override // cl.a0.e.c
    public int i() {
        return this.f19880g;
    }

    @Override // cl.a0.e.c
    public boolean j() {
        return this.f19879f;
    }

    public String toString() {
        return "Device{arch=" + this.f19874a + ", model=" + this.f19875b + ", cores=" + this.f19876c + ", ram=" + this.f19877d + ", diskSpace=" + this.f19878e + ", simulator=" + this.f19879f + ", state=" + this.f19880g + ", manufacturer=" + this.f19881h + ", modelClass=" + this.f19882i + "}";
    }

    public j(int i10, String str, int i11, long j10, long j11, boolean z10, int i12, String str2, String str3) {
        this.f19874a = i10;
        this.f19875b = str;
        this.f19876c = i11;
        this.f19877d = j10;
        this.f19878e = j11;
        this.f19879f = z10;
        this.f19880g = i12;
        this.f19881h = str2;
        this.f19882i = str3;
    }
}
