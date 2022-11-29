package s7;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.data.d;
import java.io.File;
import java.io.FileNotFoundException;
import s7.n;

/* loaded from: classes.dex */
public final class k implements n<Uri, File> {

    /* renamed from: a  reason: collision with root package name */
    public final Context f52253a;

    /* loaded from: classes.dex */
    public static final class a implements o<Uri, File> {

        /* renamed from: a  reason: collision with root package name */
        public final Context f52254a;

        public a(Context context) {
            this.f52254a = context;
        }

        @Override // s7.o
        public void a() {
        }

        @Override // s7.o
        public n<Uri, File> c(r rVar) {
            return new k(this.f52254a);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements com.bumptech.glide.load.data.d<File> {

        /* renamed from: y  reason: collision with root package name */
        public static final String[] f52255y = {"_data"};

        /* renamed from: w  reason: collision with root package name */
        public final Context f52256w;

        /* renamed from: x  reason: collision with root package name */
        public final Uri f52257x;

        public b(Context context, Uri uri) {
            this.f52256w = context;
            this.f52257x = uri;
        }

        @Override // com.bumptech.glide.load.data.d
        public Class<File> a() {
            return File.class;
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
        public void f(com.bumptech.glide.h hVar, d.a<? super File> aVar) {
            Cursor query = this.f52256w.getContentResolver().query(this.f52257x, f52255y, null, null, null);
            if (query != null) {
                try {
                    r0 = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow("_data")) : null;
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(r0)) {
                aVar.c(new FileNotFoundException("Failed to find file path for: " + this.f52257x));
                return;
            }
            aVar.e(new File(r0));
        }
    }

    public k(Context context) {
        this.f52253a = context;
    }

    @Override // s7.n
    /* renamed from: c */
    public n.a<File> b(Uri uri, int i10, int i11, m7.h hVar) {
        return new n.a<>(new h8.d(uri), new b(this.f52253a, uri));
    }

    @Override // s7.n
    /* renamed from: d */
    public boolean a(Uri uri) {
        return n7.b.b(uri);
    }
}
