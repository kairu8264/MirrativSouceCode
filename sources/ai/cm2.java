package ai;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class cm2 {
    public static il2 a(List<il2> list, il2 il2Var) {
        return list.get(0);
    }

    public static fs b(Context context, List<il2> list) {
        ArrayList arrayList = new ArrayList();
        for (il2 il2Var : list) {
            if (il2Var.f5282c) {
                arrayList.add(rg.g.f51354p);
            } else {
                arrayList.add(new rg.g(il2Var.f5280a, il2Var.f5281b));
            }
        }
        return new fs(context, (rg.g[]) arrayList.toArray(new rg.g[arrayList.size()]));
    }

    public static il2 c(fs fsVar) {
        return fsVar.E ? new il2(-3, 0, true) : new il2(fsVar.A, fsVar.f4174x, false);
    }
}
