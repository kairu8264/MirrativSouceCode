package z1;

import android.os.Build;
import android.text.StaticLayout;

/* loaded from: classes.dex */
public final class k implements o {
    @Override // z1.o
    public StaticLayout a(q qVar) {
        jo.p.h(qVar, "params");
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(qVar.p(), qVar.o(), qVar.e(), qVar.m(), qVar.s());
        obtain.setTextDirection(qVar.q());
        obtain.setAlignment(qVar.a());
        obtain.setMaxLines(qVar.l());
        obtain.setEllipsize(qVar.c());
        obtain.setEllipsizedWidth(qVar.d());
        obtain.setLineSpacing(qVar.j(), qVar.k());
        obtain.setIncludePad(qVar.g());
        obtain.setBreakStrategy(qVar.b());
        obtain.setHyphenationFrequency(qVar.f());
        obtain.setIndents(qVar.i(), qVar.n());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            l lVar = l.f62455a;
            jo.p.g(obtain, "this");
            lVar.a(obtain, qVar.h());
        }
        if (i10 >= 28) {
            m mVar = m.f62456a;
            jo.p.g(obtain, "this");
            mVar.a(obtain, qVar.r());
        }
        StaticLayout build = obtain.build();
        jo.p.g(build, "obtain(params.text, para…  }\n            }.build()");
        return build;
    }
}
