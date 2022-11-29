package jn;

import android.app.Activity;
import android.content.Intent;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterException;
import in.h;
import in.l;
import in.n;
import in.o;
import in.q;
import in.v;
import in.x;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    public final v f38112a;

    /* renamed from: b  reason: collision with root package name */
    public final jn.b f38113b;

    /* renamed from: c  reason: collision with root package name */
    public final n<x> f38114c;

    /* renamed from: d  reason: collision with root package name */
    public final q f38115d;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final jn.b f38116a = new jn.b();
    }

    /* loaded from: classes4.dex */
    public static class b extends in.c<x> {

        /* renamed from: a  reason: collision with root package name */
        public final n<x> f38117a;

        /* renamed from: b  reason: collision with root package name */
        public final in.c<x> f38118b;

        public b(n<x> nVar, in.c<x> cVar) {
            this.f38117a = nVar;
            this.f38118b = cVar;
        }

        @Override // in.c
        public void c(TwitterException twitterException) {
            o.g().c("Twitter", "Authorization completed with an error", twitterException);
            this.f38118b.c(twitterException);
        }

        @Override // in.c
        public void d(l<x> lVar) {
            o.g().b("Twitter", "Authorization completed successfully");
            this.f38117a.a(lVar.f36917a);
            this.f38118b.d(lVar);
        }
    }

    public f() {
        this(v.g(), v.g().d(), v.g().h(), a.f38116a);
    }

    public void a(Activity activity, in.c<x> cVar) {
        if (activity == null) {
            throw new IllegalArgumentException("Activity must not be null.");
        }
        if (cVar != null) {
            if (activity.isFinishing()) {
                o.g().c("Twitter", "Cannot authorize, activity is finishing.", null);
                return;
            } else {
                e(activity, cVar);
                return;
            }
        }
        throw new IllegalArgumentException("Callback must not be null.");
    }

    public final boolean b(Activity activity, b bVar) {
        o.g().b("Twitter", "Using OAuth");
        jn.b bVar2 = this.f38113b;
        q qVar = this.f38115d;
        return bVar2.a(activity, new c(qVar, bVar, qVar.c()));
    }

    public final boolean c(Activity activity, b bVar) {
        if (e.g(activity)) {
            o.g().b("Twitter", "Using SSO");
            jn.b bVar2 = this.f38113b;
            q qVar = this.f38115d;
            return bVar2.a(activity, new e(qVar, bVar, qVar.c()));
        }
        return false;
    }

    public void d() {
        this.f38113b.b();
    }

    public final void e(Activity activity, in.c<x> cVar) {
        b bVar = new b(this.f38114c, cVar);
        if (c(activity, bVar) || b(activity, bVar)) {
            return;
        }
        bVar.c(new TwitterAuthException("Authorize failed."));
    }

    public void f(int i10, int i11, Intent intent) {
        h g10 = o.g();
        g10.b("Twitter", "onActivityResult called with " + i10 + " " + i11);
        if (!this.f38113b.d()) {
            o.g().c("Twitter", "Authorize not in progress", null);
            return;
        }
        jn.a c10 = this.f38113b.c();
        if (c10 == null || !c10.d(i10, i11, intent)) {
            return;
        }
        this.f38113b.b();
    }

    public f(v vVar, q qVar, n<x> nVar, jn.b bVar) {
        this.f38112a = vVar;
        this.f38113b = bVar;
        this.f38115d = qVar;
        this.f38114c = nVar;
    }
}
