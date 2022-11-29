package s7;

import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import s7.n;

/* loaded from: classes.dex */
public class d implements n<File, ByteBuffer> {

    /* loaded from: classes.dex */
    public static final class a implements com.bumptech.glide.load.data.d<ByteBuffer> {

        /* renamed from: w  reason: collision with root package name */
        public final File f52224w;

        public a(File file) {
            this.f52224w = file;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<ByteBuffer> a() {
            return ByteBuffer.class;
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
        public void f(com.bumptech.glide.h hVar, d.a<? super ByteBuffer> aVar) {
            try {
                aVar.e(i8.a.a(this.f52224w));
            } catch (IOException e10) {
                if (Log.isLoggable("ByteBufferFileLoader", 3)) {
                    Log.d("ByteBufferFileLoader", "Failed to obtain ByteBuffer for file", e10);
                }
                aVar.c(e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements o<File, ByteBuffer> {
        @Override // s7.o
        public void a() {
        }

        @Override // s7.o
        public n<File, ByteBuffer> c(r rVar) {
            return new d();
        }
    }

    @Override // s7.n
    /* renamed from: c */
    public n.a<ByteBuffer> b(File file, int i10, int i11, m7.h hVar) {
        return new n.a<>(new h8.d(file), new a(file));
    }

    @Override // s7.n
    /* renamed from: d */
    public boolean a(File file) {
        return true;
    }
}
