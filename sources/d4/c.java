package d4;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    public int f29153a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f29154b;

    /* renamed from: c  reason: collision with root package name */
    public int f29155c;

    /* renamed from: d  reason: collision with root package name */
    public int f29156d;

    /* renamed from: e  reason: collision with root package name */
    public d f29157e = d.a();

    public int a(int i10) {
        return i10 + this.f29154b.getInt(i10);
    }

    public int b(int i10) {
        if (i10 < this.f29156d) {
            return this.f29154b.getShort(this.f29155c + i10);
        }
        return 0;
    }

    public void c(int i10, ByteBuffer byteBuffer) {
        this.f29154b = byteBuffer;
        if (byteBuffer != null) {
            this.f29153a = i10;
            int i11 = i10 - byteBuffer.getInt(i10);
            this.f29155c = i11;
            this.f29156d = this.f29154b.getShort(i11);
            return;
        }
        this.f29153a = 0;
        this.f29155c = 0;
        this.f29156d = 0;
    }

    public int d(int i10) {
        int i11 = i10 + this.f29153a;
        return i11 + this.f29154b.getInt(i11) + 4;
    }

    public int e(int i10) {
        int i11 = i10 + this.f29153a;
        return this.f29154b.getInt(i11 + this.f29154b.getInt(i11));
    }
}
