package ak;

import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Properties;

/* loaded from: classes3.dex */
public final class u3 {

    /* renamed from: h  reason: collision with root package name */
    public static final dk.f f13676h = new dk.f("SliceMetadataManager");

    /* renamed from: b  reason: collision with root package name */
    public final o0 f13678b;

    /* renamed from: c  reason: collision with root package name */
    public final String f13679c;

    /* renamed from: d  reason: collision with root package name */
    public final int f13680d;

    /* renamed from: e  reason: collision with root package name */
    public final long f13681e;

    /* renamed from: f  reason: collision with root package name */
    public final String f13682f;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f13677a = new byte[8192];

    /* renamed from: g  reason: collision with root package name */
    public int f13683g = -1;

    public u3(o0 o0Var, String str, int i10, long j10, String str2) {
        this.f13678b = o0Var;
        this.f13679c = str;
        this.f13680d = i10;
        this.f13681e = j10;
        this.f13682f = str2;
    }

    public final int a() throws IOException {
        File B = this.f13678b.B(this.f13679c, this.f13680d, this.f13681e, this.f13682f);
        if (B.exists()) {
            FileInputStream fileInputStream = new FileInputStream(B);
            try {
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                    return -1;
                }
                if (properties.getProperty("previousChunk") != null) {
                    return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
                }
                throw new p1("Slice checkpoint file corrupt.");
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
        return 0;
    }

    public final t3 b() throws IOException {
        File B = this.f13678b.B(this.f13679c, this.f13680d, this.f13681e, this.f13682f);
        if (B.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(B);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") != null && properties.getProperty("previousChunk") != null) {
                    try {
                        int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                        String property = properties.getProperty("fileName");
                        long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                        long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                        int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                        this.f13683g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                        return new v0(parseInt, property, parseLong, parseLong2, parseInt2);
                    } catch (NumberFormatException e10) {
                        throw new p1("Slice checkpoint file corrupt.", e10);
                    }
                }
                throw new p1("Slice checkpoint file corrupt.");
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        }
        throw new p1("Slice checkpoint file does not exist.");
    }

    public final File c() {
        return new File(n(), String.format("%s-NAM.dat", Integer.valueOf(this.f13683g)));
    }

    public final void d(InputStream inputStream, long j10) throws IOException {
        int read;
        RandomAccessFile randomAccessFile = new RandomAccessFile(c(), "rw");
        try {
            randomAccessFile.seek(j10);
            do {
                read = inputStream.read(this.f13677a);
                if (read > 0) {
                    randomAccessFile.write(this.f13677a, 0, read);
                }
            } while (read == 8192);
            randomAccessFile.close();
        } catch (Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
            throw th2;
        }
    }

    public final void e(long j10, byte[] bArr, int i10, int i11) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(c(), "rw");
        try {
            randomAccessFile.seek(j10);
            randomAccessFile.write(bArr, i10, i11);
            randomAccessFile.close();
        } catch (Throwable th2) {
            try {
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
            throw th2;
        }
    }

    public final void f(int i10) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(c().length()));
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f13683g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th2;
        }
    }

    public final void g(String str, long j10, long j11, int i10) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j10));
        properties.put("remainingBytes", String.valueOf(j11));
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f13683g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th2;
        }
    }

    public final void h(byte[] bArr, int i10) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f13683g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            File A = this.f13678b.A(this.f13679c, this.f13680d, this.f13681e, this.f13682f);
            if (A.exists()) {
                A.delete();
            }
            fileOutputStream = new FileOutputStream(A);
            try {
                fileOutputStream.write(bArr);
            } finally {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
            }
        } finally {
        }
    }

    public final void i(int i10) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f13683g));
        FileOutputStream fileOutputStream = new FileOutputStream(o());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th2;
        }
    }

    public final void j(byte[] bArr) throws IOException {
        this.f13683g++;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(n(), String.format("%s-LFH.dat", Integer.valueOf(this.f13683g))));
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (IOException e10) {
            throw new p1("Could not write metadata file.", e10);
        }
    }

    public final void k(byte[] bArr, InputStream inputStream) throws IOException {
        this.f13683g++;
        FileOutputStream fileOutputStream = new FileOutputStream(c());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.f13677a);
            while (read > 0) {
                fileOutputStream.write(this.f13677a, 0, read);
                read = inputStream.read(this.f13677a);
            }
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th2;
        }
    }

    public final void l(byte[] bArr, int i10, int i11) throws IOException {
        this.f13683g++;
        FileOutputStream fileOutputStream = new FileOutputStream(c());
        try {
            fileOutputStream.write(bArr, 0, i11);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th2;
        }
    }

    public final boolean m() {
        File B = this.f13678b.B(this.f13679c, this.f13680d, this.f13681e, this.f13682f);
        if (B.exists()) {
            try {
                FileInputStream fileInputStream = new FileInputStream(B);
                Properties properties = new Properties();
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") != null) {
                    return Integer.parseInt(properties.getProperty("fileStatus")) == 4;
                }
                f13676h.b("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
                return false;
            } catch (IOException e10) {
                f13676h.b("Could not read checkpoint while checking if extraction finished. %s", e10);
                return false;
            }
        }
        return false;
    }

    public final File n() {
        File C = this.f13678b.C(this.f13679c, this.f13680d, this.f13681e, this.f13682f);
        if (!C.exists()) {
            C.mkdirs();
        }
        return C;
    }

    public final File o() throws IOException {
        File B = this.f13678b.B(this.f13679c, this.f13680d, this.f13681e, this.f13682f);
        B.getParentFile().mkdirs();
        B.createNewFile();
        return B;
    }
}
