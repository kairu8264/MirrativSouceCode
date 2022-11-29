package b4;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* loaded from: classes.dex */
public class b {

    /* renamed from: d  reason: collision with root package name */
    public static final ThreadLocal<e5.a> f16926d = new ThreadLocal<>();

    /* renamed from: a  reason: collision with root package name */
    public final int f16927a;

    /* renamed from: b  reason: collision with root package name */
    public final g f16928b;

    /* renamed from: c  reason: collision with root package name */
    public volatile int f16929c = 0;

    public b(g gVar, int i10) {
        this.f16928b = gVar;
        this.f16927a = i10;
    }

    public void a(Canvas canvas, float f10, float f11, Paint paint) {
        Typeface g10 = this.f16928b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g10);
        canvas.drawText(this.f16928b.c(), this.f16927a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i10) {
        return g().g(i10);
    }

    public int c() {
        return g().h();
    }

    public int d() {
        return this.f16929c;
    }

    public short e() {
        return g().j();
    }

    public int f() {
        return g().k();
    }

    public final e5.a g() {
        ThreadLocal<e5.a> threadLocal = f16926d;
        e5.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new e5.a();
            threadLocal.set(aVar);
        }
        this.f16928b.d().i(aVar, this.f16927a);
        return aVar;
    }

    public short h() {
        return g().l();
    }

    public short i() {
        return g().m();
    }

    public boolean j() {
        return g().i();
    }

    public void k(boolean z10) {
        this.f16929c = z10 ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(f()));
        sb2.append(", codepoints:");
        int c10 = c();
        for (int i10 = 0; i10 < c10; i10++) {
            sb2.append(Integer.toHexString(b(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
