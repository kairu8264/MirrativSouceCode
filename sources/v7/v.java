package v7;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* loaded from: classes.dex */
public final class v implements m7.j<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a  reason: collision with root package name */
    public final m f56905a;

    public v(m mVar) {
        this.f56905a = mVar;
    }

    @Override // m7.j
    /* renamed from: c */
    public o7.u<Bitmap> b(ParcelFileDescriptor parcelFileDescriptor, int i10, int i11, m7.h hVar) throws IOException {
        return this.f56905a.d(parcelFileDescriptor, i10, i11, hVar);
    }

    @Override // m7.j
    /* renamed from: d */
    public boolean a(ParcelFileDescriptor parcelFileDescriptor, m7.h hVar) {
        return this.f56905a.o(parcelFileDescriptor);
    }
}
