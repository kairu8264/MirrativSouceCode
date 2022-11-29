package zo;

import java.util.concurrent.CancellationException;
import uo.d2;
import uo.d3;
import uo.i3;
import uo.m1;
import uo.u0;
import wn.l;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a */
    public static final k0 f63299a = new k0("UNDEFINED");

    /* renamed from: b */
    public static final k0 f63300b = new k0("REUSABLE_CLAIMED");

    public static final <T> void b(ao.d<? super T> dVar, Object obj, io.l<? super Throwable, wn.v> lVar) {
        boolean z10;
        if (dVar instanceof k) {
            k kVar = (k) dVar;
            Object b10 = uo.g0.b(obj, lVar);
            if (kVar.f63297z.c0(kVar.getContext())) {
                kVar.B = b10;
                kVar.f56011y = 1;
                kVar.f63297z.X(kVar.getContext(), kVar);
                return;
            }
            u0.a();
            m1 b11 = d3.f56003a.b();
            if (b11.w0()) {
                kVar.B = b10;
                kVar.f56011y = 1;
                b11.l0(kVar);
                return;
            }
            b11.q0(true);
            try {
                d2 d2Var = (d2) kVar.getContext().get(d2.f56001s);
                if (d2Var == null || d2Var.isActive()) {
                    z10 = false;
                } else {
                    CancellationException n10 = d2Var.n();
                    kVar.a(b10, n10);
                    l.a aVar = wn.l.f59224w;
                    kVar.resumeWith(wn.l.a(wn.m.a(n10)));
                    z10 = true;
                }
                if (!z10) {
                    ao.d<T> dVar2 = kVar.A;
                    Object obj2 = kVar.C;
                    ao.g context = dVar2.getContext();
                    Object c10 = o0.c(context, obj2);
                    i3<?> g10 = c10 != o0.f63311a ? uo.j0.g(dVar2, context, c10) : null;
                    kVar.A.resumeWith(obj);
                    wn.v vVar = wn.v.f59242a;
                    if (g10 == null || g10.a1()) {
                        o0.a(context, c10);
                    }
                }
                do {
                } while (b11.B0());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        dVar.resumeWith(obj);
    }

    public static /* synthetic */ void c(ao.d dVar, Object obj, io.l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        b(dVar, obj, lVar);
    }

    public static final boolean d(k<? super wn.v> kVar) {
        wn.v vVar = wn.v.f59242a;
        u0.a();
        m1 b10 = d3.f56003a.b();
        if (b10.x0()) {
            return false;
        }
        if (b10.w0()) {
            kVar.B = vVar;
            kVar.f56011y = 1;
            b10.l0(kVar);
            return true;
        }
        b10.q0(true);
        try {
            kVar.run();
            do {
            } while (b10.B0());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }
}
