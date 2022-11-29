package in;

import android.annotation.SuppressLint;
import android.content.Context;
import in.e;
import in.x;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public class v {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: i  reason: collision with root package name */
    public static volatile v f36948i;

    /* renamed from: a  reason: collision with root package name */
    public n<x> f36949a;

    /* renamed from: b  reason: collision with root package name */
    public n<e> f36950b;

    /* renamed from: c  reason: collision with root package name */
    public kn.g<x> f36951c;

    /* renamed from: d  reason: collision with root package name */
    public final q f36952d;

    /* renamed from: e  reason: collision with root package name */
    public final ConcurrentHashMap<m, p> f36953e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f36954f;

    /* renamed from: g  reason: collision with root package name */
    public volatile p f36955g;

    /* renamed from: h  reason: collision with root package name */
    public volatile f f36956h;

    public v(q qVar) {
        this(qVar, new ConcurrentHashMap(), null);
    }

    public static v g() {
        if (f36948i == null) {
            synchronized (v.class) {
                if (f36948i == null) {
                    f36948i = new v(o.f().h());
                    o.f().e().execute(u.f36947w);
                }
            }
        }
        return f36948i;
    }

    public static /* synthetic */ void j() {
        f36948i.c();
    }

    public final synchronized void b() {
        if (this.f36956h == null) {
            this.f36956h = new f(new com.twitter.sdk.android.core.internal.oauth.e(this, new kn.j()), this.f36950b);
        }
    }

    public void c() {
        this.f36949a.c();
        this.f36950b.c();
        e();
        this.f36951c.a(o.f().c());
    }

    public q d() {
        return this.f36952d;
    }

    public f e() {
        if (this.f36956h == null) {
            b();
        }
        return this.f36956h;
    }

    public String f() {
        return "com.twitter.sdk.android:twitter";
    }

    public n<x> h() {
        return this.f36949a;
    }

    public String i() {
        return "9.90.1.dev";
    }

    public v(q qVar, ConcurrentHashMap<m, p> concurrentHashMap, p pVar) {
        this.f36952d = qVar;
        this.f36953e = concurrentHashMap;
        this.f36955g = pVar;
        Context d10 = o.f().d(f());
        this.f36954f = d10;
        this.f36949a = new i(new mn.b(d10, "session_store"), new x.a(), "active_twittersession", "twittersession");
        this.f36950b = new i(new mn.b(d10, "session_store"), new e.a(), "active_guestsession", "guestsession");
        this.f36951c = new kn.g<>(this.f36949a, o.f().e(), new kn.k());
    }
}
