package jp;

import ep.d0;
import ep.w;
import java.io.IOException;
import jo.p;

/* loaded from: classes4.dex */
public final class a implements w {

    /* renamed from: a  reason: collision with root package name */
    public static final a f38153a = new a();

    @Override // ep.w
    public d0 intercept(w.a aVar) throws IOException {
        p.h(aVar, "chain");
        kp.g gVar = (kp.g) aVar;
        return kp.g.c(gVar, 0, gVar.d().u(gVar), null, 0, 0, 0, 61, null).a(gVar.h());
    }
}
