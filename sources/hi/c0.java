package hi;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes3.dex */
public final class c0 implements Comparator<q> {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ j f35679w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ u4 f35680x;

    public c0(j jVar, u4 u4Var) {
        this.f35679w = jVar;
        this.f35680x = u4Var;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(q qVar, q qVar2) {
        q qVar3 = qVar;
        q qVar4 = qVar2;
        j jVar = this.f35679w;
        u4 u4Var = this.f35680x;
        if (qVar3 instanceof v) {
            return !(qVar4 instanceof v) ? 1 : 0;
        } else if (qVar4 instanceof v) {
            return -1;
        } else {
            if (jVar == null) {
                return qVar3.h().compareTo(qVar4.h());
            }
            return (int) v5.a(jVar.a(u4Var, Arrays.asList(qVar3, qVar4)).e().doubleValue());
        }
    }
}
