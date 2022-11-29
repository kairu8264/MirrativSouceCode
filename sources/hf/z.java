package hf;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;

/* loaded from: classes2.dex */
public final class z implements y {

    /* renamed from: a  reason: collision with root package name */
    public final Context f35629a;

    public z(Context context) {
        jo.p.h(context, "context");
        this.f35629a = context;
    }

    @Override // hf.y
    public Uri a(File file) {
        jo.p.h(file, "file");
        Context context = this.f35629a;
        Uri e10 = FileProvider.e(context, this.f35629a.getPackageName() + ".provider", file);
        jo.p.g(e10, "getUriForFile(context, \"…ageName}.provider\", file)");
        return e10;
    }
}
