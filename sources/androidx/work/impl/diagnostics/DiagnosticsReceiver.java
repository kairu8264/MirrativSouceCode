package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import k5.j;
import k5.l;
import k5.t;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static final String f16615a = j.f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        j.c().a(f16615a, "Requesting diagnostics", new Throwable[0]);
        try {
            t.d(context).c(l.d(DiagnosticsWorker.class));
        } catch (IllegalStateException e10) {
            j.c().b(f16615a, "WorkManager is not initialized", e10);
        }
    }
}
