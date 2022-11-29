package q5;

import android.content.Context;
import android.os.Build;
import k5.j;
import k5.k;
import t5.p;

/* loaded from: classes.dex */
public class e extends c<p5.b> {

    /* renamed from: e  reason: collision with root package name */
    public static final String f48725e = j.f("NetworkMeteredCtrlr");

    public e(Context context, w5.a aVar) {
        super(r5.g.c(context, aVar).d());
    }

    @Override // q5.c
    public boolean b(p pVar) {
        return pVar.f53201j.b() == k.METERED;
    }

    @Override // q5.c
    /* renamed from: i */
    public boolean c(p5.b bVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            return (bVar.a() && bVar.b()) ? false : true;
        }
        j.c().a(f48725e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !bVar.a();
    }
}
