package b4;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public final e5.b f16964a;

    /* renamed from: b  reason: collision with root package name */
    public final char[] f16965b;

    /* renamed from: c  reason: collision with root package name */
    public final a f16966c = new a(1024);

    /* renamed from: d  reason: collision with root package name */
    public final Typeface f16967d;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<a> f16968a;

        /* renamed from: b  reason: collision with root package name */
        public b f16969b;

        public a() {
            this(1);
        }

        public a a(int i10) {
            SparseArray<a> sparseArray = this.f16968a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i10);
        }

        public final b b() {
            return this.f16969b;
        }

        public void c(b bVar, int i10, int i11) {
            a a10 = a(bVar.b(i10));
            if (a10 == null) {
                a10 = new a();
                this.f16968a.put(bVar.b(i10), a10);
            }
            if (i11 > i10) {
                a10.c(bVar, i10 + 1, i11);
            } else {
                a10.f16969b = bVar;
            }
        }

        public a(int i10) {
            this.f16968a = new SparseArray<>(i10);
        }
    }

    public g(Typeface typeface, e5.b bVar) {
        this.f16967d = typeface;
        this.f16964a = bVar;
        this.f16965b = new char[bVar.j() * 2];
        a(bVar);
    }

    public static g b(Typeface typeface, ByteBuffer byteBuffer) throws IOException {
        return new g(typeface, f.b(byteBuffer));
    }

    public final void a(e5.b bVar) {
        int j10 = bVar.j();
        for (int i10 = 0; i10 < j10; i10++) {
            b bVar2 = new b(this, i10);
            Character.toChars(bVar2.f(), this.f16965b, i10 * 2);
            h(bVar2);
        }
    }

    public char[] c() {
        return this.f16965b;
    }

    public e5.b d() {
        return this.f16964a;
    }

    public int e() {
        return this.f16964a.k();
    }

    public a f() {
        return this.f16966c;
    }

    public Typeface g() {
        return this.f16967d;
    }

    public void h(b bVar) {
        n3.h.h(bVar, "emoji metadata cannot be null");
        n3.h.b(bVar.c() > 0, "invalid metadata codepoint length");
        this.f16966c.c(bVar, 0, bVar.c() - 1);
    }
}
