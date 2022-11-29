package em;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import em.a1;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class a1 implements ServiceConnection {
    public x0 A;
    public boolean B;

    /* renamed from: w  reason: collision with root package name */
    public final Context f30653w;

    /* renamed from: x  reason: collision with root package name */
    public final Intent f30654x;

    /* renamed from: y  reason: collision with root package name */
    public final ScheduledExecutorService f30655y;

    /* renamed from: z  reason: collision with root package name */
    public final Queue<a> f30656z;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Intent f30657a;

        /* renamed from: b  reason: collision with root package name */
        public final vi.h<Void> f30658b = new vi.h<>();

        public a(Intent intent) {
            this.f30657a = intent;
        }

        public void a(ScheduledExecutorService scheduledExecutorService) {
            final ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new Runnable() { // from class: em.z0
                @Override // java.lang.Runnable
                public final void run() {
                    a1.a.this.d();
                }
            }, 9000L, TimeUnit.MILLISECONDS);
            c().b(scheduledExecutorService, new vi.c() { // from class: em.y0
                @Override // vi.c
                public final void a(vi.g gVar) {
                    schedule.cancel(false);
                }
            });
        }

        public void b() {
            this.f30658b.e(null);
        }

        public vi.g<Void> c() {
            return this.f30658b.a();
        }

        public /* synthetic */ void d() {
            String action = this.f30657a.getAction();
            StringBuilder sb2 = new StringBuilder(String.valueOf(action).length() + 61);
            sb2.append("Service took too long to process intent: ");
            sb2.append(action);
            sb2.append(" App may get closed.");
            Log.w("FirebaseMessaging", sb2.toString());
            b();
        }
    }

    public a1(Context context, String str) {
        this(context, "com.google.firebase.MESSAGING_EVENT", new ScheduledThreadPoolExecutor(0, new wh.a("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    public final void a() {
        while (!this.f30656z.isEmpty()) {
            this.f30656z.poll().b();
        }
    }

    public final synchronized void b() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "flush queue called");
        }
        while (!this.f30656z.isEmpty()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "found intent to be delivered");
            }
            x0 x0Var = this.A;
            if (x0Var != null && x0Var.isBinderAlive()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.A.b(this.f30656z.poll());
            } else {
                d();
                return;
            }
        }
    }

    public synchronized vi.g<Void> c(Intent intent) {
        a aVar;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
        }
        aVar = new a(intent);
        aVar.a(this.f30655y);
        this.f30656z.add(aVar);
        b();
        return aVar.c();
    }

    public final void d() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            boolean z10 = this.B;
            StringBuilder sb2 = new StringBuilder(39);
            sb2.append("binder is dead. start connection? ");
            sb2.append(!z10);
            Log.d("FirebaseMessaging", sb2.toString());
        }
        if (this.B) {
            return;
        }
        this.B = true;
        try {
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e10);
        }
        if (uh.a.b().a(this.f30653w, this.f30654x, this, 65)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.B = false;
        a();
    }

    @Override // android.content.ServiceConnection
    public synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceConnected: ".concat(String.valueOf(componentName)));
        }
        this.B = false;
        if (!(iBinder instanceof x0)) {
            Log.e("FirebaseMessaging", "Invalid service connection: ".concat(String.valueOf(iBinder)));
            a();
            return;
        }
        this.A = (x0) iBinder;
        b();
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: ".concat(String.valueOf(componentName)));
        }
        b();
    }

    public a1(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f30656z = new ArrayDeque();
        this.B = false;
        Context applicationContext = context.getApplicationContext();
        this.f30653w = applicationContext;
        this.f30654x = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f30655y = scheduledExecutorService;
    }
}
