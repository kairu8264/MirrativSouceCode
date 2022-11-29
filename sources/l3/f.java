package l3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import n3.h;

/* loaded from: classes.dex */
public class f {

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f39534a;

        /* renamed from: b  reason: collision with root package name */
        public final b[] f39535b;

        @Deprecated
        public a(int i10, b[] bVarArr) {
            this.f39534a = i10;
            this.f39535b = bVarArr;
        }

        public static a a(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] b() {
            return this.f39535b;
        }

        public int c() {
            return this.f39534a;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Uri f39536a;

        /* renamed from: b  reason: collision with root package name */
        public final int f39537b;

        /* renamed from: c  reason: collision with root package name */
        public final int f39538c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f39539d;

        /* renamed from: e  reason: collision with root package name */
        public final int f39540e;

        @Deprecated
        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this.f39536a = (Uri) h.g(uri);
            this.f39537b = i10;
            this.f39538c = i11;
            this.f39539d = z10;
            this.f39540e = i12;
        }

        public static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f39540e;
        }

        public int c() {
            return this.f39537b;
        }

        public Uri d() {
            return this.f39536a;
        }

        public int e() {
            return this.f39538c;
        }

        public boolean f() {
            return this.f39539d;
        }
    }

    /* loaded from: classes.dex */
    public static class c {
        public void a(int i10) {
            throw null;
        }

        public void b(Typeface typeface) {
            throw null;
        }
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return f3.e.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, d dVar) throws PackageManager.NameNotFoundException {
        return l3.c.d(context, dVar, cancellationSignal);
    }

    public static Typeface c(Context context, d dVar, int i10, boolean z10, int i11, Handler handler, c cVar) {
        l3.a aVar = new l3.a(cVar, handler);
        if (z10) {
            return e.e(context, dVar, aVar, i10, i11);
        }
        return e.d(context, dVar, i10, null, aVar);
    }
}
