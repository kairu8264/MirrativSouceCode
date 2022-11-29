package c1;

import c1.q0;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class r0 {
    public static final void b(e1.e eVar, q0 q0Var, u uVar, float f10, e1.f fVar, d0 d0Var, int i10) {
        u0 a10;
        jo.p.h(eVar, "$this$drawOutline");
        jo.p.h(q0Var, "outline");
        jo.p.h(uVar, "brush");
        jo.p.h(fVar, TtmlNode.TAG_STYLE);
        if (q0Var instanceof q0.b) {
            b1.h a11 = ((q0.b) q0Var).a();
            eVar.I(uVar, i(a11), g(a11), f10, fVar, d0Var, i10);
            return;
        }
        if (q0Var instanceof q0.c) {
            q0.c cVar = (q0.c) q0Var;
            a10 = cVar.b();
            if (a10 == null) {
                b1.j a12 = cVar.a();
                eVar.F0(uVar, j(a12), h(a12), b1.b.b(b1.a.d(a12.b()), 0.0f, 2, null), f10, fVar, d0Var, i10);
                return;
            }
        } else if (!(q0Var instanceof q0.a)) {
            throw new NoWhenBranchMatchedException();
        } else {
            a10 = ((q0.a) q0Var).a();
        }
        eVar.B0(a10, uVar, f10, fVar, d0Var, i10);
    }

    public static /* synthetic */ void c(e1.e eVar, q0 q0Var, u uVar, float f10, e1.f fVar, d0 d0Var, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i11 & 8) != 0) {
            fVar = e1.i.f30046a;
        }
        e1.f fVar2 = fVar;
        if ((i11 & 16) != 0) {
            d0Var = null;
        }
        d0 d0Var2 = d0Var;
        if ((i11 & 32) != 0) {
            i10 = e1.e.f30042e.a();
        }
        b(eVar, q0Var, uVar, f11, fVar2, d0Var2, i10);
    }

    public static final void d(e1.e eVar, q0 q0Var, long j10, float f10, e1.f fVar, d0 d0Var, int i10) {
        u0 a10;
        jo.p.h(eVar, "$this$drawOutline");
        jo.p.h(q0Var, "outline");
        jo.p.h(fVar, TtmlNode.TAG_STYLE);
        if (q0Var instanceof q0.b) {
            b1.h a11 = ((q0.b) q0Var).a();
            eVar.O(j10, i(a11), g(a11), f10, fVar, d0Var, i10);
            return;
        }
        if (q0Var instanceof q0.c) {
            q0.c cVar = (q0.c) q0Var;
            a10 = cVar.b();
            if (a10 == null) {
                b1.j a12 = cVar.a();
                eVar.C0(j10, j(a12), h(a12), b1.b.b(b1.a.d(a12.b()), 0.0f, 2, null), fVar, f10, d0Var, i10);
                return;
            }
        } else if (!(q0Var instanceof q0.a)) {
            throw new NoWhenBranchMatchedException();
        } else {
            a10 = ((q0.a) q0Var).a();
        }
        eVar.q0(a10, j10, f10, fVar, d0Var, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00a0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean f(b1.j r6) {
        /*
            long r0 = r6.b()
            float r0 = b1.a.d(r0)
            long r1 = r6.c()
            float r1 = b1.a.d(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L18
            r0 = r1
            goto L19
        L18:
            r0 = r2
        L19:
            if (r0 == 0) goto L4f
            long r3 = r6.c()
            float r0 = b1.a.d(r3)
            long r3 = r6.i()
            float r3 = b1.a.d(r3)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L31
            r0 = r1
            goto L32
        L31:
            r0 = r2
        L32:
            if (r0 == 0) goto L4f
            long r3 = r6.i()
            float r0 = b1.a.d(r3)
            long r3 = r6.h()
            float r3 = b1.a.d(r3)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L4a
            r0 = r1
            goto L4b
        L4a:
            r0 = r2
        L4b:
            if (r0 == 0) goto L4f
            r0 = r1
            goto L50
        L4f:
            r0 = r2
        L50:
            long r3 = r6.b()
            float r3 = b1.a.e(r3)
            long r4 = r6.c()
            float r4 = b1.a.e(r4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L66
            r3 = r1
            goto L67
        L66:
            r3 = r2
        L67:
            if (r3 == 0) goto L9d
            long r3 = r6.c()
            float r3 = b1.a.e(r3)
            long r4 = r6.i()
            float r4 = b1.a.e(r4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L7f
            r3 = r1
            goto L80
        L7f:
            r3 = r2
        L80:
            if (r3 == 0) goto L9d
            long r3 = r6.i()
            float r3 = b1.a.e(r3)
            long r4 = r6.h()
            float r6 = b1.a.e(r4)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 != 0) goto L98
            r6 = r1
            goto L99
        L98:
            r6 = r2
        L99:
            if (r6 == 0) goto L9d
            r6 = r1
            goto L9e
        L9d:
            r6 = r2
        L9e:
            if (r0 == 0) goto La3
            if (r6 == 0) goto La3
            goto La4
        La3:
            r1 = r2
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.r0.f(b1.j):boolean");
    }

    public static final long g(b1.h hVar) {
        return b1.m.a(hVar.n(), hVar.h());
    }

    public static final long h(b1.j jVar) {
        return b1.m.a(jVar.j(), jVar.d());
    }

    public static final long i(b1.h hVar) {
        return b1.g.a(hVar.i(), hVar.l());
    }

    public static final long j(b1.j jVar) {
        return b1.g.a(jVar.e(), jVar.g());
    }
}
