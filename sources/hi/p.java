package hi;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class p extends j {
    public u4 A;

    /* renamed from: y  reason: collision with root package name */
    public final List<String> f35902y;

    /* renamed from: z  reason: collision with root package name */
    public final List<q> f35903z;

    public p(p pVar) {
        super(pVar.f35817w);
        ArrayList arrayList = new ArrayList(pVar.f35902y.size());
        this.f35902y = arrayList;
        arrayList.addAll(pVar.f35902y);
        ArrayList arrayList2 = new ArrayList(pVar.f35903z.size());
        this.f35903z = arrayList2;
        arrayList2.addAll(pVar.f35903z);
        this.A = pVar.A;
    }

    @Override // hi.j
    public final q a(u4 u4Var, List<q> list) {
        u4 a10 = this.A.a();
        for (int i10 = 0; i10 < this.f35902y.size(); i10++) {
            if (i10 < list.size()) {
                a10.e(this.f35902y.get(i10), u4Var.b(list.get(i10)));
            } else {
                a10.e(this.f35902y.get(i10), q.f35921f);
            }
        }
        for (q qVar : this.f35903z) {
            q b10 = a10.b(qVar);
            if (b10 instanceof r) {
                b10 = a10.b(qVar);
            }
            if (b10 instanceof h) {
                return ((h) b10).a();
            }
        }
        return q.f35921f;
    }

    @Override // hi.j, hi.q
    public final q d() {
        return new p(this);
    }

    public p(String str, List<q> list, List<q> list2, u4 u4Var) {
        super(str);
        this.f35902y = new ArrayList();
        this.A = u4Var;
        if (!list.isEmpty()) {
            for (q qVar : list) {
                this.f35902y.add(qVar.h());
            }
        }
        this.f35903z = new ArrayList(list2);
    }
}
