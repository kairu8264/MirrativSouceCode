package e5;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class b extends c {
    public static b g(ByteBuffer byteBuffer) {
        return h(byteBuffer, new b());
    }

    public static b h(ByteBuffer byteBuffer, b bVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return bVar.e(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public b e(int i10, ByteBuffer byteBuffer) {
        f(i10, byteBuffer);
        return this;
    }

    public void f(int i10, ByteBuffer byteBuffer) {
        this.f30253a = i10;
        this.f30254b = byteBuffer;
    }

    public a i(a aVar, int i10) {
        int b10 = b(6);
        if (b10 != 0) {
            return aVar.e(a(c(b10) + (i10 * 4)), this.f30254b);
        }
        return null;
    }

    public int j() {
        int b10 = b(6);
        if (b10 != 0) {
            return d(b10);
        }
        return 0;
    }

    public int k() {
        int b10 = b(4);
        if (b10 != 0) {
            return this.f30254b.getInt(b10 + this.f30253a);
        }
        return 0;
    }
}
