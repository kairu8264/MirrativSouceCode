package ai;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class ee extends zd {

    /* renamed from: b  reason: collision with root package name */
    public final ce f3615b = new ce();

    /* renamed from: c  reason: collision with root package name */
    public ByteBuffer f3616c;

    /* renamed from: d  reason: collision with root package name */
    public long f3617d;

    public ee(int i10) {
    }

    @Override // ai.zd
    public final void a() {
        super.a();
        ByteBuffer byteBuffer = this.f3616c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final void h(int i10) throws IllegalStateException {
        ByteBuffer byteBuffer = this.f3616c;
        if (byteBuffer == null) {
            this.f3616c = j(i10);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.f3616c.position();
        int i11 = i10 + position;
        if (capacity >= i11) {
            return;
        }
        ByteBuffer j10 = j(i11);
        if (position > 0) {
            this.f3616c.position(0);
            this.f3616c.limit(position);
            j10.put(this.f3616c);
        }
        this.f3616c = j10;
    }

    public final boolean i() {
        return g(1073741824);
    }

    public final ByteBuffer j(int i10) {
        ByteBuffer byteBuffer = this.f3616c;
        int capacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb2 = new StringBuilder(44);
        sb2.append("Buffer too small (");
        sb2.append(capacity);
        sb2.append(" < ");
        sb2.append(i10);
        sb2.append(")");
        throw new IllegalStateException(sb2.toString());
    }
}
