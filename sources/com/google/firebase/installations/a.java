package com.google.firebase.installations;

import android.text.TextUtils;
import bm.d;
import bm.f;
import com.google.firebase.installations.FirebaseInstallationsException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import pk.c;
import rh.p;
import um.i;
import vi.g;
import vi.h;
import yl.f;
import yl.j;
import yl.k;
import yl.l;
import yl.m;

/* loaded from: classes4.dex */
public class a implements f {

    /* renamed from: m  reason: collision with root package name */
    public static final Object f27959m = new Object();

    /* renamed from: n  reason: collision with root package name */
    public static final ThreadFactory f27960n = new ThreadFactoryC0252a();

    /* renamed from: a  reason: collision with root package name */
    public final c f27961a;

    /* renamed from: b  reason: collision with root package name */
    public final bm.c f27962b;

    /* renamed from: c  reason: collision with root package name */
    public final am.c f27963c;

    /* renamed from: d  reason: collision with root package name */
    public final m f27964d;

    /* renamed from: e  reason: collision with root package name */
    public final am.b f27965e;

    /* renamed from: f  reason: collision with root package name */
    public final k f27966f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f27967g;

    /* renamed from: h  reason: collision with root package name */
    public final ExecutorService f27968h;

    /* renamed from: i  reason: collision with root package name */
    public final ExecutorService f27969i;

    /* renamed from: j  reason: collision with root package name */
    public String f27970j;

    /* renamed from: k  reason: collision with root package name */
    public Set<zl.a> f27971k;

    /* renamed from: l  reason: collision with root package name */
    public final List<l> f27972l;

    /* renamed from: com.google.firebase.installations.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public class ThreadFactoryC0252a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public final AtomicInteger f27973a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.f27973a.getAndIncrement())));
        }
    }

    /* loaded from: classes4.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27974a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f27975b;

        static {
            int[] iArr = new int[f.b.values().length];
            f27975b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27975b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27975b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f27974a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27974a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public a(c cVar, xl.b<i> bVar, xl.b<vl.f> bVar2) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f27960n), cVar, new bm.c(cVar.h(), bVar, bVar2), new am.c(cVar), m.c(), new am.b(cVar), new k());
    }

    public static a n() {
        return o(c.i());
    }

    public static a o(c cVar) {
        p.b(cVar != null, "Null is not a valid value of FirebaseApp.");
        return (a) cVar.g(yl.f.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u() {
        v(false);
    }

    public final void A(am.d dVar) {
        synchronized (this.f27967g) {
            Iterator<l> it = this.f27972l.iterator();
            while (it.hasNext()) {
                if (it.next().a(dVar)) {
                    it.remove();
                }
            }
        }
    }

    public final synchronized void B(String str) {
        this.f27970j = str;
    }

    public final synchronized void C(am.d dVar, am.d dVar2) {
        if (this.f27971k.size() != 0 && !dVar.d().equals(dVar2.d())) {
            for (zl.a aVar : this.f27971k) {
                aVar.a(dVar2.d());
            }
        }
    }

    @Override // yl.f
    public g<j> a(final boolean z10) {
        w();
        g<j> e10 = e();
        this.f27968h.execute(new Runnable() { // from class: yl.e
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.a.this.v(z10);
            }
        });
        return e10;
    }

    public final g<j> e() {
        h hVar = new h();
        g(new yl.h(this.f27964d, hVar));
        return hVar.a();
    }

    public final g<String> f() {
        h hVar = new h();
        g(new yl.i(hVar));
        return hVar.a();
    }

    public final void g(l lVar) {
        synchronized (this.f27967g) {
            this.f27972l.add(lVar);
        }
    }

    @Override // yl.f
    public g<String> getId() {
        w();
        String m10 = m();
        if (m10 != null) {
            return vi.j.e(m10);
        }
        g<String> f10 = f();
        this.f27968h.execute(new Runnable() { // from class: yl.c
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.a.this.u();
            }
        });
        return f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t(boolean r3) {
        /*
            r2 = this;
            am.d r0 = r2.p()
            boolean r1 = r0.i()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            if (r1 != 0) goto L22
            boolean r1 = r0.l()     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            if (r1 == 0) goto L11
            goto L22
        L11:
            if (r3 != 0) goto L1d
            yl.m r3 = r2.f27964d     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            boolean r3 = r3.f(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            return
        L1d:
            am.d r3 = r2.j(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
            goto L26
        L22:
            am.d r3 = r2.y(r0)     // Catch: com.google.firebase.installations.FirebaseInstallationsException -> L5f
        L26:
            r2.s(r3)
            r2.C(r0, r3)
            boolean r0 = r3.k()
            if (r0 == 0) goto L39
            java.lang.String r0 = r3.d()
            r2.B(r0)
        L39:
            boolean r0 = r3.i()
            if (r0 == 0) goto L4a
            com.google.firebase.installations.FirebaseInstallationsException r3 = new com.google.firebase.installations.FirebaseInstallationsException
            com.google.firebase.installations.FirebaseInstallationsException$a r0 = com.google.firebase.installations.FirebaseInstallationsException.a.BAD_CONFIG
            r3.<init>(r0)
            r2.z(r3)
            goto L5e
        L4a:
            boolean r0 = r3.j()
            if (r0 == 0) goto L5b
            java.io.IOException r3 = new java.io.IOException
            java.lang.String r0 = "Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."
            r3.<init>(r0)
            r2.z(r3)
            goto L5e
        L5b:
            r2.A(r3)
        L5e:
            return
        L5f:
            r3 = move-exception
            r2.z(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.a.t(boolean):void");
    }

    /* renamed from: i */
    public final void v(final boolean z10) {
        am.d q10 = q();
        if (z10) {
            q10 = q10.p();
        }
        A(q10);
        this.f27969i.execute(new Runnable() { // from class: yl.d
            @Override // java.lang.Runnable
            public final void run() {
                com.google.firebase.installations.a.this.t(z10);
            }
        });
    }

    public final am.d j(am.d dVar) throws FirebaseInstallationsException {
        bm.f e10 = this.f27962b.e(k(), dVar.d(), r(), dVar.f());
        int i10 = b.f27975b[e10.b().ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    B(null);
                    return dVar.r();
                }
                throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
            }
            return dVar.q("BAD CONFIG");
        }
        return dVar.o(e10.c(), e10.d(), this.f27964d.b());
    }

    public String k() {
        return this.f27961a.k().b();
    }

    public String l() {
        return this.f27961a.k().c();
    }

    public final synchronized String m() {
        return this.f27970j;
    }

    public final am.d p() {
        am.d c10;
        synchronized (f27959m) {
            yl.b a10 = yl.b.a(this.f27961a.h(), "generatefid.lock");
            c10 = this.f27963c.c();
            if (a10 != null) {
                a10.b();
            }
        }
        return c10;
    }

    public final am.d q() {
        am.d c10;
        synchronized (f27959m) {
            yl.b a10 = yl.b.a(this.f27961a.h(), "generatefid.lock");
            c10 = this.f27963c.c();
            if (c10.j()) {
                c10 = this.f27963c.a(c10.t(x(c10)));
            }
            if (a10 != null) {
                a10.b();
            }
        }
        return c10;
    }

    public String r() {
        return this.f27961a.k().e();
    }

    public final void s(am.d dVar) {
        synchronized (f27959m) {
            yl.b a10 = yl.b.a(this.f27961a.h(), "generatefid.lock");
            this.f27963c.a(dVar);
            if (a10 != null) {
                a10.b();
            }
        }
    }

    public final void w() {
        p.f(l(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        p.f(r(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        p.f(k(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        p.b(m.h(l()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        p.b(m.g(k()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    public final String x(am.d dVar) {
        if ((!this.f27961a.j().equals("CHIME_ANDROID_SDK") && !this.f27961a.r()) || !dVar.m()) {
            return this.f27966f.a();
        }
        String f10 = this.f27965e.f();
        return TextUtils.isEmpty(f10) ? this.f27966f.a() : f10;
    }

    public final am.d y(am.d dVar) throws FirebaseInstallationsException {
        d d10 = this.f27962b.d(k(), dVar.d(), r(), l(), (dVar.d() == null || dVar.d().length() != 11) ? null : this.f27965e.i());
        int i10 = b.f27974a[d10.e().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return dVar.q("BAD CONFIG");
            }
            throw new FirebaseInstallationsException("Firebase Installations Service is unavailable. Please try again later.", FirebaseInstallationsException.a.UNAVAILABLE);
        }
        return dVar.s(d10.c(), d10.d(), this.f27964d.b(), d10.b().c(), d10.b().d());
    }

    public final void z(Exception exc) {
        synchronized (this.f27967g) {
            Iterator<l> it = this.f27972l.iterator();
            while (it.hasNext()) {
                if (it.next().b(exc)) {
                    it.remove();
                }
            }
        }
    }

    public a(ExecutorService executorService, c cVar, bm.c cVar2, am.c cVar3, m mVar, am.b bVar, k kVar) {
        this.f27967g = new Object();
        this.f27971k = new HashSet();
        this.f27972l = new ArrayList();
        this.f27961a = cVar;
        this.f27962b = cVar2;
        this.f27963c = cVar3;
        this.f27964d = mVar;
        this.f27965e = bVar;
        this.f27966f = kVar;
        this.f27968h = executorService;
        this.f27969i = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f27960n);
    }
}
