package mh;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzq;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class r implements ServiceConnection {
    public final /* synthetic */ w B;

    /* renamed from: y  reason: collision with root package name */
    public s f41166y;

    /* renamed from: w  reason: collision with root package name */
    public int f41164w = 0;

    /* renamed from: x  reason: collision with root package name */
    public final Messenger f41165x = new Messenger(new ei.f(Looper.getMainLooper(), new Handler.Callback() { // from class: mh.k
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            r rVar = r.this;
            int i10 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb2 = new StringBuilder(41);
                sb2.append("Received response to request: ");
                sb2.append(i10);
                Log.d("MessengerIpcClient", sb2.toString());
            }
            synchronized (rVar) {
                u<?> uVar = rVar.A.get(i10);
                if (uVar == null) {
                    StringBuilder sb3 = new StringBuilder(50);
                    sb3.append("Received response for unknown request: ");
                    sb3.append(i10);
                    Log.w("MessengerIpcClient", sb3.toString());
                    return true;
                }
                rVar.A.remove(i10);
                rVar.f();
                Bundle data = message.getData();
                if (data.getBoolean("unsupported", false)) {
                    uVar.c(new zzq(4, "Not supported by GmsCore", null));
                    return true;
                }
                uVar.a(data);
                return true;
            }
        }
    }));

    /* renamed from: z  reason: collision with root package name */
    public final Queue<u<?>> f41167z = new ArrayDeque();
    public final SparseArray<u<?>> A = new SparseArray<>();

    public /* synthetic */ r(w wVar, q qVar) {
        this.B = wVar;
    }

    public final synchronized void a(int i10, String str) {
        b(i10, str, null);
    }

    public final synchronized void b(int i10, String str, Throwable th2) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(str);
            Log.d("MessengerIpcClient", valueOf.length() != 0 ? "Disconnected: ".concat(valueOf) : new String("Disconnected: "));
        }
        int i11 = this.f41164w;
        if (i11 == 0) {
            throw new IllegalStateException();
        }
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                return;
            }
            this.f41164w = 4;
            return;
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Unbinding service");
        }
        this.f41164w = 4;
        uh.a.b().c(w.a(this.B), this);
        zzq zzqVar = new zzq(i10, str, th2);
        for (u<?> uVar : this.f41167z) {
            uVar.c(zzqVar);
        }
        this.f41167z.clear();
        for (int i12 = 0; i12 < this.A.size(); i12++) {
            this.A.valueAt(i12).c(zzqVar);
        }
        this.A.clear();
    }

    public final void c() {
        w.e(this.B).execute(new Runnable() { // from class: mh.m
            @Override // java.lang.Runnable
            public final void run() {
                final u<?> poll;
                final r rVar = r.this;
                while (true) {
                    synchronized (rVar) {
                        if (rVar.f41164w != 2) {
                            return;
                        }
                        if (rVar.f41167z.isEmpty()) {
                            rVar.f();
                            return;
                        }
                        poll = rVar.f41167z.poll();
                        rVar.A.put(poll.f41170a, poll);
                        w.e(rVar.B).schedule(new Runnable() { // from class: mh.p
                            @Override // java.lang.Runnable
                            public final void run() {
                                r.this.e(poll.f41170a);
                            }
                        }, 30L, TimeUnit.SECONDS);
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String valueOf = String.valueOf(poll);
                        StringBuilder sb2 = new StringBuilder(valueOf.length() + 8);
                        sb2.append("Sending ");
                        sb2.append(valueOf);
                        Log.d("MessengerIpcClient", sb2.toString());
                    }
                    Context a10 = w.a(rVar.B);
                    Messenger messenger = rVar.f41165x;
                    Message obtain = Message.obtain();
                    obtain.what = poll.f41172c;
                    obtain.arg1 = poll.f41170a;
                    obtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", poll.b());
                    bundle.putString("pkg", a10.getPackageName());
                    bundle.putBundle("data", poll.f41173d);
                    obtain.setData(bundle);
                    try {
                        rVar.f41166y.a(obtain);
                    } catch (RemoteException e10) {
                        rVar.a(2, e10.getMessage());
                    }
                }
            }
        });
    }

    public final synchronized void d() {
        if (this.f41164w == 1) {
            a(1, "Timed out while binding");
        }
    }

    public final synchronized void e(int i10) {
        u<?> uVar = this.A.get(i10);
        if (uVar != null) {
            StringBuilder sb2 = new StringBuilder(31);
            sb2.append("Timing out request: ");
            sb2.append(i10);
            Log.w("MessengerIpcClient", sb2.toString());
            this.A.remove(i10);
            uVar.c(new zzq(3, "Timed out waiting for response", null));
            f();
        }
    }

    public final synchronized void f() {
        if (this.f41164w == 2 && this.f41167z.isEmpty() && this.A.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.f41164w = 3;
            uh.a.b().c(w.a(this.B), this);
        }
    }

    public final synchronized boolean g(u<?> uVar) {
        int i10 = this.f41164w;
        if (i10 != 0) {
            if (i10 == 1) {
                this.f41167z.add(uVar);
                return true;
            } else if (i10 != 2) {
                return false;
            } else {
                this.f41167z.add(uVar);
                c();
                return true;
            }
        }
        this.f41167z.add(uVar);
        rh.p.l(this.f41164w == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f41164w = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (!uh.a.b().a(w.a(this.B), intent, this, 1)) {
                a(0, "Unable to bind to service");
            } else {
                w.e(this.B).schedule(new Runnable() { // from class: mh.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        r.this.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            }
        } catch (SecurityException e10) {
            b(0, "Unable to bind to service", e10);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        w.e(this.B).execute(new Runnable() { // from class: mh.o
            @Override // java.lang.Runnable
            public final void run() {
                r rVar = r.this;
                IBinder iBinder2 = iBinder;
                synchronized (rVar) {
                    try {
                        if (iBinder2 == null) {
                            rVar.a(0, "Null service connection");
                            return;
                        }
                        try {
                            rVar.f41166y = new s(iBinder2);
                            rVar.f41164w = 2;
                            rVar.c();
                        } catch (RemoteException e10) {
                            rVar.a(0, e10.getMessage());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        w.e(this.B).execute(new Runnable() { // from class: mh.l
            @Override // java.lang.Runnable
            public final void run() {
                r.this.a(2, "Service disconnected");
            }
        });
    }
}
