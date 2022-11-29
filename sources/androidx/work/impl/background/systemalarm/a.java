package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.d;
import java.util.HashMap;
import java.util.Map;
import k5.j;
import t5.p;

/* loaded from: classes.dex */
public class a implements l5.b {

    /* renamed from: z  reason: collision with root package name */
    public static final String f16590z = j.f("CommandHandler");

    /* renamed from: w  reason: collision with root package name */
    public final Context f16591w;

    /* renamed from: x  reason: collision with root package name */
    public final Map<String, l5.b> f16592x = new HashMap();

    /* renamed from: y  reason: collision with root package name */
    public final Object f16593y = new Object();

    public a(Context context) {
        this.f16591w = context;
    }

    public static Intent a(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, boolean z10) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        return intent;
    }

    public static Intent e(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    public static Intent f(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent g(Context context, String str) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static boolean n(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // l5.b
    public void d(String str, boolean z10) {
        synchronized (this.f16593y) {
            l5.b remove = this.f16592x.remove(str);
            if (remove != null) {
                remove.d(str, z10);
            }
        }
    }

    public final void h(Intent intent, int i10, d dVar) {
        j.c().a(f16590z, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new b(this.f16591w, i10, dVar).a();
    }

    public final void i(Intent intent, int i10, d dVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f16593y) {
            String string = extras.getString("KEY_WORKSPEC_ID");
            j c10 = j.c();
            String str = f16590z;
            c10.a(str, String.format("Handing delay met for %s", string), new Throwable[0]);
            if (!this.f16592x.containsKey(string)) {
                c cVar = new c(this.f16591w, i10, string, dVar);
                this.f16592x.put(string, cVar);
                cVar.e();
            } else {
                j.c().a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
            }
        }
    }

    public final void j(Intent intent, int i10) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z10 = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        j.c().a(f16590z, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
        d(string, z10);
    }

    public final void k(Intent intent, int i10, d dVar) {
        j.c().a(f16590z, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i10)), new Throwable[0]);
        dVar.g().s();
    }

    public final void l(Intent intent, int i10, d dVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        j c10 = j.c();
        String str = f16590z;
        c10.a(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase o10 = dVar.g().o();
        o10.e();
        try {
            p g10 = o10.L().g(string);
            if (g10 == null) {
                j c11 = j.c();
                c11.h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
            } else if (g10.f53193b.a()) {
                j c12 = j.c();
                c12.h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
            } else {
                long a10 = g10.a();
                if (!g10.b()) {
                    j.c().a(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(a10)), new Throwable[0]);
                    n5.a.c(this.f16591w, dVar.g(), string, a10);
                } else {
                    j.c().a(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(a10)), new Throwable[0]);
                    n5.a.c(this.f16591w, dVar.g(), string, a10);
                    dVar.k(new d.b(dVar, a(this.f16591w), i10));
                }
                o10.A();
            }
        } finally {
            o10.i();
        }
    }

    public final void m(Intent intent, d dVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        j.c().a(f16590z, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        dVar.g().x(string);
        n5.a.a(this.f16591w, dVar.g(), string);
        dVar.d(string, false);
    }

    public boolean o() {
        boolean z10;
        synchronized (this.f16593y) {
            z10 = !this.f16592x.isEmpty();
        }
        return z10;
    }

    public void p(Intent intent, int i10, d dVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            h(intent, i10, dVar);
        } else if ("ACTION_RESCHEDULE".equals(action)) {
            k(intent, i10, dVar);
        } else if (!n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            j.c().b(f16590z, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
        } else if ("ACTION_SCHEDULE_WORK".equals(action)) {
            l(intent, i10, dVar);
        } else if ("ACTION_DELAY_MET".equals(action)) {
            i(intent, i10, dVar);
        } else if ("ACTION_STOP_WORK".equals(action)) {
            m(intent, dVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            j(intent, i10);
        } else {
            j.c().h(f16590z, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}
