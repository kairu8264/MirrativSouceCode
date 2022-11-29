package androidx.lifecycle;

import androidx.lifecycle.o;
import uo.g1;
import uo.o2;

@co.f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3", f = "RepeatOnLifecycle.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt$repeatOnLifecycle$3 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
    public final /* synthetic */ io.p<uo.q0, ao.d<? super wn.v>, Object> A;

    /* renamed from: w  reason: collision with root package name */
    public int f15471w;

    /* renamed from: x  reason: collision with root package name */
    public /* synthetic */ Object f15472x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ o f15473y;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ o.c f15474z;

    @co.f(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1", f = "RepeatOnLifecycle.kt", l = {166}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {
        public Object A;
        public Object B;
        public int C;
        public final /* synthetic */ o D;
        public final /* synthetic */ o.c E;
        public final /* synthetic */ uo.q0 F;
        public final /* synthetic */ io.p<uo.q0, ao.d<? super wn.v>, Object> G;

        /* renamed from: w  reason: collision with root package name */
        public Object f15475w;

        /* renamed from: x  reason: collision with root package name */
        public Object f15476x;

        /* renamed from: y  reason: collision with root package name */
        public Object f15477y;

        /* renamed from: z  reason: collision with root package name */
        public Object f15478z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(o oVar, o.c cVar, uo.q0 q0Var, io.p<? super uo.q0, ? super ao.d<? super wn.v>, ? extends Object> pVar, ao.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.D = oVar;
            this.E = cVar;
            this.F = q0Var;
            this.G = pVar;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new AnonymousClass1(this.D, this.E, this.F, this.G, dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((AnonymousClass1) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
        /* JADX WARN: Type inference failed for: r10v0, types: [androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1, T] */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 217
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3(o oVar, o.c cVar, io.p<? super uo.q0, ? super ao.d<? super wn.v>, ? extends Object> pVar, ao.d<? super RepeatOnLifecycleKt$repeatOnLifecycle$3> dVar) {
        super(2, dVar);
        this.f15473y = oVar;
        this.f15474z = cVar;
        this.A = pVar;
    }

    @Override // co.a
    public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
        RepeatOnLifecycleKt$repeatOnLifecycle$3 repeatOnLifecycleKt$repeatOnLifecycle$3 = new RepeatOnLifecycleKt$repeatOnLifecycle$3(this.f15473y, this.f15474z, this.A, dVar);
        repeatOnLifecycleKt$repeatOnLifecycle$3.f15472x = obj;
        return repeatOnLifecycleKt$repeatOnLifecycle$3;
    }

    @Override // io.p
    public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
    }

    @Override // co.a
    public final Object invokeSuspend(Object obj) {
        Object c10 = bo.c.c();
        int i10 = this.f15471w;
        if (i10 == 0) {
            wn.m.b(obj);
            uo.q0 q0Var = (uo.q0) this.f15472x;
            o2 h02 = g1.c().h0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f15473y, this.f15474z, q0Var, this.A, null);
            this.f15471w = 1;
            if (uo.j.f(h02, anonymousClass1, this) == c10) {
                return c10;
            }
        } else if (i10 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            wn.m.b(obj);
        }
        return wn.v.f59242a;
    }
}
