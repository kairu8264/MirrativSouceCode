package l1;

import android.view.KeyEvent;
import jo.p;

/* loaded from: classes.dex */
public final class d {
    public static final long a(KeyEvent keyEvent) {
        p.h(keyEvent, "$this$key");
        return g.a(keyEvent.getKeyCode());
    }

    public static final int b(KeyEvent keyEvent) {
        p.h(keyEvent, "$this$type");
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                return c.f39491a.c();
            }
            return c.f39491a.b();
        }
        return c.f39491a.a();
    }

    public static final int c(KeyEvent keyEvent) {
        p.h(keyEvent, "$this$utf16CodePoint");
        return keyEvent.getUnicodeChar();
    }

    public static final boolean d(KeyEvent keyEvent) {
        p.h(keyEvent, "$this$isCtrlPressed");
        return keyEvent.isCtrlPressed();
    }

    public static final boolean e(KeyEvent keyEvent) {
        p.h(keyEvent, "$this$isShiftPressed");
        return keyEvent.isShiftPressed();
    }
}
