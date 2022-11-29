package androidx.lifecycle;

import androidx.lifecycle.o;
import wn.l;

/* loaded from: classes.dex */
public final class WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$2$observer$1 implements r {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ o.c f15496w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ o f15497x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ uo.p<Object> f15498y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ io.a<Object> f15499z;

    @Override // androidx.lifecycle.r
    public void i(u uVar, o.b bVar) {
        Object a10;
        jo.p.h(uVar, "source");
        jo.p.h(bVar, "event");
        if (bVar == o.b.h(this.f15496w)) {
            this.f15497x.c(this);
            uo.p<Object> pVar = this.f15498y;
            io.a<Object> aVar = this.f15499z;
            try {
                l.a aVar2 = wn.l.f59224w;
                a10 = wn.l.a(aVar.invoke());
            } catch (Throwable th2) {
                l.a aVar3 = wn.l.f59224w;
                a10 = wn.l.a(wn.m.a(th2));
            }
            pVar.resumeWith(a10);
        } else if (bVar == o.b.ON_DESTROY) {
            this.f15497x.c(this);
            uo.p<Object> pVar2 = this.f15498y;
            LifecycleDestroyedException lifecycleDestroyedException = new LifecycleDestroyedException();
            l.a aVar4 = wn.l.f59224w;
            pVar2.resumeWith(wn.l.a(wn.m.a(lifecycleDestroyedException)));
        }
    }
}
