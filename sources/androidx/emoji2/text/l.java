package androidx.emoji2.text;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final d4.b f15115a;

    /* renamed from: b  reason: collision with root package name */
    public final char[] f15116b;

    /* renamed from: c  reason: collision with root package name */
    public final a f15117c = new a(1024);

    /* renamed from: d  reason: collision with root package name */
    public final Typeface f15118d;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final SparseArray<a> f15119a;

        /* renamed from: b  reason: collision with root package name */
        public f f15120b;

        public a() {
            this(1);
        }

        public a a(int i10) {
            SparseArray<a> sparseArray = this.f15119a;
            if (sparseArray == null) {
                return null;
            }
            return sparseArray.get(i10);
        }

        public final f b() {
            return this.f15120b;
        }

        public void c(f fVar, int i10, int i11) {
            a a10 = a(fVar.b(i10));
            if (a10 == null) {
                a10 = new a();
                this.f15119a.put(fVar.b(i10), a10);
            }
            if (i11 > i10) {
                a10.c(fVar, i10 + 1, i11);
            } else {
                a10.f15120b = fVar;
            }
        }

        public a(int i10) {
            this.f15119a = new SparseArray<>(i10);
        }
    }

    public l(Typeface typeface, d4.b bVar) {
        this.f15118d = typeface;
        this.f15115a = bVar;
        this.f15116b = new char[bVar.k() * 2];
        a(bVar);
    }

    public static l b(Typeface typeface, ByteBuffer byteBuffer) throws IOException {
        try {
            k3.j.a("EmojiCompat.MetadataRepo.create");
            return new l(typeface, k.b(byteBuffer));
        } finally {
            k3.j.b();
        }
    }

    public final void a(d4.b bVar) {
        int k10 = bVar.k();
        for (int i10 = 0; i10 < k10; i10++) {
            f fVar = new f(this, i10);
            Character.toChars(fVar.f(), this.f15116b, i10 * 2);
            h(fVar);
        }
    }

    public char[] c() {
        return this.f15116b;
    }

    public d4.b d() {
        return this.f15115a;
    }

    public int e() {
        return this.f15115a.l();
    }

    public a f() {
        return this.f15117c;
    }

    public Typeface g() {
        return this.f15118d;
    }

    public void h(f fVar) {
        n3.h.h(fVar, "emoji metadata cannot be null");
        n3.h.b(fVar.c() > 0, "invalid metadata codepoint length");
        this.f15117c.c(fVar, 0, fVar.c() - 1);
    }
}
