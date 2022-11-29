package d6;

import a6.r;
import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import d6.h;
import j6.m;
import java.io.InputStream;
import java.util.List;
import jo.p;
import k6.b;
import rp.t;

/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: a  reason: collision with root package name */
    public final Uri f29200a;

    /* renamed from: b  reason: collision with root package name */
    public final m f29201b;

    /* loaded from: classes.dex */
    public static final class a implements h.a<Uri> {
        @Override // d6.h.a
        /* renamed from: b */
        public h a(Uri uri, m mVar, x5.e eVar) {
            if (c(uri)) {
                return new d(uri, mVar);
            }
            return null;
        }

        public final boolean c(Uri uri) {
            return p.c(uri.getScheme(), "content");
        }
    }

    public d(Uri uri, m mVar) {
        this.f29200a = uri;
        this.f29201b = mVar;
    }

    @Override // d6.h
    public Object a(ao.d<? super g> dVar) {
        InputStream openInputStream;
        ContentResolver contentResolver = this.f29201b.g().getContentResolver();
        if (b(this.f29200a)) {
            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(this.f29200a, TopicConstant.EXTEND_AAC_RAW);
            openInputStream = openAssetFileDescriptor != null ? openAssetFileDescriptor.createInputStream() : null;
            if (openInputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + this.f29200a + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT >= 29 && c(this.f29200a)) {
            AssetFileDescriptor openTypedAssetFile = contentResolver.openTypedAssetFile(this.f29200a, "image/*", d(), null);
            openInputStream = openTypedAssetFile != null ? openTypedAssetFile.createInputStream() : null;
            if (openInputStream == null) {
                throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + this.f29200a + "'.").toString());
            }
        } else {
            openInputStream = contentResolver.openInputStream(this.f29200a);
            if (openInputStream == null) {
                throw new IllegalStateException(("Unable to open '" + this.f29200a + "'.").toString());
            }
        }
        return new l(r.b(t.c(t.j(openInputStream)), this.f29201b.g(), new a6.c(this.f29200a)), contentResolver.getType(this.f29200a), a6.d.DISK);
    }

    public final boolean b(Uri uri) {
        return p.c(uri.getAuthority(), "com.android.contacts") && p.c(uri.getLastPathSegment(), "display_photo");
    }

    public final boolean c(Uri uri) {
        List<String> pathSegments;
        int size;
        return p.c(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && p.c(pathSegments.get(size + (-3)), "audio") && p.c(pathSegments.get(size + (-2)), "albums");
    }

    public final Bundle d() {
        k6.b b10 = this.f29201b.o().b();
        b.C0535b c0535b = b10 instanceof b.C0535b ? (b.C0535b) b10 : null;
        Integer valueOf = c0535b == null ? null : Integer.valueOf(c0535b.f38438a);
        if (valueOf == null) {
            return null;
        }
        int intValue = valueOf.intValue();
        k6.b a10 = this.f29201b.o().a();
        b.C0535b c0535b2 = a10 instanceof b.C0535b ? (b.C0535b) a10 : null;
        Integer valueOf2 = c0535b2 == null ? null : Integer.valueOf(c0535b2.f38438a);
        if (valueOf2 == null) {
            return null;
        }
        int intValue2 = valueOf2.intValue();
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("android.content.extra.SIZE", new Point(intValue, intValue2));
        return bundle;
    }
}
