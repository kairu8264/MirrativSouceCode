package m5;

import java.util.HashMap;
import java.util.Map;
import k5.j;
import k5.q;
import t5.p;

/* loaded from: classes.dex */
public class a {

    /* renamed from: d  reason: collision with root package name */
    public static final String f40600d = j.f("DelayedWorkTracker");

    /* renamed from: a  reason: collision with root package name */
    public final b f40601a;

    /* renamed from: b  reason: collision with root package name */
    public final q f40602b;

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, Runnable> f40603c = new HashMap();

    /* renamed from: m5.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0592a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ p f40604w;

        public RunnableC0592a(p pVar) {
            this.f40604w = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.c().a(a.f40600d, String.format("Scheduling work %s", this.f40604w.f53192a), new Throwable[0]);
            a.this.f40601a.e(this.f40604w);
        }
    }

    public a(b bVar, q qVar) {
        this.f40601a = bVar;
        this.f40602b = qVar;
    }

    public void a(p pVar) {
        Runnable remove = this.f40603c.remove(pVar.f53192a);
        if (remove != null) {
            this.f40602b.a(remove);
        }
        RunnableC0592a runnableC0592a = new RunnableC0592a(pVar);
        this.f40603c.put(pVar.f53192a, runnableC0592a);
        long currentTimeMillis = System.currentTimeMillis();
        this.f40602b.b(pVar.a() - currentTimeMillis, runnableC0592a);
    }

    public void b(String str) {
        Runnable remove = this.f40603c.remove(str);
        if (remove != null) {
            this.f40602b.a(remove);
        }
    }
}
