package v4;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: e  reason: collision with root package name */
    public final long f56572e;

    /* renamed from: f  reason: collision with root package name */
    public final Executor f56573f;

    /* renamed from: i  reason: collision with root package name */
    public z4.g f56576i;

    /* renamed from: a  reason: collision with root package name */
    public z4.h f56568a = null;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f56569b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public Runnable f56570c = null;

    /* renamed from: d  reason: collision with root package name */
    public final Object f56571d = new Object();

    /* renamed from: g  reason: collision with root package name */
    public int f56574g = 0;

    /* renamed from: h  reason: collision with root package name */
    public long f56575h = SystemClock.uptimeMillis();

    /* renamed from: j  reason: collision with root package name */
    public boolean f56577j = false;

    /* renamed from: k  reason: collision with root package name */
    public final Runnable f56578k = new RunnableC0903a();

    /* renamed from: l  reason: collision with root package name */
    public final Runnable f56579l = new b();

    /* renamed from: v4.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0903a implements Runnable {
        public RunnableC0903a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            aVar.f56573f.execute(aVar.f56579l);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (a.this.f56571d) {
                long uptimeMillis = SystemClock.uptimeMillis();
                a aVar = a.this;
                if (uptimeMillis - aVar.f56575h < aVar.f56572e) {
                    return;
                }
                if (aVar.f56574g != 0) {
                    return;
                }
                Runnable runnable = aVar.f56570c;
                if (runnable != null) {
                    runnable.run();
                    z4.g gVar = a.this.f56576i;
                    if (gVar != null && gVar.isOpen()) {
                        try {
                            a.this.f56576i.close();
                        } catch (IOException e10) {
                            x4.e.a(e10);
                        }
                        a.this.f56576i = null;
                    }
                    return;
                }
                throw new IllegalStateException("mOnAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
            }
        }
    }

    public a(long j10, TimeUnit timeUnit, Executor executor) {
        this.f56572e = timeUnit.toMillis(j10);
        this.f56573f = executor;
    }

    public void a() throws IOException {
        synchronized (this.f56571d) {
            this.f56577j = true;
            z4.g gVar = this.f56576i;
            if (gVar != null) {
                gVar.close();
            }
            this.f56576i = null;
        }
    }

    public void b() {
        synchronized (this.f56571d) {
            int i10 = this.f56574g;
            if (i10 > 0) {
                int i11 = i10 - 1;
                this.f56574g = i11;
                if (i11 == 0) {
                    if (this.f56576i == null) {
                        return;
                    }
                    this.f56569b.postDelayed(this.f56578k, this.f56572e);
                }
                return;
            }
            throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
        }
    }

    public <V> V c(n.a<z4.g, V> aVar) {
        try {
            return aVar.apply(e());
        } finally {
            b();
        }
    }

    public z4.g d() {
        z4.g gVar;
        synchronized (this.f56571d) {
            gVar = this.f56576i;
        }
        return gVar;
    }

    public z4.g e() {
        synchronized (this.f56571d) {
            this.f56569b.removeCallbacks(this.f56578k);
            this.f56574g++;
            if (!this.f56577j) {
                z4.g gVar = this.f56576i;
                if (gVar != null && gVar.isOpen()) {
                    return this.f56576i;
                }
                z4.h hVar = this.f56568a;
                if (hVar != null) {
                    z4.g writableDatabase = hVar.getWritableDatabase();
                    this.f56576i = writableDatabase;
                    return writableDatabase;
                }
                throw new IllegalStateException("AutoCloser has not been initialized. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
            }
            throw new IllegalStateException("Attempting to open already closed database.");
        }
    }

    public void f(z4.h hVar) {
        if (this.f56568a != null) {
            Log.e("ROOM", "AutoCloser initialized multiple times. Please file a bug against room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
        } else {
            this.f56568a = hVar;
        }
    }

    public boolean g() {
        return !this.f56577j;
    }

    public void h(Runnable runnable) {
        this.f56570c = runnable;
    }
}
