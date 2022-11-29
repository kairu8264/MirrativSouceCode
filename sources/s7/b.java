package s7;

import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import s7.n;

/* loaded from: classes.dex */
public class b<Data> implements n<byte[], Data> {

    /* renamed from: a  reason: collision with root package name */
    public final InterfaceC0799b<Data> f52219a;

    /* loaded from: classes.dex */
    public static class a implements o<byte[], ByteBuffer> {

        /* renamed from: s7.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0798a implements InterfaceC0799b<ByteBuffer> {
            public C0798a() {
            }

            @Override // s7.b.InterfaceC0799b
            public Class<ByteBuffer> a() {
                return ByteBuffer.class;
            }

            @Override // s7.b.InterfaceC0799b
            /* renamed from: c */
            public ByteBuffer b(byte[] bArr) {
                return ByteBuffer.wrap(bArr);
            }
        }

        @Override // s7.o
        public void a() {
        }

        @Override // s7.o
        public n<byte[], ByteBuffer> c(r rVar) {
            return new b(new C0798a());
        }
    }

    /* renamed from: s7.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public interface InterfaceC0799b<Data> {
        Class<Data> a();

        Data b(byte[] bArr);
    }

    /* loaded from: classes.dex */
    public static class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: w  reason: collision with root package name */
        public final byte[] f52221w;

        /* renamed from: x  reason: collision with root package name */
        public final InterfaceC0799b<Data> f52222x;

        public c(byte[] bArr, InterfaceC0799b<Data> interfaceC0799b) {
            this.f52221w = bArr;
            this.f52222x = interfaceC0799b;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f52222x.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public m7.a d() {
            return m7.a.LOCAL;
        }

        @Override // com.bumptech.glide.load.data.d
        public void f(com.bumptech.glide.h hVar, d.a<? super Data> aVar) {
            aVar.e((Data) this.f52222x.b(this.f52221w));
        }
    }

    /* loaded from: classes.dex */
    public static class d implements o<byte[], InputStream> {

        /* loaded from: classes.dex */
        public class a implements InterfaceC0799b<InputStream> {
            public a() {
            }

            @Override // s7.b.InterfaceC0799b
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // s7.b.InterfaceC0799b
            /* renamed from: c */
            public InputStream b(byte[] bArr) {
                return new ByteArrayInputStream(bArr);
            }
        }

        @Override // s7.o
        public void a() {
        }

        @Override // s7.o
        public n<byte[], InputStream> c(r rVar) {
            return new b(new a());
        }
    }

    public b(InterfaceC0799b<Data> interfaceC0799b) {
        this.f52219a = interfaceC0799b;
    }

    @Override // s7.n
    /* renamed from: c */
    public n.a<Data> b(byte[] bArr, int i10, int i11, m7.h hVar) {
        return new n.a<>(new h8.d(bArr), new c(bArr, this.f52219a));
    }

    @Override // s7.n
    /* renamed from: d */
    public boolean a(byte[] bArr) {
        return true;
    }
}
