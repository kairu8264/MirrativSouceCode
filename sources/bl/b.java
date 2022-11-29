package bl;

import com.google.android.exoplayer2.C;
import fl.f;
import java.io.File;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: c  reason: collision with root package name */
    public static final C0128b f18496c = new C0128b();

    /* renamed from: a  reason: collision with root package name */
    public final f f18497a;

    /* renamed from: b  reason: collision with root package name */
    public bl.a f18498b;

    /* renamed from: bl.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0128b implements bl.a {
        public C0128b() {
        }

        @Override // bl.a
        public void a() {
        }

        @Override // bl.a
        public String b() {
            return null;
        }

        @Override // bl.a
        public byte[] c() {
            return null;
        }

        @Override // bl.a
        public void d() {
        }

        @Override // bl.a
        public void e(long j10, String str) {
        }
    }

    public b(f fVar) {
        this.f18497a = fVar;
        this.f18498b = f18496c;
    }

    public void a() {
        this.f18498b.d();
    }

    public byte[] b() {
        return this.f18498b.c();
    }

    public String c() {
        return this.f18498b.b();
    }

    public final File d(String str) {
        return this.f18497a.n(str, "userlog");
    }

    public final void e(String str) {
        this.f18498b.a();
        this.f18498b = f18496c;
        if (str == null) {
            return;
        }
        f(d(str), C.DEFAULT_BUFFER_SEGMENT_SIZE);
    }

    public void f(File file, int i10) {
        this.f18498b = new d(file, i10);
    }

    public void g(long j10, String str) {
        this.f18498b.e(j10, str);
    }

    public b(f fVar, String str) {
        this(fVar);
        e(str);
    }
}
