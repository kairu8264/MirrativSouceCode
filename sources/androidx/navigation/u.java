package androidx.navigation;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public boolean f15792a;

    /* renamed from: b  reason: collision with root package name */
    public int f15793b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f15794c;

    /* renamed from: d  reason: collision with root package name */
    public int f15795d;

    /* renamed from: e  reason: collision with root package name */
    public int f15796e;

    /* renamed from: f  reason: collision with root package name */
    public int f15797f;

    /* renamed from: g  reason: collision with root package name */
    public int f15798g;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public boolean f15799a;

        /* renamed from: c  reason: collision with root package name */
        public boolean f15801c;

        /* renamed from: b  reason: collision with root package name */
        public int f15800b = -1;

        /* renamed from: d  reason: collision with root package name */
        public int f15802d = -1;

        /* renamed from: e  reason: collision with root package name */
        public int f15803e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f15804f = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f15805g = -1;

        public u a() {
            return new u(this.f15799a, this.f15800b, this.f15801c, this.f15802d, this.f15803e, this.f15804f, this.f15805g);
        }

        public a b(int i10) {
            this.f15802d = i10;
            return this;
        }

        public a c(int i10) {
            this.f15803e = i10;
            return this;
        }

        public a d(boolean z10) {
            this.f15799a = z10;
            return this;
        }

        public a e(int i10) {
            this.f15804f = i10;
            return this;
        }

        public a f(int i10) {
            this.f15805g = i10;
            return this;
        }

        public a g(int i10, boolean z10) {
            this.f15800b = i10;
            this.f15801c = z10;
            return this;
        }
    }

    public u(boolean z10, int i10, boolean z11, int i11, int i12, int i13, int i14) {
        this.f15792a = z10;
        this.f15793b = i10;
        this.f15794c = z11;
        this.f15795d = i11;
        this.f15796e = i12;
        this.f15797f = i13;
        this.f15798g = i14;
    }

    public int a() {
        return this.f15795d;
    }

    public int b() {
        return this.f15796e;
    }

    public int c() {
        return this.f15797f;
    }

    public int d() {
        return this.f15798g;
    }

    public int e() {
        return this.f15793b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        return this.f15792a == uVar.f15792a && this.f15793b == uVar.f15793b && this.f15794c == uVar.f15794c && this.f15795d == uVar.f15795d && this.f15796e == uVar.f15796e && this.f15797f == uVar.f15797f && this.f15798g == uVar.f15798g;
    }

    public boolean f() {
        return this.f15794c;
    }

    public boolean g() {
        return this.f15792a;
    }

    public int hashCode() {
        return ((((((((((((g() ? 1 : 0) * 31) + e()) * 31) + (f() ? 1 : 0)) * 31) + a()) * 31) + b()) * 31) + c()) * 31) + d();
    }
}
