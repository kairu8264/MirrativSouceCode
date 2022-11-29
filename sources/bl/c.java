package bl;

import android.support.v4.media.session.PlaybackStateCompat;
import com.mirrativ.llstream.protocol.v1.tag.TagConstant;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public class c implements Closeable {
    public static final Logger C = Logger.getLogger(c.class.getName());
    public b A;
    public final byte[] B = new byte[16];

    /* renamed from: w  reason: collision with root package name */
    public final RandomAccessFile f18499w;

    /* renamed from: x  reason: collision with root package name */
    public int f18500x;

    /* renamed from: y  reason: collision with root package name */
    public int f18501y;

    /* renamed from: z  reason: collision with root package name */
    public b f18502z;

    /* loaded from: classes2.dex */
    public class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public boolean f18503a = true;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ StringBuilder f18504b;

        public a(StringBuilder sb2) {
            this.f18504b = sb2;
        }

        @Override // bl.c.d
        public void a(InputStream inputStream, int i10) throws IOException {
            if (this.f18503a) {
                this.f18503a = false;
            } else {
                this.f18504b.append(", ");
            }
            this.f18504b.append(i10);
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: c  reason: collision with root package name */
        public static final b f18506c = new b(0, 0);

        /* renamed from: a  reason: collision with root package name */
        public final int f18507a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18508b;

        public b(int i10, int i11) {
            this.f18507a = i10;
            this.f18508b = i11;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f18507a + ", length = " + this.f18508b + "]";
        }
    }

    /* renamed from: bl.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public final class C0129c extends InputStream {

        /* renamed from: w  reason: collision with root package name */
        public int f18509w;

        /* renamed from: x  reason: collision with root package name */
        public int f18510x;

        public /* synthetic */ C0129c(c cVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            c.q(bArr, "buffer");
            if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
                int i12 = this.f18510x;
                if (i12 > 0) {
                    if (i11 > i12) {
                        i11 = i12;
                    }
                    c.this.I(this.f18509w, bArr, i10, i11);
                    this.f18509w = c.this.O(this.f18509w + i11);
                    this.f18510x -= i11;
                    return i11;
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        }

        public C0129c(b bVar) {
            this.f18509w = c.this.O(bVar.f18507a + 4);
            this.f18510x = bVar.f18508b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f18510x == 0) {
                return -1;
            }
            c.this.f18499w.seek(this.f18509w);
            int read = c.this.f18499w.read();
            this.f18509w = c.this.O(this.f18509w + 1);
            this.f18510x--;
            return read;
        }
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(InputStream inputStream, int i10) throws IOException;
    }

    public c(File file) throws IOException {
        if (!file.exists()) {
            o(file);
        }
        this.f18499w = v(file);
        C();
    }

    public static int E(byte[] bArr, int i10) {
        return ((bArr[i10] & TagConstant.TAG_CAT_RESERVED) << 24) + ((bArr[i10 + 1] & TagConstant.TAG_CAT_RESERVED) << 16) + ((bArr[i10 + 2] & TagConstant.TAG_CAT_RESERVED) << 8) + (bArr[i10 + 3] & TagConstant.TAG_CAT_RESERVED);
    }

    public static void S(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    public static void U(byte[] bArr, int... iArr) {
        int i10 = 0;
        for (int i11 : iArr) {
            S(bArr, i10, i11);
            i10 += 4;
        }
    }

    public static void o(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile v10 = v(file2);
        try {
            v10.setLength(PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM);
            v10.seek(0L);
            byte[] bArr = new byte[16];
            U(bArr, 4096, 0, 0, 0);
            v10.write(bArr);
            v10.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th2) {
            v10.close();
            throw th2;
        }
    }

    public static <T> T q(T t10, String str) {
        Objects.requireNonNull(t10, str);
        return t10;
    }

    public static RandomAccessFile v(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    public final void C() throws IOException {
        this.f18499w.seek(0L);
        this.f18499w.readFully(this.B);
        int E = E(this.B, 0);
        this.f18500x = E;
        if (E <= this.f18499w.length()) {
            this.f18501y = E(this.B, 4);
            int E2 = E(this.B, 8);
            int E3 = E(this.B, 12);
            this.f18502z = z(E2);
            this.A = z(E3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f18500x + ", Actual length: " + this.f18499w.length());
    }

    public final int F() {
        return this.f18500x - N();
    }

    public synchronized void G() throws IOException {
        if (!p()) {
            if (this.f18501y == 1) {
                clear();
            } else {
                b bVar = this.f18502z;
                int O = O(bVar.f18507a + 4 + bVar.f18508b);
                I(O, this.B, 0, 4);
                int E = E(this.B, 0);
                P(this.f18500x, this.f18501y - 1, O, this.A.f18507a);
                this.f18501y--;
                this.f18502z = new b(O, E);
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public final void I(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int O = O(i10);
        int i13 = O + i12;
        int i14 = this.f18500x;
        if (i13 <= i14) {
            this.f18499w.seek(O);
            this.f18499w.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - O;
        this.f18499w.seek(O);
        this.f18499w.readFully(bArr, i11, i15);
        this.f18499w.seek(16L);
        this.f18499w.readFully(bArr, i11 + i15, i12 - i15);
    }

    public final void K(int i10, byte[] bArr, int i11, int i12) throws IOException {
        int O = O(i10);
        int i13 = O + i12;
        int i14 = this.f18500x;
        if (i13 <= i14) {
            this.f18499w.seek(O);
            this.f18499w.write(bArr, i11, i12);
            return;
        }
        int i15 = i14 - O;
        this.f18499w.seek(O);
        this.f18499w.write(bArr, i11, i15);
        this.f18499w.seek(16L);
        this.f18499w.write(bArr, i11 + i15, i12 - i15);
    }

    public final void L(int i10) throws IOException {
        this.f18499w.setLength(i10);
        this.f18499w.getChannel().force(true);
    }

    public int N() {
        if (this.f18501y == 0) {
            return 16;
        }
        b bVar = this.A;
        int i10 = bVar.f18507a;
        int i11 = this.f18502z.f18507a;
        if (i10 >= i11) {
            return (i10 - i11) + 4 + bVar.f18508b + 16;
        }
        return (((i10 + 4) + bVar.f18508b) + this.f18500x) - i11;
    }

    public final int O(int i10) {
        int i11 = this.f18500x;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    public final void P(int i10, int i11, int i12, int i13) throws IOException {
        U(this.B, i10, i11, i12, i13);
        this.f18499w.seek(0L);
        this.f18499w.write(this.B);
    }

    public synchronized void clear() throws IOException {
        P(4096, 0, 0, 0);
        this.f18501y = 0;
        b bVar = b.f18506c;
        this.f18502z = bVar;
        this.A = bVar;
        if (this.f18500x > 4096) {
            L(4096);
        }
        this.f18500x = 4096;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f18499w.close();
    }

    public void h(byte[] bArr) throws IOException {
        i(bArr, 0, bArr.length);
    }

    public synchronized void i(byte[] bArr, int i10, int i11) throws IOException {
        int O;
        q(bArr, "buffer");
        if ((i10 | i11) >= 0 && i11 <= bArr.length - i10) {
            j(i11);
            boolean p10 = p();
            if (p10) {
                O = 16;
            } else {
                b bVar = this.A;
                O = O(bVar.f18507a + 4 + bVar.f18508b);
            }
            b bVar2 = new b(O, i11);
            S(this.B, 0, i11);
            K(bVar2.f18507a, this.B, 0, 4);
            K(bVar2.f18507a + 4, bArr, i10, i11);
            P(this.f18500x, this.f18501y + 1, p10 ? bVar2.f18507a : this.f18502z.f18507a, bVar2.f18507a);
            this.A = bVar2;
            this.f18501y++;
            if (p10) {
                this.f18502z = bVar2;
            }
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public final void j(int i10) throws IOException {
        int i11 = i10 + 4;
        int F = F();
        if (F >= i11) {
            return;
        }
        int i12 = this.f18500x;
        do {
            F += i12;
            i12 <<= 1;
        } while (F < i11);
        L(i12);
        b bVar = this.A;
        int O = O(bVar.f18507a + 4 + bVar.f18508b);
        if (O < this.f18502z.f18507a) {
            FileChannel channel = this.f18499w.getChannel();
            channel.position(this.f18500x);
            long j10 = O - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.A.f18507a;
        int i14 = this.f18502z.f18507a;
        if (i13 < i14) {
            int i15 = (this.f18500x + i13) - 16;
            P(i12, this.f18501y, i14, i15);
            this.A = new b(i15, this.A.f18508b);
        } else {
            P(i12, this.f18501y, i14, i13);
        }
        this.f18500x = i12;
    }

    public synchronized void n(d dVar) throws IOException {
        int i10 = this.f18502z.f18507a;
        for (int i11 = 0; i11 < this.f18501y; i11++) {
            b z10 = z(i10);
            dVar.a(new C0129c(this, z10, null), z10.f18508b);
            i10 = O(z10.f18507a + 4 + z10.f18508b);
        }
    }

    public synchronized boolean p() {
        return this.f18501y == 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.f18500x);
        sb2.append(", size=");
        sb2.append(this.f18501y);
        sb2.append(", first=");
        sb2.append(this.f18502z);
        sb2.append(", last=");
        sb2.append(this.A);
        sb2.append(", element lengths=[");
        try {
            n(new a(sb2));
        } catch (IOException e10) {
            C.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public final b z(int i10) throws IOException {
        if (i10 == 0) {
            return b.f18506c;
        }
        this.f18499w.seek(i10);
        return new b(i10, this.f18499w.readInt());
    }
}
