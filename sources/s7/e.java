package s7;

import android.util.Base64;
import com.bumptech.glide.load.data.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import s7.n;

/* loaded from: classes.dex */
public final class e<Model, Data> implements n<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final a<Data> f52225a;

    /* loaded from: classes.dex */
    public interface a<Data> {
        Class<Data> a();

        void b(Data data) throws IOException;

        Data c(String str) throws IllegalArgumentException;
    }

    /* loaded from: classes.dex */
    public static final class b<Data> implements com.bumptech.glide.load.data.d<Data> {

        /* renamed from: w  reason: collision with root package name */
        public final String f52226w;

        /* renamed from: x  reason: collision with root package name */
        public final a<Data> f52227x;

        /* renamed from: y  reason: collision with root package name */
        public Data f52228y;

        public b(String str, a<Data> aVar) {
            this.f52226w = str;
            this.f52227x = aVar;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<Data> a() {
            return this.f52227x.a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            try {
                this.f52227x.b(this.f52228y);
            } catch (IOException unused) {
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
        }

        @Override // com.bumptech.glide.load.data.d
        public m7.a d() {
            return m7.a.LOCAL;
        }

        /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, Data] */
        @Override // com.bumptech.glide.load.data.d
        public void f(com.bumptech.glide.h hVar, d.a<? super Data> aVar) {
            try {
                Data c10 = this.f52227x.c(this.f52226w);
                this.f52228y = c10;
                aVar.e(c10);
            } catch (IllegalArgumentException e10) {
                aVar.c(e10);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c<Model> implements o<Model, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final a<InputStream> f52229a = new a();

        /* loaded from: classes.dex */
        public class a implements a<InputStream> {
            public a() {
            }

            @Override // s7.e.a
            public Class<InputStream> a() {
                return InputStream.class;
            }

            @Override // s7.e.a
            /* renamed from: d */
            public void b(InputStream inputStream) throws IOException {
                inputStream.close();
            }

            @Override // s7.e.a
            /* renamed from: e */
            public InputStream c(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf != -1) {
                        if (str.substring(0, indexOf).endsWith(";base64")) {
                            return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                        }
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                    throw new IllegalArgumentException("Missing comma in data URL.");
                }
                throw new IllegalArgumentException("Not a valid image data URL.");
            }
        }

        @Override // s7.o
        public void a() {
        }

        @Override // s7.o
        public n<Model, InputStream> c(r rVar) {
            return new e(this.f52229a);
        }
    }

    public e(a<Data> aVar) {
        this.f52225a = aVar;
    }

    @Override // s7.n
    public boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }

    @Override // s7.n
    public n.a<Data> b(Model model, int i10, int i11, m7.h hVar) {
        return new n.a<>(new h8.d(model), new b(model.toString(), this.f52225a));
    }
}
