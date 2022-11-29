package gh;

import ai.cg0;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import rg.f;
import rg.l;
import rg.q;
import rh.p;

/* loaded from: classes3.dex */
public abstract class b {
    public static void a(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull f fVar, @RecentlyNonNull c cVar) {
        p.j(context, "Context cannot be null.");
        p.j(str, "AdUnitId cannot be null.");
        p.j(fVar, "AdRequest cannot be null.");
        p.j(cVar, "LoadCallback cannot be null.");
        new cg0(context, str).d(fVar.a(), cVar);
    }

    public abstract void b(l lVar);

    public abstract void c(@RecentlyNonNull Activity activity, @RecentlyNonNull q qVar);
}
