package a1;

import androidx.compose.ui.platform.c1;
import androidx.compose.ui.platform.d1;
import l0.s0;
import l0.z1;

/* loaded from: classes.dex */
public final class s extends d1 implements r1.b, r1.d<s> {

    /* renamed from: x  reason: collision with root package name */
    public final io.l<p, wn.v> f345x;

    /* renamed from: y  reason: collision with root package name */
    public final s0 f346y;

    /* renamed from: z  reason: collision with root package name */
    public final r1.f<s> f347z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(io.l<? super p, wn.v> lVar, io.l<? super c1, wn.v> lVar2) {
        super(lVar2);
        s0 e10;
        jo.p.h(lVar, "focusPropertiesScope");
        jo.p.h(lVar2, "inspectorInfo");
        this.f345x = lVar;
        e10 = z1.e(null, null, 2, null);
        this.f346y = e10;
        this.f347z = r.c();
    }

    public final void b(p pVar) {
        jo.p.h(pVar, "focusProperties");
        this.f345x.invoke(pVar);
        s f10 = f();
        if (f10 != null) {
            f10.b(pVar);
        }
    }

    public final io.l<p, wn.v> c() {
        return this.f345x;
    }

    public boolean equals(Object obj) {
        return (obj instanceof s) && jo.p.c(this.f345x, ((s) obj).f345x);
    }

    public final s f() {
        return (s) this.f346y.getValue();
    }

    @Override // r1.d
    /* renamed from: g */
    public s getValue() {
        return this;
    }

    @Override // r1.d
    public r1.f<s> getKey() {
        return this.f347z;
    }

    public int hashCode() {
        return this.f345x.hashCode();
    }

    public final void i(s sVar) {
        this.f346y.setValue(sVar);
    }

    @Override // r1.b
    public void j0(r1.e eVar) {
        jo.p.h(eVar, "scope");
        i((s) eVar.a(r.c()));
    }
}
