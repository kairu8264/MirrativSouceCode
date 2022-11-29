package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public boolean f14066a;

    /* renamed from: b  reason: collision with root package name */
    public CopyOnWriteArrayList<a> f14067b = new CopyOnWriteArrayList<>();

    public e(boolean z10) {
        this.f14066a = z10;
    }

    public void a(a aVar) {
        this.f14067b.add(aVar);
    }

    public abstract void b();

    public final boolean c() {
        return this.f14066a;
    }

    public final void d() {
        Iterator<a> it = this.f14067b.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
    }

    public void e(a aVar) {
        this.f14067b.remove(aVar);
    }

    public final void f(boolean z10) {
        this.f14066a = z10;
    }
}
