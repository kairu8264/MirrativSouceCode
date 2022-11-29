package r5;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import k5.j;

/* loaded from: classes.dex */
public abstract class d<T> {

    /* renamed from: f  reason: collision with root package name */
    public static final String f49748f = j.f("ConstraintTracker");

    /* renamed from: a  reason: collision with root package name */
    public final w5.a f49749a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f49750b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f49751c = new Object();

    /* renamed from: d  reason: collision with root package name */
    public final Set<p5.a<T>> f49752d = new LinkedHashSet();

    /* renamed from: e  reason: collision with root package name */
    public T f49753e;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ List f49754w;

        public a(List list) {
            this.f49754w = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (p5.a aVar : this.f49754w) {
                aVar.a(d.this.f49753e);
            }
        }
    }

    public d(Context context, w5.a aVar) {
        this.f49750b = context.getApplicationContext();
        this.f49749a = aVar;
    }

    public void a(p5.a<T> aVar) {
        synchronized (this.f49751c) {
            if (this.f49752d.add(aVar)) {
                if (this.f49752d.size() == 1) {
                    this.f49753e = b();
                    j.c().a(f49748f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f49753e), new Throwable[0]);
                    e();
                }
                aVar.a(this.f49753e);
            }
        }
    }

    public abstract T b();

    public void c(p5.a<T> aVar) {
        synchronized (this.f49751c) {
            if (this.f49752d.remove(aVar) && this.f49752d.isEmpty()) {
                f();
            }
        }
    }

    public void d(T t10) {
        synchronized (this.f49751c) {
            T t11 = this.f49753e;
            if (t11 != t10 && (t11 == null || !t11.equals(t10))) {
                this.f49753e = t10;
                this.f49749a.a().execute(new a(new ArrayList(this.f49752d)));
            }
        }
    }

    public abstract void e();

    public abstract void f();
}
