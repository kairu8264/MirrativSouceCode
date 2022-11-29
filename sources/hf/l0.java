package hf;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes2.dex */
public final class l0 implements k0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f35557a;

    public l0(Context context) {
        jo.p.h(context, "context");
        this.f35557a = context;
    }

    @Override // hf.k0
    public Object a(String str, Bitmap bitmap, ao.d<? super File> dVar) {
        File file = new File(this.f35557a.getCacheDir(), str + ".png");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        return file;
    }
}
