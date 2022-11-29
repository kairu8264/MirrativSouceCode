package v7;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;

/* loaded from: classes.dex */
public class a<DataType> implements m7.j<DataType, BitmapDrawable> {

    /* renamed from: a  reason: collision with root package name */
    public final m7.j<DataType, Bitmap> f56826a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f56827b;

    public a(Resources resources, m7.j<DataType, Bitmap> jVar) {
        this.f56827b = (Resources) i8.j.d(resources);
        this.f56826a = (m7.j) i8.j.d(jVar);
    }

    @Override // m7.j
    public boolean a(DataType datatype, m7.h hVar) throws IOException {
        return this.f56826a.a(datatype, hVar);
    }

    @Override // m7.j
    public o7.u<BitmapDrawable> b(DataType datatype, int i10, int i11, m7.h hVar) throws IOException {
        return u.f(this.f56827b, this.f56826a.b(datatype, i10, i11, hVar));
    }
}
