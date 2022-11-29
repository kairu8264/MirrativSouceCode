package c0;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.platform.z;

/* loaded from: classes.dex */
public final class l {
    public static final d b(l0.i iVar, int i10) {
        iVar.x(-1031410916);
        View view = (View) iVar.G(z.k());
        iVar.x(1157296644);
        boolean P = iVar.P(view);
        Object y10 = iVar.y();
        if (P || y10 == l0.i.f39065a.a()) {
            y10 = new a(view);
            iVar.q(y10);
        }
        iVar.O();
        a aVar = (a) y10;
        iVar.O();
        return aVar;
    }

    public static final Rect c(b1.h hVar) {
        return new Rect((int) hVar.i(), (int) hVar.l(), (int) hVar.j(), (int) hVar.e());
    }
}
