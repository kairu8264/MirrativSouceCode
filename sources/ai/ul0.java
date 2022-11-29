package ai;

import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public abstract class ul0 {

    /* renamed from: w  reason: collision with root package name */
    public static final AtomicInteger f10743w = new AtomicInteger(0);

    /* renamed from: x  reason: collision with root package name */
    public static final AtomicInteger f10744x = new AtomicInteger(0);

    public static int Q() {
        return f10743w.get();
    }

    public static int R() {
        return f10744x.get();
    }

    public abstract boolean B();

    public abstract int C();

    public abstract long D();

    public abstract boolean E();

    public abstract void F(boolean z10);

    public abstract void G(int i10);

    public abstract void H(int i10);

    public abstract long I();

    public abstract long J();

    public abstract long K();

    public abstract long L();

    public abstract int M();

    public abstract void N(boolean z10);

    public abstract long O();

    public abstract long P();

    public abstract void S(Uri[] uriArr, String str);

    public abstract void T(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z10);

    public abstract void U(tl0 tl0Var);

    public abstract void V();

    public abstract void W(Surface surface, boolean z10) throws IOException;

    public abstract void X(float f10, boolean z10) throws IOException;

    public abstract void Y();

    public abstract void Z(long j10);

    public abstract void a0(int i10);

    public abstract void b0(int i10);

    public abstract void c0(int i10);
}
