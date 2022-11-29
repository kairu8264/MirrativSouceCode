package hi;

import java.io.IOException;

/* loaded from: classes3.dex */
public final class xa extends va<wa, wa> {
    @Override // hi.va
    public final /* synthetic */ int a(wa waVar) {
        return waVar.a();
    }

    @Override // hi.va
    public final /* synthetic */ int b(wa waVar) {
        return waVar.b();
    }

    @Override // hi.va
    public final /* synthetic */ wa c(Object obj) {
        return ((t8) obj).zzc;
    }

    @Override // hi.va
    public final /* bridge */ /* synthetic */ wa d(wa waVar, wa waVar2) {
        wa waVar3 = waVar2;
        return waVar3.equals(wa.c()) ? waVar : wa.d(waVar, waVar3);
    }

    @Override // hi.va
    public final /* synthetic */ wa e() {
        return wa.e();
    }

    @Override // hi.va
    public final /* bridge */ /* synthetic */ void f(wa waVar, int i10, long j10) {
        waVar.h(i10 << 3, Long.valueOf(j10));
    }

    @Override // hi.va
    public final void g(Object obj) {
        ((t8) obj).zzc.f();
    }

    @Override // hi.va
    public final /* synthetic */ void h(Object obj, wa waVar) {
        ((t8) obj).zzc = waVar;
    }

    @Override // hi.va
    public final /* synthetic */ void i(wa waVar, c8 c8Var) throws IOException {
        waVar.i(c8Var);
    }
}
