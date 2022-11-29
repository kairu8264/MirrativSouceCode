package androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;
import jo.h;

/* loaded from: classes.dex */
public final class GestureCancellationException extends CancellationException {
    public GestureCancellationException() {
        this(null, 1, null);
    }

    public GestureCancellationException(String str) {
        super(str);
    }

    public /* synthetic */ GestureCancellationException(String str, int i10, h hVar) {
        this((i10 & 1) != 0 ? null : str);
    }
}
