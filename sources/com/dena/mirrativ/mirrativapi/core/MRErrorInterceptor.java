package com.dena.mirrativ.mirrativapi.core;

import android.content.Context;
import android.content.Intent;
import com.dena.mirrativ.mirrativapi.core.MRError;
import ep.b0;
import ep.d0;
import ep.e0;
import ep.w;
import ep.x;
import g9.b;
import go.a;
import java.nio.charset.Charset;
import jo.p;
import rp.e;
import so.n;
import tb.c;
import xm.f;

/* loaded from: classes2.dex */
public final class MRErrorInterceptor implements w {
    private final Context applicationContext;
    private final b errorLogger;
    private final c intentResolver;

    public MRErrorInterceptor(Context context, c cVar, b bVar) {
        p.h(context, "applicationContext");
        p.h(cVar, "intentResolver");
        p.h(bVar, "errorLogger");
        this.applicationContext = context;
        this.intentResolver = cVar;
        this.errorLogger = bVar;
    }

    @Override // ep.w
    public d0 intercept(w.a aVar) {
        x i10;
        p.h(aVar, "chain");
        b0 j10 = aVar.j();
        d0 a10 = aVar.a(j10);
        if (a10.h() != 200) {
            b bVar = this.errorLogger;
            String vVar = j10.j().toString();
            bVar.a(new MRIOException(vVar, new MRError.Failure("status_code: " + a10.h())));
            return a10;
        }
        e0 a11 = a10.a();
        if (a11 == null || (i10 = a11.i()) == null) {
            return a10;
        }
        Charset d10 = x.d(i10, null, 1, null);
        if (d10 == null) {
            d10 = Charset.forName("utf-8");
        }
        if (p.c(i10.g(), "json")) {
            e n10 = a11.n();
            n10.n0(Long.MAX_VALUE);
            rp.c l10 = n10.l();
            if (n.q("gzip", a10.p().d("Content-Encoding"), true)) {
                rp.n nVar = new rp.n(l10.clone());
                try {
                    l10 = new rp.c();
                    l10.H0(nVar);
                    a.a(nVar, null);
                } finally {
                }
            }
            rp.c clone = l10.clone();
            p.g(d10, "charset");
            StatusResponse statusResponse = (StatusResponse) new f().e(xm.c.LOWER_CASE_WITH_UNDERSCORES).b().i(clone.q1(d10), StatusResponse.class);
            if (statusResponse.getStatus() == null || statusResponse.getStatus().isSuccess()) {
                return a10;
            }
            MRError mirrativError = statusResponse.getStatus().getMirrativError();
            if (!(mirrativError instanceof MRError.Maintenance)) {
                if (mirrativError instanceof MRError.ForceUpdate) {
                    Context context = this.applicationContext;
                    Intent o02 = this.intentResolver.o0(context);
                    o02.setFlags(268468224);
                    context.startActivity(o02);
                    Context context2 = this.applicationContext;
                    context2.sendBroadcast(this.intentResolver.q(context2));
                    Context context3 = this.applicationContext;
                    context3.sendBroadcast(this.intentResolver.V(context3));
                }
            } else {
                Context context4 = this.applicationContext;
                Intent e10 = this.intentResolver.e(context4);
                e10.setFlags(268468224);
                context4.startActivity(e10);
                Context context5 = this.applicationContext;
                context5.sendBroadcast(this.intentResolver.q(context5));
                Context context6 = this.applicationContext;
                context6.sendBroadcast(this.intentResolver.V(context6));
            }
            MRIOException mRIOException = new MRIOException(j10.j().toString(), mirrativError);
            this.errorLogger.a(mRIOException);
            throw mRIOException;
        }
        return a10;
    }
}
