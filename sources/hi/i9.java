package hi;

/* loaded from: classes3.dex */
public final class i9 extends j9 {
    public /* synthetic */ i9(g9 g9Var) {
        super(null);
    }

    @Override // hi.j9
    public final void a(Object obj, long j10) {
        ((a9) fb.k(obj, j10)).zzb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    @Override // hi.j9
    public final <E> void b(Object obj, Object obj2, long j10) {
        a9<E> a9Var = (a9) fb.k(obj, j10);
        a9<E> a9Var2 = (a9) fb.k(obj2, j10);
        int size = a9Var.size();
        int size2 = a9Var2.size();
        a9<E> a9Var3 = a9Var;
        a9Var3 = a9Var;
        if (size > 0 && size2 > 0) {
            boolean b10 = a9Var.b();
            a9<E> a9Var4 = a9Var;
            if (!b10) {
                a9Var4 = a9Var.v(size2 + size);
            }
            a9Var4.addAll(a9Var2);
            a9Var3 = a9Var4;
        }
        if (size > 0) {
            a9Var2 = a9Var3;
        }
        fb.x(obj, j10, a9Var2);
    }
}
