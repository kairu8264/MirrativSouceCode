package ai;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class kb implements v9 {
    @Override // ai.v9
    public final ha a(Looper looper, Handler.Callback callback) {
        return new nb(new Handler(looper, callback));
    }
}
