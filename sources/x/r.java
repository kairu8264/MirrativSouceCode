package x;

import java.util.ArrayList;
import java.util.List;
import l0.c0;
import l0.c2;
import l0.s0;
import l0.z1;
import uo.q0;
import wn.v;

/* loaded from: classes.dex */
public final class r {

    @co.f(c = "androidx.compose.foundation.interaction.PressInteractionKt$collectIsPressedAsState$1", f = "PressInteraction.kt", l = {85}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f59322w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ k f59323x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ s0<Boolean> f59324y;

        /* renamed from: x.r$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0985a implements xo.d<j> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ List<p> f59325w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ s0<Boolean> f59326x;

            public C0985a(List<p> list, s0<Boolean> s0Var) {
                this.f59325w = list;
                this.f59326x = s0Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(j jVar, ao.d<? super v> dVar) {
                if (jVar instanceof p) {
                    this.f59325w.add(jVar);
                } else if (jVar instanceof q) {
                    this.f59325w.remove(((q) jVar).a());
                } else if (jVar instanceof o) {
                    this.f59325w.remove(((o) jVar).a());
                }
                this.f59326x.setValue(co.b.a(!this.f59325w.isEmpty()));
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, s0<Boolean> s0Var, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f59323x = kVar;
            this.f59324y = s0Var;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f59323x, this.f59324y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f59322w;
            if (i10 == 0) {
                wn.m.b(obj);
                ArrayList arrayList = new ArrayList();
                xo.c<j> c11 = this.f59323x.c();
                C0985a c0985a = new C0985a(arrayList, this.f59324y);
                this.f59322w = 1;
                if (c11.a(c0985a, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            return v.f59242a;
        }
    }

    public static final c2<Boolean> a(k kVar, l0.i iVar, int i10) {
        jo.p.h(kVar, "<this>");
        iVar.x(-1692965168);
        iVar.x(-492369756);
        Object y10 = iVar.y();
        if (y10 == l0.i.f39065a.a()) {
            y10 = z1.e(Boolean.FALSE, null, 2, null);
            iVar.q(y10);
        }
        iVar.O();
        s0 s0Var = (s0) y10;
        c0.c(kVar, new a(kVar, s0Var, null), iVar, i10 & 14);
        iVar.O();
        return s0Var;
    }
}
