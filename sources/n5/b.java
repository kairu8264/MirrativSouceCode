package n5;

import android.content.Context;
import k5.j;
import l5.e;
import t5.p;

/* loaded from: classes.dex */
public class b implements e {

    /* renamed from: x  reason: collision with root package name */
    public static final String f41581x = j.f("SystemAlarmScheduler");

    /* renamed from: w  reason: collision with root package name */
    public final Context f41582w;

    public b(Context context) {
        this.f41582w = context.getApplicationContext();
    }

    @Override // l5.e
    public void a(String str) {
        this.f41582w.startService(androidx.work.impl.background.systemalarm.a.g(this.f41582w, str));
    }

    public final void b(p pVar) {
        j.c().a(f41581x, String.format("Scheduling work with workSpecId %s", pVar.f53192a), new Throwable[0]);
        this.f41582w.startService(androidx.work.impl.background.systemalarm.a.f(this.f41582w, pVar.f53192a));
    }

    @Override // l5.e
    public boolean c() {
        return true;
    }

    @Override // l5.e
    public void e(p... pVarArr) {
        for (p pVar : pVarArr) {
            b(pVar);
        }
    }
}
