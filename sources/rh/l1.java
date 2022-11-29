package rh;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class l1 implements ServiceConnection, p1 {
    public final k1 A;
    public ComponentName B;
    public final /* synthetic */ o1 C;

    /* renamed from: w  reason: collision with root package name */
    public final Map<ServiceConnection, ServiceConnection> f51471w = new HashMap();

    /* renamed from: x  reason: collision with root package name */
    public int f51472x = 2;

    /* renamed from: y  reason: collision with root package name */
    public boolean f51473y;

    /* renamed from: z  reason: collision with root package name */
    public IBinder f51474z;

    public l1(o1 o1Var, k1 k1Var) {
        this.C = o1Var;
        this.A = k1Var;
    }

    public final int a() {
        return this.f51472x;
    }

    public final ComponentName b() {
        return this.B;
    }

    public final IBinder c() {
        return this.f51474z;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f51471w.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        uh.a aVar;
        Context context;
        Context context2;
        uh.a aVar2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j10;
        this.f51472x = 3;
        o1 o1Var = this.C;
        aVar = o1Var.f51491j;
        context = o1Var.f51488g;
        k1 k1Var = this.A;
        context2 = o1Var.f51488g;
        boolean d10 = aVar.d(context, str, k1Var.c(context2), this, this.A.a(), executor);
        this.f51473y = d10;
        if (d10) {
            handler = this.C.f51489h;
            Message obtainMessage = handler.obtainMessage(1, this.A);
            handler2 = this.C.f51489h;
            j10 = this.C.f51493l;
            handler2.sendMessageDelayed(obtainMessage, j10);
            return;
        }
        this.f51472x = 2;
        try {
            o1 o1Var2 = this.C;
            aVar2 = o1Var2.f51491j;
            context3 = o1Var2.f51488g;
            aVar2.c(context3, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f51471w.remove(serviceConnection);
    }

    public final void g(String str) {
        Handler handler;
        uh.a aVar;
        Context context;
        handler = this.C.f51489h;
        handler.removeMessages(1, this.A);
        o1 o1Var = this.C;
        aVar = o1Var.f51491j;
        context = o1Var.f51488g;
        aVar.c(context, this);
        this.f51473y = false;
        this.f51472x = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f51471w.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f51471w.isEmpty();
    }

    public final boolean j() {
        return this.f51473y;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.C.f51487f;
        synchronized (hashMap) {
            handler = this.C.f51489h;
            handler.removeMessages(1, this.A);
            this.f51474z = iBinder;
            this.B = componentName;
            for (ServiceConnection serviceConnection : this.f51471w.values()) {
                serviceConnection.onServiceConnected(componentName, iBinder);
            }
            this.f51472x = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.C.f51487f;
        synchronized (hashMap) {
            handler = this.C.f51489h;
            handler.removeMessages(1, this.A);
            this.f51474z = null;
            this.B = componentName;
            for (ServiceConnection serviceConnection : this.f51471w.values()) {
                serviceConnection.onServiceDisconnected(componentName);
            }
            this.f51472x = 2;
        }
    }
}
