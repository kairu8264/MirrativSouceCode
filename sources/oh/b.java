package oh;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import oh.e;

/* loaded from: classes3.dex */
public abstract class b<R extends e> {

    /* loaded from: classes3.dex */
    public interface a {
        void a(Status status);
    }

    public abstract void a(a aVar);

    public abstract R b(long j10, TimeUnit timeUnit);
}
