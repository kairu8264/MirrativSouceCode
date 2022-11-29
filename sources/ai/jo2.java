package ai;

/* loaded from: classes3.dex */
public final class jo2 {

    /* renamed from: a  reason: collision with root package name */
    public final long f5869a;

    /* renamed from: c  reason: collision with root package name */
    public long f5871c;

    /* renamed from: b  reason: collision with root package name */
    public final ho2 f5870b = new ho2();

    /* renamed from: d  reason: collision with root package name */
    public int f5872d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f5873e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f5874f = 0;

    public jo2() {
        long currentTimeMillis = wg.t.k().currentTimeMillis();
        this.f5869a = currentTimeMillis;
        this.f5871c = currentTimeMillis;
    }

    public final void a() {
        this.f5871c = wg.t.k().currentTimeMillis();
        this.f5872d++;
    }

    public final void b() {
        this.f5873e++;
        this.f5870b.f4911w = true;
    }

    public final void c() {
        this.f5874f++;
        this.f5870b.f4912x++;
    }

    public final long d() {
        return this.f5869a;
    }

    public final long e() {
        return this.f5871c;
    }

    public final int f() {
        return this.f5872d;
    }

    public final ho2 g() {
        ho2 clone = this.f5870b.clone();
        ho2 ho2Var = this.f5870b;
        ho2Var.f4911w = false;
        ho2Var.f4912x = 0;
        return clone;
    }

    public final String h() {
        return "Created: " + this.f5869a + " Last accessed: " + this.f5871c + " Accesses: " + this.f5872d + "\nEntries retrieved: Valid: " + this.f5873e + " Stale: " + this.f5874f;
    }
}
