package ai;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class l54 extends xm3 {
    public ByteBuffer G;

    public l54(String str) {
        super(str);
    }

    @Override // ai.xm3
    public final void c(ByteBuffer byteBuffer) {
        this.G = byteBuffer;
        byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
    }
}
