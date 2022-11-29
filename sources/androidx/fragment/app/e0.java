package androidx.fragment.app;

import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;

/* loaded from: classes.dex */
public final class e0 {

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Fragment f15332w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f15332w = fragment;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            t0.b r02 = this.f15332w.r0();
            jo.p.g(r02, "defaultViewModelProviderFactory");
            return r02;
        }
    }

    public static final <VM extends q0> wn.f<VM> a(Fragment fragment, qo.b<VM> bVar, io.a<? extends u0> aVar, io.a<? extends t0.b> aVar2) {
        jo.p.h(fragment, "<this>");
        jo.p.h(bVar, "viewModelClass");
        jo.p.h(aVar, "storeProducer");
        if (aVar2 == null) {
            aVar2 = new a(fragment);
        }
        return new s0(bVar, aVar, aVar2);
    }
}
