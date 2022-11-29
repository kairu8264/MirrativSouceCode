package ai;

import com.google.android.exoplayer2.util.MimeTypes;
import java.util.List;

/* loaded from: classes3.dex */
public final class n24 {

    /* renamed from: a  reason: collision with root package name */
    public final List<v4> f7168a;

    /* renamed from: b  reason: collision with root package name */
    public final pw3[] f7169b;

    public n24(List<v4> list) {
        this.f7168a = list;
        this.f7169b = new pw3[list.size()];
    }

    public final void a(pv3 pv3Var, k24 k24Var) {
        for (int i10 = 0; i10 < this.f7169b.length; i10++) {
            k24Var.a();
            pw3 p10 = pv3Var.p(k24Var.b(), 3);
            v4 v4Var = this.f7168a.get(i10);
            String str = v4Var.f10960l;
            boolean z10 = true;
            if (!MimeTypes.APPLICATION_CEA608.equals(str) && !MimeTypes.APPLICATION_CEA708.equals(str)) {
                z10 = false;
            }
            String valueOf = String.valueOf(str);
            u9.b(z10, valueOf.length() != 0 ? "Invalid closed caption mime type provided: ".concat(valueOf) : new String("Invalid closed caption mime type provided: "));
            t4 t4Var = new t4();
            t4Var.d(k24Var.c());
            t4Var.n(str);
            t4Var.h(v4Var.f10952d);
            t4Var.g(v4Var.f10951c);
            t4Var.G(v4Var.D);
            t4Var.p(v4Var.f10962n);
            p10.b(t4Var.I());
            this.f7169b[i10] = p10;
        }
    }

    public final void b(long j10, hb hbVar) {
        if (hbVar.l() < 9) {
            return;
        }
        int D = hbVar.D();
        int D2 = hbVar.D();
        int v10 = hbVar.v();
        if (D == 434 && D2 == 1195456820 && v10 == 3) {
            ev3.b(j10, hbVar, this.f7169b);
        }
    }
}
