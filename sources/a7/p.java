package a7;

/* loaded from: classes.dex */
public class p implements c {

    /* renamed from: a  reason: collision with root package name */
    public final String f615a;

    /* renamed from: b  reason: collision with root package name */
    public final int f616b;

    /* renamed from: c  reason: collision with root package name */
    public final z6.h f617c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f618d;

    public p(String str, int i10, z6.h hVar, boolean z10) {
        this.f615a = str;
        this.f616b = i10;
        this.f617c = hVar;
        this.f618d = z10;
    }

    @Override // a7.c
    public u6.c a(s6.f fVar, b7.b bVar) {
        return new u6.q(fVar, bVar, this);
    }

    public String b() {
        return this.f615a;
    }

    public z6.h c() {
        return this.f617c;
    }

    public boolean d() {
        return this.f618d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f615a + ", index=" + this.f616b + '}';
    }
}
