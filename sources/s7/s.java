package s7;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.InputStream;
import s7.n;

/* loaded from: classes.dex */
public class s<Data> implements n<Integer, Data> {

    /* renamed from: a  reason: collision with root package name */
    public final n<Uri, Data> f52286a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f52287b;

    /* loaded from: classes.dex */
    public static final class a implements o<Integer, AssetFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f52288a;

        public a(Resources resources) {
            this.f52288a = resources;
        }

        @Override // s7.o
        public void a() {
        }

        @Override // s7.o
        public n<Integer, AssetFileDescriptor> c(r rVar) {
            return new s(this.f52288a, rVar.d(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class b implements o<Integer, ParcelFileDescriptor> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f52289a;

        public b(Resources resources) {
            this.f52289a = resources;
        }

        @Override // s7.o
        public void a() {
        }

        @Override // s7.o
        public n<Integer, ParcelFileDescriptor> c(r rVar) {
            return new s(this.f52289a, rVar.d(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* loaded from: classes.dex */
    public static class c implements o<Integer, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f52290a;

        public c(Resources resources) {
            this.f52290a = resources;
        }

        @Override // s7.o
        public void a() {
        }

        @Override // s7.o
        public n<Integer, InputStream> c(r rVar) {
            return new s(this.f52290a, rVar.d(Uri.class, InputStream.class));
        }
    }

    /* loaded from: classes.dex */
    public static class d implements o<Integer, Uri> {

        /* renamed from: a  reason: collision with root package name */
        public final Resources f52291a;

        public d(Resources resources) {
            this.f52291a = resources;
        }

        @Override // s7.o
        public void a() {
        }

        @Override // s7.o
        public n<Integer, Uri> c(r rVar) {
            return new s(this.f52291a, v.c());
        }
    }

    public s(Resources resources, n<Uri, Data> nVar) {
        this.f52287b = resources;
        this.f52286a = nVar;
    }

    @Override // s7.n
    /* renamed from: c */
    public n.a<Data> b(Integer num, int i10, int i11, m7.h hVar) {
        Uri d10 = d(num);
        if (d10 == null) {
            return null;
        }
        return this.f52286a.b(d10, i10, i11, hVar);
    }

    public final Uri d(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.f52287b.getResourcePackageName(num.intValue()) + '/' + this.f52287b.getResourceTypeName(num.intValue()) + '/' + this.f52287b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e10) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e10);
                return null;
            }
            return null;
        }
    }

    @Override // s7.n
    /* renamed from: e */
    public boolean a(Integer num) {
        return true;
    }
}
