package hi;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes3.dex */
public abstract class u7 implements Iterable<Byte>, Serializable {

    /* renamed from: x  reason: collision with root package name */
    public static final u7 f36014x = new s7(b9.f35666d);

    /* renamed from: y  reason: collision with root package name */
    public static final Comparator<u7> f36015y;

    /* renamed from: z  reason: collision with root package name */
    public static final t7 f36016z;

    /* renamed from: w  reason: collision with root package name */
    public int f36017w = 0;

    static {
        int i10 = g7.f35783a;
        f36016z = new t7(null);
        f36015y = new n7();
    }

    public static int r(int i10, int i11, int i12) {
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

    public static u7 t(byte[] bArr, int i10, int i11) {
        r(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new s7(bArr2);
    }

    public static u7 u(String str) {
        return new s7(str.getBytes(b9.f35664b));
    }

    public abstract byte d(int i10);

    public abstract boolean equals(Object obj);

    public abstract byte f(int i10);

    public abstract int g();

    public final int hashCode() {
        int i10 = this.f36017w;
        if (i10 == 0) {
            int g10 = g();
            i10 = j(g10, 0, g10);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f36017w = i10;
        }
        return i10;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new l7(this);
    }

    public abstract int j(int i10, int i11, int i12);

    public abstract u7 k(int i10, int i11);

    public abstract String l(Charset charset);

    public abstract void m(k7 k7Var) throws IOException;

    public abstract boolean p();

    public final int s() {
        return this.f36017w;
    }

    public final String toString() {
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(g());
        objArr[2] = g() <= 50 ? ta.a(this) : ta.a(k(0, 47)).concat("...");
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final String w(Charset charset) {
        return g() == 0 ? "" : l(charset);
    }
}
