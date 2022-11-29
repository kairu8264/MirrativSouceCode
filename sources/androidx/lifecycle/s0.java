package androidx.lifecycle;

import androidx.lifecycle.q0;
import androidx.lifecycle.t0;

/* loaded from: classes.dex */
public final class s0<VM extends q0> implements wn.f<VM> {

    /* renamed from: w  reason: collision with root package name */
    public final qo.b<VM> f15612w;

    /* renamed from: x  reason: collision with root package name */
    public final io.a<u0> f15613x;

    /* renamed from: y  reason: collision with root package name */
    public final io.a<t0.b> f15614y;

    /* renamed from: z  reason: collision with root package name */
    public VM f15615z;

    /* JADX WARN: Multi-variable type inference failed */
    public s0(qo.b<VM> bVar, io.a<? extends u0> aVar, io.a<? extends t0.b> aVar2) {
        jo.p.h(bVar, "viewModelClass");
        jo.p.h(aVar, "storeProducer");
        jo.p.h(aVar2, "factoryProducer");
        this.f15612w = bVar;
        this.f15613x = aVar;
        this.f15614y = aVar2;
    }

    @Override // wn.f
    /* renamed from: a */
    public VM getValue() {
        VM vm2 = this.f15615z;
        if (vm2 == null) {
            VM vm3 = (VM) new t0(this.f15613x.invoke(), this.f15614y.invoke()).a(ho.a.a(this.f15612w));
            this.f15615z = vm3;
            return vm3;
        }
        return vm2;
    }
}
