package t2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import t2.e;
import u2.b;

/* loaded from: classes.dex */
public class f extends l {
    public int M0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public u2.b K0 = new u2.b(this);
    public u2.e L0 = new u2.e(this);
    public b.InterfaceC0853b N0 = null;
    public boolean O0 = false;
    public q2.d P0 = new q2.d();
    public int U0 = 0;
    public int V0 = 0;
    public c[] W0 = new c[4];
    public c[] X0 = new c[4];
    public boolean Y0 = false;
    public boolean Z0 = false;

    /* renamed from: a1  reason: collision with root package name */
    public boolean f53107a1 = false;

    /* renamed from: b1  reason: collision with root package name */
    public int f53108b1 = 0;

    /* renamed from: c1  reason: collision with root package name */
    public int f53109c1 = 0;

    /* renamed from: d1  reason: collision with root package name */
    public int f53110d1 = TsExtractor.TS_STREAM_TYPE_AIT;

    /* renamed from: e1  reason: collision with root package name */
    public boolean f53111e1 = false;

    /* renamed from: f1  reason: collision with root package name */
    public boolean f53112f1 = false;

    /* renamed from: g1  reason: collision with root package name */
    public boolean f53113g1 = false;

    /* renamed from: h1  reason: collision with root package name */
    public int f53114h1 = 0;

    /* renamed from: i1  reason: collision with root package name */
    public WeakReference<d> f53115i1 = null;

    /* renamed from: j1  reason: collision with root package name */
    public WeakReference<d> f53116j1 = null;

    /* renamed from: k1  reason: collision with root package name */
    public WeakReference<d> f53117k1 = null;

    /* renamed from: l1  reason: collision with root package name */
    public WeakReference<d> f53118l1 = null;

    /* renamed from: m1  reason: collision with root package name */
    public HashSet<e> f53119m1 = new HashSet<>();

    /* renamed from: n1  reason: collision with root package name */
    public b.a f53120n1 = new b.a();

    public static boolean I1(int i10, e eVar, b.InterfaceC0853b interfaceC0853b, b.a aVar, int i11) {
        int i12;
        int i13;
        if (interfaceC0853b == null) {
            return false;
        }
        if (eVar.Q() != 8 && !(eVar instanceof g) && !(eVar instanceof a)) {
            aVar.f54282a = eVar.y();
            aVar.f54283b = eVar.O();
            aVar.f54284c = eVar.R();
            aVar.f54285d = eVar.v();
            aVar.f54290i = false;
            aVar.f54291j = i11;
            e.b bVar = aVar.f54282a;
            e.b bVar2 = e.b.MATCH_CONSTRAINT;
            boolean z10 = bVar == bVar2;
            boolean z11 = aVar.f54283b == bVar2;
            boolean z12 = z10 && eVar.f53058c0 > 0.0f;
            boolean z13 = z11 && eVar.f53058c0 > 0.0f;
            if (z10 && eVar.V(0) && eVar.f53095v == 0 && !z12) {
                aVar.f54282a = e.b.WRAP_CONTENT;
                if (z11 && eVar.f53097w == 0) {
                    aVar.f54282a = e.b.FIXED;
                }
                z10 = false;
            }
            if (z11 && eVar.V(1) && eVar.f53097w == 0 && !z13) {
                aVar.f54283b = e.b.WRAP_CONTENT;
                if (z10 && eVar.f53095v == 0) {
                    aVar.f54283b = e.b.FIXED;
                }
                z11 = false;
            }
            if (eVar.i0()) {
                aVar.f54282a = e.b.FIXED;
                z10 = false;
            }
            if (eVar.j0()) {
                aVar.f54283b = e.b.FIXED;
                z11 = false;
            }
            if (z12) {
                if (eVar.f53099x[0] == 4) {
                    aVar.f54282a = e.b.FIXED;
                } else if (!z11) {
                    e.b bVar3 = aVar.f54283b;
                    e.b bVar4 = e.b.FIXED;
                    if (bVar3 == bVar4) {
                        i13 = aVar.f54285d;
                    } else {
                        aVar.f54282a = e.b.WRAP_CONTENT;
                        interfaceC0853b.b(eVar, aVar);
                        i13 = aVar.f54287f;
                    }
                    aVar.f54282a = bVar4;
                    aVar.f54284c = (int) (eVar.t() * i13);
                }
            }
            if (z13) {
                if (eVar.f53099x[1] == 4) {
                    aVar.f54283b = e.b.FIXED;
                } else if (!z10) {
                    e.b bVar5 = aVar.f54282a;
                    e.b bVar6 = e.b.FIXED;
                    if (bVar5 == bVar6) {
                        i12 = aVar.f54284c;
                    } else {
                        aVar.f54283b = e.b.WRAP_CONTENT;
                        interfaceC0853b.b(eVar, aVar);
                        i12 = aVar.f54286e;
                    }
                    aVar.f54283b = bVar6;
                    if (eVar.u() == -1) {
                        aVar.f54285d = (int) (i12 / eVar.t());
                    } else {
                        aVar.f54285d = (int) (eVar.t() * i12);
                    }
                }
            }
            interfaceC0853b.b(eVar, aVar);
            eVar.b1(aVar.f54286e);
            eVar.C0(aVar.f54287f);
            eVar.B0(aVar.f54289h);
            eVar.r0(aVar.f54288g);
            aVar.f54291j = b.a.f54279k;
            return aVar.f54290i;
        }
        aVar.f54286e = 0;
        aVar.f54287f = 0;
        return false;
    }

    public int A1() {
        return this.f53110d1;
    }

    public q2.d B1() {
        return this.P0;
    }

    public void C1() {
        this.L0.j();
    }

    public void D1() {
        this.L0.k();
    }

    public boolean E1() {
        return this.f53113g1;
    }

    public boolean F1() {
        return this.O0;
    }

    public boolean G1() {
        return this.f53112f1;
    }

    public long H1(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        this.Q0 = i17;
        this.R0 = i18;
        return this.K0.d(this, i10, i17, i18, i11, i12, i13, i14, i15, i16);
    }

    public boolean J1(int i10) {
        return (this.f53110d1 & i10) == i10;
    }

    public final void K1() {
        this.U0 = 0;
        this.V0 = 0;
    }

    public void L1(b.InterfaceC0853b interfaceC0853b) {
        this.N0 = interfaceC0853b;
        this.L0.n(interfaceC0853b);
    }

    public void M1(int i10) {
        this.f53110d1 = i10;
        q2.d.f48658r = J1(512);
    }

    public void N1(int i10) {
        this.M0 = i10;
    }

    public void O1(boolean z10) {
        this.O0 = z10;
    }

    public boolean P1(q2.d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean J1 = J1(64);
        h1(dVar, J1);
        int size = this.J0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.J0.get(i10);
            eVar.h1(dVar, J1);
            if (eVar.X()) {
                z10 = true;
            }
        }
        return z10;
    }

    public void Q1() {
        this.K0.e(this);
    }

    @Override // t2.e
    public void g1(boolean z10, boolean z11) {
        super.g1(z10, z11);
        int size = this.J0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.J0.get(i10).g1(z10, z11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:154:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0312  */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // t2.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j1() {
        /*
            Method dump skipped, instructions count: 815
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.f.j1():void");
    }

    public void m1(e eVar, int i10) {
        if (i10 == 0) {
            o1(eVar);
        } else if (i10 == 1) {
            t1(eVar);
        }
    }

    public boolean n1(q2.d dVar) {
        boolean J1 = J1(64);
        g(dVar, J1);
        int size = this.J0.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar = this.J0.get(i10);
            eVar.J0(0, false);
            eVar.J0(1, false);
            if (eVar instanceof a) {
                z10 = true;
            }
        }
        if (z10) {
            for (int i11 = 0; i11 < size; i11++) {
                e eVar2 = this.J0.get(i11);
                if (eVar2 instanceof a) {
                    ((a) eVar2).p1();
                }
            }
        }
        this.f53119m1.clear();
        for (int i12 = 0; i12 < size; i12++) {
            e eVar3 = this.J0.get(i12);
            if (eVar3.f()) {
                if (eVar3 instanceof k) {
                    this.f53119m1.add(eVar3);
                } else {
                    eVar3.g(dVar, J1);
                }
            }
        }
        while (this.f53119m1.size() > 0) {
            int size2 = this.f53119m1.size();
            Iterator<e> it = this.f53119m1.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                k kVar = (k) it.next();
                if (kVar.l1(this.f53119m1)) {
                    kVar.g(dVar, J1);
                    this.f53119m1.remove(kVar);
                    break;
                }
            }
            if (size2 == this.f53119m1.size()) {
                Iterator<e> it2 = this.f53119m1.iterator();
                while (it2.hasNext()) {
                    it2.next().g(dVar, J1);
                }
                this.f53119m1.clear();
            }
        }
        if (q2.d.f48658r) {
            HashSet<e> hashSet = new HashSet<>();
            for (int i13 = 0; i13 < size; i13++) {
                e eVar4 = this.J0.get(i13);
                if (!eVar4.f()) {
                    hashSet.add(eVar4);
                }
            }
            e(this, dVar, hashSet, y() == e.b.WRAP_CONTENT ? 0 : 1, false);
            Iterator<e> it3 = hashSet.iterator();
            while (it3.hasNext()) {
                e next = it3.next();
                j.a(this, dVar, next);
                next.g(dVar, J1);
            }
        } else {
            for (int i14 = 0; i14 < size; i14++) {
                e eVar5 = this.J0.get(i14);
                if (eVar5 instanceof f) {
                    e.b[] bVarArr = eVar5.Y;
                    e.b bVar = bVarArr[0];
                    e.b bVar2 = bVarArr[1];
                    e.b bVar3 = e.b.WRAP_CONTENT;
                    if (bVar == bVar3) {
                        eVar5.G0(e.b.FIXED);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.X0(e.b.FIXED);
                    }
                    eVar5.g(dVar, J1);
                    if (bVar == bVar3) {
                        eVar5.G0(bVar);
                    }
                    if (bVar2 == bVar3) {
                        eVar5.X0(bVar2);
                    }
                } else {
                    j.a(this, dVar, eVar5);
                    if (!eVar5.f()) {
                        eVar5.g(dVar, J1);
                    }
                }
            }
        }
        if (this.U0 > 0) {
            b.b(this, dVar, null, 0);
        }
        if (this.V0 > 0) {
            b.b(this, dVar, null, 1);
        }
        return true;
    }

    @Override // t2.l, t2.e
    public void o0() {
        this.P0.D();
        this.Q0 = 0;
        this.S0 = 0;
        this.R0 = 0;
        this.T0 = 0;
        this.f53111e1 = false;
        super.o0();
    }

    public final void o1(e eVar) {
        int i10 = this.U0 + 1;
        c[] cVarArr = this.X0;
        if (i10 >= cVarArr.length) {
            this.X0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.X0[this.U0] = new c(eVar, 0, F1());
        this.U0++;
    }

    public void p1(d dVar) {
        WeakReference<d> weakReference = this.f53118l1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f53118l1.get().d()) {
            this.f53118l1 = new WeakReference<>(dVar);
        }
    }

    public void q1(d dVar) {
        WeakReference<d> weakReference = this.f53116j1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f53116j1.get().d()) {
            this.f53116j1 = new WeakReference<>(dVar);
        }
    }

    public final void r1(d dVar, q2.i iVar) {
        this.P0.h(iVar, this.P0.q(dVar), 0, 5);
    }

    public final void s1(d dVar, q2.i iVar) {
        this.P0.h(this.P0.q(dVar), iVar, 0, 5);
    }

    public final void t1(e eVar) {
        int i10 = this.V0 + 1;
        c[] cVarArr = this.W0;
        if (i10 >= cVarArr.length) {
            this.W0 = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.W0[this.V0] = new c(eVar, 1, F1());
        this.V0++;
    }

    public void u1(d dVar) {
        WeakReference<d> weakReference = this.f53117k1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f53117k1.get().d()) {
            this.f53117k1 = new WeakReference<>(dVar);
        }
    }

    public void v1(d dVar) {
        WeakReference<d> weakReference = this.f53115i1;
        if (weakReference == null || weakReference.get() == null || dVar.d() > this.f53115i1.get().d()) {
            this.f53115i1 = new WeakReference<>(dVar);
        }
    }

    public boolean w1(boolean z10) {
        return this.L0.f(z10);
    }

    public boolean x1(boolean z10) {
        return this.L0.g(z10);
    }

    public boolean y1(boolean z10, int i10) {
        return this.L0.h(z10, i10);
    }

    public b.InterfaceC0853b z1() {
        return this.N0;
    }
}
