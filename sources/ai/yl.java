package ai;

import java.util.Comparator;

/* loaded from: classes3.dex */
public final class yl implements Comparator<em> {
    public yl(am amVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(em emVar, em emVar2) {
        em emVar3 = emVar;
        em emVar4 = emVar2;
        int i10 = emVar3.f3725c - emVar4.f3725c;
        return i10 != 0 ? i10 : (int) (emVar3.f3723a - emVar4.f3723a);
    }
}
