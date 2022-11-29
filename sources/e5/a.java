package e5;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class a extends c {
    public a e(int i10, ByteBuffer byteBuffer) {
        f(i10, byteBuffer);
        return this;
    }

    public void f(int i10, ByteBuffer byteBuffer) {
        this.f30253a = i10;
        this.f30254b = byteBuffer;
    }

    public int g(int i10) {
        int b10 = b(16);
        if (b10 != 0) {
            return this.f30254b.getInt(c(b10) + (i10 * 4));
        }
        return 0;
    }

    public int h() {
        int b10 = b(16);
        if (b10 != 0) {
            return d(b10);
        }
        return 0;
    }

    public boolean i() {
        int b10 = b(6);
        return (b10 == 0 || this.f30254b.get(b10 + this.f30253a) == 0) ? false : true;
    }

    public short j() {
        int b10 = b(14);
        if (b10 != 0) {
            return this.f30254b.getShort(b10 + this.f30253a);
        }
        return (short) 0;
    }

    public int k() {
        int b10 = b(4);
        if (b10 != 0) {
            return this.f30254b.getInt(b10 + this.f30253a);
        }
        return 0;
    }

    public short l() {
        int b10 = b(8);
        if (b10 != 0) {
            return this.f30254b.getShort(b10 + this.f30253a);
        }
        return (short) 0;
    }

    public short m() {
        int b10 = b(12);
        if (b10 != 0) {
            return this.f30254b.getShort(b10 + this.f30253a);
        }
        return (short) 0;
    }
}
