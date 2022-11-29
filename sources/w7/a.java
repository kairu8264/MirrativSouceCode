package w7;

import com.bumptech.glide.load.data.e;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class a implements e<ByteBuffer> {

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f58213a;

    /* renamed from: w7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0956a implements e.a<ByteBuffer> {
        @Override // com.bumptech.glide.load.data.e.a
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        /* renamed from: c */
        public e<ByteBuffer> b(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }
    }

    public a(ByteBuffer byteBuffer) {
        this.f58213a = byteBuffer;
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.e
    /* renamed from: c */
    public ByteBuffer a() {
        this.f58213a.position(0);
        return this.f58213a;
    }
}
