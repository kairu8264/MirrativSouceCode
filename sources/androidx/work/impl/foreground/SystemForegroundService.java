package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.y;
import androidx.work.impl.foreground.a;
import k5.j;

/* loaded from: classes.dex */
public class SystemForegroundService extends y implements a.b {
    public static final String B = j.f("SystemFgService");
    public static SystemForegroundService C = null;
    public NotificationManager A;

    /* renamed from: x  reason: collision with root package name */
    public Handler f16616x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f16617y;

    /* renamed from: z  reason: collision with root package name */
    public androidx.work.impl.foreground.a f16618z;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f16619w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Notification f16620x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ int f16621y;

        public a(int i10, Notification notification, int i11) {
            this.f16619w = i10;
            this.f16620x = notification;
            this.f16621y = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.f16619w, this.f16620x, this.f16621y);
            } else {
                SystemForegroundService.this.startForeground(this.f16619w, this.f16620x);
            }
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f16623w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Notification f16624x;

        public b(int i10, Notification notification) {
            this.f16623w = i10;
            this.f16624x = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.A.notify(this.f16623w, this.f16624x);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f16626w;

        public c(int i10) {
            this.f16626w = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.A.cancel(this.f16626w);
        }
    }

    @Override // androidx.work.impl.foreground.a.b
    public void a(int i10, Notification notification) {
        this.f16616x.post(new b(i10, notification));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void l(int i10, int i11, Notification notification) {
        this.f16616x.post(new a(i10, notification, i11));
    }

    @Override // androidx.work.impl.foreground.a.b
    public void n(int i10) {
        this.f16616x.post(new c(i10));
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public void onCreate() {
        super.onCreate();
        C = this;
        p();
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f16618z.k();
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f16617y) {
            j.c().d(B, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            this.f16618z.k();
            p();
            this.f16617y = false;
        }
        if (intent != null) {
            this.f16618z.l(intent);
            return 3;
        }
        return 3;
    }

    public final void p() {
        this.f16616x = new Handler(Looper.getMainLooper());
        this.A = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.a aVar = new androidx.work.impl.foreground.a(getApplicationContext());
        this.f16618z = aVar;
        aVar.m(this);
    }

    @Override // androidx.work.impl.foreground.a.b
    public void stop() {
        this.f16617y = true;
        j.c().a(B, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        C = null;
        stopSelf();
    }
}
