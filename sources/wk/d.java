package wk;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import tk.a;
import xl.a;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    public final xl.a<tk.a> f59170a;

    /* renamed from: b  reason: collision with root package name */
    public volatile yk.a f59171b;

    /* renamed from: c  reason: collision with root package name */
    public volatile zk.b f59172c;

    /* renamed from: d  reason: collision with root package name */
    public final List<zk.a> f59173d;

    public d(xl.a<tk.a> aVar) {
        this(aVar, new zk.c(), new yk.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(String str, Bundle bundle) {
        this.f59171b.a(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(zk.a aVar) {
        synchronized (this) {
            if (this.f59172c instanceof zk.c) {
                this.f59173d.add(aVar);
            }
            this.f59172c.a(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(xl.b bVar) {
        xk.f.f().b("AnalyticsConnector now available.");
        tk.a aVar = (tk.a) bVar.get();
        yk.e eVar = new yk.e(aVar);
        e eVar2 = new e();
        if (j(aVar, eVar2) != null) {
            xk.f.f().b("Registered Firebase Analytics listener.");
            yk.d dVar = new yk.d();
            yk.c cVar = new yk.c(eVar, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                for (zk.a aVar2 : this.f59173d) {
                    dVar.a(aVar2);
                }
                eVar2.d(dVar);
                eVar2.e(cVar);
                this.f59172c = dVar;
                this.f59171b = cVar;
            }
            return;
        }
        xk.f.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    public static a.InterfaceC0836a j(tk.a aVar, e eVar) {
        a.InterfaceC0836a a10 = aVar.a("clx", eVar);
        if (a10 == null) {
            xk.f.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            a10 = aVar.a("crash", eVar);
            if (a10 != null) {
                xk.f.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return a10;
    }

    public yk.a d() {
        return new yk.a() { // from class: wk.b
            @Override // yk.a
            public final void a(String str, Bundle bundle) {
                d.this.g(str, bundle);
            }
        };
    }

    public zk.b e() {
        return new zk.b() { // from class: wk.c
            @Override // zk.b
            public final void a(zk.a aVar) {
                d.this.h(aVar);
            }
        };
    }

    public final void f() {
        this.f59170a.a(new a.InterfaceC1009a() { // from class: wk.a
            @Override // xl.a.InterfaceC1009a
            public final void a(xl.b bVar) {
                d.this.i(bVar);
            }
        });
    }

    public d(xl.a<tk.a> aVar, zk.b bVar, yk.a aVar2) {
        this.f59170a = aVar;
        this.f59172c = bVar;
        this.f59173d = new ArrayList();
        this.f59171b = aVar2;
        f();
    }
}
