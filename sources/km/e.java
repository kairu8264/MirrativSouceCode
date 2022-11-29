package km;

import vm.l;

/* loaded from: classes4.dex */
public final class e implements rn.a {

    /* renamed from: a  reason: collision with root package name */
    public final a f38878a;

    public e(a aVar) {
        this.f38878a = aVar;
    }

    public static e a(a aVar) {
        return new e(aVar);
    }

    public static xl.b<l> c(a aVar) {
        return (xl.b) pn.b.c(aVar.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // rn.a
    /* renamed from: b */
    public xl.b<l> get() {
        return c(this.f38878a);
    }
}
