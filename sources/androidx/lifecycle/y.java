package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public class y extends Service implements u {

    /* renamed from: w  reason: collision with root package name */
    public final n0 f15634w = new n0(this);

    @Override // androidx.lifecycle.u
    public o g() {
        return this.f15634w.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.f15634w.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f15634w.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f15634w.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i10) {
        this.f15634w.e();
        super.onStart(intent, i10);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        return super.onStartCommand(intent, i10, i11);
    }
}
