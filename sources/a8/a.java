package a8;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;
import m7.h;
import o7.u;

/* loaded from: classes.dex */
public class a implements e<Bitmap, byte[]> {

    /* renamed from: a  reason: collision with root package name */
    public final Bitmap.CompressFormat f637a;

    /* renamed from: b  reason: collision with root package name */
    public final int f638b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // a8.e
    public u<byte[]> a(u<Bitmap> uVar, h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        uVar.get().compress(this.f637a, this.f638b, byteArrayOutputStream);
        uVar.c();
        return new w7.b(byteArrayOutputStream.toByteArray());
    }

    public a(Bitmap.CompressFormat compressFormat, int i10) {
        this.f637a = compressFormat;
        this.f638b = i10;
    }
}
