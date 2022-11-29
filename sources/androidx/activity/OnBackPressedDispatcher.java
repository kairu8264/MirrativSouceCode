package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.o;
import androidx.lifecycle.r;
import androidx.lifecycle.u;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a  reason: collision with root package name */
    public final Runnable f14055a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<e> f14056b = new ArrayDeque<>();

    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements r, androidx.activity.a {

        /* renamed from: w  reason: collision with root package name */
        public final o f14057w;

        /* renamed from: x  reason: collision with root package name */
        public final e f14058x;

        /* renamed from: y  reason: collision with root package name */
        public androidx.activity.a f14059y;

        public LifecycleOnBackPressedCancellable(o oVar, e eVar) {
            this.f14057w = oVar;
            this.f14058x = eVar;
            oVar.a(this);
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f14057w.c(this);
            this.f14058x.e(this);
            androidx.activity.a aVar = this.f14059y;
            if (aVar != null) {
                aVar.cancel();
                this.f14059y = null;
            }
        }

        @Override // androidx.lifecycle.r
        public void i(u uVar, o.b bVar) {
            if (bVar == o.b.ON_START) {
                this.f14059y = OnBackPressedDispatcher.this.b(this.f14058x);
            } else if (bVar == o.b.ON_STOP) {
                androidx.activity.a aVar = this.f14059y;
                if (aVar != null) {
                    aVar.cancel();
                }
            } else if (bVar == o.b.ON_DESTROY) {
                cancel();
            }
        }
    }

    /* loaded from: classes.dex */
    public class a implements androidx.activity.a {

        /* renamed from: w  reason: collision with root package name */
        public final e f14061w;

        public a(e eVar) {
            this.f14061w = eVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f14056b.remove(this.f14061w);
            this.f14061w.e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f14055a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    public void a(u uVar, e eVar) {
        o g10 = uVar.g();
        if (g10.b() == o.c.DESTROYED) {
            return;
        }
        eVar.a(new LifecycleOnBackPressedCancellable(g10, eVar));
    }

    public androidx.activity.a b(e eVar) {
        this.f14056b.add(eVar);
        a aVar = new a(eVar);
        eVar.a(aVar);
        return aVar;
    }

    public void c() {
        Iterator<e> descendingIterator = this.f14056b.descendingIterator();
        while (descendingIterator.hasNext()) {
            e next = descendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.f14055a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
