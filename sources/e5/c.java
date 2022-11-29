package e5;

import com.google.android.exoplayer2.C;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

/* loaded from: classes.dex */
public class c {

    /* renamed from: c  reason: collision with root package name */
    public static final ThreadLocal<CharsetDecoder> f30250c = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal<Charset> f30251d = new b();

    /* renamed from: e  reason: collision with root package name */
    public static final ThreadLocal<CharBuffer> f30252e = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public int f30253a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f30254b;

    /* loaded from: classes.dex */
    public static class a extends ThreadLocal<CharsetDecoder> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public CharsetDecoder initialValue() {
            return Charset.forName(C.UTF8_NAME).newDecoder();
        }
    }

    /* loaded from: classes.dex */
    public static class b extends ThreadLocal<Charset> {
        @Override // java.lang.ThreadLocal
        /* renamed from: a */
        public Charset initialValue() {
            return Charset.forName(C.UTF8_NAME);
        }
    }

    public int a(int i10) {
        return i10 + this.f30254b.getInt(i10);
    }

    public int b(int i10) {
        int i11 = this.f30253a;
        int i12 = i11 - this.f30254b.getInt(i11);
        if (i10 < this.f30254b.getShort(i12)) {
            return this.f30254b.getShort(i12 + i10);
        }
        return 0;
    }

    public int c(int i10) {
        int i11 = i10 + this.f30253a;
        return i11 + this.f30254b.getInt(i11) + 4;
    }

    public int d(int i10) {
        int i11 = i10 + this.f30253a;
        return this.f30254b.getInt(i11 + this.f30254b.getInt(i11));
    }
}
