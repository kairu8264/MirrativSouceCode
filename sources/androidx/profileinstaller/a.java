package androidx.profileinstaller;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;
import t4.c;
import t4.j;
import t4.k;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final AssetManager f15826a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f15827b;

    /* renamed from: c  reason: collision with root package name */
    public final b.c f15828c;

    /* renamed from: e  reason: collision with root package name */
    public final File f15830e;

    /* renamed from: f  reason: collision with root package name */
    public final String f15831f;

    /* renamed from: g  reason: collision with root package name */
    public final String f15832g;

    /* renamed from: h  reason: collision with root package name */
    public final String f15833h;

    /* renamed from: j  reason: collision with root package name */
    public t4.b[] f15835j;

    /* renamed from: k  reason: collision with root package name */
    public byte[] f15836k;

    /* renamed from: i  reason: collision with root package name */
    public boolean f15834i = false;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f15829d = c();

    public a(AssetManager assetManager, Executor executor, b.c cVar, String str, String str2, String str3, File file) {
        this.f15826a = assetManager;
        this.f15827b = executor;
        this.f15828c = cVar;
        this.f15831f = str;
        this.f15832g = str2;
        this.f15833h = str3;
        this.f15830e = file;
    }

    public static byte[] c() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24) {
            return null;
        }
        switch (i10) {
            case 24:
            case 25:
                return k.f53152e;
            case 26:
                return k.f53151d;
            case 27:
                return k.f53150c;
            case 28:
            case 29:
            case 30:
                return k.f53149b;
            case 31:
                return k.f53148a;
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(int i10, Object obj) {
        this.f15828c.a(i10, obj);
    }

    public static boolean g() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24) {
            return false;
        }
        return i10 == 24 || i10 == 25 || i10 == 31;
    }

    public final void b() {
        if (!this.f15834i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    public boolean d() {
        if (this.f15829d == null) {
            h(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        } else if (!this.f15830e.canWrite()) {
            h(4, null);
            return false;
        } else {
            this.f15834i = true;
            return true;
        }
    }

    public a f() {
        b();
        if (this.f15829d == null) {
            return this;
        }
        try {
            AssetFileDescriptor openFd = this.f15826a.openFd(this.f15832g);
            FileInputStream createInputStream = openFd.createInputStream();
            this.f15835j = j.w(createInputStream, j.o(createInputStream, j.f53146a), this.f15831f);
            if (createInputStream != null) {
                createInputStream.close();
            }
            openFd.close();
        } catch (FileNotFoundException e10) {
            this.f15828c.a(6, e10);
        } catch (IOException e11) {
            this.f15828c.a(7, e11);
        } catch (IllegalStateException e12) {
            this.f15828c.a(8, e12);
        }
        t4.b[] bVarArr = this.f15835j;
        if (bVarArr != null && g()) {
            try {
                AssetFileDescriptor openFd2 = this.f15826a.openFd(this.f15833h);
                try {
                    FileInputStream createInputStream2 = openFd2.createInputStream();
                    this.f15835j = j.q(createInputStream2, j.o(createInputStream2, j.f53147b), this.f15829d, bVarArr);
                    if (createInputStream2 != null) {
                        createInputStream2.close();
                    }
                    openFd2.close();
                    return this;
                } catch (Throwable th2) {
                    if (openFd2 != null) {
                        try {
                            openFd2.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (FileNotFoundException e13) {
                this.f15828c.a(9, e13);
            } catch (IOException e14) {
                this.f15828c.a(7, e14);
            } catch (IllegalStateException e15) {
                this.f15835j = null;
                this.f15828c.a(8, e15);
            }
        }
        return this;
    }

    public final void h(final int i10, final Object obj) {
        this.f15827b.execute(new Runnable() { // from class: t4.a
            @Override // java.lang.Runnable
            public final void run() {
                androidx.profileinstaller.a.this.e(i10, obj);
            }
        });
    }

    public a i() {
        ByteArrayOutputStream byteArrayOutputStream;
        t4.b[] bVarArr = this.f15835j;
        byte[] bArr = this.f15829d;
        if (bVarArr != null && bArr != null) {
            b();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e10) {
                this.f15828c.a(7, e10);
            } catch (IllegalStateException e11) {
                this.f15828c.a(8, e11);
            }
            try {
                j.E(byteArrayOutputStream, bArr);
                if (!j.B(byteArrayOutputStream, bArr, bVarArr)) {
                    this.f15828c.a(5, null);
                    this.f15835j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f15836k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f15835j = null;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return this;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [t4.b[], byte[]] */
    public boolean j() {
        byte[] bArr = this.f15836k;
        if (bArr == null) {
            return false;
        }
        b();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f15830e);
                    c.l(byteArrayInputStream, fileOutputStream);
                    h(1, null);
                    fileOutputStream.close();
                    byteArrayInputStream.close();
                    return true;
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (FileNotFoundException e10) {
                h(6, e10);
                return false;
            } catch (IOException e11) {
                h(7, e11);
                return false;
            }
        } finally {
            this.f15836k = null;
            this.f15835j = null;
        }
    }
}
