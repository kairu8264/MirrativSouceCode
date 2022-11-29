package s7;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import s7.n;

/* loaded from: classes.dex */
public class f<Data> implements n<File, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final d<Data> f52231a;

    /* loaded from: classes.dex */
    public static class a<Data> implements o<File, Data> {

        /* renamed from: a  reason: collision with root package name */
        public final d<Data> f52232a;

        public a(d<Data> dVar) {
            this.f52232a = dVar;
        }

        @Override // s7.o
        public final void a() {
        }

        @Override // s7.o
        public final n<File, Data> c(r rVar) {
            return new f(this.f52232a);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends a<ParcelFileDescriptor> {

        /* loaded from: classes.dex */
        public class a implements d<ParcelFileDescriptor> {
            @Override // s7.f.d
            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }

            @Override // s7.f.d
            /* renamed from: d */
            public void b(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
                parcelFileDescriptor.close();
            }

            @Override // s7.f.d
            /* renamed from: e */
            public ParcelFileDescriptor c(File file) throws FileNotFoundException {
                return ParcelFileDescriptor.open(file, 268435456);
            }
        }

        public b() {
            super(new a());
        }
    }

    /* loaded from: classes.dex */
    public static final class c<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: w  reason: collision with root package name */
        public final File f52233w;

        /* renamed from: x  reason: collision with root package name */
        public final d<Data> f52234x;

        /* renamed from: y  reason: collision with root package name */
        public Data f52235y;

        public c(File file, d<Data> dVar) {
            this.f52233w = file;
            this.f52234x = dVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f52234x.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            Data data = this.f52235y;
            if (data != null) {
                try {
                    this.f52234x.b(data);
                } catch (IOException unused) {
                }
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public m7.a d() {
            return m7.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, Data] */
        @Override // com.bumptech.glide.load.data.d
        public void f(com.bumptech.glide.h hVar, d.a<? super Data> aVar) {
            try {
                Data c10 = this.f52234x.c(this.f52233w);
                this.f52235y = c10;
                aVar.e(c10);
            } catch (FileNotFoundException e10) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e10);
                }
                aVar.c(e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(File file) throws FileNotFoundException;
    }

    /* loaded from: classes.dex */
    public static class e extends a<InputStream> {

        /* loaded from: classes.dex */
        public class a implements d<InputStream> {
            @Override // s7.f.d
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // s7.f.d
            /* renamed from: d */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // s7.f.d
            /* renamed from: e */
            public InputStream c(File file) throws FileNotFoundException {
                return new FileInputStream(file);
            }
        }

        public e() {
            super(new a());
        }
    }

    public f(d<Data> dVar) {
        this.f52231a = dVar;
    }

    @Override // s7.n
    /* renamed from: c */
    public n.a<Data> b(File file, int i10, int i11, m7.h hVar) {
        return new n.a<>(new h8.d(file), new c(file, this.f52231a));
    }

    @Override // s7.n
    /* renamed from: d */
    public boolean a(File file) {
        return true;
    }
}
