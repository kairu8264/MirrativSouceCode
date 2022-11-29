package com.dena.showroom.flvplayback;

/* loaded from: classes3.dex */
public class Size {

    /* renamed from: a  reason: collision with root package name */
    public final int f26417a;

    /* renamed from: b  reason: collision with root package name */
    public final int f26418b;

    public Size(int i10, int i11) {
        this.f26417a = i10;
        this.f26418b = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Size size = (Size) obj;
        return this.f26417a == size.f26417a && this.f26418b == size.f26418b;
    }

    public double getAspectRatio() {
        return this.f26417a / this.f26418b;
    }

    public int getHeight() {
        return this.f26418b;
    }

    public int getWidth() {
        return this.f26417a;
    }

    public int hashCode() {
        return (this.f26417a * 31) + this.f26418b;
    }

    public String toString() {
        return "Size{width=" + this.f26417a + ", height=" + this.f26418b + '}';
    }
}
