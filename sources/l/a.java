package l;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: c  reason: collision with root package name */
    public static volatile a f38946c;

    /* renamed from: d  reason: collision with root package name */
    public static final Executor f38947d = new ExecutorC0553a();

    /* renamed from: e  reason: collision with root package name */
    public static final Executor f38948e = new b();

    /* renamed from: a  reason: collision with root package name */
    public c f38949a;

    /* renamed from: b  reason: collision with root package name */
    public c f38950b;

    /* renamed from: l.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class ExecutorC0553a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.e().c(runnable);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.e().a(runnable);
        }
    }

    public a() {
        l.b bVar = new l.b();
        this.f38950b = bVar;
        this.f38949a = bVar;
    }

    public static Executor d() {
        return f38948e;
    }

    public static a e() {
        if (f38946c != null) {
            return f38946c;
        }
        synchronized (a.class) {
            if (f38946c == null) {
                f38946c = new a();
            }
        }
        return f38946c;
    }

    @Override // l.c
    public void a(Runnable runnable) {
        this.f38949a.a(runnable);
    }

    @Override // l.c
    public boolean b() {
        return this.f38949a.b();
    }

    @Override // l.c
    public void c(Runnable runnable) {
        this.f38949a.c(runnable);
    }
}
