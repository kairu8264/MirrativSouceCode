package t;

import l0.s0;
import l0.z1;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final n f52946a;

    /* renamed from: b  reason: collision with root package name */
    public final p f52947b;

    /* renamed from: c  reason: collision with root package name */
    public final s0 f52948c;

    /* renamed from: d  reason: collision with root package name */
    public x f52949d;

    public k(n nVar, p pVar, float f10, x xVar) {
        s0 e10;
        jo.p.h(nVar, "targetContentEnter");
        jo.p.h(pVar, "initialContentExit");
        this.f52946a = nVar;
        this.f52947b = pVar;
        e10 = z1.e(Float.valueOf(f10), null, 2, null);
        this.f52948c = e10;
        this.f52949d = xVar;
    }

    public final p a() {
        return this.f52947b;
    }

    public final x b() {
        return this.f52949d;
    }

    public final n c() {
        return this.f52946a;
    }

    public final float d() {
        return ((Number) this.f52948c.getValue()).floatValue();
    }

    public /* synthetic */ k(n nVar, p pVar, float f10, x xVar, int i10, jo.h hVar) {
        this(nVar, pVar, (i10 & 4) != 0 ? 0.0f : f10, (i10 & 8) != 0 ? b.d(false, null, 3, null) : xVar);
    }
}
