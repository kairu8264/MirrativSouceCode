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
public final class f {

    @co.f(c = "androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1", f = "FocusInteraction.kt", l = {69}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f59307w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ k f59308x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ s0<Boolean> f59309y;

        /* renamed from: x.f$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0983a implements xo.d<j> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ List<d> f59310w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ s0<Boolean> f59311x;

            public C0983a(List<d> list, s0<Boolean> s0Var) {
                this.f59310w = list;
                this.f59311x = s0Var;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(j jVar, ao.d<? super v> dVar) {
                if (jVar instanceof d) {
                    this.f59310w.add(jVar);
                } else if (jVar instanceof e) {
                    this.f59310w.remove(((e) jVar).a());
                }
                this.f59311x.setValue(co.b.a(!this.f59310w.isEmpty()));
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, s0<Boolean> s0Var, ao.d<? super a> dVar) {
            super(2, dVar);
            this.f59308x = kVar;
            this.f59309y = s0Var;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new a(this.f59308x, this.f59309y, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f59307w;
            if (i10 == 0) {
                wn.m.b(obj);
                ArrayList arrayList = new ArrayList();
                xo.c<j> c11 = this.f59308x.c();
                C0983a c0983a = new C0983a(arrayList, this.f59309y);
                this.f59307w = 1;
                if (c11.a(c0983a, this) == c10) {
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
        iVar.x(-1805515472);
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
