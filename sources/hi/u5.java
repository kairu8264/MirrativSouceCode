package hi;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes3.dex */
public final class u5 extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w5 f36013a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(w5 w5Var, Handler handler) {
        super(null);
        this.f36013a = w5Var;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f36013a.e();
    }
}
