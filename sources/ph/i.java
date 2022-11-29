package ph;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import java.util.Collections;
import java.util.Set;
import rh.c;

/* loaded from: classes3.dex */
public final class i implements a.f, ServiceConnection {
    public static final String H = i.class.getSimpleName();
    public final d A;
    public final Handler B;
    public final j C;
    public IBinder D;
    public boolean E;
    public String F;
    public String G;

    /* renamed from: w  reason: collision with root package name */
    public final String f47501w;

    /* renamed from: x  reason: collision with root package name */
    public final String f47502x;

    /* renamed from: y  reason: collision with root package name */
    public final ComponentName f47503y;

    /* renamed from: z  reason: collision with root package name */
    public final Context f47504z;

    @Override // com.google.android.gms.common.api.a.f
    public final void a(String str) {
        q();
        this.F = str;
        disconnect();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean b() {
        q();
        return this.E;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final String c() {
        String str = this.f47501w;
        if (str != null) {
            return str;
        }
        rh.p.i(this.f47503y);
        return this.f47503y.getPackageName();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void d(c.e eVar) {
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void disconnect() {
        q();
        r("Disconnect called.");
        try {
            this.f47504z.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.E = false;
        this.D = null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean e() {
        return false;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean f() {
        return false;
    }

    public final /* synthetic */ void g() {
        this.E = false;
        this.D = null;
        r("Disconnected.");
        this.A.s0(1);
    }

    @Override // com.google.android.gms.common.api.a.f
    public final Set<Scope> h() {
        return Collections.emptySet();
    }

    @Override // com.google.android.gms.common.api.a.f
    public final boolean isConnected() {
        q();
        return this.D != null;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void j(rh.i iVar, Set<Scope> set) {
    }

    @Override // com.google.android.gms.common.api.a.f
    public final void k(c.InterfaceC0781c interfaceC0781c) {
        q();
        r("Connect started.");
        if (isConnected()) {
            try {
                a("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f47503y;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f47501w).setAction(this.f47502x);
            }
            boolean bindService = this.f47504z.bindService(intent, this, rh.h.a());
            this.E = bindService;
            if (!bindService) {
                this.D = null;
                this.C.z0(new ConnectionResult(16));
            }
            r("Finished connect.");
        } catch (SecurityException e10) {
            this.E = false;
            this.D = null;
            throw e10;
        }
    }

    @Override // com.google.android.gms.common.api.a.f
    public final int l() {
        return 0;
    }

    @Override // com.google.android.gms.common.api.a.f
    public final nh.c[] m() {
        return new nh.c[0];
    }

    @Override // com.google.android.gms.common.api.a.f
    public final String n() {
        return this.F;
    }

    public final /* synthetic */ void o(IBinder iBinder) {
        this.E = false;
        this.D = iBinder;
        r("Connected.");
        this.A.i0(new Bundle());
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        this.B.post(new Runnable() { // from class: ph.n0
            @Override // java.lang.Runnable
            public final void run() {
                i.this.o(iBinder);
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.B.post(new Runnable() { // from class: ph.m0
            @Override // java.lang.Runnable
            public final void run() {
                i.this.g();
            }
        });
    }

    public final void p(String str) {
        this.G = str;
    }

    public final void q() {
        if (Thread.currentThread() != this.B.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    public final void r(String str) {
        String.valueOf(this.D);
    }
}
