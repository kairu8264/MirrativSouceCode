package ai;

import android.os.Environment;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class ww implements Callable<Boolean> {
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
        return Boolean.valueOf("mounted".equals(Environment.getExternalStorageState()));
    }
}
