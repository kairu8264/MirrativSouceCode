package ud;

import ud.h1;

/* loaded from: classes2.dex */
public final class i1 implements h1 {

    /* renamed from: a  reason: collision with root package name */
    public final h1.a f55018a;

    public i1(h1.a aVar) {
        jo.p.h(aVar, "type");
        this.f55018a = aVar;
    }

    @Override // ud.h1
    public h1.a getType() {
        return this.f55018a;
    }

    public /* synthetic */ i1(h1.a aVar, int i10, jo.h hVar) {
        this((i10 & 1) != 0 ? h1.a.SELECT_FROM_GALLERY : aVar);
    }
}
