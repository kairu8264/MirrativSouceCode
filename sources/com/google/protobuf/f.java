package com.google.protobuf;

import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes4.dex */
public abstract class f implements Iterable<Byte>, Serializable {

    /* renamed from: x  reason: collision with root package name */
    public static final f f28094x = new j(t.f28217c);

    /* renamed from: y  reason: collision with root package name */
    public static final InterfaceC0256f f28095y;

    /* renamed from: z  reason: collision with root package name */
    public static final Comparator<f> f28096z;

    /* renamed from: w  reason: collision with root package name */
    public int f28097w = 0;

    /* loaded from: classes4.dex */
    public class a extends c {

        /* renamed from: w  reason: collision with root package name */
        public int f28098w = 0;

        /* renamed from: x  reason: collision with root package name */
        public final int f28099x;

        public a() {
            this.f28099x = f.this.size();
        }

        @Override // com.google.protobuf.f.g
        public byte c() {
            int i10 = this.f28098w;
            if (i10 < this.f28099x) {
                this.f28098w = i10 + 1;
                return f.this.p(i10);
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f28098w < this.f28099x;
        }
    }

    /* loaded from: classes4.dex */
    public static class b implements Comparator<f> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(f fVar, f fVar2) {
            g it = fVar.iterator();
            g it2 = fVar2.iterator();
            while (it.hasNext() && it2.hasNext()) {
                int compare = Integer.compare(f.B(it.c()), f.B(it2.c()));
                if (compare != 0) {
                    return compare;
                }
            }
            return Integer.compare(fVar.size(), fVar2.size());
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class c implements g {
        @Override // java.util.Iterator
        /* renamed from: a */
        public final Byte next() {
            return Byte.valueOf(c());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* loaded from: classes4.dex */
    public static final class d implements InterfaceC0256f {
        public d() {
        }

        @Override // com.google.protobuf.f.InterfaceC0256f
        public byte[] a(byte[] bArr, int i10, int i11) {
            return Arrays.copyOfRange(bArr, i10, i11 + i10);
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class e extends j {
        public final int B;
        public final int C;

        public e(byte[] bArr, int i10, int i11) {
            super(bArr);
            f.j(i10, i10 + i11, bArr.length);
            this.B = i10;
            this.C = i11;
        }

        @Override // com.google.protobuf.f.j
        public int Q() {
            return this.B;
        }

        @Override // com.google.protobuf.f.j, com.google.protobuf.f
        public byte f(int i10) {
            f.g(i10, size());
            return this.A[this.B + i10];
        }

        @Override // com.google.protobuf.f.j, com.google.protobuf.f
        public void m(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.A, Q() + i10, bArr, i11, i12);
        }

        @Override // com.google.protobuf.f.j, com.google.protobuf.f
        public byte p(int i10) {
            return this.A[this.B + i10];
        }

        @Override // com.google.protobuf.f.j, com.google.protobuf.f
        public int size() {
            return this.C;
        }
    }

    /* renamed from: com.google.protobuf.f$f  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0256f {
        byte[] a(byte[] bArr, int i10, int i11);
    }

    /* loaded from: classes4.dex */
    public interface g extends Iterator<Byte> {
        byte c();
    }

    /* loaded from: classes4.dex */
    public static final class h {

        /* renamed from: a  reason: collision with root package name */
        public final CodedOutputStream f28101a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f28102b;

        public /* synthetic */ h(int i10, a aVar) {
            this(i10);
        }

        public f a() {
            this.f28101a.c();
            return new j(this.f28102b);
        }

        public CodedOutputStream b() {
            return this.f28101a;
        }

        public h(int i10) {
            byte[] bArr = new byte[i10];
            this.f28102b = bArr;
            this.f28101a = CodedOutputStream.d0(bArr);
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class i extends f {
        @Override // com.google.protobuf.f, java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator<Byte> iterator() {
            return super.iterator();
        }
    }

    /* loaded from: classes4.dex */
    public static class j extends i {
        public final byte[] A;

        public j(byte[] bArr) {
            Objects.requireNonNull(bArr);
            this.A = bArr;
        }

        @Override // com.google.protobuf.f
        public final String H(Charset charset) {
            return new String(this.A, Q(), size(), charset);
        }

        @Override // com.google.protobuf.f
        public final void N(fn.b bVar) throws IOException {
            bVar.a(this.A, Q(), size());
        }

        public final boolean P(f fVar, int i10, int i11) {
            if (i11 <= fVar.size()) {
                int i12 = i10 + i11;
                if (i12 <= fVar.size()) {
                    if (fVar instanceof j) {
                        j jVar = (j) fVar;
                        byte[] bArr = this.A;
                        byte[] bArr2 = jVar.A;
                        int Q = Q() + i11;
                        int Q2 = Q();
                        int Q3 = jVar.Q() + i10;
                        while (Q2 < Q) {
                            if (bArr[Q2] != bArr2[Q3]) {
                                return false;
                            }
                            Q2++;
                            Q3++;
                        }
                        return true;
                    }
                    return fVar.y(i10, i12).equals(y(0, i11));
                }
                throw new IllegalArgumentException("Ran off end of other: " + i10 + ", " + i11 + ", " + fVar.size());
            }
            throw new IllegalArgumentException("Length too large: " + i11 + size());
        }

        public int Q() {
            return 0;
        }

        @Override // com.google.protobuf.f
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if ((obj instanceof f) && size() == ((f) obj).size()) {
                if (size() == 0) {
                    return true;
                }
                if (obj instanceof j) {
                    j jVar = (j) obj;
                    int x10 = x();
                    int x11 = jVar.x();
                    if (x10 == 0 || x11 == 0 || x10 == x11) {
                        return P(jVar, 0, size());
                    }
                    return false;
                }
                return obj.equals(this);
            }
            return false;
        }

        @Override // com.google.protobuf.f
        public byte f(int i10) {
            return this.A[i10];
        }

        @Override // com.google.protobuf.f
        public void m(byte[] bArr, int i10, int i11, int i12) {
            System.arraycopy(this.A, i10, bArr, i11, i12);
        }

        @Override // com.google.protobuf.f
        public byte p(int i10) {
            return this.A[i10];
        }

        @Override // com.google.protobuf.f
        public final boolean r() {
            int Q = Q();
            return o0.n(this.A, Q, size() + Q);
        }

        @Override // com.google.protobuf.f
        public int size() {
            return this.A.length;
        }

        @Override // com.google.protobuf.f
        public final com.google.protobuf.g u() {
            return com.google.protobuf.g.h(this.A, Q(), size(), true);
        }

        @Override // com.google.protobuf.f
        public final int w(int i10, int i11, int i12) {
            return t.i(i10, this.A, Q() + i11, i12);
        }

        @Override // com.google.protobuf.f
        public final f y(int i10, int i11) {
            int j10 = f.j(i10, i11, size());
            if (j10 == 0) {
                return f.f28094x;
            }
            return new e(this.A, Q() + i10, j10);
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements InterfaceC0256f {
        public k() {
        }

        @Override // com.google.protobuf.f.InterfaceC0256f
        public byte[] a(byte[] bArr, int i10, int i11) {
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return bArr2;
        }

        public /* synthetic */ k(a aVar) {
            this();
        }
    }

    static {
        f28095y = fn.a.c() ? new k(null) : new d(null);
        f28096z = new b();
    }

    public static int B(byte b10) {
        return b10 & TagConstant.TAG_CAT_RESERVED;
    }

    public static f L(byte[] bArr) {
        return new j(bArr);
    }

    public static f M(byte[] bArr, int i10, int i11) {
        return new e(bArr, i10, i11);
    }

    public static void g(int i10, int i11) {
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + i11);
        }
    }

    public static int j(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) < 0) {
            if (i10 < 0) {
                throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
            } else if (i11 < i10) {
                throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
            } else {
                throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
            }
        }
        return i13;
    }

    public static f k(byte[] bArr, int i10, int i11) {
        j(i10, i10 + i11, bArr.length);
        return new j(f28095y.a(bArr, i10, i11));
    }

    public static f l(String str) {
        return new j(str.getBytes(t.f28215a));
    }

    public static h t(int i10) {
        return new h(i10, null);
    }

    public final byte[] A() {
        int size = size();
        if (size == 0) {
            return t.f28217c;
        }
        byte[] bArr = new byte[size];
        m(bArr, 0, 0, size);
        return bArr;
    }

    public final String D(Charset charset) {
        return size() == 0 ? "" : H(charset);
    }

    public abstract String H(Charset charset);

    public final String J() {
        return D(t.f28215a);
    }

    public final String K() {
        if (size() <= 50) {
            return fn.y.a(this);
        }
        return fn.y.a(y(0, 47)) + "...";
    }

    public abstract void N(fn.b bVar) throws IOException;

    public abstract boolean equals(Object obj);

    public abstract byte f(int i10);

    public final int hashCode() {
        int i10 = this.f28097w;
        if (i10 == 0) {
            int size = size();
            i10 = w(size, 0, size);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f28097w = i10;
        }
        return i10;
    }

    public abstract void m(byte[] bArr, int i10, int i11, int i12);

    public abstract byte p(int i10);

    public abstract boolean r();

    @Override // java.lang.Iterable
    /* renamed from: s */
    public g iterator() {
        return new a();
    }

    public abstract int size();

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), K());
    }

    public abstract com.google.protobuf.g u();

    public abstract int w(int i10, int i11, int i12);

    public final int x() {
        return this.f28097w;
    }

    public abstract f y(int i10, int i11);
}
