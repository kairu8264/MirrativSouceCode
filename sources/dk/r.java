package dk;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.play.core.internal.zzat;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class r<T extends IInterface> {

    /* renamed from: o */
    public static final Map<String, Handler> f29702o = new HashMap();

    /* renamed from: a */
    public final Context f29703a;

    /* renamed from: b */
    public final f f29704b;

    /* renamed from: c */
    public final String f29705c;

    /* renamed from: g */
    public boolean f29709g;

    /* renamed from: h */
    public final Intent f29710h;

    /* renamed from: i */
    public final m<T> f29711i;

    /* renamed from: m */
    public ServiceConnection f29715m;

    /* renamed from: n */
    public T f29716n;

    /* renamed from: d */
    public final List<g> f29706d = new ArrayList();

    /* renamed from: e */
    public final Set<jk.o<?>> f29707e = new HashSet();

    /* renamed from: f */
    public final Object f29708f = new Object();

    /* renamed from: k */
    public final IBinder.DeathRecipient f29713k = new IBinder.DeathRecipient() { // from class: dk.h
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            r.i(r.this);
        }
    };

    /* renamed from: l */
    public final AtomicInteger f29714l = new AtomicInteger(0);

    /* renamed from: j */
    public final WeakReference<l> f29712j = new WeakReference<>(null);

    public r(Context context, f fVar, String str, Intent intent, m<T> mVar, l lVar) {
        this.f29703a = context;
        this.f29704b = fVar;
        this.f29705c = str;
        this.f29710h = intent;
        this.f29711i = mVar;
    }

    public static /* synthetic */ void i(r rVar) {
        rVar.f29704b.d("reportBinderDeath", new Object[0]);
        l lVar = rVar.f29712j.get();
        if (lVar != null) {
            rVar.f29704b.d("calling onBinderDied", new Object[0]);
            lVar.zza();
        } else {
            rVar.f29704b.d("%s : Binder has died.", rVar.f29705c);
            for (g gVar : rVar.f29706d) {
                gVar.c(rVar.t());
            }
            rVar.f29706d.clear();
        }
        rVar.u();
    }

    public static /* bridge */ /* synthetic */ void n(r rVar, g gVar) {
        if (rVar.f29716n != null || rVar.f29709g) {
            if (rVar.f29709g) {
                rVar.f29704b.d("Waiting to bind to the service.", new Object[0]);
                rVar.f29706d.add(gVar);
                return;
            }
            gVar.run();
            return;
        }
        rVar.f29704b.d("Initiate binding to the service.", new Object[0]);
        rVar.f29706d.add(gVar);
        q qVar = new q(rVar, null);
        rVar.f29715m = qVar;
        rVar.f29709g = true;
        if (rVar.f29703a.bindService(rVar.f29710h, qVar, 1)) {
            return;
        }
        rVar.f29704b.d("Failed to bind to the service.", new Object[0]);
        rVar.f29709g = false;
        for (g gVar2 : rVar.f29706d) {
            gVar2.c(new zzat());
        }
        rVar.f29706d.clear();
    }

    public static /* bridge */ /* synthetic */ void o(r rVar) {
        rVar.f29704b.d("linkToDeath", new Object[0]);
        try {
            rVar.f29716n.asBinder().linkToDeath(rVar.f29713k, 0);
        } catch (RemoteException e10) {
            rVar.f29704b.c(e10, "linkToDeath failed", new Object[0]);
        }
    }

    public static /* bridge */ /* synthetic */ void p(r rVar) {
        rVar.f29704b.d("unlinkToDeath", new Object[0]);
        rVar.f29716n.asBinder().unlinkToDeath(rVar.f29713k, 0);
    }

    public final Handler c() {
        Handler handler;
        Map<String, Handler> map = f29702o;
        synchronized (map) {
            if (!map.containsKey(this.f29705c)) {
                HandlerThread handlerThread = new HandlerThread(this.f29705c, 10);
                handlerThread.start();
                map.put(this.f29705c, new Handler(handlerThread.getLooper()));
            }
            handler = map.get(this.f29705c);
        }
        return handler;
    }

    public final T e() {
        return this.f29716n;
    }

    public final void q(g gVar, final jk.o<?> oVar) {
        synchronized (this.f29708f) {
            this.f29707e.add(oVar);
            oVar.a().a(new jk.a() { // from class: dk.i
                @Override // jk.a
                public final void onComplete(jk.d dVar) {
                    r.this.r(oVar, dVar);
                }
            });
        }
        synchronized (this.f29708f) {
            if (this.f29714l.getAndIncrement() > 0) {
                this.f29704b.a("Already connected to the service.", new Object[0]);
            }
        }
        c().post(new j(this, gVar.b(), gVar));
    }

    public final /* synthetic */ void r(jk.o oVar, jk.d dVar) {
        synchronized (this.f29708f) {
            this.f29707e.remove(oVar);
        }
    }

    public final void s(jk.o<?> oVar) {
        synchronized (this.f29708f) {
            this.f29707e.remove(oVar);
        }
        synchronized (this.f29708f) {
            if (this.f29714l.decrementAndGet() > 0) {
                this.f29704b.d("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            c().post(new k(this));
        }
    }

    public final RemoteException t() {
        return Build.VERSION.SDK_INT < 15 ? new RemoteException() : new RemoteException(String.valueOf(this.f29705c).concat(" : Binder has died."));
    }

    public final void u() {
        synchronized (this.f29708f) {
            for (jk.o<?> oVar : this.f29707e) {
                oVar.d(t());
            }
            this.f29707e.clear();
        }
    }
}
