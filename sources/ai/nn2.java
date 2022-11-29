package ai;

/* loaded from: classes3.dex */
public final class nn2 {

    /* renamed from: a  reason: collision with root package name */
    public final mn2 f7419a = new mn2();

    /* renamed from: b  reason: collision with root package name */
    public int f7420b;

    /* renamed from: c  reason: collision with root package name */
    public int f7421c;

    /* renamed from: d  reason: collision with root package name */
    public int f7422d;

    /* renamed from: e  reason: collision with root package name */
    public int f7423e;

    /* renamed from: f  reason: collision with root package name */
    public int f7424f;

    public final void a() {
        this.f7422d++;
    }

    public final void b() {
        this.f7423e++;
    }

    public final void c() {
        this.f7420b++;
        this.f7419a.f6985w = true;
    }

    public final void d() {
        this.f7421c++;
        this.f7419a.f6986x = true;
    }

    public final void e() {
        this.f7424f++;
    }

    public final mn2 f() {
        mn2 clone = this.f7419a.clone();
        mn2 mn2Var = this.f7419a;
        mn2Var.f6985w = false;
        mn2Var.f6986x = false;
        return clone;
    }

    public final String g() {
        return "\n\tPool does not exist: " + this.f7422d + "\n\tNew pools created: " + this.f7420b + "\n\tPools removed: " + this.f7421c + "\n\tEntries added: " + this.f7424f + "\n\tNo entries retrieved: " + this.f7423e + "\n";
    }
}
