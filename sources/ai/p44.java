package ai;

import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.exoplayer2.C;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class p44 implements i34 {

    /* renamed from: c  reason: collision with root package name */
    public final o44 f8301c;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, m44> f8299a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b  reason: collision with root package name */
    public long f8300b = 0;

    /* renamed from: d  reason: collision with root package name */
    public final int f8302d = 5242880;

    public p44(o44 o44Var, int i10) {
        this.f8301c = o44Var;
    }

    public static byte[] f(n44 n44Var, long j10) throws IOException {
        long a10 = n44Var.a();
        if (j10 >= 0 && j10 <= a10) {
            int i10 = (int) j10;
            if (i10 == j10) {
                byte[] bArr = new byte[i10];
                new DataInputStream(n44Var).readFully(bArr);
                return bArr;
            }
        }
        StringBuilder sb2 = new StringBuilder(73);
        sb2.append("streamToBytes length=");
        sb2.append(j10);
        sb2.append(", maxLength=");
        sb2.append(a10);
        throw new IOException(sb2.toString());
    }

    public static void g(OutputStream outputStream, int i10) throws IOException {
        outputStream.write(i10 & 255);
        outputStream.write((i10 >> 8) & 255);
        outputStream.write((i10 >> 16) & 255);
        outputStream.write((i10 >> 24) & 255);
    }

    public static int h(InputStream inputStream) throws IOException {
        return (o(inputStream) << 24) | o(inputStream) | (o(inputStream) << 8) | (o(inputStream) << 16);
    }

    public static void i(OutputStream outputStream, long j10) throws IOException {
        outputStream.write((byte) j10);
        outputStream.write((byte) (j10 >>> 8));
        outputStream.write((byte) (j10 >>> 16));
        outputStream.write((byte) (j10 >>> 24));
        outputStream.write((byte) (j10 >>> 32));
        outputStream.write((byte) (j10 >>> 40));
        outputStream.write((byte) (j10 >>> 48));
        outputStream.write((byte) (j10 >>> 56));
    }

    public static long j(InputStream inputStream) throws IOException {
        return (o(inputStream) & 255) | ((o(inputStream) & 255) << 8) | ((o(inputStream) & 255) << 16) | ((o(inputStream) & 255) << 24) | ((o(inputStream) & 255) << 32) | ((o(inputStream) & 255) << 40) | ((o(inputStream) & 255) << 48) | ((255 & o(inputStream)) << 56);
    }

    public static void k(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes(C.UTF8_NAME);
        int length = bytes.length;
        i(outputStream, length);
        outputStream.write(bytes, 0, length);
    }

    public static String l(n44 n44Var) throws IOException {
        return new String(f(n44Var, j(n44Var)), C.UTF8_NAME);
    }

    public static int o(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    public static final String p(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(String.valueOf(str.substring(0, length).hashCode()));
        String valueOf2 = String.valueOf(String.valueOf(str.substring(length).hashCode()));
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    @Override // ai.i34
    public final synchronized void a(String str, h34 h34Var) {
        long j10 = this.f8300b;
        int length = h34Var.f4730a.length;
        int i10 = this.f8302d;
        if (j10 + length <= i10 || length <= i10 * 0.9f) {
            File e10 = e(str);
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(e10));
                m44 m44Var = new m44(str, h34Var);
                try {
                    g(bufferedOutputStream, 538247942);
                    k(bufferedOutputStream, m44Var.f6787b);
                    String str2 = m44Var.f6788c;
                    if (str2 == null) {
                        str2 = "";
                    }
                    k(bufferedOutputStream, str2);
                    i(bufferedOutputStream, m44Var.f6789d);
                    i(bufferedOutputStream, m44Var.f6790e);
                    i(bufferedOutputStream, m44Var.f6791f);
                    i(bufferedOutputStream, m44Var.f6792g);
                    List<p34> list = m44Var.f6793h;
                    if (list != null) {
                        g(bufferedOutputStream, list.size());
                        for (p34 p34Var : list) {
                            k(bufferedOutputStream, p34Var.a());
                            k(bufferedOutputStream, p34Var.b());
                        }
                    } else {
                        g(bufferedOutputStream, 0);
                    }
                    bufferedOutputStream.flush();
                    bufferedOutputStream.write(h34Var.f4730a);
                    bufferedOutputStream.close();
                    m44Var.f6786a = e10.length();
                    m(str, m44Var);
                    if (this.f8300b >= this.f8302d) {
                        if (f44.f3946b) {
                            f44.a("Pruning old cache entries.", new Object[0]);
                        }
                        long j11 = this.f8300b;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        Iterator<Map.Entry<String, m44>> it = this.f8299a.entrySet().iterator();
                        int i11 = 0;
                        while (it.hasNext()) {
                            m44 value = it.next().getValue();
                            if (e(value.f6787b).delete()) {
                                this.f8300b -= value.f6786a;
                            } else {
                                String str3 = value.f6787b;
                                f44.b("Could not delete cache entry for key=%s, filename=%s", str3, p(str3));
                            }
                            it.remove();
                            i11++;
                            if (((float) this.f8300b) < this.f8302d * 0.9f) {
                                break;
                            }
                        }
                        if (f44.f3946b) {
                            f44.a("pruned %d files, %d bytes, %d ms", Integer.valueOf(i11), Long.valueOf(this.f8300b - j11), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
                        }
                    }
                } catch (IOException e11) {
                    f44.b("%s", e11.toString());
                    bufferedOutputStream.close();
                    f44.b("Failed to write header for %s", e10.getAbsolutePath());
                    throw new IOException();
                }
            } catch (IOException unused) {
                if (!e10.delete()) {
                    f44.b("Could not clean up file %s", e10.getAbsolutePath());
                }
                if (!this.f8301c.zza().exists()) {
                    f44.b("Re-initializing cache after external clearing.", new Object[0]);
                    this.f8299a.clear();
                    this.f8300b = 0L;
                    b();
                }
            }
        }
    }

    @Override // ai.i34
    public final synchronized void b() {
        File zza = this.f8301c.zza();
        if (!zza.exists()) {
            if (zza.mkdirs()) {
                return;
            }
            f44.c("Unable to create cache dir %s", zza.getAbsolutePath());
            return;
        }
        File[] listFiles = zza.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file : listFiles) {
            try {
                long length = file.length();
                n44 n44Var = new n44(new BufferedInputStream(new FileInputStream(file)), length);
                try {
                    m44 a10 = m44.a(n44Var);
                    a10.f6786a = length;
                    m(a10.f6787b, a10);
                    n44Var.close();
                } catch (Throwable th2) {
                    n44Var.close();
                    throw th2;
                    break;
                }
            } catch (IOException unused) {
                file.delete();
            }
        }
    }

    @Override // ai.i34
    public final synchronized void c(String str, boolean z10) {
        h34 v10 = v(str);
        if (v10 != null) {
            v10.f4735f = 0L;
            v10.f4734e = 0L;
            a(str, v10);
        }
    }

    public final synchronized void d(String str) {
        boolean delete = e(str).delete();
        n(str);
        if (delete) {
            return;
        }
        f44.b("Could not delete cache entry for key=%s, filename=%s", str, p(str));
    }

    public final File e(String str) {
        return new File(this.f8301c.zza(), p(str));
    }

    public final void m(String str, m44 m44Var) {
        if (this.f8299a.containsKey(str)) {
            this.f8300b += m44Var.f6786a - this.f8299a.get(str).f6786a;
        } else {
            this.f8300b += m44Var.f6786a;
        }
        this.f8299a.put(str, m44Var);
    }

    public final void n(String str) {
        m44 remove = this.f8299a.remove(str);
        if (remove != null) {
            this.f8300b -= remove.f6786a;
        }
    }

    @Override // ai.i34
    public final synchronized h34 v(String str) {
        m44 m44Var = this.f8299a.get(str);
        if (m44Var == null) {
            return null;
        }
        File e10 = e(str);
        try {
            n44 n44Var = new n44(new BufferedInputStream(new FileInputStream(e10)), e10.length());
            try {
                m44 a10 = m44.a(n44Var);
                if (!TextUtils.equals(str, a10.f6787b)) {
                    f44.b("%s: key=%s, found=%s", e10.getAbsolutePath(), str, a10.f6787b);
                    n(str);
                    return null;
                }
                byte[] f10 = f(n44Var, n44Var.a());
                h34 h34Var = new h34();
                h34Var.f4730a = f10;
                h34Var.f4731b = m44Var.f6788c;
                h34Var.f4732c = m44Var.f6789d;
                h34Var.f4733d = m44Var.f6790e;
                h34Var.f4734e = m44Var.f6791f;
                h34Var.f4735f = m44Var.f6792g;
                List<p34> list = m44Var.f6793h;
                TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
                for (p34 p34Var : list) {
                    treeMap.put(p34Var.a(), p34Var.b());
                }
                h34Var.f4736g = treeMap;
                h34Var.f4737h = Collections.unmodifiableList(m44Var.f6793h);
                return h34Var;
            } finally {
                n44Var.close();
            }
        } catch (IOException e11) {
            f44.b("%s: %s", e10.getAbsolutePath(), e11.toString());
            d(str);
            return null;
        }
    }

    public p44(File file, int i10) {
        this.f8301c = new l44(this, file);
    }
}
