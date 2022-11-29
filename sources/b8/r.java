package b8;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    public final Set<e8.d> f17090a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    public final List<e8.d> f17091b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public boolean f17092c;

    public boolean a(e8.d dVar) {
        boolean z10 = true;
        if (dVar == null) {
            return true;
        }
        boolean remove = this.f17090a.remove(dVar);
        if (!this.f17091b.remove(dVar) && !remove) {
            z10 = false;
        }
        if (z10) {
            dVar.clear();
        }
        return z10;
    }

    public void b() {
        for (e8.d dVar : i8.k.j(this.f17090a)) {
            a(dVar);
        }
        this.f17091b.clear();
    }

    public boolean c() {
        return this.f17092c;
    }

    public void d() {
        this.f17092c = true;
        for (e8.d dVar : i8.k.j(this.f17090a)) {
            if (dVar.isRunning() || dVar.g()) {
                dVar.clear();
                this.f17091b.add(dVar);
            }
        }
    }

    public void e() {
        this.f17092c = true;
        for (e8.d dVar : i8.k.j(this.f17090a)) {
            if (dVar.isRunning()) {
                dVar.pause();
                this.f17091b.add(dVar);
            }
        }
    }

    public void f() {
        for (e8.d dVar : i8.k.j(this.f17090a)) {
            if (!dVar.g() && !dVar.e()) {
                dVar.clear();
                if (!this.f17092c) {
                    dVar.i();
                } else {
                    this.f17091b.add(dVar);
                }
            }
        }
    }

    public void g() {
        this.f17092c = false;
        for (e8.d dVar : i8.k.j(this.f17090a)) {
            if (!dVar.g() && !dVar.isRunning()) {
                dVar.i();
            }
        }
        this.f17091b.clear();
    }

    public void h(e8.d dVar) {
        this.f17090a.add(dVar);
        if (!this.f17092c) {
            dVar.i();
            return;
        }
        dVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f17091b.add(dVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f17090a.size() + ", isPaused=" + this.f17092c + "}";
    }
}
