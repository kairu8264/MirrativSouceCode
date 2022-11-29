package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import androidx.lifecycle.y;
import androidx.work.impl.background.systemalarm.d;
import k5.j;

/* loaded from: classes.dex */
public class SystemAlarmService extends y implements d.c {

    /* renamed from: z  reason: collision with root package name */
    public static final String f16587z = j.f("SystemAlarmService");

    /* renamed from: x  reason: collision with root package name */
    public d f16588x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f16589y;

    @Override // androidx.work.impl.background.systemalarm.d.c
    public void i() {
        this.f16589y = true;
        j.c().a(f16587z, "All commands completed in dispatcher", new Throwable[0]);
        u5.j.a();
        stopSelf();
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public void onCreate() {
        super.onCreate();
        p();
        this.f16589y = false;
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f16589y = true;
        this.f16588x.j();
    }

    @Override // androidx.lifecycle.y, android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f16589y) {
            j.c().d(f16587z, "Re-initializing SystemAlarmDispatcher after a request to shut-down.", new Throwable[0]);
            this.f16588x.j();
            p();
            this.f16589y = false;
        }
        if (intent != null) {
            this.f16588x.a(intent, i11);
            return 3;
        }
        return 3;
    }

    public final void p() {
        d dVar = new d(this);
        this.f16588x = dVar;
        dVar.m(this);
    }
}
