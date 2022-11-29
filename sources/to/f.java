package to;

import to.h;

/* loaded from: classes4.dex */
public final class f implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final f f53893a = new f();

    /* renamed from: b  reason: collision with root package name */
    public static final long f53894b = System.nanoTime();

    @Override // to.h
    public /* bridge */ /* synthetic */ g a() {
        return h.a.C0843a.a(b());
    }

    public long b() {
        return h.a.C0843a.b(c());
    }

    public final long c() {
        return System.nanoTime() - f53894b;
    }

    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
