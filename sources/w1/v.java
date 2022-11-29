package w1;

/* loaded from: classes.dex */
public final class v extends jo.q implements io.p<a<wn.b<? extends Boolean>>, a<wn.b<? extends Boolean>>, a<wn.b<? extends Boolean>>> {

    /* renamed from: w  reason: collision with root package name */
    public static final v f57984w = new v();

    public v() {
        super(2);
    }

    @Override // io.p
    /* renamed from: a */
    public final a<wn.b<? extends Boolean>> invoke(a<wn.b<? extends Boolean>> aVar, a<wn.b<? extends Boolean>> aVar2) {
        String b10;
        wn.b<? extends Boolean> a10;
        jo.p.h(aVar2, "childValue");
        if (aVar == null || (b10 = aVar.b()) == null) {
            b10 = aVar2.b();
        }
        if (aVar == null || (a10 = aVar.a()) == null) {
            a10 = aVar2.a();
        }
        return new a<>(b10, a10);
    }
}
