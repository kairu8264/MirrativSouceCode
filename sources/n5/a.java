package n5;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import k5.j;
import l5.i;
import t5.g;
import t5.h;
import u5.c;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f41580a = j.f("Alarms");

    public static void a(Context context, i iVar, String str) {
        h I = iVar.o().I();
        g a10 = I.a(str);
        if (a10 != null) {
            b(context, str, a10.f53170b);
            j.c().a(f41580a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            I.d(str);
        }
    }

    public static void b(Context context, String str, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i10, androidx.work.impl.background.systemalarm.a.b(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        j.c().a(f41580a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i10)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void c(Context context, i iVar, String str, long j10) {
        WorkDatabase o10 = iVar.o();
        h I = o10.I();
        g a10 = I.a(str);
        if (a10 != null) {
            b(context, str, a10.f53170b);
            d(context, str, a10.f53170b, j10);
            return;
        }
        int b10 = new c(o10).b();
        I.c(new g(str, b10));
        d(context, str, b10, j10);
    }

    public static void d(Context context, String str, int i10, long j10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i11 = Build.VERSION.SDK_INT;
        PendingIntent service = PendingIntent.getService(context, i10, androidx.work.impl.background.systemalarm.a.b(context, str), i11 >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            if (i11 >= 19) {
                alarmManager.setExact(0, j10, service);
            } else {
                alarmManager.set(0, j10, service);
            }
        }
    }
}
