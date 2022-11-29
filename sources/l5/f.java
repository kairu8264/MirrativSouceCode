package l5;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;
import t5.p;
import t5.q;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public static final String f39561a = k5.j.f("Schedulers");

    public static e a(Context context, i iVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            o5.b bVar = new o5.b(context, iVar);
            u5.d.a(context, SystemJobService.class, true);
            k5.j.c().a(f39561a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return bVar;
        }
        e c10 = c(context);
        if (c10 == null) {
            n5.b bVar2 = new n5.b(context);
            u5.d.a(context, SystemAlarmService.class, true);
            k5.j.c().a(f39561a, "Created SystemAlarmScheduler", new Throwable[0]);
            return bVar2;
        }
        return c10;
    }

    public static void b(androidx.work.a aVar, WorkDatabase workDatabase, List<e> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        q L = workDatabase.L();
        workDatabase.e();
        try {
            List<p> o10 = L.o(aVar.h());
            List<p> j10 = L.j(200);
            if (o10 != null && o10.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                for (p pVar : o10) {
                    L.m(pVar.f53192a, currentTimeMillis);
                }
            }
            workDatabase.A();
            if (o10 != null && o10.size() > 0) {
                p[] pVarArr = (p[]) o10.toArray(new p[o10.size()]);
                for (e eVar : list) {
                    if (eVar.c()) {
                        eVar.e(pVarArr);
                    }
                }
            }
            if (j10 == null || j10.size() <= 0) {
                return;
            }
            p[] pVarArr2 = (p[]) j10.toArray(new p[j10.size()]);
            for (e eVar2 : list) {
                if (!eVar2.c()) {
                    eVar2.e(pVarArr2);
                }
            }
        } finally {
            workDatabase.i();
        }
    }

    public static e c(Context context) {
        try {
            e eVar = (e) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
            k5.j.c().a(f39561a, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
            return eVar;
        } catch (Throwable th2) {
            k5.j.c().a(f39561a, "Unable to create GCM Scheduler", th2);
            return null;
        }
    }
}
