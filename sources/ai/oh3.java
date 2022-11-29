package ai;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class oh3 implements Iterable<Byte>, Serializable {

    /* renamed from: x  reason: collision with root package name */
    public static final oh3 f7807x = new kh3(bj3.f2376c);

    /* renamed from: y  reason: collision with root package name */
    public static final Comparator<oh3> f7808y;

    /* renamed from: z  reason: collision with root package name */
    public static final nh3 f7809z;

    /* renamed from: w  reason: collision with root package name */
    public int f7810w = 0;

    static {
        int i10 = zg3.f12988a;
        f7809z = new nh3(null);
        f7808y = new fh3();
    }

    public static oh3 M(byte[] bArr, int i10, int i11) {
        k(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new kh3(bArr2);
    }

    public static oh3 N(byte[] bArr) {
        return M(bArr, 0, bArr.length);
    }

    public static oh3 P(byte[] bArr) {
        return new kh3(bArr);
    }

    public static oh3 Q(String str) {
        return new kh3(str.getBytes(bj3.f2374a));
    }

    public static oh3 R(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int i10 = 256;
        while (true) {
            byte[] bArr = new byte[i10];
            int i11 = 0;
            while (i11 < i10) {
                int read = inputStream.read(bArr, i11, i10 - i11);
                if (read == -1) {
                    break;
                }
                i11 += read;
            }
            oh3 M = i11 == 0 ? null : M(bArr, 0, i11);
            if (M == null) {
                return S(arrayList);
            }
            arrayList.add(M);
            i10 = Math.min(i10 + i10, 8192);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static oh3 S(Iterable<oh3> iterable) {
        int size;
        if (!(iterable instanceof Collection)) {
            Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        } else {
            size = iterable.size();
        }
        if (size == 0) {
            return f7807x;
        }
        return r(iterable.iterator(), size);
    }

    public static mh3 f() {
        return new mh3(128);
    }

    public static void j(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                StringBuilder sb2 = new StringBuilder(22);
                sb2.append("Index < 0: ");
                sb2.append(i10);
                throw new ArrayIndexOutOfBoundsException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder(40);
            sb3.append("Index > length: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            throw new ArrayIndexOutOfBoundsException(sb3.toString());
        }
    }

    public static int k(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) < 0) {
            if (i10 < 0) {
                StringBuilder sb2 = new StringBuilder(32);
                sb2.append("Beginning index: ");
                sb2.append(i10);
                sb2.append(" < 0");
                throw new IndexOutOfBoundsException(sb2.toString());
            } else if (i11 < i10) {
                StringBuilder sb3 = new StringBuilder(66);
                sb3.append("Beginning index larger than ending index: ");
                sb3.append(i10);
                sb3.append(", ");
                sb3.append(i11);
                throw new IndexOutOfBoundsException(sb3.toString());
            } else {
                StringBuilder sb4 = new StringBuilder(37);
                sb4.append("End index: ");
                sb4.append(i11);
                sb4.append(" >= ");
                sb4.append(i12);
                throw new IndexOutOfBoundsException(sb4.toString());
            }
        }
        return i13;
    }

    public static oh3 r(Iterator<oh3> it, int i10) {
        if (i10 > 0) {
            if (i10 == 1) {
                return it.next();
            }
            int i11 = i10 >>> 1;
            oh3 r10 = r(it, i11);
            oh3 r11 = r(it, i10 - i11);
            if (Integer.MAX_VALUE - r10.p() >= r11.p()) {
                return nk3.V(r10, r11);
            }
            int p10 = r10.p();
            int p11 = r11.p();
            StringBuilder sb2 = new StringBuilder(53);
            sb2.append("ByteString would be too long: ");
            sb2.append(p10);
            sb2.append("+");
            sb2.append(p11);
            throw new IllegalArgumentException(sb2.toString());
        }
        throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i10)));
    }

    public abstract String A(Charset charset);

    public abstract boolean B();

    public abstract int D(int i10, int i11, int i12);

    public abstract int H(int i10, int i11, int i12);

    public abstract uh3 J();

    @Override // java.lang.Iterable
    /* renamed from: K */
    public ih3 iterator() {
        return new eh3(this);
    }

    public final boolean L() {
        return p() == 0;
    }

    @Deprecated
    public final void T(byte[] bArr, int i10, int i11, int i12) {
        k(0, i12, p());
        k(i11, i11 + i12, bArr.length);
        if (i12 > 0) {
            s(bArr, 0, i11, i12);
        }
    }

    public final byte[] U() {
        int p10 = p();
        if (p10 == 0) {
            return bj3.f2376c;
        }
        byte[] bArr = new byte[p10];
        s(bArr, 0, 0, p10);
        return bArr;
    }

    public final String d(Charset charset) {
        return p() == 0 ? "" : A(charset);
    }

    public abstract boolean equals(Object obj);

    public final int g() {
        return this.f7810w;
    }

    public final int hashCode() {
        int i10 = this.f7810w;
        if (i10 == 0) {
            int p10 = p();
            i10 = H(p10, 0, p10);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f7810w = i10;
        }
        return i10;
    }

    public abstract byte l(int i10);

    public abstract byte m(int i10);

    public abstract int p();

    public abstract void s(byte[] bArr, int i10, int i11, int i12);

    public abstract int t();

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(p());
        objArr[2] = p() <= 50 ? cl3.a(this) : cl3.a(w(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract boolean u();

    public abstract oh3 w(int i10, int i11);

    public abstract ByteBuffer x();

    public abstract void y(dh3 dh3Var) throws IOException;
}
