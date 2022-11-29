package cf;

import android.net.ConnectivityManager;
import android.view.Surface;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public interface c {
    int a();

    long b();

    void close();

    void connect();

    void d(ByteBuffer byteBuffer, i iVar);

    long e();

    ConnectivityManager.NetworkCallback f();

    Surface getSurface();

    void prepare();
}
