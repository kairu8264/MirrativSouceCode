package s7;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;
import s7.n;

/* loaded from: classes.dex */
public class u<Data> implements n<String, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final n<Uri, Data> f52293a;

    /* loaded from: classes.dex */
    public static final class a implements o<String, AssetFileDescriptor> {
        @Override // s7.o
        public void a() {
        }

        @Override // s7.o
        public n<String, AssetFileDescriptor> c(r rVar) {
            return new u(rVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class b implements o<String, ParcelFileDescriptor> {
        @Override // s7.o
        public void a() {
        }

        @Override // s7.o
        public n<String, ParcelFileDescriptor> c(r rVar) {
            return new u(rVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class c implements o<String, InputStream> {
        @Override // s7.o
        public void a() {
        }

        @Override // s7.o
        public n<String, InputStream> c(r rVar) {
            return new u(rVar.d(Uri.class, InputStream.class));
        }
    }

    public u(n<Uri, Data> nVar) {
        this.f52293a = nVar;
    }

    public static Uri e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            return f(str);
        }
        Uri parse = Uri.parse(str);
        return parse.getScheme() == null ? f(str) : parse;
    }

    public static Uri f(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // s7.n
    /* renamed from: c */
    public n.a<Data> b(String str, int i10, int i11, m7.h hVar) {
        Uri e10 = e(str);
        if (e10 == null || !this.f52293a.a(e10)) {
            return null;
        }
        return this.f52293a.b(e10, i10, i11, hVar);
    }

    @Override // s7.n
    /* renamed from: d */
    public boolean a(String str) {
        return true;
    }
}
