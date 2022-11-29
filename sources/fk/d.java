package fk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import dk.f;
import dk.t;
import dk.w;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class d<StateT> {

    /* renamed from: a  reason: collision with root package name */
    public final f f31995a;

    /* renamed from: b  reason: collision with root package name */
    public final IntentFilter f31996b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f31997c;

    /* renamed from: d  reason: collision with root package name */
    public final Set<a<StateT>> f31998d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    public c f31999e = null;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f32000f = false;

    public d(f fVar, IntentFilter intentFilter, Context context) {
        this.f31995a = fVar;
        this.f31996b = intentFilter;
        this.f31997c = t.a(context);
    }

    public abstract void a(Context context, Intent intent);

    public final void b() {
        c cVar;
        if ((this.f32000f || !this.f31998d.isEmpty()) && this.f31999e == null) {
            c cVar2 = new c(this, null);
            this.f31999e = cVar2;
            this.f31997c.registerReceiver(cVar2, this.f31996b);
        }
        if (this.f32000f || !this.f31998d.isEmpty() || (cVar = this.f31999e) == null) {
            return;
        }
        this.f31997c.unregisterReceiver(cVar);
        this.f31999e = null;
    }

    public final synchronized void c(a<StateT> aVar) {
        this.f31995a.d("registerListener", new Object[0]);
        w.a(aVar, "Registered Play Core listener should not be null.");
        this.f31998d.add(aVar);
        b();
    }

    public final synchronized void d(boolean z10) {
        this.f32000f = z10;
        b();
    }

    public final synchronized void e(a<StateT> aVar) {
        this.f31995a.d("unregisterListener", new Object[0]);
        w.a(aVar, "Unregistered Play Core listener should not be null.");
        this.f31998d.remove(aVar);
        b();
    }

    public final synchronized void f(StateT statet) {
        Iterator it = new HashSet(this.f31998d).iterator();
        while (it.hasNext()) {
            ((a) it.next()).onStateUpdate(statet);
        }
    }

    public final synchronized boolean g() {
        return this.f31999e != null;
    }
}
