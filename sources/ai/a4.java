package ai;

import com.google.android.gms.internal.ads.zzae;
import java.nio.ByteBuffer;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* loaded from: classes3.dex */
public class a4 extends t64 {

    /* renamed from: b  reason: collision with root package name */
    public final a1 f1722b = new a1();

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer f1723c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f1724d;

    /* renamed from: e  reason: collision with root package name */
    public long f1725e;

    /* renamed from: f  reason: collision with root package name */
    public ByteBuffer f1726f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1727g;

    public a4(int i10, int i11) {
        this.f1727g = i10;
    }

    @Override // ai.t64
    public void a() {
        super.a();
        ByteBuffer byteBuffer = this.f1723c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f1726f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f1724d = false;
    }

    @EnsuresNonNull({"data"})
    public final void i(int i10) {
        ByteBuffer byteBuffer = this.f1723c;
        if (byteBuffer == null) {
            this.f1723c = l(i10);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i11 = i10 + position;
        if (capacity >= i11) {
            this.f1723c = byteBuffer;
            return;
        }
        ByteBuffer l10 = l(i11);
        l10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            l10.put(byteBuffer);
        }
        this.f1723c = l10;
    }

    public final boolean j() {
        return h(1073741824);
    }

    public final void k() {
        ByteBuffer byteBuffer = this.f1723c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f1726f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    public final ByteBuffer l(int i10) {
        int i11 = this.f1727g;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f1723c;
        throw new zzae(byteBuffer == null ? 0 : byteBuffer.capacity(), i10);
    }
}
