package ln;

import ep.b0;
import ep.c0;
import ep.d0;
import ep.s;
import ep.v;
import ep.w;
import in.m;
import in.q;
import in.r;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes4.dex */
public class a implements w {

    /* renamed from: a  reason: collision with root package name */
    public final m<? extends r> f40413a;

    /* renamed from: b  reason: collision with root package name */
    public final q f40414b;

    public a(m<? extends r> mVar, q qVar) {
        this.f40413a = mVar;
        this.f40414b = qVar;
    }

    public String a(b0 b0Var) throws IOException {
        return new com.twitter.sdk.android.core.internal.oauth.b().a(this.f40414b, this.f40413a.a(), null, b0Var.g(), b0Var.j().toString(), b(b0Var));
    }

    public Map<String, String> b(b0 b0Var) throws IOException {
        HashMap hashMap = new HashMap();
        if ("POST".equals(b0Var.g().toUpperCase(Locale.US))) {
            c0 a10 = b0Var.a();
            if (a10 instanceof s) {
                s sVar = (s) a10;
                for (int i10 = 0; i10 < sVar.j(); i10++) {
                    hashMap.put(sVar.h(i10), sVar.k(i10));
                }
            }
        }
        return hashMap;
    }

    public v c(v vVar) {
        v.a p10 = vVar.k().p(null);
        int s10 = vVar.s();
        for (int i10 = 0; i10 < s10; i10++) {
            p10.a(c.c(vVar.q(i10)), c.c(vVar.r(i10)));
        }
        return p10.c();
    }

    @Override // ep.w
    public d0 intercept(w.a aVar) throws IOException {
        b0 j10 = aVar.j();
        b0 b10 = j10.h().i(c(j10.j())).b();
        return aVar.a(b10.h().d("Authorization", a(b10)).b());
    }
}
