package q0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Object f48508a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f48509b;

    public a(Object obj, Object obj2) {
        this.f48508a = obj;
        this.f48509b = obj2;
    }

    public final boolean a() {
        return this.f48509b != r0.c.f49705a;
    }

    public final boolean b() {
        return this.f48508a != r0.c.f49705a;
    }

    public final Object c() {
        return this.f48509b;
    }

    public final Object d() {
        return this.f48508a;
    }

    public final a e(Object obj) {
        return new a(this.f48508a, obj);
    }

    public final a f(Object obj) {
        return new a(obj, this.f48509b);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a() {
        /*
            r1 = this;
            r0.c r0 = r0.c.f49705a
            r1.<init>(r0, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q0.a.<init>():void");
    }

    public a(Object obj) {
        this(obj, r0.c.f49705a);
    }
}
