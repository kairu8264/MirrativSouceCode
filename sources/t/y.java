package t;

/* loaded from: classes.dex */
public final class y implements x {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f53009a;

    /* renamed from: b  reason: collision with root package name */
    public final io.p<m2.o, m2.o, u.c0<m2.o>> f53010b;

    /* JADX WARN: Multi-variable type inference failed */
    public y(boolean z10, io.p<? super m2.o, ? super m2.o, ? extends u.c0<m2.o>> pVar) {
        jo.p.h(pVar, "sizeAnimationSpec");
        this.f53009a = z10;
        this.f53010b = pVar;
    }

    @Override // t.x
    public u.c0<m2.o> a(long j10, long j11) {
        return this.f53010b.invoke(m2.o.b(j10), m2.o.b(j11));
    }

    @Override // t.x
    public boolean b() {
        return this.f53009a;
    }
}
