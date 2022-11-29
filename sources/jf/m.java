package jf;

import android.graphics.Paint;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final String f37941a;

    /* renamed from: b  reason: collision with root package name */
    public final int f37942b;

    /* renamed from: c  reason: collision with root package name */
    public final float f37943c;

    /* renamed from: d  reason: collision with root package name */
    public final float f37944d;

    /* renamed from: e  reason: collision with root package name */
    public final float f37945e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f37946f;

    public m(String str, int i10, float f10, float f11, float f12, boolean z10) {
        jo.p.h(str, "character");
        this.f37941a = str;
        this.f37942b = i10;
        this.f37943c = f10;
        this.f37944d = f11;
        this.f37945e = f12;
        this.f37946f = z10;
    }

    public final String a() {
        return this.f37941a;
    }

    public final float b(Paint paint) {
        jo.p.h(paint, "paint");
        return this.f37945e + paint.measureText(this.f37941a);
    }

    public final float c() {
        return this.f37945e;
    }

    public final boolean d() {
        return this.f37946f;
    }

    public final float e() {
        return this.f37943c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return jo.p.c(this.f37941a, mVar.f37941a) && this.f37942b == mVar.f37942b && jo.p.c(Float.valueOf(this.f37943c), Float.valueOf(mVar.f37943c)) && jo.p.c(Float.valueOf(this.f37944d), Float.valueOf(mVar.f37944d)) && jo.p.c(Float.valueOf(this.f37945e), Float.valueOf(mVar.f37945e)) && this.f37946f == mVar.f37946f;
        }
        return false;
    }

    public final boolean f() {
        return ((float) this.f37942b) == this.f37943c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((((((this.f37941a.hashCode() * 31) + Integer.hashCode(this.f37942b)) * 31) + Float.hashCode(this.f37943c)) * 31) + Float.hashCode(this.f37944d)) * 31) + Float.hashCode(this.f37945e)) * 31;
        boolean z10 = this.f37946f;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode + i10;
    }

    public String toString() {
        return this.f37941a + '[' + this.f37943c + "], x:" + this.f37945e + " r:" + this.f37946f;
    }

    public /* synthetic */ m(String str, int i10, float f10, float f11, float f12, boolean z10, int i11, jo.h hVar) {
        this(str, i10, f10, f11, f12, (i11 & 32) != 0 ? false : z10);
    }
}
