package ai;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public abstract class zm3 extends xm3 {
    public int G;

    public zm3(String str) {
        super("mvhd");
    }

    public final int f() {
        if (!this.f12033y) {
            e();
        }
        return this.G;
    }

    public final long g(ByteBuffer byteBuffer) {
        this.G = g54.c(byteBuffer.get());
        g54.b(byteBuffer);
        byteBuffer.get();
        return 4L;
    }
}
