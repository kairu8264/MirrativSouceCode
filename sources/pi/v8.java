package pi;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.common.ConnectionResult;
import rh.c;

/* loaded from: classes3.dex */
public final class v8 implements ServiceConnection, c.a, c.b {

    /* renamed from: w  reason: collision with root package name */
    public volatile boolean f48288w;

    /* renamed from: x  reason: collision with root package name */
    public volatile m3 f48289x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ w8 f48290y;

    public v8(w8 w8Var) {
        this.f48290y = w8Var;
    }

    public final void b(Intent intent) {
        v8 v8Var;
        this.f48290y.f();
        Context F = this.f48290y.f48285a.F();
        uh.a b10 = uh.a.b();
        synchronized (this) {
            if (this.f48288w) {
                this.f48290y.f48285a.r().u().a("Connection attempt already in progress");
                return;
            }
            this.f48290y.f48285a.r().u().a("Using local app measurement service");
            this.f48288w = true;
            v8Var = this.f48290y.f48321c;
            b10.a(F, intent, v8Var, TsExtractor.TS_STREAM_TYPE_AC3);
        }
    }

    public final void c() {
        this.f48290y.f();
        Context F = this.f48290y.f48285a.F();
        synchronized (this) {
            if (this.f48288w) {
                this.f48290y.f48285a.r().u().a("Connection attempt already in progress");
            } else if (this.f48289x != null && (this.f48289x.b() || this.f48289x.isConnected())) {
                this.f48290y.f48285a.r().u().a("Already awaiting connection attempt");
            } else {
                this.f48289x = new m3(F, Looper.getMainLooper(), this, this);
                this.f48290y.f48285a.r().u().a("Connecting to remote service");
                this.f48288w = true;
                rh.p.i(this.f48289x);
                this.f48289x.o();
            }
        }
    }

    public final void d() {
        if (this.f48289x != null && (this.f48289x.isConnected() || this.f48289x.b())) {
            this.f48289x.disconnect();
        }
        this.f48289x = null;
    }

    @Override // rh.c.a
    public final void i0(Bundle bundle) {
        rh.p.d("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                rh.p.i(this.f48289x);
                this.f48290y.f48285a.a().y(new s8(this, this.f48289x.B()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f48289x = null;
                this.f48288w = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        v8 v8Var;
        g3 d3Var;
        rh.p.d("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f48288w = false;
                this.f48290y.f48285a.r().p().a("Service connected with null binder");
                return;
            }
            g3 g3Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof g3) {
                        d3Var = (g3) queryLocalInterface;
                    } else {
                        d3Var = new d3(iBinder);
                    }
                    g3Var = d3Var;
                    this.f48290y.f48285a.r().u().a("Bound to IMeasurementService interface");
                } else {
                    this.f48290y.f48285a.r().p().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f48290y.f48285a.r().p().a("Service connect failed to get IMeasurementService");
            }
            if (g3Var == null) {
                this.f48288w = false;
                try {
                    uh.a b10 = uh.a.b();
                    Context F = this.f48290y.f48285a.F();
                    v8Var = this.f48290y.f48321c;
                    b10.c(F, v8Var);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f48290y.f48285a.a().y(new q8(this, g3Var));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        rh.p.d("MeasurementServiceConnection.onServiceDisconnected");
        this.f48290y.f48285a.r().o().a("Service disconnected");
        this.f48290y.f48285a.a().y(new r8(this, componentName));
    }

    @Override // rh.c.a
    public final void s0(int i10) {
        rh.p.d("MeasurementServiceConnection.onConnectionSuspended");
        this.f48290y.f48285a.r().o().a("Service connection suspended");
        this.f48290y.f48285a.a().y(new t8(this));
    }

    @Override // rh.c.b
    public final void z0(ConnectionResult connectionResult) {
        rh.p.d("MeasurementServiceConnection.onConnectionFailed");
        q3 D = this.f48290y.f48285a.D();
        if (D != null) {
            D.v().b("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.f48288w = false;
            this.f48289x = null;
        }
        this.f48290y.f48285a.a().y(new u8(this));
    }
}
