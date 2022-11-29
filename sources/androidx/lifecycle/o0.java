package androidx.lifecycle;

import androidx.lifecycle.q0;

/* loaded from: classes.dex */
public final class o0<T extends q0> extends androidx.lifecycle.a {

    /* renamed from: d  reason: collision with root package name */
    public final xq.a f15598d;

    /* renamed from: e  reason: collision with root package name */
    public final kq.b<T> f15599e;

    /* loaded from: classes.dex */
    public static final class a extends jo.q implements io.a<uq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ uq.a f15600w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ l0 f15601x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(uq.a aVar, l0 l0Var) {
            super(0);
            this.f15600w = aVar;
            this.f15601x = l0Var;
        }

        @Override // io.a
        /* renamed from: a */
        public final uq.a invoke() {
            return this.f15600w.a(this.f15601x);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public o0(xq.a r3, kq.b<T> r4) {
        /*
            r2 = this;
            java.lang.String r0 = "scope"
            jo.p.h(r3, r0)
            java.lang.String r0 = "parameters"
            jo.p.h(r4, r0)
            y4.e r0 = r4.d()
            if (r0 == 0) goto L26
            io.a r1 = r4.e()
            if (r1 != 0) goto L18
            r1 = 0
            goto L1e
        L18:
            java.lang.Object r1 = r1.invoke()
            android.os.Bundle r1 = (android.os.Bundle) r1
        L1e:
            r2.<init>(r0, r1)
            r2.f15598d = r3
            r2.f15599e = r4
            return
        L26:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Can't create SavedStateViewModelFactory without a proper stateRegistryOwner"
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.o0.<init>(xq.a, kq.b):void");
    }

    @Override // androidx.lifecycle.a
    public <T extends q0> T d(String str, Class<T> cls, l0 l0Var) {
        jo.p.h(str, "key");
        jo.p.h(cls, "modelClass");
        jo.p.h(l0Var, "handle");
        return (T) this.f15598d.c(this.f15599e.a(), this.f15599e.c(), e(l0Var));
    }

    public final io.a<uq.a> e(l0 l0Var) {
        io.a<uq.a> b10 = this.f15599e.b();
        uq.a invoke = b10 == null ? null : b10.invoke();
        if (invoke == null) {
            invoke = uq.b.a();
        }
        return new a(invoke, l0Var);
    }
}
