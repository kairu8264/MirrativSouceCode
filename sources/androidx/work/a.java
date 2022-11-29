package androidx.work;

import android.os.Build;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import k5.g;
import k5.i;
import k5.q;
import k5.v;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Executor f16531a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f16532b;

    /* renamed from: c  reason: collision with root package name */
    public final v f16533c;

    /* renamed from: d  reason: collision with root package name */
    public final i f16534d;

    /* renamed from: e  reason: collision with root package name */
    public final q f16535e;

    /* renamed from: f  reason: collision with root package name */
    public final g f16536f;

    /* renamed from: g  reason: collision with root package name */
    public final String f16537g;

    /* renamed from: h  reason: collision with root package name */
    public final int f16538h;

    /* renamed from: i  reason: collision with root package name */
    public final int f16539i;

    /* renamed from: j  reason: collision with root package name */
    public final int f16540j;

    /* renamed from: k  reason: collision with root package name */
    public final int f16541k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f16542l;

    /* renamed from: androidx.work.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class ThreadFactoryC0084a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f16543a = new AtomicInteger(0);

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ boolean f16544b;

        public ThreadFactoryC0084a(boolean z10) {
            this.f16544b = z10;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            String str = this.f16544b ? "WM.task-" : "androidx.work-";
            return new Thread(runnable, str + this.f16543a.incrementAndGet());
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public Executor f16546a;

        /* renamed from: b  reason: collision with root package name */
        public v f16547b;

        /* renamed from: c  reason: collision with root package name */
        public i f16548c;

        /* renamed from: d  reason: collision with root package name */
        public Executor f16549d;

        /* renamed from: e  reason: collision with root package name */
        public q f16550e;

        /* renamed from: f  reason: collision with root package name */
        public g f16551f;

        /* renamed from: g  reason: collision with root package name */
        public String f16552g;

        /* renamed from: h  reason: collision with root package name */
        public int f16553h = 4;

        /* renamed from: i  reason: collision with root package name */
        public int f16554i = 0;

        /* renamed from: j  reason: collision with root package name */
        public int f16555j = Integer.MAX_VALUE;

        /* renamed from: k  reason: collision with root package name */
        public int f16556k = 20;

        public a a() {
            return new a(this);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        a a();
    }

    public a(b bVar) {
        Executor executor = bVar.f16546a;
        if (executor == null) {
            this.f16531a = a(false);
        } else {
            this.f16531a = executor;
        }
        Executor executor2 = bVar.f16549d;
        if (executor2 == null) {
            this.f16542l = true;
            this.f16532b = a(true);
        } else {
            this.f16542l = false;
            this.f16532b = executor2;
        }
        v vVar = bVar.f16547b;
        if (vVar == null) {
            this.f16533c = v.c();
        } else {
            this.f16533c = vVar;
        }
        i iVar = bVar.f16548c;
        if (iVar == null) {
            this.f16534d = i.c();
        } else {
            this.f16534d = iVar;
        }
        q qVar = bVar.f16550e;
        if (qVar == null) {
            this.f16535e = new l5.a();
        } else {
            this.f16535e = qVar;
        }
        this.f16538h = bVar.f16553h;
        this.f16539i = bVar.f16554i;
        this.f16540j = bVar.f16555j;
        this.f16541k = bVar.f16556k;
        this.f16536f = bVar.f16551f;
        this.f16537g = bVar.f16552g;
    }

    public final Executor a(boolean z10) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), b(z10));
    }

    public final ThreadFactory b(boolean z10) {
        return new ThreadFactoryC0084a(z10);
    }

    public String c() {
        return this.f16537g;
    }

    public g d() {
        return this.f16536f;
    }

    public Executor e() {
        return this.f16531a;
    }

    public i f() {
        return this.f16534d;
    }

    public int g() {
        return this.f16540j;
    }

    public int h() {
        if (Build.VERSION.SDK_INT == 23) {
            return this.f16541k / 2;
        }
        return this.f16541k;
    }

    public int i() {
        return this.f16539i;
    }

    public int j() {
        return this.f16538h;
    }

    public q k() {
        return this.f16535e;
    }

    public Executor l() {
        return this.f16532b;
    }

    public v m() {
        return this.f16533c;
    }
}
