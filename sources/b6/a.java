package b6;

import android.os.StatFs;
import java.io.Closeable;
import java.io.File;
import po.n;
import rp.i;
import rp.y;
import uo.g1;
import uo.k0;

/* loaded from: classes.dex */
public interface a {

    /* renamed from: b6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0101a {

        /* renamed from: a  reason: collision with root package name */
        public y f16976a;

        /* renamed from: f  reason: collision with root package name */
        public long f16981f;

        /* renamed from: b  reason: collision with root package name */
        public i f16977b = i.f51697b;

        /* renamed from: c  reason: collision with root package name */
        public double f16978c = 0.02d;

        /* renamed from: d  reason: collision with root package name */
        public long f16979d = 10485760;

        /* renamed from: e  reason: collision with root package name */
        public long f16980e = 262144000;

        /* renamed from: g  reason: collision with root package name */
        public k0 f16982g = g1.b();

        public final a a() {
            long j10;
            y yVar = this.f16976a;
            if (yVar != null) {
                if (this.f16978c > 0.0d) {
                    try {
                        StatFs statFs = new StatFs(yVar.r().getAbsolutePath());
                        j10 = n.o((long) (this.f16978c * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), this.f16979d, this.f16980e);
                    } catch (Exception unused) {
                        j10 = this.f16979d;
                    }
                } else {
                    j10 = this.f16981f;
                }
                return new d(j10, yVar, this.f16977b, this.f16982g);
            }
            throw new IllegalStateException("directory == null".toString());
        }

        public final C0101a b(File file) {
            return c(y.a.d(y.f51736x, file, false, 1, null));
        }

        public final C0101a c(y yVar) {
            this.f16976a = yVar;
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        y f();

        c g();

        y getMetadata();

        void h();
    }

    /* loaded from: classes.dex */
    public interface c extends Closeable {
        y f();

        y getMetadata();

        b s1();
    }

    c a(String str);

    i b();

    b c(String str);
}
