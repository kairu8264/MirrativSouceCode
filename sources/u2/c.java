package u2;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c extends p {

    /* renamed from: k  reason: collision with root package name */
    public ArrayList<p> f54292k;

    /* renamed from: l  reason: collision with root package name */
    public int f54293l;

    public c(t2.e eVar, int i10) {
        super(eVar);
        this.f54292k = new ArrayList<>();
        this.f54352f = i10;
        q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:271:0x0400, code lost:
        r7 = r7 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e9  */
    @Override // u2.p, u2.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(u2.d r27) {
        /*
            Method dump skipped, instructions count: 1064
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u2.c.a(u2.d):void");
    }

    @Override // u2.p
    public void d() {
        Iterator<p> it = this.f54292k.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
        int size = this.f54292k.size();
        if (size < 1) {
            return;
        }
        t2.e eVar = this.f54292k.get(0).f54348b;
        t2.e eVar2 = this.f54292k.get(size - 1).f54348b;
        if (this.f54352f == 0) {
            t2.d dVar = eVar.N;
            t2.d dVar2 = eVar2.P;
            f i10 = i(dVar, 0);
            int e10 = dVar.e();
            t2.e r10 = r();
            if (r10 != null) {
                e10 = r10.N.e();
            }
            if (i10 != null) {
                b(this.f54354h, i10, e10);
            }
            f i11 = i(dVar2, 0);
            int e11 = dVar2.e();
            t2.e s10 = s();
            if (s10 != null) {
                e11 = s10.P.e();
            }
            if (i11 != null) {
                b(this.f54355i, i11, -e11);
            }
        } else {
            t2.d dVar3 = eVar.O;
            t2.d dVar4 = eVar2.Q;
            f i12 = i(dVar3, 1);
            int e12 = dVar3.e();
            t2.e r11 = r();
            if (r11 != null) {
                e12 = r11.O.e();
            }
            if (i12 != null) {
                b(this.f54354h, i12, e12);
            }
            f i13 = i(dVar4, 1);
            int e13 = dVar4.e();
            t2.e s11 = s();
            if (s11 != null) {
                e13 = s11.Q.e();
            }
            if (i13 != null) {
                b(this.f54355i, i13, -e13);
            }
        }
        this.f54354h.f54303a = this;
        this.f54355i.f54303a = this;
    }

    @Override // u2.p
    public void e() {
        for (int i10 = 0; i10 < this.f54292k.size(); i10++) {
            this.f54292k.get(i10).e();
        }
    }

    @Override // u2.p
    public void f() {
        this.f54349c = null;
        Iterator<p> it = this.f54292k.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
    }

    @Override // u2.p
    public long j() {
        int size = this.f54292k.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            p pVar = this.f54292k.get(i10);
            j10 = j10 + pVar.f54354h.f54308f + pVar.j() + pVar.f54355i.f54308f;
        }
        return j10;
    }

    @Override // u2.p
    public boolean m() {
        int size = this.f54292k.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!this.f54292k.get(i10).m()) {
                return false;
            }
        }
        return true;
    }

    public final void q() {
        t2.e eVar;
        t2.e eVar2 = this.f54348b;
        t2.e J = eVar2.J(this.f54352f);
        while (true) {
            t2.e eVar3 = J;
            eVar = eVar2;
            eVar2 = eVar3;
            if (eVar2 == null) {
                break;
            }
            J = eVar2.J(this.f54352f);
        }
        this.f54348b = eVar;
        this.f54292k.add(eVar.L(this.f54352f));
        t2.e H = eVar.H(this.f54352f);
        while (H != null) {
            this.f54292k.add(H.L(this.f54352f));
            H = H.H(this.f54352f);
        }
        Iterator<p> it = this.f54292k.iterator();
        while (it.hasNext()) {
            p next = it.next();
            int i10 = this.f54352f;
            if (i10 == 0) {
                next.f54348b.f53057c = this;
            } else if (i10 == 1) {
                next.f54348b.f53059d = this;
            }
        }
        if ((this.f54352f == 0 && ((t2.f) this.f54348b.I()).F1()) && this.f54292k.size() > 1) {
            ArrayList<p> arrayList = this.f54292k;
            this.f54348b = arrayList.get(arrayList.size() - 1).f54348b;
        }
        this.f54293l = this.f54352f == 0 ? this.f54348b.x() : this.f54348b.N();
    }

    public final t2.e r() {
        for (int i10 = 0; i10 < this.f54292k.size(); i10++) {
            p pVar = this.f54292k.get(i10);
            if (pVar.f54348b.Q() != 8) {
                return pVar.f54348b;
            }
        }
        return null;
    }

    public final t2.e s() {
        for (int size = this.f54292k.size() - 1; size >= 0; size--) {
            p pVar = this.f54292k.get(size);
            if (pVar.f54348b.Q() != 8) {
                return pVar.f54348b;
            }
        }
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f54352f == 0 ? "horizontal : " : "vertical : ");
        Iterator<p> it = this.f54292k.iterator();
        while (it.hasNext()) {
            sb2.append("<");
            sb2.append(it.next());
            sb2.append("> ");
        }
        return sb2.toString();
    }
}
