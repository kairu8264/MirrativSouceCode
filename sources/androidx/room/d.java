package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.a;
import androidx.room.b;
import androidx.room.c;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f16392a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16393b;

    /* renamed from: c  reason: collision with root package name */
    public int f16394c;

    /* renamed from: d  reason: collision with root package name */
    public final androidx.room.c f16395d;

    /* renamed from: e  reason: collision with root package name */
    public final c.AbstractC0080c f16396e;

    /* renamed from: f  reason: collision with root package name */
    public androidx.room.b f16397f;

    /* renamed from: g  reason: collision with root package name */
    public final Executor f16398g;

    /* renamed from: h  reason: collision with root package name */
    public final androidx.room.a f16399h = new a();

    /* renamed from: i  reason: collision with root package name */
    public final AtomicBoolean f16400i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    public final ServiceConnection f16401j;

    /* renamed from: k  reason: collision with root package name */
    public final Runnable f16402k;

    /* renamed from: l  reason: collision with root package name */
    public final Runnable f16403l;

    /* loaded from: classes.dex */
    public class a extends a.AbstractBinderC0077a {

        /* renamed from: androidx.room.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0081a implements Runnable {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ String[] f16405w;

            public RunnableC0081a(String[] strArr) {
                this.f16405w = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f16395d.f(this.f16405w);
            }
        }

        public a() {
        }

        @Override // androidx.room.a
        public void c1(String[] strArr) {
            d.this.f16398g.execute(new RunnableC0081a(strArr));
        }
    }

    /* loaded from: classes.dex */
    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            d.this.f16397f = b.a.i0(iBinder);
            d dVar = d.this;
            dVar.f16398g.execute(dVar.f16402k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            d dVar = d.this;
            dVar.f16398g.execute(dVar.f16403l);
            d.this.f16397f = null;
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                d dVar = d.this;
                androidx.room.b bVar = dVar.f16397f;
                if (bVar != null) {
                    dVar.f16394c = bVar.Z3(dVar.f16399h, dVar.f16393b);
                    d dVar2 = d.this;
                    dVar2.f16395d.a(dVar2.f16396e);
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e10);
            }
        }
    }

    /* renamed from: androidx.room.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0082d implements Runnable {
        public RunnableC0082d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            dVar.f16395d.i(dVar.f16396e);
        }
    }

    /* loaded from: classes.dex */
    public class e extends c.AbstractC0080c {
        public e(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.c.AbstractC0080c
        public boolean a() {
            return true;
        }

        @Override // androidx.room.c.AbstractC0080c
        public void b(Set<String> set) {
            if (d.this.f16400i.get()) {
                return;
            }
            try {
                d dVar = d.this;
                androidx.room.b bVar = dVar.f16397f;
                if (bVar != null) {
                    bVar.X2(dVar.f16394c, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e10) {
                Log.w("ROOM", "Cannot broadcast invalidation", e10);
            }
        }
    }

    public d(Context context, String str, Intent intent, androidx.room.c cVar, Executor executor) {
        b bVar = new b();
        this.f16401j = bVar;
        this.f16402k = new c();
        this.f16403l = new RunnableC0082d();
        Context applicationContext = context.getApplicationContext();
        this.f16392a = applicationContext;
        this.f16393b = str;
        this.f16395d = cVar;
        this.f16398g = executor;
        this.f16396e = new e((String[]) cVar.f16368a.keySet().toArray(new String[0]));
        applicationContext.bindService(intent, bVar, 1);
    }
}
