package t;

import android.view.ViewConfiguration;
import androidx.compose.ui.platform.o0;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public static final float f52905a = ViewConfiguration.getScrollFriction();

    public static final float a() {
        return f52905a;
    }

    public static final <T> u.w<T> b(l0.i iVar, int i10) {
        iVar.x(-903108490);
        m2.d dVar = (m2.d) iVar.G(o0.e());
        Float valueOf = Float.valueOf(dVar.getDensity());
        iVar.x(-3686930);
        boolean P = iVar.P(valueOf);
        Object y10 = iVar.y();
        if (P || y10 == l0.i.f39065a.a()) {
            y10 = u.y.b(new c0(dVar));
            iVar.q(y10);
        }
        iVar.O();
        u.w<T> wVar = (u.w) y10;
        iVar.O();
        return wVar;
    }
}
