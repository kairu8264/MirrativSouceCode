package com.google.firebase.remoteconfig.internal;

import android.text.format.DateUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.b;
import com.google.firebase.remoteconfig.internal.c;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import vi.g;
import vi.j;
import yl.f;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: j  reason: collision with root package name */
    public static final long f28040j = TimeUnit.HOURS.toSeconds(12);

    /* renamed from: k  reason: collision with root package name */
    public static final int[] f28041k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* renamed from: a  reason: collision with root package name */
    public final f f28042a;

    /* renamed from: b  reason: collision with root package name */
    public final xl.b<tk.a> f28043b;

    /* renamed from: c  reason: collision with root package name */
    public final Executor f28044c;

    /* renamed from: d  reason: collision with root package name */
    public final vh.f f28045d;

    /* renamed from: e  reason: collision with root package name */
    public final Random f28046e;

    /* renamed from: f  reason: collision with root package name */
    public final wm.d f28047f;

    /* renamed from: g  reason: collision with root package name */
    public final ConfigFetchHttpClient f28048g;

    /* renamed from: h  reason: collision with root package name */
    public final c f28049h;

    /* renamed from: i  reason: collision with root package name */
    public final Map<String, String> f28050i;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final Date f28051a;

        /* renamed from: b  reason: collision with root package name */
        public final int f28052b;

        /* renamed from: c  reason: collision with root package name */
        public final com.google.firebase.remoteconfig.internal.a f28053c;

        /* renamed from: d  reason: collision with root package name */
        public final String f28054d;

        public a(Date date, int i10, com.google.firebase.remoteconfig.internal.a aVar, String str) {
            this.f28051a = date;
            this.f28052b = i10;
            this.f28053c = aVar;
            this.f28054d = str;
        }

        public static a a(Date date) {
            return new a(date, 1, null, null);
        }

        public static a b(com.google.firebase.remoteconfig.internal.a aVar, String str) {
            return new a(aVar.e(), 0, aVar, str);
        }

        public static a c(Date date) {
            return new a(date, 2, null, null);
        }

        public com.google.firebase.remoteconfig.internal.a d() {
            return this.f28053c;
        }

        public String e() {
            return this.f28054d;
        }

        public int f() {
            return this.f28052b;
        }
    }

    public b(f fVar, xl.b<tk.a> bVar, Executor executor, vh.f fVar2, Random random, wm.d dVar, ConfigFetchHttpClient configFetchHttpClient, c cVar, Map<String, String> map) {
        this.f28042a = fVar;
        this.f28043b = bVar;
        this.f28044c = executor;
        this.f28045d = fVar2;
        this.f28046e = random;
        this.f28047f = dVar;
        this.f28048g = configFetchHttpClient;
        this.f28049h = cVar;
        this.f28050i = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ g s(g gVar, g gVar2, Date date, g gVar3) throws Exception {
        if (!gVar.s()) {
            return j.d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", gVar.n()));
        }
        if (!gVar2.s()) {
            return j.d(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", gVar2.n()));
        }
        return k((String) gVar.o(), ((yl.j) gVar2.o()).b(), date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ g t(Date date, g gVar) throws Exception {
        x(gVar, date);
        return gVar;
    }

    public final boolean e(long j10, Date date) {
        Date e10 = this.f28049h.e();
        if (e10.equals(c.f28055d)) {
            return false;
        }
        return date.before(new Date(e10.getTime() + TimeUnit.SECONDS.toMillis(j10)));
    }

    public final FirebaseRemoteConfigServerException f(FirebaseRemoteConfigServerException firebaseRemoteConfigServerException) throws FirebaseRemoteConfigClientException {
        String str;
        int a10 = firebaseRemoteConfigServerException.a();
        if (a10 == 401) {
            str = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
        } else if (a10 == 403) {
            str = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
        } else if (a10 == 429) {
            throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
        } else {
            if (a10 != 500) {
                switch (a10) {
                    case 502:
                    case 503:
                    case 504:
                        str = "The server is unavailable. Please try again later.";
                        break;
                    default:
                        str = "The server returned an unexpected error.";
                        break;
                }
            } else {
                str = "There was an internal server error.";
            }
        }
        int a11 = firebaseRemoteConfigServerException.a();
        return new FirebaseRemoteConfigServerException(a11, "Fetch failed: " + str, firebaseRemoteConfigServerException);
    }

    public final String g(long j10) {
        return String.format("Fetch is throttled. Please wait before calling fetch again: %s", DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(j10)));
    }

    public g<a> h() {
        return i(this.f28049h.f());
    }

    public g<a> i(final long j10) {
        return this.f28047f.e().l(this.f28044c, new vi.a() { // from class: wm.e
            @Override // vi.a
            public final Object a(vi.g gVar) {
                vi.g q10;
                q10 = com.google.firebase.remoteconfig.internal.b.this.q(j10, gVar);
                return q10;
            }
        });
    }

    public final a j(String str, String str2, Date date) throws FirebaseRemoteConfigException {
        try {
            a fetch = this.f28048g.fetch(this.f28048g.c(), str, str2, o(), this.f28049h.d(), this.f28050i, date);
            if (fetch.e() != null) {
                this.f28049h.i(fetch.e());
            }
            this.f28049h.g();
            return fetch;
        } catch (FirebaseRemoteConfigServerException e10) {
            c.a v10 = v(e10.a(), date);
            if (u(v10, e10.a())) {
                throw new FirebaseRemoteConfigFetchThrottledException(v10.a().getTime());
            }
            throw f(e10);
        }
    }

    public final g<a> k(String str, String str2, Date date) {
        try {
            final a j10 = j(str, str2, date);
            if (j10.f() != 0) {
                return j.e(j10);
            }
            return this.f28047f.k(j10.d()).t(this.f28044c, new vi.f() { // from class: wm.h
                @Override // vi.f
                public final vi.g a(Object obj) {
                    vi.g e10;
                    com.google.firebase.remoteconfig.internal.a aVar = (com.google.firebase.remoteconfig.internal.a) obj;
                    e10 = vi.j.e(b.a.this);
                    return e10;
                }
            });
        } catch (FirebaseRemoteConfigException e10) {
            return j.d(e10);
        }
    }

    /* renamed from: l */
    public final g<a> q(g<com.google.firebase.remoteconfig.internal.a> gVar, long j10) {
        g l10;
        final Date date = new Date(this.f28045d.currentTimeMillis());
        if (gVar.s() && e(j10, date)) {
            return j.e(a.c(date));
        }
        Date m10 = m(date);
        if (m10 != null) {
            l10 = j.d(new FirebaseRemoteConfigFetchThrottledException(g(m10.getTime() - date.getTime()), m10.getTime()));
        } else {
            final g<String> id2 = this.f28042a.getId();
            final g<yl.j> a10 = this.f28042a.a(false);
            l10 = j.i(id2, a10).l(this.f28044c, new vi.a() { // from class: wm.g
                @Override // vi.a
                public final Object a(vi.g gVar2) {
                    vi.g s10;
                    s10 = com.google.firebase.remoteconfig.internal.b.this.s(id2, a10, date, gVar2);
                    return s10;
                }
            });
        }
        return l10.l(this.f28044c, new vi.a() { // from class: wm.f
            @Override // vi.a
            public final Object a(vi.g gVar2) {
                vi.g t10;
                t10 = com.google.firebase.remoteconfig.internal.b.this.t(date, gVar2);
                return t10;
            }
        });
    }

    public final Date m(Date date) {
        Date a10 = this.f28049h.a().a();
        if (date.before(a10)) {
            return a10;
        }
        return null;
    }

    public final long n(int i10) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        int[] iArr = f28041k;
        long millis = timeUnit.toMillis(iArr[Math.min(i10, iArr.length) - 1]);
        return (millis / 2) + this.f28046e.nextInt((int) millis);
    }

    public final Map<String, String> o() {
        HashMap hashMap = new HashMap();
        tk.a aVar = this.f28043b.get();
        if (aVar == null) {
            return hashMap;
        }
        for (Map.Entry<String, Object> entry : aVar.e(false).entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().toString());
        }
        return hashMap;
    }

    public final boolean p(int i10) {
        return i10 == 429 || i10 == 502 || i10 == 503 || i10 == 504;
    }

    public final boolean u(c.a aVar, int i10) {
        return aVar.b() > 1 || i10 == 429;
    }

    public final c.a v(int i10, Date date) {
        if (p(i10)) {
            w(date);
        }
        return this.f28049h.a();
    }

    public final void w(Date date) {
        int b10 = this.f28049h.a().b() + 1;
        this.f28049h.h(b10, new Date(date.getTime() + n(b10)));
    }

    public final void x(g<a> gVar, Date date) {
        if (gVar.s()) {
            this.f28049h.k(date);
            return;
        }
        Exception n10 = gVar.n();
        if (n10 == null) {
            return;
        }
        if (n10 instanceof FirebaseRemoteConfigFetchThrottledException) {
            this.f28049h.l();
        } else {
            this.f28049h.j();
        }
    }
}
