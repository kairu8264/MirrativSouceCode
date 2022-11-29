package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class k {

    /* loaded from: classes.dex */
    public static class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public final ByteBuffer f15112a;

        public a(ByteBuffer byteBuffer) {
            this.f15112a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // androidx.emoji2.text.k.c
        public int a() throws IOException {
            return this.f15112a.getInt();
        }

        @Override // androidx.emoji2.text.k.c
        public long b() throws IOException {
            return k.c(this.f15112a.getInt());
        }

        @Override // androidx.emoji2.text.k.c
        public long getPosition() {
            return this.f15112a.position();
        }

        @Override // androidx.emoji2.text.k.c
        public int readUnsignedShort() throws IOException {
            return k.d(this.f15112a.getShort());
        }

        @Override // androidx.emoji2.text.k.c
        public void skip(int i10) throws IOException {
            ByteBuffer byteBuffer = this.f15112a;
            byteBuffer.position(byteBuffer.position() + i10);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final long f15113a;

        /* renamed from: b  reason: collision with root package name */
        public final long f15114b;

        public b(long j10, long j11) {
            this.f15113a = j10;
            this.f15114b = j11;
        }

        public long a() {
            return this.f15113a;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        int a() throws IOException;

        long b() throws IOException;

        long getPosition();

        int readUnsignedShort() throws IOException;

        void skip(int i10) throws IOException;
    }

    public static b a(c cVar) throws IOException {
        long j10;
        cVar.skip(4);
        int readUnsignedShort = cVar.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            cVar.skip(6);
            int i10 = 0;
            while (true) {
                if (i10 >= readUnsignedShort) {
                    j10 = -1;
                    break;
                }
                int a10 = cVar.a();
                cVar.skip(4);
                j10 = cVar.b();
                cVar.skip(4);
                if (1835365473 == a10) {
                    break;
                }
                i10++;
            }
            if (j10 != -1) {
                cVar.skip((int) (j10 - cVar.getPosition()));
                cVar.skip(12);
                long b10 = cVar.b();
                for (int i11 = 0; i11 < b10; i11++) {
                    int a11 = cVar.a();
                    long b11 = cVar.b();
                    long b12 = cVar.b();
                    if (1164798569 == a11 || 1701669481 == a11) {
                        return new b(b11 + j10, b12);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static d4.b b(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position((int) a(new a(duplicate)).a());
        return d4.b.h(duplicate);
    }

    public static long c(int i10) {
        return i10 & 4294967295L;
    }

    public static int d(short s10) {
        return s10 & 65535;
    }
}
