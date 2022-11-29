package com.twitter.sdk.android.core.internal.oauth;

import android.net.Uri;
import com.dena.mirrorman.clientlog.logs.LogBase;
import com.twitter.sdk.android.core.TwitterAuthException;
import com.twitter.sdk.android.core.TwitterException;
import ep.e0;
import gr.o;
import gr.t;
import in.l;
import in.q;
import in.r;
import in.v;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
import kn.j;

/* loaded from: classes4.dex */
public class d extends i {

    /* renamed from: e  reason: collision with root package name */
    public b f28287e;

    /* loaded from: classes4.dex */
    public class a extends in.c<e0> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ in.c f28288a;

        public a(in.c cVar) {
            this.f28288a = cVar;
        }

        @Override // in.c
        public void c(TwitterException twitterException) {
            this.f28288a.c(twitterException);
        }

        @Override // in.c
        public void d(l<e0> lVar) {
            StringBuilder sb2 = new StringBuilder();
            BufferedReader bufferedReader = null;
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(lVar.f36917a.a()));
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb2.append(readLine);
                        } catch (Throwable th2) {
                            th = th2;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            throw th;
                        }
                    }
                    bufferedReader2.close();
                    String sb3 = sb2.toString();
                    g l10 = d.l(sb3);
                    if (l10 == null) {
                        in.c cVar = this.f28288a;
                        cVar.c(new TwitterAuthException("Failed to parse auth response: " + sb3));
                        return;
                    }
                    this.f28288a.d(new l(l10, null));
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e10) {
                this.f28288a.c(new TwitterAuthException(e10.getMessage(), e10));
            }
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        @o("/oauth/request_token")
        er.b<e0> a(@gr.i("Authorization") String str);

        @o("/oauth/access_token")
        er.b<e0> b(@gr.i("Authorization") String str, @t("oauth_verifier") String str2);
    }

    public d(v vVar, j jVar) {
        super(vVar, jVar);
        this.f28287e = (b) c().b(b.class);
    }

    public static g l(String str) {
        TreeMap<String, String> a10 = ln.c.a(str, false);
        String str2 = a10.get("oauth_token");
        String str3 = a10.get("oauth_token_secret");
        String str4 = a10.get("screen_name");
        long parseLong = a10.containsKey(LogBase.USER_ID) ? Long.parseLong(a10.get(LogBase.USER_ID)) : 0L;
        if (str2 == null || str3 == null) {
            return null;
        }
        return new g(new r(str2, str3), str4, parseLong);
    }

    public String g(q qVar) {
        return Uri.parse("twittersdk://callback").buildUpon().appendQueryParameter("version", d().i()).appendQueryParameter("app", qVar.a()).build().toString();
    }

    public String h() {
        return b().c() + "/oauth/access_token";
    }

    public String i(r rVar) {
        return b().a("oauth", "authorize").appendQueryParameter("oauth_token", rVar.f36933x).build().toString();
    }

    public in.c<e0> j(in.c<g> cVar) {
        return new a(cVar);
    }

    public String k() {
        return b().c() + "/oauth/request_token";
    }

    public void m(in.c<g> cVar, r rVar, String str) {
        this.f28287e.b(new com.twitter.sdk.android.core.internal.oauth.b().a(d().d(), rVar, null, "POST", h(), null), str).D0(j(cVar));
    }

    public void n(in.c<g> cVar) {
        q d10 = d().d();
        this.f28287e.a(new com.twitter.sdk.android.core.internal.oauth.b().a(d10, null, g(d10), "POST", k(), null)).D0(j(cVar));
    }
}
