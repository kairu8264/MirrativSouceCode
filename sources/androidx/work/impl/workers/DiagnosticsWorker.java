package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import k5.j;
import l5.i;
import t5.g;
import t5.h;
import t5.k;
import t5.p;
import t5.q;
import t5.t;

/* loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {
    public static final String C = j.f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String a(p pVar, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", pVar.f53192a, pVar.f53194c, num, pVar.f53193b.name(), str, str2);
    }

    public static String c(k kVar, t tVar, h hVar, List<p> list) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"));
        for (p pVar : list) {
            Integer num = null;
            g a10 = hVar.a(pVar.f53192a);
            if (a10 != null) {
                num = Integer.valueOf(a10.f53170b);
            }
            sb2.append(a(pVar, TextUtils.join(",", kVar.a(pVar.f53192a)), num, TextUtils.join(",", tVar.b(pVar.f53192a))));
        }
        return sb2.toString();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a doWork() {
        WorkDatabase o10 = i.k(getApplicationContext()).o();
        q L = o10.L();
        k J = o10.J();
        t M = o10.M();
        h I = o10.I();
        List<p> a10 = L.a(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List<p> q10 = L.q();
        List<p> j10 = L.j(200);
        if (a10 != null && !a10.isEmpty()) {
            j c10 = j.c();
            String str = C;
            c10.d(str, "Recently completed work:\n\n", new Throwable[0]);
            j.c().d(str, c(J, M, I, a10), new Throwable[0]);
        }
        if (q10 != null && !q10.isEmpty()) {
            j c11 = j.c();
            String str2 = C;
            c11.d(str2, "Running work:\n\n", new Throwable[0]);
            j.c().d(str2, c(J, M, I, q10), new Throwable[0]);
        }
        if (j10 != null && !j10.isEmpty()) {
            j c12 = j.c();
            String str3 = C;
            c12.d(str3, "Enqueued work:\n\n", new Throwable[0]);
            j.c().d(str3, c(J, M, I, j10), new Throwable[0]);
        }
        return ListenableWorker.a.c();
    }
}
