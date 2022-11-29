package ai;

/* loaded from: classes3.dex */
public final class ma<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f6840a;

    /* renamed from: b  reason: collision with root package name */
    public da f6841b = new da();

    /* renamed from: c  reason: collision with root package name */
    public boolean f6842c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f6843d;

    public ma(T t10) {
        this.f6840a = t10;
    }

    public final void a(la<T> laVar) {
        this.f6843d = true;
        if (this.f6842c) {
            laVar.a(this.f6840a, this.f6841b.b());
        }
    }

    public final void b(int i10, ka<T> kaVar) {
        if (this.f6843d) {
            return;
        }
        if (i10 != -1) {
            this.f6841b.a(i10);
        }
        this.f6842c = true;
        kaVar.a(this.f6840a);
    }

    public final void c(la<T> laVar) {
        if (this.f6843d || !this.f6842c) {
            return;
        }
        fa b10 = this.f6841b.b();
        this.f6841b = new da();
        this.f6842c = false;
        laVar.a(this.f6840a, b10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ma.class != obj.getClass()) {
            return false;
        }
        return this.f6840a.equals(((ma) obj).f6840a);
    }

    public final int hashCode() {
        return this.f6840a.hashCode();
    }
}
