package f0;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public final class o {
    public static final boolean a(KeyEvent keyEvent) {
        jo.p.h(keyEvent, "$this$cancelsTextSelection");
        return keyEvent.getKeyCode() == 4 && l1.c.e(l1.d.b(keyEvent), l1.c.f39491a.b());
    }

    public static final void b() {
    }
}
