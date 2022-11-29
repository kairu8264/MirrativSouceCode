package f0;

import android.view.KeyEvent;

/* loaded from: classes.dex */
public final class l0 {
    public static final boolean a(KeyEvent keyEvent) {
        jo.p.h(keyEvent, "$this$isTypedEvent");
        return keyEvent.getAction() == 0 && keyEvent.getUnicodeChar() != 0;
    }
}
