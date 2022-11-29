package ai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class yt1 implements e43<sl2> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ zt1 f12728a;

    public yt1(zt1 zt1Var) {
        this.f12728a = zt1Var;
    }

    @Override // ai.e43
    public final void a(Throwable th2) {
        Pattern pattern;
        hx1 hx1Var;
        if (((Boolean) ft.c().c(ox.f8129x4)).booleanValue()) {
            pattern = zt1.f13161f;
            Matcher matcher = pattern.matcher(th2.getMessage());
            if (matcher.matches()) {
                String group = matcher.group(1);
                hx1Var = this.f12728a.f13166e;
                hx1Var.a(Integer.parseInt(group));
            }
        }
    }

    @Override // ai.e43
    public final /* bridge */ /* synthetic */ void b(sl2 sl2Var) {
        hx1 hx1Var;
        hx1 hx1Var2;
        sl2 sl2Var2 = sl2Var;
        if (((Boolean) ft.c().c(ox.f8129x4)).booleanValue()) {
            hx1Var = this.f12728a.f13166e;
            hx1Var.a(sl2Var2.f9876b.f9497b.f6280e);
            hx1Var2 = this.f12728a.f13166e;
            hx1Var2.c(sl2Var2.f9876b.f9497b.f6281f);
        }
    }
}
