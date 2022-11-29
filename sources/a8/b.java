package a8;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import i8.j;
import m7.h;
import o7.u;

/* loaded from: classes.dex */
public class b implements e<Bitmap, BitmapDrawable> {

    /* renamed from: a  reason: collision with root package name */
    public final Resources f639a;

    public b(Resources resources) {
        this.f639a = (Resources) j.d(resources);
    }

    @Override // a8.e
    public u<BitmapDrawable> a(u<Bitmap> uVar, h hVar) {
        return v7.u.f(this.f639a, uVar);
    }
}
