package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import k5.e;
import k5.j;
import l5.i;
import p5.c;
import p5.d;
import t5.p;

/* loaded from: classes.dex */
public class a implements c, l5.b {
    public static final String G = j.f("SystemFgDispatcher");
    public String A;
    public final Map<String, e> B;
    public final Map<String, p> C;
    public final Set<p> D;
    public final d E;
    public b F;

    /* renamed from: w  reason: collision with root package name */
    public Context f16628w;

    /* renamed from: x  reason: collision with root package name */
    public i f16629x;

    /* renamed from: y  reason: collision with root package name */
    public final w5.a f16630y;

    /* renamed from: z  reason: collision with root package name */
    public final Object f16631z = new Object();

    /* renamed from: androidx.work.impl.foreground.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0087a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ WorkDatabase f16632w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ String f16633x;

        public RunnableC0087a(WorkDatabase workDatabase, String str) {
            this.f16632w = workDatabase;
            this.f16633x = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            p g10 = this.f16632w.L().g(this.f16633x);
            if (g10 == null || !g10.b()) {
                return;
            }
            synchronized (a.this.f16631z) {
                a.this.C.put(this.f16633x, g10);
                a.this.D.add(g10);
                a aVar = a.this;
                aVar.E.d(aVar.D);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(int i10, Notification notification);

        void l(int i10, int i11, Notification notification);

        void n(int i10);

        void stop();
    }

    public a(Context context) {
        this.f16628w = context;
        i k10 = i.k(context);
        this.f16629x = k10;
        w5.a p10 = k10.p();
        this.f16630y = p10;
        this.A = null;
        this.B = new LinkedHashMap();
        this.D = new HashSet();
        this.C = new HashMap();
        this.E = new d(this.f16628w, p10, this);
        this.f16629x.m().c(this);
    }

    public static Intent a(Context context, String str, e eVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, e eVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NOTIFICATION_ID", eVar.c());
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", eVar.a());
        intent.putExtra("KEY_NOTIFICATION", eVar.b());
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent e(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    @Override // p5.c
    public void b(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        for (String str : list) {
            j.c().a(G, String.format("Constraints unmet for WorkSpec %s", str), new Throwable[0]);
            this.f16629x.w(str);
        }
    }

    @Override // l5.b
    public void d(String str, boolean z10) {
        Map.Entry<String, e> entry;
        synchronized (this.f16631z) {
            p remove = this.C.remove(str);
            if (remove != null ? this.D.remove(remove) : false) {
                this.E.d(this.D);
            }
        }
        e remove2 = this.B.remove(str);
        if (str.equals(this.A) && this.B.size() > 0) {
            Iterator<Map.Entry<String, e>> it = this.B.entrySet().iterator();
            Map.Entry<String, e> next = it.next();
            while (true) {
                entry = next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.A = entry.getKey();
            if (this.F != null) {
                e value = entry.getValue();
                this.F.l(value.c(), value.a(), value.b());
                this.F.n(value.c());
            }
        }
        b bVar = this.F;
        if (remove2 == null || bVar == null) {
            return;
        }
        j.c().a(G, String.format("Removing Notification (id: %s, workSpecId: %s ,notificationType: %s)", Integer.valueOf(remove2.c()), str, Integer.valueOf(remove2.a())), new Throwable[0]);
        bVar.n(remove2.c());
    }

    @Override // p5.c
    public void f(List<String> list) {
    }

    public final void g(Intent intent) {
        j.c().d(G, String.format("Stopping foreground work for %s", intent), new Throwable[0]);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return;
        }
        this.f16629x.f(UUID.fromString(stringExtra));
    }

    public final void h(Intent intent) {
        int i10 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        j.c().a(G, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)), new Throwable[0]);
        if (notification == null || this.F == null) {
            return;
        }
        this.B.put(stringExtra, new e(intExtra, notification, intExtra2));
        if (TextUtils.isEmpty(this.A)) {
            this.A = stringExtra;
            this.F.l(intExtra, intExtra2, notification);
            return;
        }
        this.F.a(intExtra, notification);
        if (intExtra2 == 0 || Build.VERSION.SDK_INT < 29) {
            return;
        }
        for (Map.Entry<String, e> entry : this.B.entrySet()) {
            i10 |= entry.getValue().a();
        }
        e eVar = this.B.get(this.A);
        if (eVar != null) {
            this.F.l(eVar.c(), i10, eVar.b());
        }
    }

    public final void i(Intent intent) {
        j.c().d(G, String.format("Started foreground service %s", intent), new Throwable[0]);
        this.f16630y.b(new RunnableC0087a(this.f16629x.o(), intent.getStringExtra("KEY_WORKSPEC_ID")));
    }

    public void j(Intent intent) {
        j.c().d(G, "Stopping foreground service", new Throwable[0]);
        b bVar = this.F;
        if (bVar != null) {
            bVar.stop();
        }
    }

    public void k() {
        this.F = null;
        synchronized (this.f16631z) {
            this.E.e();
        }
        this.f16629x.m().i(this);
    }

    public void l(Intent intent) {
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            i(intent);
            h(intent);
        } else if ("ACTION_NOTIFY".equals(action)) {
            h(intent);
        } else if ("ACTION_CANCEL_WORK".equals(action)) {
            g(intent);
        } else if ("ACTION_STOP_FOREGROUND".equals(action)) {
            j(intent);
        }
    }

    public void m(b bVar) {
        if (this.F != null) {
            j.c().b(G, "A callback already exists.", new Throwable[0]);
        } else {
            this.F = bVar;
        }
    }
}
