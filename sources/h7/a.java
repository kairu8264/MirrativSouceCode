package h7;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class a implements Closeable {
    public final int A;
    public long B;
    public final int C;
    public Writer E;
    public int G;

    /* renamed from: w  reason: collision with root package name */
    public final File f34560w;

    /* renamed from: x  reason: collision with root package name */
    public final File f34561x;

    /* renamed from: y  reason: collision with root package name */
    public final File f34562y;

    /* renamed from: z  reason: collision with root package name */
    public final File f34563z;
    public long D = 0;
    public final LinkedHashMap<String, d> F = new LinkedHashMap<>(0, 0.75f, true);
    public long H = 0;
    public final ThreadPoolExecutor I = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));
    public final Callable<Void> J = new CallableC0437a();

    /* renamed from: h7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class CallableC0437a implements Callable<Void> {
        public CallableC0437a() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public Void call() throws Exception {
            synchronized (a.this) {
                if (a.this.E == null) {
                    return null;
                }
                a.this.X();
                if (a.this.I()) {
                    a.this.P();
                    a.this.G = 0;
                }
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements ThreadFactory {
        public b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        public /* synthetic */ b(CallableC0437a callableC0437a) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public final class c {

        /* renamed from: a  reason: collision with root package name */
        public final d f34565a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean[] f34566b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f34567c;

        public /* synthetic */ c(a aVar, d dVar, CallableC0437a callableC0437a) {
            this(dVar);
        }

        public void a() throws IOException {
            a.this.q(this, false);
        }

        public void b() {
            if (this.f34567c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() throws IOException {
            a.this.q(this, true);
            this.f34567c = true;
        }

        public File f(int i10) throws IOException {
            File k10;
            synchronized (a.this) {
                if (this.f34565a.f34574f == this) {
                    if (!this.f34565a.f34573e) {
                        this.f34566b[i10] = true;
                    }
                    k10 = this.f34565a.k(i10);
                    a.this.f34560w.mkdirs();
                } else {
                    throw new IllegalStateException();
                }
            }
            return k10;
        }

        public c(d dVar) {
            this.f34565a = dVar;
            this.f34566b = dVar.f34573e ? null : new boolean[a.this.C];
        }
    }

    /* loaded from: classes.dex */
    public final class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f34569a;

        /* renamed from: b  reason: collision with root package name */
        public final long[] f34570b;

        /* renamed from: c  reason: collision with root package name */
        public File[] f34571c;

        /* renamed from: d  reason: collision with root package name */
        public File[] f34572d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f34573e;

        /* renamed from: f  reason: collision with root package name */
        public c f34574f;

        /* renamed from: g  reason: collision with root package name */
        public long f34575g;

        public /* synthetic */ d(a aVar, String str, CallableC0437a callableC0437a) {
            this(str);
        }

        public File j(int i10) {
            return this.f34571c[i10];
        }

        public File k(int i10) {
            return this.f34572d[i10];
        }

        public String l() throws IOException {
            long[] jArr;
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f34570b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        public final IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final void n(String[] strArr) throws IOException {
            if (strArr.length == a.this.C) {
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    try {
                        this.f34570b[i10] = Long.parseLong(strArr[i10]);
                    } catch (NumberFormatException unused) {
                        throw m(strArr);
                    }
                }
                return;
            }
            throw m(strArr);
        }

        public d(String str) {
            this.f34569a = str;
            this.f34570b = new long[a.this.C];
            this.f34571c = new File[a.this.C];
            this.f34572d = new File[a.this.C];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i10 = 0; i10 < a.this.C; i10++) {
                sb2.append(i10);
                this.f34571c[i10] = new File(a.this.f34560w, sb2.toString());
                sb2.append(".tmp");
                this.f34572d[i10] = new File(a.this.f34560w, sb2.toString());
                sb2.setLength(length);
            }
        }
    }

    /* loaded from: classes.dex */
    public final class e {

        /* renamed from: a  reason: collision with root package name */
        public final String f34577a;

        /* renamed from: b  reason: collision with root package name */
        public final long f34578b;

        /* renamed from: c  reason: collision with root package name */
        public final long[] f34579c;

        /* renamed from: d  reason: collision with root package name */
        public final File[] f34580d;

        public /* synthetic */ e(a aVar, String str, long j10, File[] fileArr, long[] jArr, CallableC0437a callableC0437a) {
            this(str, j10, fileArr, jArr);
        }

        public File a(int i10) {
            return this.f34580d[i10];
        }

        public e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f34577a = str;
            this.f34578b = j10;
            this.f34580d = fileArr;
            this.f34579c = jArr;
        }
    }

    public a(File file, int i10, int i11, long j10) {
        this.f34560w = file;
        this.A = i10;
        this.f34561x = new File(file, "journal");
        this.f34562y = new File(file, "journal.tmp");
        this.f34563z = new File(file, "journal.bkp");
        this.C = i11;
        this.B = j10;
    }

    @TargetApi(26)
    public static void F(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static a K(File file, int i10, int i11, long j10) throws IOException {
        if (j10 > 0) {
            if (i11 > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        U(file2, file3, false);
                    }
                }
                a aVar = new a(file, i10, i11, j10);
                if (aVar.f34561x.exists()) {
                    try {
                        aVar.N();
                        aVar.L();
                        return aVar;
                    } catch (IOException e10) {
                        PrintStream printStream = System.out;
                        printStream.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                        aVar.v();
                    }
                }
                file.mkdirs();
                a aVar2 = new a(file, i10, i11, j10);
                aVar2.P();
                return aVar2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void U(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            z(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    @TargetApi(26)
    public static void p(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void z(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public c C(String str) throws IOException {
        return E(str, -1L);
    }

    public final synchronized c E(String str, long j10) throws IOException {
        o();
        d dVar = this.F.get(str);
        if (j10 == -1 || (dVar != null && dVar.f34575g == j10)) {
            if (dVar != null) {
                if (dVar.f34574f != null) {
                    return null;
                }
            } else {
                dVar = new d(this, str, null);
                this.F.put(str, dVar);
            }
            c cVar = new c(this, dVar, null);
            dVar.f34574f = cVar;
            this.E.append((CharSequence) "DIRTY");
            this.E.append(' ');
            this.E.append((CharSequence) str);
            this.E.append('\n');
            F(this.E);
            return cVar;
        }
        return null;
    }

    public synchronized e G(String str) throws IOException {
        o();
        d dVar = this.F.get(str);
        if (dVar == null) {
            return null;
        }
        if (dVar.f34573e) {
            for (File file : dVar.f34571c) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.G++;
            this.E.append((CharSequence) "READ");
            this.E.append(' ');
            this.E.append((CharSequence) str);
            this.E.append('\n');
            if (I()) {
                this.I.submit(this.J);
            }
            return new e(this, str, dVar.f34575g, dVar.f34571c, dVar.f34570b, null);
        }
        return null;
    }

    public final boolean I() {
        int i10 = this.G;
        return i10 >= 2000 && i10 >= this.F.size();
    }

    public final void L() throws IOException {
        z(this.f34562y);
        Iterator<d> it = this.F.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i10 = 0;
            if (next.f34574f != null) {
                next.f34574f = null;
                while (i10 < this.C) {
                    z(next.j(i10));
                    z(next.k(i10));
                    i10++;
                }
                it.remove();
            } else {
                while (i10 < this.C) {
                    this.D += next.f34570b[i10];
                    i10++;
                }
            }
        }
    }

    public final void N() throws IOException {
        h7.b bVar = new h7.b(new FileInputStream(this.f34561x), h7.c.f34587a);
        try {
            String e10 = bVar.e();
            String e11 = bVar.e();
            String e12 = bVar.e();
            String e13 = bVar.e();
            String e14 = bVar.e();
            if (!"libcore.io.DiskLruCache".equals(e10) || !IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(e11) || !Integer.toString(this.A).equals(e12) || !Integer.toString(this.C).equals(e13) || !"".equals(e14)) {
                throw new IOException("unexpected journal header: [" + e10 + ", " + e11 + ", " + e13 + ", " + e14 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    O(bVar.e());
                    i10++;
                } catch (EOFException unused) {
                    this.G = i10 - this.F.size();
                    if (bVar.d()) {
                        P();
                    } else {
                        this.E = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f34561x, true), h7.c.f34587a));
                    }
                    h7.c.a(bVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            h7.c.a(bVar);
            throw th2;
        }
    }

    public final void O(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i10 = indexOf + 1;
            int indexOf2 = str.indexOf(32, i10);
            if (indexOf2 == -1) {
                substring = str.substring(i10);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.F.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i10, indexOf2);
            }
            d dVar = this.F.get(substring);
            if (dVar == null) {
                dVar = new d(this, substring, null);
                this.F.put(substring, dVar);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                dVar.f34573e = true;
                dVar.f34574f = null;
                dVar.n(split);
                return;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f34574f = new c(this, dVar, null);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            } else {
                throw new IOException("unexpected journal line: " + str);
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public final synchronized void P() throws IOException {
        Writer writer = this.E;
        if (writer != null) {
            p(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f34562y), h7.c.f34587a));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.A));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.C));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (d dVar : this.F.values()) {
            if (dVar.f34574f != null) {
                bufferedWriter.write("DIRTY " + dVar.f34569a + '\n');
            } else {
                bufferedWriter.write("CLEAN " + dVar.f34569a + dVar.l() + '\n');
            }
        }
        p(bufferedWriter);
        if (this.f34561x.exists()) {
            U(this.f34561x, this.f34563z, true);
        }
        U(this.f34562y, this.f34561x, false);
        this.f34563z.delete();
        this.E = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f34561x, true), h7.c.f34587a));
    }

    public synchronized boolean S(String str) throws IOException {
        o();
        d dVar = this.F.get(str);
        if (dVar != null && dVar.f34574f == null) {
            for (int i10 = 0; i10 < this.C; i10++) {
                File j10 = dVar.j(i10);
                if (j10.exists() && !j10.delete()) {
                    throw new IOException("failed to delete " + j10);
                }
                this.D -= dVar.f34570b[i10];
                dVar.f34570b[i10] = 0;
            }
            this.G++;
            this.E.append((CharSequence) "REMOVE");
            this.E.append(' ');
            this.E.append((CharSequence) str);
            this.E.append('\n');
            this.F.remove(str);
            if (I()) {
                this.I.submit(this.J);
            }
            return true;
        }
        return false;
    }

    public final void X() throws IOException {
        while (this.D > this.B) {
            S(this.F.entrySet().iterator().next().getKey());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.E == null) {
            return;
        }
        Iterator it = new ArrayList(this.F.values()).iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.f34574f != null) {
                dVar.f34574f.a();
            }
        }
        X();
        p(this.E);
        this.E = null;
    }

    public final void o() {
        if (this.E == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized void q(c cVar, boolean z10) throws IOException {
        d dVar = cVar.f34565a;
        if (dVar.f34574f == cVar) {
            if (z10 && !dVar.f34573e) {
                for (int i10 = 0; i10 < this.C; i10++) {
                    if (cVar.f34566b[i10]) {
                        if (!dVar.k(i10).exists()) {
                            cVar.a();
                            return;
                        }
                    } else {
                        cVar.a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                    }
                }
            }
            for (int i11 = 0; i11 < this.C; i11++) {
                File k10 = dVar.k(i11);
                if (z10) {
                    if (k10.exists()) {
                        File j10 = dVar.j(i11);
                        k10.renameTo(j10);
                        long j11 = dVar.f34570b[i11];
                        long length = j10.length();
                        dVar.f34570b[i11] = length;
                        this.D = (this.D - j11) + length;
                    }
                } else {
                    z(k10);
                }
            }
            this.G++;
            dVar.f34574f = null;
            if (dVar.f34573e | z10) {
                dVar.f34573e = true;
                this.E.append((CharSequence) "CLEAN");
                this.E.append(' ');
                this.E.append((CharSequence) dVar.f34569a);
                this.E.append((CharSequence) dVar.l());
                this.E.append('\n');
                if (z10) {
                    long j12 = this.H;
                    this.H = 1 + j12;
                    dVar.f34575g = j12;
                }
            } else {
                this.F.remove(dVar.f34569a);
                this.E.append((CharSequence) "REMOVE");
                this.E.append(' ');
                this.E.append((CharSequence) dVar.f34569a);
                this.E.append('\n');
            }
            F(this.E);
            if (this.D > this.B || I()) {
                this.I.submit(this.J);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public void v() throws IOException {
        close();
        h7.c.b(this.f34560w);
    }
}
