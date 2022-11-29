package ak;

import android.app.Notification;
import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.play.core.assetpacks.ExtractionForegroundService;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class n1 implements ServiceConnection {
    public Notification A;

    /* renamed from: w  reason: collision with root package name */
    public final dk.f f13546w = new dk.f("ExtractionForegroundServiceConnection");

    /* renamed from: x  reason: collision with root package name */
    public final List<dk.q0> f13547x = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    public final Context f13548y;

    /* renamed from: z  reason: collision with root package name */
    public ExtractionForegroundService f13549z;

    public n1(Context context) {
        this.f13548y = context;
    }

    public final void a(Notification notification) {
        this.A = notification;
    }

    public final void b() {
        this.f13546w.a("Stopping foreground installation service.", new Object[0]);
        this.f13548y.unbindService(this);
        ExtractionForegroundService extractionForegroundService = this.f13549z;
        if (extractionForegroundService != null) {
            extractionForegroundService.a();
        }
        d();
    }

    public final void c(dk.q0 q0Var) {
        synchronized (this.f13547x) {
            this.f13547x.add(q0Var);
        }
    }

    public final void d() {
        ArrayList arrayList;
        synchronized (this.f13547x) {
            arrayList = new ArrayList(this.f13547x);
            this.f13547x.clear();
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((dk.q0) arrayList.get(i10)).w3(new Bundle(), new Bundle());
            } catch (RemoteException unused) {
                this.f13546w.b("Could not resolve Play Store service state update callback.", new Object[0]);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f13546w.a("Starting foreground installation service.", new Object[0]);
        ExtractionForegroundService extractionForegroundService = ((m1) iBinder).f13531w;
        this.f13549z = extractionForegroundService;
        extractionForegroundService.startForeground(-1883842196, this.A);
        d();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
