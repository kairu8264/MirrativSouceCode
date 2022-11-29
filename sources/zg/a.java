package zg;

import ai.y50;
import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import rg.f;
import rg.l;
import rh.p;

/* loaded from: classes3.dex */
public abstract class a {
    public static void a(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull f fVar, @RecentlyNonNull b bVar) {
        p.j(context, "Context cannot be null.");
        p.j(str, "AdUnitId cannot be null.");
        p.j(fVar, "AdRequest cannot be null.");
        p.j(bVar, "LoadCallback cannot be null.");
        new y50(context, str).e(fVar.a(), bVar);
    }

    public abstract void b(l lVar);

    public abstract void c(boolean z10);

    public abstract void d(@RecentlyNonNull Activity activity);
}
