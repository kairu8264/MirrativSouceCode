package ji;

/* loaded from: classes3.dex */
public final class n<E> extends l<E> {

    /* renamed from: y  reason: collision with root package name */
    public final p<E> f38062y;

    public n(p<E> pVar, int i10) {
        super(pVar.size(), i10);
        this.f38062y = pVar;
    }

    @Override // ji.l
    public final E a(int i10) {
        return this.f38062y.get(i10);
    }
}
