package kn;

import android.app.Activity;
import in.m;
import in.n;
import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import kn.a;

/* loaded from: classes4.dex */
public class g<T extends m> {

    /* renamed from: a  reason: collision with root package name */
    public final b f38897a;

    /* renamed from: b  reason: collision with root package name */
    public final i f38898b;

    /* renamed from: c  reason: collision with root package name */
    public final n<T> f38899c;

    /* renamed from: d  reason: collision with root package name */
    public final ExecutorService f38900d;

    /* renamed from: e  reason: collision with root package name */
    public final h f38901e;

    /* loaded from: classes4.dex */
    public class a extends a.b {
        public a() {
        }

        @Override // kn.a.b
        public void f(Activity activity) {
            g.this.b();
        }
    }

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public boolean f38903a;

        /* renamed from: b  reason: collision with root package name */
        public long f38904b;

        /* renamed from: c  reason: collision with root package name */
        public final Calendar f38905c = Calendar.getInstance(TimeZone.getTimeZone("UTC"));

        public synchronized boolean a(long j10) {
            long j11 = this.f38904b;
            boolean z10 = j10 - j11 > 21600000;
            boolean z11 = !c(j10, j11);
            if (this.f38903a || !(z10 || z11)) {
                return false;
            }
            this.f38903a = true;
            return true;
        }

        public synchronized void b(long j10) {
            this.f38903a = false;
            this.f38904b = j10;
        }

        public final boolean c(long j10, long j11) {
            this.f38905c.setTimeInMillis(j10);
            int i10 = this.f38905c.get(6);
            int i11 = this.f38905c.get(1);
            this.f38905c.setTimeInMillis(j11);
            return i10 == this.f38905c.get(6) && i11 == this.f38905c.get(1);
        }
    }

    public g(n<T> nVar, ExecutorService executorService, h<T> hVar) {
        this(nVar, new i(), executorService, new b(), hVar);
    }

    public void a(kn.a aVar) {
        aVar.a(new a());
    }

    public void b() {
        if (this.f38899c.c() != null && this.f38897a.a(this.f38898b.a())) {
            this.f38900d.submit(new Runnable() { // from class: kn.f
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.c();
                }
            });
        }
    }

    public void c() {
        for (T t10 : this.f38899c.b().values()) {
            this.f38901e.a(t10);
        }
        this.f38897a.b(this.f38898b.a());
    }

    public g(n<T> nVar, i iVar, ExecutorService executorService, b bVar, h hVar) {
        this.f38898b = iVar;
        this.f38899c = nVar;
        this.f38900d = executorService;
        this.f38897a = bVar;
        this.f38901e = hVar;
    }
}
