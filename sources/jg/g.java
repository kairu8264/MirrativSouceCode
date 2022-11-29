package jg;

/* loaded from: classes3.dex */
public final class g implements fg.b<kg.g> {

    /* renamed from: a  reason: collision with root package name */
    public final rn.a<ng.a> f38050a;

    public g(rn.a<ng.a> aVar) {
        this.f38050a = aVar;
    }

    public static kg.g a(ng.a aVar) {
        return (kg.g) fg.d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(rn.a<ng.a> aVar) {
        return new g(aVar);
    }

    @Override // rn.a
    /* renamed from: c */
    public kg.g get() {
        return a(this.f38050a.get());
    }
}
