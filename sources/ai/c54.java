package ai;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class c54 extends ThreadLocal<ByteBuffer> {
    public c54(d54 d54Var) {
    }

    @Override // java.lang.ThreadLocal
    public final /* bridge */ /* synthetic */ ByteBuffer initialValue() {
        return ByteBuffer.allocate(32);
    }
}
