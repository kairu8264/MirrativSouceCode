package ai;

import com.google.android.exoplayer2.C;
import com.google.android.gms.internal.ads.zzaaw;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class z1 {

    /* renamed from: a  reason: collision with root package name */
    public final r0 f12806a;

    /* renamed from: b  reason: collision with root package name */
    public final String f12807b;

    /* renamed from: c  reason: collision with root package name */
    public final String f12808c;

    /* renamed from: e  reason: collision with root package name */
    public final Class<?>[] f12810e;

    /* renamed from: d  reason: collision with root package name */
    public volatile Method f12809d = null;

    /* renamed from: f  reason: collision with root package name */
    public final CountDownLatch f12811f = new CountDownLatch(1);

    public z1(r0 r0Var, String str, String str2, Class<?>... clsArr) {
        this.f12806a = r0Var;
        this.f12807b = str;
        this.f12808c = str2;
        this.f12810e = clsArr;
        r0Var.e().submit(new y1(this));
    }

    public static /* synthetic */ void a(z1 z1Var) {
        CountDownLatch countDownLatch;
        Class loadClass;
        try {
            loadClass = z1Var.f12806a.f().loadClass(z1Var.c(z1Var.f12806a.h(), z1Var.f12807b));
        } catch (zzaaw | UnsupportedEncodingException | ClassNotFoundException | NoSuchMethodException unused) {
        } catch (NullPointerException unused2) {
            countDownLatch = z1Var.f12811f;
        } catch (Throwable th2) {
            z1Var.f12811f.countDown();
            throw th2;
        }
        if (loadClass == null) {
            countDownLatch = z1Var.f12811f;
        } else {
            z1Var.f12809d = loadClass.getMethod(z1Var.c(z1Var.f12806a.h(), z1Var.f12808c), z1Var.f12810e);
            if (z1Var.f12809d == null) {
                countDownLatch = z1Var.f12811f;
            }
            countDownLatch = z1Var.f12811f;
        }
        countDownLatch.countDown();
    }

    public final Method b() {
        if (this.f12809d != null) {
            return this.f12809d;
        }
        try {
            if (this.f12811f.await(2L, TimeUnit.SECONDS)) {
                return this.f12809d;
            }
            return null;
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public final String c(byte[] bArr, String str) throws zzaaw, UnsupportedEncodingException {
        return new String(this.f12806a.g().b(bArr, str), C.UTF8_NAME);
    }
}
