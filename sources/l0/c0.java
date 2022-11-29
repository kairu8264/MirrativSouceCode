package l0;

import java.util.Arrays;
import uo.d2;
import uo.i2;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public static final a0 f38967a = new a0();

    public static final void a(Object obj, io.l<? super a0, ? extends z> lVar, i iVar, int i10) {
        jo.p.h(lVar, "effect");
        iVar.x(-1371986847);
        iVar.x(1157296644);
        boolean P = iVar.P(obj);
        Object y10 = iVar.y();
        if (P || y10 == i.f39065a.a()) {
            iVar.q(new y(lVar));
        }
        iVar.O();
        iVar.O();
    }

    public static final void b(Object obj, Object obj2, io.l<? super a0, ? extends z> lVar, i iVar, int i10) {
        jo.p.h(lVar, "effect");
        iVar.x(1429097729);
        iVar.x(511388516);
        boolean P = iVar.P(obj) | iVar.P(obj2);
        Object y10 = iVar.y();
        if (P || y10 == i.f39065a.a()) {
            iVar.q(new y(lVar));
        }
        iVar.O();
        iVar.O();
    }

    public static final void c(Object obj, io.p<? super uo.q0, ? super ao.d<? super wn.v>, ? extends Object> pVar, i iVar, int i10) {
        jo.p.h(pVar, "block");
        iVar.x(1179185413);
        ao.g n10 = iVar.n();
        iVar.x(1157296644);
        boolean P = iVar.P(obj);
        Object y10 = iVar.y();
        if (P || y10 == i.f39065a.a()) {
            iVar.q(new l0(n10, pVar));
        }
        iVar.O();
        iVar.O();
    }

    public static final void d(Object obj, Object obj2, io.p<? super uo.q0, ? super ao.d<? super wn.v>, ? extends Object> pVar, i iVar, int i10) {
        jo.p.h(pVar, "block");
        iVar.x(590241125);
        ao.g n10 = iVar.n();
        iVar.x(511388516);
        boolean P = iVar.P(obj) | iVar.P(obj2);
        Object y10 = iVar.y();
        if (P || y10 == i.f39065a.a()) {
            iVar.q(new l0(n10, pVar));
        }
        iVar.O();
        iVar.O();
    }

    public static final void e(Object obj, Object obj2, Object obj3, io.p<? super uo.q0, ? super ao.d<? super wn.v>, ? extends Object> pVar, i iVar, int i10) {
        jo.p.h(pVar, "block");
        iVar.x(-54093371);
        ao.g n10 = iVar.n();
        iVar.x(1618982084);
        boolean P = iVar.P(obj) | iVar.P(obj2) | iVar.P(obj3);
        Object y10 = iVar.y();
        if (P || y10 == i.f39065a.a()) {
            iVar.q(new l0(n10, pVar));
        }
        iVar.O();
        iVar.O();
    }

    public static final void f(Object[] objArr, io.p<? super uo.q0, ? super ao.d<? super wn.v>, ? extends Object> pVar, i iVar, int i10) {
        jo.p.h(objArr, "keys");
        jo.p.h(pVar, "block");
        iVar.x(-139560008);
        ao.g n10 = iVar.n();
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        iVar.x(-568225417);
        boolean z10 = false;
        for (Object obj : copyOf) {
            z10 |= iVar.P(obj);
        }
        Object y10 = iVar.y();
        if (z10 || y10 == i.f39065a.a()) {
            iVar.q(new l0(n10, pVar));
        }
        iVar.O();
        iVar.O();
    }

    public static final void g(io.a<wn.v> aVar, i iVar, int i10) {
        jo.p.h(aVar, "effect");
        iVar.x(-1288466761);
        iVar.i(aVar);
        iVar.O();
    }

    public static final uo.q0 i(ao.g gVar, i iVar) {
        uo.b0 b10;
        jo.p.h(gVar, "coroutineContext");
        jo.p.h(iVar, "composer");
        d2.b bVar = uo.d2.f56001s;
        if (gVar.get(bVar) != null) {
            b10 = i2.b(null, 1, null);
            b10.a(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
            return uo.r0.a(b10);
        }
        ao.g n10 = iVar.n();
        return uo.r0.a(n10.plus(uo.g2.a((uo.d2) n10.get(bVar))).plus(gVar));
    }
}
