package o7;

/* loaded from: classes.dex */
public class p<Z> implements u<Z> {
    public final m7.e A;
    public int B;
    public boolean C;

    /* renamed from: w  reason: collision with root package name */
    public final boolean f44236w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f44237x;

    /* renamed from: y  reason: collision with root package name */
    public final u<Z> f44238y;

    /* renamed from: z  reason: collision with root package name */
    public final a f44239z;

    /* loaded from: classes.dex */
    public interface a {
        void b(m7.e eVar, p<?> pVar);
    }

    public p(u<Z> uVar, boolean z10, boolean z11, m7.e eVar, a aVar) {
        this.f44238y = (u) i8.j.d(uVar);
        this.f44236w = z10;
        this.f44237x = z11;
        this.A = eVar;
        this.f44239z = (a) i8.j.d(aVar);
    }

    @Override // o7.u
    public int a() {
        return this.f44238y.a();
    }

    public synchronized void b() {
        if (!this.C) {
            this.B++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    @Override // o7.u
    public synchronized void c() {
        if (this.B <= 0) {
            if (!this.C) {
                this.C = true;
                if (this.f44237x) {
                    this.f44238y.c();
                }
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    @Override // o7.u
    public Class<Z> d() {
        return this.f44238y.d();
    }

    public u<Z> e() {
        return this.f44238y;
    }

    public boolean f() {
        return this.f44236w;
    }

    public void g() {
        boolean z10;
        synchronized (this) {
            int i10 = this.B;
            if (i10 > 0) {
                z10 = true;
                int i11 = i10 - 1;
                this.B = i11;
                if (i11 != 0) {
                    z10 = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z10) {
            this.f44239z.b(this.A, this);
        }
    }

    @Override // o7.u
    public Z get() {
        return this.f44238y.get();
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f44236w + ", listener=" + this.f44239z + ", key=" + this.A + ", acquired=" + this.B + ", isRecycled=" + this.C + ", resource=" + this.f44238y + '}';
    }
}
