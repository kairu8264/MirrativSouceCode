package hi;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes3.dex */
public final class c6 extends ContentObserver {
    public c6(d6 d6Var, Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        q6.e();
    }
}
