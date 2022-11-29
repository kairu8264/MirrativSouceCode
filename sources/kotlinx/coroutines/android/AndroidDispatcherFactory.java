package kotlinx.coroutines.android;

import android.os.Looper;
import java.util.List;
import uo.o2;
import vo.b;
import vo.d;
import zo.y;

/* loaded from: classes4.dex */
public final class AndroidDispatcherFactory implements y {
    @Override // zo.y
    public o2 createDispatcher(List<? extends y> list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new b(d.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // zo.y
    public int getLoadPriority() {
        return 1073741823;
    }

    @Override // zo.y
    public String hintOnError() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
