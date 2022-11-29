package hn;

import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public ByteBuffer f36134a;

    /* renamed from: b  reason: collision with root package name */
    public int f36135b = 0;

    public c(int i10) {
        this.f36134a = ByteBuffer.allocate(i10);
    }

    public void a() {
        this.f36134a.clear();
        this.f36134a.position(0);
        this.f36135b = 0;
    }

    public void b(int i10) {
        o(i10, false);
    }

    public final void c(int i10) {
        ByteBuffer allocate = ByteBuffer.allocate(i10);
        int position = this.f36134a.position();
        this.f36134a.position(0);
        allocate.put(this.f36134a);
        allocate.position(position);
        this.f36134a = allocate;
    }

    public byte d(int i10) throws IndexOutOfBoundsException {
        if (i10 >= 0 && this.f36135b > i10) {
            return this.f36134a.get(i10);
        }
        throw new IndexOutOfBoundsException(String.format("Bad index: index=%d, length=%d", Integer.valueOf(i10), Integer.valueOf(this.f36135b)));
    }

    public boolean e(int i10) {
        return ((1 << (i10 % 8)) & d(i10 / 8)) != 0;
    }

    public int f(int i10, int i11) {
        int i12 = 1;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i11) {
            if (e(i10 + i13)) {
                i14 += i12;
            }
            i13++;
            i12 *= 2;
        }
        return i14;
    }

    public int g(int i10, int i11) {
        int i12 = 1;
        int i13 = i11 - 1;
        int i14 = 0;
        while (i13 >= 0) {
            if (e(i10 + i13)) {
                i14 += i12;
            }
            i13--;
            i12 *= 2;
        }
        return i14;
    }

    public int h() {
        return this.f36135b;
    }

    public void i(int i10) {
        int capacity = this.f36134a.capacity();
        int i11 = this.f36135b;
        if (capacity < i11 + 1) {
            c(i11 + 1024);
        }
        this.f36134a.put((byte) i10);
        this.f36135b++;
    }

    public void j(c cVar, int i10, int i11) {
        l(cVar.f36134a.array(), i10, i11);
    }

    public void k(byte[] bArr) {
        int capacity = this.f36134a.capacity();
        int i10 = this.f36135b;
        if (capacity < bArr.length + i10) {
            c(i10 + bArr.length + 1024);
        }
        this.f36134a.put(bArr);
        this.f36135b += bArr.length;
    }

    public void l(byte[] bArr, int i10, int i11) {
        int capacity = this.f36134a.capacity();
        int i12 = this.f36135b;
        if (capacity < i12 + i11) {
            c(i12 + i11 + 1024);
        }
        this.f36134a.put(bArr, i10, i11);
        this.f36135b += i11;
    }

    public boolean m(int[] iArr) {
        boolean e10 = e(iArr[0]);
        iArr[0] = iArr[0] + 1;
        return e10;
    }

    public int n(int[] iArr, int i10) {
        int f10 = f(iArr[0], i10);
        iArr[0] = iArr[0] + i10;
        return f10;
    }

    public void o(int i10, boolean z10) {
        int i11 = i10 / 8;
        int i12 = i10 % 8;
        byte d10 = d(i11);
        this.f36134a.put(i11, (byte) (z10 ? (1 << i12) | d10 : (~(1 << i12)) & d10));
    }

    public void p(int i10) {
        if (this.f36134a.capacity() <= i10) {
            return;
        }
        int i11 = this.f36135b;
        byte[] r10 = r(i11 - i10, i11);
        ByteBuffer wrap = ByteBuffer.wrap(r10);
        this.f36134a = wrap;
        wrap.position(r10.length);
        this.f36135b = r10.length;
    }

    public byte[] q(int i10) {
        return r(i10, h());
    }

    public byte[] r(int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 >= 0 && i10 >= 0 && this.f36135b >= i11) {
            byte[] bArr = new byte[i12];
            if (i12 != 0) {
                System.arraycopy(this.f36134a.array(), i10, bArr, 0, i12);
            }
            return bArr;
        }
        throw new IllegalArgumentException(String.format("Bad range: beginIndex=%d, endIndex=%d, length=%d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(this.f36135b)));
    }
}
