package em;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.widget.ActivityChooserModel;
import b3.j;
import em.a;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f30659a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f30660b;

    /* renamed from: c  reason: collision with root package name */
    public final com.google.firebase.messaging.c f30661c;

    public b(Context context, com.google.firebase.messaging.c cVar, Executor executor) {
        this.f30659a = executor;
        this.f30660b = context;
        this.f30661c = cVar;
    }

    public boolean a() {
        if (this.f30661c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        c0 d10 = d();
        a.C0307a d11 = a.d(this.f30660b, this.f30661c);
        e(d11.f30644a, d10);
        c(d11);
        return true;
    }

    public final boolean b() {
        if (((KeyguardManager) this.f30660b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!vh.n.h()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f30660b.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ActivityManager.RunningAppProcessInfo next = it.next();
                if (next.pid == myPid) {
                    if (next.importance == 100) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void c(a.C0307a c0307a) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f30660b.getSystemService("notification")).notify(c0307a.f30645b, c0307a.f30646c, c0307a.f30644a.c());
    }

    public final c0 d() {
        c0 d10 = c0.d(this.f30661c.p("gcm.n.image"));
        if (d10 != null) {
            d10.h(this.f30659a);
        }
        return d10;
    }

    public final void e(j.e eVar, c0 c0Var) {
        if (c0Var == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) vi.j.b(c0Var.e(), 5L, TimeUnit.SECONDS);
            eVar.v(bitmap);
            eVar.F(new j.b().n(bitmap).m(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            c0Var.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e10) {
            Log.w("FirebaseMessaging", "Failed to download image: ".concat(String.valueOf(e10.getCause())));
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            c0Var.close();
        }
    }
}
