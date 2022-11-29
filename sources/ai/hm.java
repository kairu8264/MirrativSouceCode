package ai;

import java.util.Comparator;

/* loaded from: classes3.dex */
public final class hm implements Comparator<wl> {
    public hm(im imVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(wl wlVar, wl wlVar2) {
        wl wlVar3 = wlVar;
        wl wlVar4 = wlVar2;
        if (wlVar3.b() >= wlVar4.b()) {
            if (wlVar3.b() > wlVar4.b()) {
                return 1;
            }
            if (wlVar3.a() >= wlVar4.a()) {
                if (wlVar3.a() > wlVar4.a()) {
                    return 1;
                }
                float d10 = (wlVar3.d() - wlVar3.b()) * (wlVar3.c() - wlVar3.a());
                float d11 = (wlVar4.d() - wlVar4.b()) * (wlVar4.c() - wlVar4.a());
                if (d10 <= d11) {
                    return d10 < d11 ? 1 : 0;
                }
            }
        }
        return -1;
    }
}
