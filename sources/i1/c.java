package i1;

import android.view.View;
import i1.b;
import jo.p;

/* loaded from: classes.dex */
public final class c implements a {

    /* renamed from: a  reason: collision with root package name */
    public final View f36314a;

    public c(View view) {
        p.h(view, "view");
        this.f36314a = view;
    }

    @Override // i1.a
    public void a(int i10) {
        b.a aVar = b.f36313a;
        if (b.b(i10, aVar.a())) {
            this.f36314a.performHapticFeedback(0);
        } else if (b.b(i10, aVar.b())) {
            this.f36314a.performHapticFeedback(9);
        }
    }
}
