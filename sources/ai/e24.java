package ai;

import android.util.SparseArray;

/* loaded from: classes3.dex */
public final class e24 implements x14 {

    /* renamed from: a  reason: collision with root package name */
    public final gb f3508a = new gb(new byte[4], 4);

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ g24 f3509b;

    public e24(g24 g24Var) {
        this.f3509b = g24Var;
    }

    @Override // ai.x14
    public final void a(pb pbVar, pv3 pv3Var, k24 k24Var) {
    }

    @Override // ai.x14
    public final void b(hb hbVar) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int i10;
        if (hbVar.v() == 0 && (hbVar.v() & 128) != 0) {
            hbVar.s(6);
            int l10 = hbVar.l() / 4;
            for (int i11 = 0; i11 < l10; i11++) {
                hbVar.t(this.f3508a, 4);
                int h10 = this.f3508a.h(16);
                this.f3508a.f(3);
                if (h10 == 0) {
                    this.f3508a.f(13);
                } else {
                    int h11 = this.f3508a.h(13);
                    sparseArray2 = this.f3509b.f4303e;
                    if (sparseArray2.get(h11) == null) {
                        sparseArray3 = this.f3509b.f4303e;
                        sparseArray3.put(h11, new y14(new f24(this.f3509b, h11)));
                        g24 g24Var = this.f3509b;
                        i10 = g24Var.f4309k;
                        g24Var.f4309k = i10 + 1;
                    }
                }
            }
            sparseArray = this.f3509b.f4303e;
            sparseArray.remove(0);
        }
    }
}
