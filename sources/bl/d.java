package bl;

import al.g;
import bl.c;
import com.google.android.exoplayer2.C;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Locale;
import xk.f;

/* loaded from: classes2.dex */
public class d implements bl.a {

    /* renamed from: d  reason: collision with root package name */
    public static final Charset f18512d = Charset.forName(C.UTF8_NAME);

    /* renamed from: a  reason: collision with root package name */
    public final File f18513a;

    /* renamed from: b  reason: collision with root package name */
    public final int f18514b;

    /* renamed from: c  reason: collision with root package name */
    public c f18515c;

    /* loaded from: classes2.dex */
    public class a implements c.d {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ byte[] f18516a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ int[] f18517b;

        public a(byte[] bArr, int[] iArr) {
            this.f18516a = bArr;
            this.f18517b = iArr;
        }

        @Override // bl.c.d
        public void a(InputStream inputStream, int i10) throws IOException {
            try {
                inputStream.read(this.f18516a, this.f18517b[0], i10);
                int[] iArr = this.f18517b;
                iArr[0] = iArr[0] + i10;
            } finally {
                inputStream.close();
            }
        }
    }

    /* loaded from: classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final byte[] f18519a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18520b;

        public b(byte[] bArr, int i10) {
            this.f18519a = bArr;
            this.f18520b = i10;
        }
    }

    public d(File file, int i10) {
        this.f18513a = file;
        this.f18514b = i10;
    }

    @Override // bl.a
    public void a() {
        g.e(this.f18515c, "There was a problem closing the Crashlytics log file.");
        this.f18515c = null;
    }

    @Override // bl.a
    public String b() {
        byte[] c10 = c();
        if (c10 != null) {
            return new String(c10, f18512d);
        }
        return null;
    }

    @Override // bl.a
    public byte[] c() {
        b g10 = g();
        if (g10 == null) {
            return null;
        }
        int i10 = g10.f18520b;
        byte[] bArr = new byte[i10];
        System.arraycopy(g10.f18519a, 0, bArr, 0, i10);
        return bArr;
    }

    @Override // bl.a
    public void d() {
        a();
        this.f18513a.delete();
    }

    @Override // bl.a
    public void e(long j10, String str) {
        h();
        f(j10, str);
    }

    public final void f(long j10, String str) {
        int i10;
        if (this.f18515c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            if (str.length() > this.f18514b / 4) {
                str = "..." + str.substring(str.length() - i10);
            }
            this.f18515c.h(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f18512d));
            while (!this.f18515c.p() && this.f18515c.N() > this.f18514b) {
                this.f18515c.G();
            }
        } catch (IOException e10) {
            f.f().e("There was a problem writing to the Crashlytics log.", e10);
        }
    }

    public final b g() {
        if (this.f18513a.exists()) {
            h();
            c cVar = this.f18515c;
            if (cVar == null) {
                return null;
            }
            int[] iArr = {0};
            byte[] bArr = new byte[cVar.N()];
            try {
                this.f18515c.n(new a(bArr, iArr));
            } catch (IOException e10) {
                f.f().e("A problem occurred while reading the Crashlytics log file.", e10);
            }
            return new b(bArr, iArr[0]);
        }
        return null;
    }

    public final void h() {
        if (this.f18515c == null) {
            try {
                this.f18515c = new c(this.f18513a);
            } catch (IOException e10) {
                f f10 = f.f();
                f10.e("Could not open log file: " + this.f18513a, e10);
            }
        }
    }
}
