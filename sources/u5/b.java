package u5;

import android.text.TextUtils;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.List;
import k5.m;
import t5.p;

/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: y  reason: collision with root package name */
    public static final String f54395y = k5.j.f("EnqueueRunnable");

    /* renamed from: w  reason: collision with root package name */
    public final l5.g f54396w;

    /* renamed from: x  reason: collision with root package name */
    public final l5.c f54397x = new l5.c();

    public b(l5.g gVar) {
        this.f54396w = gVar;
    }

    public static boolean b(l5.g gVar) {
        boolean c10 = c(gVar.g(), gVar.f(), (String[]) l5.g.l(gVar).toArray(new String[0]), gVar.d(), gVar.b());
        gVar.k();
        return c10;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e1 A[LOOP:5: B:125:0x01db->B:127:0x01e1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x020a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0159  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(l5.i r19, java.util.List<? extends k5.u> r20, java.lang.String[] r21, java.lang.String r22, k5.d r23) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u5.b.c(l5.i, java.util.List, java.lang.String[], java.lang.String, k5.d):boolean");
    }

    public static boolean e(l5.g gVar) {
        List<l5.g> e10 = gVar.e();
        boolean z10 = false;
        if (e10 != null) {
            boolean z11 = false;
            for (l5.g gVar2 : e10) {
                if (!gVar2.j()) {
                    z11 |= e(gVar2);
                } else {
                    k5.j.c().h(f54395y, String.format("Already enqueued work ids (%s).", TextUtils.join(", ", gVar2.c())), new Throwable[0]);
                }
            }
            z10 = z11;
        }
        return b(gVar) | z10;
    }

    public static void g(p pVar) {
        k5.b bVar = pVar.f53201j;
        String str = pVar.f53194c;
        if (str.equals(ConstraintTrackingWorker.class.getName())) {
            return;
        }
        if (bVar.f() || bVar.i()) {
            b.a aVar = new b.a();
            aVar.c(pVar.f53196e).e("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str);
            pVar.f53194c = ConstraintTrackingWorker.class.getName();
            pVar.f53196e = aVar.a();
        }
    }

    public static boolean h(l5.i iVar, String str) {
        try {
            Class<?> cls = Class.forName(str);
            for (l5.e eVar : iVar.n()) {
                if (cls.isAssignableFrom(eVar.getClass())) {
                    return true;
                }
            }
        } catch (ClassNotFoundException unused) {
        }
        return false;
    }

    public boolean a() {
        WorkDatabase o10 = this.f54396w.g().o();
        o10.e();
        try {
            boolean e10 = e(this.f54396w);
            o10.A();
            return e10;
        } finally {
            o10.i();
        }
    }

    public k5.m d() {
        return this.f54397x;
    }

    public void f() {
        l5.i g10 = this.f54396w.g();
        l5.f.b(g10.i(), g10.o(), g10.n());
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (!this.f54396w.h()) {
                if (a()) {
                    d.a(this.f54396w.g().h(), RescheduleReceiver.class, true);
                    f();
                }
                this.f54397x.a(k5.m.f38418a);
                return;
            }
            throw new IllegalStateException(String.format("WorkContinuation has cycles (%s)", this.f54396w));
        } catch (Throwable th2) {
            this.f54397x.a(new m.b.a(th2));
        }
    }
}
